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

public class FirePitsTaskList extends TaskList
{

	public FirePitsTaskList()
	{
		super("Environmental alterations");
		initTasks();
	}

	public void initTasks()
	{
		// TODO:
		//Built a raft using the smashed table in Ah Za Rhoon couldn't find https://oldschool.runescape.wiki/w/Crude_raft
		
		//Built the Spinning Wheel on the Isle of Souls
		addTask("Built the Spinning Wheel on the Isle of Souls", VarbitID.SW_SPINNINGWHEEL_BUILT);
		//Built the Potter's Wheel on the Isle of Souls
		addTask("Built the Potter's Wheel on the Isle of Souls", VarbitID.SW_POTTERYWHEEL_BUILT);
		//Built all 5 quetzal landing sites
		Task allQuetzalSites = new Task.TaskBuilder()
				.name("Built all 5 quetzal landing sites")
				// the commented out ones are already built
				//.eqVar(true, VarbitID.QUETZAL_AUBURNVALLEY, 2)
				//.eqVar(true, VarbitID.QUETZAL_QUETZACALLIGORGE, 2)
				//.eqVar(true, VarbitID.QUETZAL_TEOMAT, 2)
				//.eqVar(true, VarbitID.QUETZAL_TALTEKLAN, 2)
				//.eqVar(true, VarbitID.QUETZAL_HUNTERGUILD, 2)
				//.eqVar(true, VarbitID.QUETZAL_FORTIS, 2)
				//.eqVar(true, VarbitID.QUETZAL_SUNSETCOAST, 2)
				//.eqVar(true, VarbitID.QUETZAL_ALDARIN, 2)
				.eqVar(true, VarbitID.QUETZAL_SALVAGEROVERLOOK, 2)
				.eqVar(true, VarbitID.QUETZAL_CAMTORUM, 2)
				.eqVar(true, VarbitID.QUETZAL_COLOSSEUM, 2)
				.eqVar(true, VarbitID.QUETZAL_KASTORI, 2)
				.eqVar(true, VarbitID.QUETZAL_OUTERFORTIS, 2)
				.eqVar(true, VarbitID.QUETZAL_COLOSSALWYRM, 2)
				.build();
		this.add(allQuetzalSites);

		//Searched the treasure pile in Movario's base
		addTask("Searched the treasure pile in Movario's base", VarbitID.WGS_SEARCHED_TREASURE);

		//Destroyed all 9 tentacles in the Lassar Undercity couldn't find under DT2_LASSAR
		//Listened to all 10 remnants in the Lassar Undercity
//		Task listenedToRemnantsLassarUndercity = new Task.TaskBuilder()
//				.name("")
//				// where did the other 6 go?
//				.switchVar(true, VarbitID.DT2_LASSAR_EMPOWERED_REMNANT_6)
//				.switchVar(true, VarbitID.DT2_LASSAR_EMPOWERED_REMNANT_7)
//				.switchVar(true, VarbitID.DT2_LASSAR_EMPOWERED_REMNANT_8)
//				.switchVar(true, VarbitID.DT2_LASSAR_EMPOWERED_REMNANT_9)
//				.build();

		addTask("Used Saradomin's light", VarbitID.GODWARS_SARADOMIN_LIGHT);

		addTask("Build the fire pit in the Mole Hole", VarbitID.MY2ARM_FIRE_MOLE);

		addTask("Build the fire pit in the Lumbridge Swamp Caves", VarbitID.MY2ARM_FIRE_LUMB);

		addTask("Build the fire pit in the Mos Le'Harmless Cave", VarbitID.MY2ARM_FIRE_HORRORS);

		addTask("Build the fire pit in the Mort Myre Swamp", VarbitID.MY2ARM_FIRE_GHASTS);

		addGeTask(true, "Build the fire pit near the Weiss herb patch", VarbitID.MY2ARM_STATUS, 205);

		addTask("Build the fire pit by the God Wars Dungeon entrance", VarbitID.MY2ARM_FIRE_GWD);

	}

}

