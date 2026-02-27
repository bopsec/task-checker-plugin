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
import com.andmcadams.taskchecker.Varplayers;
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class LootTaskList extends TaskList
{

	public LootTaskList()
	{
		super("Loot crates, chests, and miscellaneous items");
		initTasks();
	}

	public void initTasks()
	{
//		Looted the crate containing a teleport in the Goblin Temple
		Task lootedTeleportGoblinTemple = new Task.TaskBuilder()
				.name("Looted the crate containing a teleport in the Goblin Temple")
				.switchVar(true, VarbitID.LOTG_FOUND_SPHERE)
				.build();
		this.add(lootedTeleportGoblinTemple);
//		Looted the workbench containing iron nails at Gordon's farm
		Task lootedIronNailsGordonsFarm = new Task.TaskBuilder()
				.name("Looted the workbench containing iron nails at Gordon's farm")
				.switchVar(true, VarbitID.GA_NAILS_GIVEN)
				.build();
		this.add(lootedIronNailsGordonsFarm);
		// TODO:
//		Looted the stone chest in The Stranglewood mine couldn't find
//		Looted the chest in Lassar Undercity couldn't find

//
		Task piscatorisTools = new Task.TaskBuilder()
				.name("Looted both bronze tools in the Piscatoris Fishing Colony")
				.switchVar(true, VarbitID.SWANSONG_PICKAXE)
				.switchVar(true, VarbitID.SWANSONG_HATCHET)
				.build();
		this.add(piscatorisTools);
		//
		// Looted all 3 of Ru Merald's gem locations not transmitted


//		Looted all 4 pallets and the chest in Movario's base

		// Search tasks
		Task openMarlosCrate = new Task.TaskBuilder()
			.name("Open Marlo's crate")
			.eqVar(true, VarbitID.DADDYSHOME_STATUS, 14)
			.build();

		// MORTON_TABLE - UNKNOWN
		Task searchMorttonTable = new Task.TaskBuilder()
			.name("Loot the smashed table containing herbs in Mort'ton")
			.bitVar(false, VarPlayerID.MORTTONMULTI, 8)
			.build();

		Task undergroundPassCrate = new Task.TaskBuilder()
			.name("Searched the crate in the Underground Pass")
			.switchVar(true, VarbitID.UPASS_CRATE_FOOD)
			.build();

		Task elementalWorkshopCrate = new Task.TaskBuilder()
			.name("Searched the crate in the Elemental Workshop for leather")
			.switchVar(true, VarbitID.ELEMENTAL_WORKSHOP_LEATHER)
			.build();

		Task meiyerditchLabRuneCase = new Task.TaskBuilder()
			.name("Searched the broken rune case in the Meiyerditch lab")
			.switchVar(true, VarbitID.MYQ3_RUNECASE_SEARCHED)
			.build();

		Task canifisHideoutGarlic = new Task.TaskBuilder()
			.name("Searched the chest in the Canifis Myreque hideout for three garlic bulbs")
			.eqVar(true, VarbitID.MYQ2_GARLIC_CHEST, 3)
			.build();

		Task enakhraSandstone = new Task.TaskBuilder()
			.name("Collected 5 sandstone from Enakhra's temple")
			.eqVar(true, VarbitID.ENAKH_RUBBLE_LIMIT, 5)
			.build();

		Task agrithNaarThrone = new Task.TaskBuilder()
			.name("Collected the gems from Agrith Naar's throne")
			.switchVar(true, VarbitID.GOLEM_THRONE_GEMS)
			.build();

		Task fenkenstrainClockLetter = new Task.TaskBuilder()
			.name("Searched the clock in Fenkenstrain's castle")
			.switchVar(true, VarbitID.FENK_WOUND_CLOCK)
			.build();

		Task goblinVillageGoblinMail = new Task.TaskBuilder()
			.name("Loot the 3 pieces of goblin mail in the Goblin Village")
			.switchVar(true, VarbitID.GOBDIP_CRATE1_SEARCHED)
			.switchVar(true, VarbitID.GOBDIP_CRATE2_SEARCHED)
			.switchVar(true, VarbitID.GOBDIP_CRATE3_SEARCHED)
			.build();

		Task observatorySpiderChests = new Task.TaskBuilder()
			.name("Loot the 7 spider chests in the Observatory dungeon")
			.switchVar(true, VarbitID.OBSERVATORY_CHEST1_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST2_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST3_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST4_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST5_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST6_SEEN)
			.switchVar(true, VarbitID.OBSERVATORY_CHEST7_SEEN)
			.build();

		add(openMarlosCrate);
		add(searchMorttonTable);
		add(undergroundPassCrate);
		add(elementalWorkshopCrate);
		add(meiyerditchLabRuneCase);
		add(canifisHideoutGarlic);
		add(enakhraSandstone);
		add(agrithNaarThrone);
		add(fenkenstrainClockLetter);
		add(goblinVillageGoblinMail);
		add(observatorySpiderChests);
	}
}
