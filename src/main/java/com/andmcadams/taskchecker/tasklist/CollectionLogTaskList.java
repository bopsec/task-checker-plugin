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
		addGeTask(false, "Unlocked the Bronze staff of collections", VarPlayerID.COLLECTION_COUNT, 100);
		addGeTask(false, "Unlocked the Iron staff of collections", VarPlayerID.COLLECTION_COUNT, 300);
		addGeTask(false, "Unlocked the Steel staff of collections", VarPlayerID.COLLECTION_COUNT, 500);
		addGeTask(false, "Unlocked the Black staff of collections", VarPlayerID.COLLECTION_COUNT, 700);
		addGeTask(false, "Unlocked the Mithril staff of collections", VarPlayerID.COLLECTION_COUNT, 900);
		addGeTask(false, "Unlocked the Adamant staff of collections", VarPlayerID.COLLECTION_COUNT, 1000);
		addGeTask(false, "Unlocked the Rune staff of collections", VarPlayerID.COLLECTION_COUNT, 1100);
		addGeTask(false, "Unlocked the Dragon staff of collections", VarPlayerID.COLLECTION_COUNT, 1200);

		Task gildedStaff = new Task.TaskBuilder()
			.name("Unlocked the Gilded staff of collections")
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
