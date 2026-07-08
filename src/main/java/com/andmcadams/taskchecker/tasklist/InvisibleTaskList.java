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
import net.runelite.api.gameval.VarbitID;

public class InvisibleTaskList extends TaskList
{

	public InvisibleTaskList()
	{
		super("No known effect in game");
		this.initTasks();
	}

	public void initTasks()
	{
		addTask("Loot the Ancient letter from the Forsaken Tower", VarbitID.LOVAQUEST_HIDDEN_NOTE);

		addTask("Loot the Tatty note from the bed in the Kebos Lowlands", VarbitID.KEBOS_SHACK_NOTE);

		addTask("Pickpocket Teddy from the female student in the Digsite", VarbitID.ITDIGSITETEDDY);

		// Note that this doesn't actually change dialogue as far as I can tell.
		addTask("Ask a Fortress guard about their uniform outside the Black Knights' Fortress", VarbitID.SPY_ARMOUR_HINT);

		addTask("Exit through the Troll Stronghold's secret exit", VarbitID.TROLL_OPENED_BACK_EXIT);

		addTask("Try to Enter Guidor's room without priest gowns", VarbitID.BIOHAZARD_MET_JULIE); // varbit changes, but no visible effect

		addTask("Talk to Reldo in Varrock castle library", VarbitID.RELDO_MET); // did change to 1, but no visible effect

		addTask("Search the Ruby Bookcase in Movario's base", VarbitID.WGS_RUBY_BOOKCASE_SEARCHED); // no effect and not needed during quest

		addTask("Read the wall plaque in the basement in Burgh de Rott", VarbitID.BURGH_WALL_PLAQUE_READ);

		// Open all the doors in sangvesti once lol
		Task allSangvestiDoors = new Task.TaskBuilder()
			.name("Open all the doors in Sangvesti")
			.switchVar(true, VarbitID.SANGVESTI_CLOTHES_SHOP_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_CLOTHES_SHOP_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_3_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_3_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_CHAPEL_BACK_DOOR_1_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_CHAPEL_BACK_DOOR_2_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_TRAPDOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_BLACKSMITH_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_BASIC_HOUSE_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_PUB_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_PUB_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_MYRMEL_MANOR_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_MYRMEL_MANOR_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_BANK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_INTERIOR_BANK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_SHADUM_MANOR_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_1_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_1_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_VITUR_MANOR_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_2_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FANCY_HOUSE_2_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FOOD_SHOP_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_FOOD_SHOP_BACK_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_GENERAL_STORE_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_BASIC_HOUSE_2_DOOR_FOUND)
			.switchVar(true, VarbitID.SANGVESTI_BASIC_HOUSE_3_DOOR_FOUND)
			.build(); // these do not remember retroactively it seems, have to be done after 8th of July 2026
		this.add(allSangvestiDoors);
	}
}
