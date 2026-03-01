package com.andmcadams.taskchecker.tasklist;

import net.runelite.api.gameval.VarbitID;

public class ChampionsChallengeTaskList extends TaskList
{

	public ChampionsChallengeTaskList()
	{
		super("Champions' Challenge");
		initTasks();
	}

	public void initTasks()
	{
		// Earth warrior, ghoul, hill giant, goblin, hobgoblin, imp, jogre, lesser demon, skeleton, zombie
		addBitTask(true, "Use the champion's lamp of the earth warrior champion", VarbitID.CHAMPIONS_LAMPS, 0);
		addBitTask(true, "Use the champion's lamp of the ghoul champion", VarbitID.CHAMPIONS_LAMPS, 1);
		addBitTask(true, "Use the champion's lamp of the giant champion", VarbitID.CHAMPIONS_LAMPS, 2);
		addBitTask(true, "Use the champion's lamp of the goblin champion", VarbitID.CHAMPIONS_LAMPS, 3);
		addBitTask(true, "Use the champion's lamp of the hobgoblin champion", VarbitID.CHAMPIONS_LAMPS, 4);
		addBitTask(true, "Use the champion's lamp of the imp champion", VarbitID.CHAMPIONS_LAMPS, 5);
		addBitTask(true, "Use the champion's lamp of the jogre champion", VarbitID.CHAMPIONS_LAMPS, 6);
		addBitTask(true, "Use the champion's lamp of the lesser demon champion", VarbitID.CHAMPIONS_LAMPS, 7);
		addBitTask(true, "Use the champion's lamp of the skeleton champion", VarbitID.CHAMPIONS_LAMPS, 8);
		addBitTask(true, "Use the champion's lamp of the zombie champion", VarbitID.CHAMPIONS_LAMPS, 9);
		addBitTask(true, "Use the champion's lamp of the human champion", VarbitID.CHAMPIONS_LAMPS, 10);
	}
}
