package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import net.runelite.api.gameval.VarPlayerID;

public class CollectionLogTaskList extends TaskList
{
	public CollectionLogTaskList()
	{
		super("Collection logs");
		initTasks();
	}

	public void initTasks()
	{
		addGeTask(false, "Unlocked the ability to claim a bronze staff of collection", VarPlayerID.COLLECTION_COUNT, 100);
		addGeTask(false, "Unlocked the ability to claim an iron staff of collection", VarPlayerID.COLLECTION_COUNT, 300);
		addGeTask(false, "Unlocked the ability to claim a steel staff of collection", VarPlayerID.COLLECTION_COUNT, 500);
		addGeTask(false, "Unlocked the ability to claim a black staff of collection", VarPlayerID.COLLECTION_COUNT, 700);
		addGeTask(false, "Unlocked the ability to claim a mithril staff of collection", VarPlayerID.COLLECTION_COUNT, 900);
		addGeTask(false, "Unlocked the ability to claim an adamant staff of collection", VarPlayerID.COLLECTION_COUNT, 1000);
		addGeTask(false, "Unlocked the ability to claim a rune staff of collection", VarPlayerID.COLLECTION_COUNT, 1100);
		addGeTask(false, "Unlocked the ability to claim a dragon staff of collection", VarPlayerID.COLLECTION_COUNT, 1200);

		Task gildedStaff = new Task.TaskBuilder()
			.name("Unlocked the ability to claim a gilded staff of collection")
			.geVarVar(false, VarPlayerID.COLLECTION_COUNT, VarPlayerID.COLLECTION_COUNT_MAX,
				CollectionLogTaskList::gildedStaffRequirement)
			.build();
		this.add(gildedStaff);
	}

	static int gildedStaffRequirement(int maximumCollectionCount)
	{
		return maximumCollectionCount * 9 / 10 / 25 * 25;
	}
}
