/*
 * Copyright (c) 2021, Andrew McAdams
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.andmcadams.taskchecker;

import com.andmcadams.taskchecker.tasklist.TaskList;
import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

@Slf4j
@PluginDescriptor(
	name = "Completionist Task Checker"
)
public class TaskCheckerPlugin extends Plugin
{
	@Inject
	private Client client;
	@Inject
	private ClientThread clientThread;
	@Inject
	private ClientToolbar clientToolbar;
	@Inject
	private TaskCheckerConfig config;

	private CompleteTaskList tasks;
	private TaskCheckerPanel taskCheckerPanel;
	private NavigationButton navButton;

	@Provides
	TaskCheckerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(TaskCheckerConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		log.info("Task Checker started!");
		tasks = new CompleteTaskList();
		taskCheckerPanel = new TaskCheckerPanel(this,
			config.totusOrder() ? tasks.getTotusTaskLists() : tasks.getTaskLists());

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "/task_icon.png");
		navButton = NavigationButton.builder().tooltip("Task Checker").icon(icon).priority(7).panel(taskCheckerPanel).build();
		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Task Checker stopped!");
		clientToolbar.removeNavigation(navButton);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (TaskCheckerConfig.GROUP.equals(event.getGroup()) && TaskCheckerConfig.TOTUS_ORDER.equals(event.getKey()))
		{
			TaskCheckerPanel panel = taskCheckerPanel;
			SwingUtilities.invokeLater(() -> {
				if (panel != null && panel == taskCheckerPanel)
				{
					panel.setTaskLists(config.totusOrder() ? tasks.getTotusTaskLists() : tasks.getTaskLists());
				}
			});
		}
	}

	public void checkTasks()
	{
		clientThread.invoke(() -> {
			for (TaskList taskList : tasks.getTaskLists())
			{
				for (Task task : taskList.getTasks())
				{
					task.setCurrentValues(client);
				}
			}
			SwingUtilities.invokeLater(() -> taskCheckerPanel.refresh());
		});
	}
}
