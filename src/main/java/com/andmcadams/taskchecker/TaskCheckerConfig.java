package com.andmcadams.taskchecker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(TaskCheckerConfig.GROUP)
public interface TaskCheckerConfig extends Config
{
	String GROUP = "completionisttaskchecker";
	String TOTUS_ORDER = "totusOrder";

	@ConfigItem(
		keyName = TOTUS_ORDER,
		name = "Use Totus task order",
		description = "Display matched tasks in Totus sections and subgroups"
	)
	default boolean totusOrder()
	{
		return false;
	}
}
