package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class CapesTaskList extends TaskList
{

	public CapesTaskList()
	{
		super("Capes of Achievements");
		initTasks();
	}

	public void initTasks()
	{
		//Unlocked the effect of Ava's assembler on ranging/max capes
		addTask("Unlocked the effect of Ava's assembler on ranging/max capes", VarbitID.DS2_AMMO_COLLECTION); // confirmed
		//Unlocked the effect of Ava's assembler on Dizana's quiver
		addEqTask(true, "Unlocked the effect of Ava's assembler on Dizana's quiver", VarbitID.DIZANAS_QUIVER_AMMO_SAVE, 3); // confirmed
		//
		//Unlocked all non-holiday music tracks
		addGeTask(true, "Unlocked all non-holiday music tracks", VarbitID.MUSIC_CAPE_STATUS, 1);
		//Unlocked the ability to toggle the music cape's trim
		addGeTask(true, "Unlocked the ability to toggle the music cape's trim", VarbitID.MUSIC_CAPE_STATUS, 2);
		//Completed all 12 easy achievement diaries
		Task completedEasyDiaries = new Task.TaskBuilder()
			.name("Completed all 12 easy achievement diaries")
			.switchVar(true, VarbitID.ARDOUGNE_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.DESERT_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.FALADOR_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.FREMENNIK_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.KANDARIN_DIARY_EASY_COMPLETE)
			.eqVar(true, VarbitID.KARAMJA_EASY_COUNT, 10)
			.switchVar(true, VarbitID.KOUREND_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.LUMBRIDGE_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.MORYTANIA_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.VARROCK_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.WESTERN_DIARY_EASY_COMPLETE)
			.switchVar(true, VarbitID.WILDERNESS_DIARY_EASY_COMPLETE)
			.build();
		this.add(completedEasyDiaries);
		//Completed all 12 medium achievement diaries
		Task completedMediumDiaries = new Task.TaskBuilder()
			.name("Completed all 12 medium achievement diaries")
			.switchVar(true, VarbitID.ARDOUGNE_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.DESERT_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.FALADOR_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.FREMENNIK_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.KANDARIN_DIARY_MEDIUM_COMPLETE)
			.eqVar(true, VarbitID.KARAMJA_MED_COUNT, 19)
			.switchVar(true, VarbitID.KOUREND_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.LUMBRIDGE_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.MORYTANIA_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.VARROCK_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.WESTERN_DIARY_MEDIUM_COMPLETE)
			.switchVar(true, VarbitID.WILDERNESS_DIARY_MEDIUM_COMPLETE)
			.build();
		this.add(completedMediumDiaries);
		//Completed all 12 hard achievement diaries
		Task completedHardDiaries = new Task.TaskBuilder()
			.name("Completed all 12 hard achievement diaries")
			.switchVar(true, VarbitID.ARDOUGNE_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.DESERT_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.FALADOR_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.FREMENNIK_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.KANDARIN_DIARY_HARD_COMPLETE)
			.eqVar(true, VarbitID.KARAMJA_HARD_COUNT, 10)
			.switchVar(true, VarbitID.KOUREND_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.LUMBRIDGE_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.MORYTANIA_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.VARROCK_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.WESTERN_DIARY_HARD_COMPLETE)
			.switchVar(true, VarbitID.WILDERNESS_DIARY_HARD_COMPLETE)
			.build();
		this.add(completedHardDiaries);
		//Completed all 12 elite achievement diaries
		Task completedEliteDiaries = new Task.TaskBuilder()
			.name("Completed all 12 elite achievement diaries")
			.switchVar(true, VarbitID.ARDOUGNE_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.DESERT_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.FALADOR_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.FREMENNIK_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KANDARIN_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KARAMJA_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KOUREND_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.LUMBRIDGE_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.MORYTANIA_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.VARROCK_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.WESTERN_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.WILDERNESS_DIARY_ELITE_COMPLETE)
			.build();
		this.add(completedEliteDiaries);
		//Unlocked the ability to equip a quest point cape (t)
		Task trimmedQuestCape = new Task.TaskBuilder()
			.name("Unlocked the ability to equip a quest point cape (t)")
			.eqVar(false, VarPlayerID.QP, 333)
			.switchVar(true, VarbitID.ARDOUGNE_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.DESERT_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.FALADOR_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.FREMENNIK_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KANDARIN_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KARAMJA_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.KOUREND_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.LUMBRIDGE_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.MORYTANIA_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.VARROCK_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.WESTERN_DIARY_ELITE_COMPLETE)
			.switchVar(true, VarbitID.WILDERNESS_DIARY_ELITE_COMPLETE)
			.build(); // this could probs be done more cleanly, idk if there's one "can get diary cape" varb/varp
		this.add(trimmedQuestCape);

		// I changed it to only be the highest cape
//        addGeTask(false, "Unlocked the ability to claim Xeric's guard", VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 100);
//        addGeTask(false, "Unlocked the ability to claim Xeric's warrior", VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 500);
//        addGeTask(false, "Unlocked the ability to claim Xeric's sentinel", VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 1000);
//        addGeTask(false, "Unlocked the ability to claim Xeric's general", VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 1500);
		addGeTask(false, "Unlocked the ability to claim Xeric's champion", VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 2000);

		//
//        Task tobCape1 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim a Sinhaza shroud tier 1")
//                .geSumVars(false, 100, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
//                .build();
//        this.add(tobCape1);
//        Task tobCape2 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim a Sinhaza shroud tier 2")
//                .geSumVars(false, 500, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
//                .build();
//        this.add(tobCape2);
//        Task tobCape3 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim a Sinhaza shroud tier 3")
//                .geSumVars(false, 1000, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
//                .build();
//        this.add(tobCape3);
//        Task tobCape4 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim a Sinhaza shroud tier 4")
//                .geSumVars(false, 1500, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
//                .build();
//        this.add(tobCape4);
		Task tobCape5 = new Task.TaskBuilder()
			.name("Unlocked the ability to claim a Sinhaza shroud tier 5")
			.geSumVars(false, 2000, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
			.build();
		this.add(tobCape5);
//        //
//        Task toaCape1 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim Icthlarin's shroud (tier 1)")
//                .geSumVars(false, 100, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
//                .build();
//        this.add(toaCape1);
//        Task toaCape2 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim Icthlarin's shroud (tier 2)")
//                .geSumVars(false, 500, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
//                .build();
//        this.add(toaCape2);
//        Task toaCape3 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim Icthlarin's shroud (tier 3)")
//                .geSumVars(false, 1000, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
//                .build();
//        this.add(toaCape3);
//        Task toaCape4 = new Task.TaskBuilder()
//                .name("Unlocked the ability to claim Icthlarin's shroud (tier 4)")
//                .geSumVars(false, 1500, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
//                .build();
//        this.add(toaCape4);
		Task toaCape5 = new Task.TaskBuilder()
			.name("Unlocked the ability to claim Icthlarin's shroud (tier 5)")
			.geSumVars(false, 2000, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
			.build();
		this.add(toaCape5);
	}
}
