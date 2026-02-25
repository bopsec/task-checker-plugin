package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
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
		Task earthWarriorLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the earth warrior champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 0)
			.build();

		Task ghoulLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the ghoul champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 1)
			.build();

		Task giantLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the giant champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 2)
			.build();

		Task goblinLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the goblin champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 3)
			.build();

		Task hobgoblinLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the hobgoblin champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 4)
			.build();

		Task impLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the imp champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 5)
			.build();

		Task jogreLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the jogre champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 6)
			.build();

		Task lesserDemonLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the lesser demon champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 7)
			.build();

		Task skeletonLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the skeleton champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 8)
			.build();

		Task zombieLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the zombie champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 9)
			.build();

		Task humanLampUsed = new Task.TaskBuilder()
			.name("Use the champion's lamp of the human champion")
			.bitVar(true, VarbitID.CHAMPIONS_LAMPS, 10)
			.build();

		add(earthWarriorLampUsed);
		add(ghoulLampUsed);
		add(giantLampUsed);
		add(goblinLampUsed);
		add(hobgoblinLampUsed);
		add(impLampUsed);
		add(jogreLampUsed);
		add(lesserDemonLampUsed);
		add(skeletonLampUsed);
		add(zombieLampUsed);
		add(humanLampUsed);
	}
}
