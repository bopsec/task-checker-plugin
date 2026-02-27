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
package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import net.runelite.api.gameval.VarbitID;

public class EntrancesAndObstaclesTaskList extends TaskList
{

	public EntrancesAndObstaclesTaskList()
	{
		super("Entrances and Obstacles");
		initTasks();
	}

	public void initTasks()
	{

		Task unblockLumbridgeSwampCavesHole = new Task.TaskBuilder()
			.name("Unblock the hole leading to the Lumbridge Swamp Caves")
			.switchVar(true, VarbitID.LOST_TRIBE_HOLE_2_DUG)
			.build();

		Task unblockEagleTransport = new Task.TaskBuilder()
			.name("Unblock both obstructed eagle transport route entrances")
			.switchVar(true, VarbitID.EAGLEPEAK_UNBLOCKED_DESERT)
			.eqVar(true, VarbitID.EAGLEPEAK_JUNGLE_VINE, 3)
			.build();

		Task unblockKourendCatacombsEntrances = new Task.TaskBuilder()
			.name("Unblock all five additional entrances to the Kourend Catacombs")
			.switchVar(true, VarbitID.CATA_HOLE1)
			.switchVar(true, VarbitID.CATA_HOLE2)
			.switchVar(true, VarbitID.CATA_HOLE3)
			.switchVar(true, VarbitID.CATA_HOLE4)
			.switchVar(true, VarbitID.CATA_HOLE_GIANTS_DEN)
			.build();

		Task unlockAccessToHarisArea = new Task.TaskBuilder()
			.name("Unlock access to Haris's resource area in Corsair Cove")
			.switchVar(true, VarbitID.CORSAIR_COVE_RESOURCE_ENTRY)
			.build();

		Task unblockKrukDungeonPassage = new Task.TaskBuilder()
			.name("Unlock the hidden passage to the entrance of Kruk's lair")
			.switchVar(true, VarbitID.MM2_MAZE_RETURN)
			.build();

		Task unlockDoorToEodan = new Task.TaskBuilder()
			.name("Unlock the door to Eodan in the Forthos Dungeon")
			.switchVar(true, VarbitID.HOSDUN_BURNER_OPEN)
			.build();

		Task unlockForthosDungeonDoors = new Task.TaskBuilder()
			.name("Unlock both Temple Doors in the Forthos Dungeon")
			.switchVar(true, VarbitID.HOSDUN_EAST_DOOR_STATUS)
			.switchVar(true, VarbitID.HOSDUN_WEST_DOOR_STATUS)
			.build();

		Task unlockEnakhrasTempleEntrances = new Task.TaskBuilder()
			.name("Unlock all four secret entrances to Enakhra's Temple")
			.switchVar(true, VarbitID.ENAKH_BOULDER_N_MULTIVAR)
			.switchVar(true, VarbitID.ENAKH_BOULDER_E_MULTIVAR)
			.switchVar(true, VarbitID.ENAKH_BOULDER_S_MULTIVAR)
			.switchVar(true, VarbitID.ENAKH_BOULDER_W_MULTIVAR)
			.build();

		Task unlockEnakhrasTempleSigilDoors = new Task.TaskBuilder()
			.name("Unlock all four sigil-locked doors in Enakhra's Temple")
			.switchVar(true, VarbitID.ENAKH_Z_DOOR)
			.switchVar(true, VarbitID.ENAKH_M_DOOR)
			.switchVar(true, VarbitID.ENAKH_R_DOOR)
			.switchVar(true, VarbitID.ENAKH_K_DOOR)
			.build();

		Task excavateStatue = new Task.TaskBuilder()
				.name("Unblock the statue leading to the Tunnel of Chaos")
				.switchVar(true, VarbitID.SUROK_TUNNELCHECK)
				.build();

		Task excavateTrueBloodAltar = new Task.TaskBuilder()
				.name("Unblocked the tunnel leading to the true Blood Altar")
				.switchVar(true, VarbitID.MYQ5_LAB_SC_UNLOCKED)
				.build();


		add(unblockLumbridgeSwampCavesHole);
		add(unblockEagleTransport);
		add(unblockKourendCatacombsEntrances);
		add(unlockAccessToHarisArea);
		add(unblockKrukDungeonPassage);
		add(unlockDoorToEodan);
		add(unlockForthosDungeonDoors);
		add(unlockEnakhrasTempleEntrances);
		add(unlockEnakhrasTempleSigilDoors);
		add(excavateStatue);
		add(excavateTrueBloodAltar);
	}
}
