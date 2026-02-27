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

public class DoomsayerToggleTaskList extends TaskList
{

	public DoomsayerToggleTaskList()
	{
		super("Doomsayer Toggles and warnings");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockAllWarningToggles = new Task.TaskBuilder()
			.name("Unlock all Doomsayer warning toggles")
			.geVar(true, VarbitID.CWS_WARNING_1, 6) // DKS ladder
			.geVar(true, VarbitID.CWS_WARNING_2, 6) // Contact ladder
			.geVar(true, VarbitID.CWS_WARNING_3, 6) // Fally mole lair
			.geVar(true, VarbitID.CWS_WARNING_4, 6) // Stronghold of security ladder
			.geVar(true, VarbitID.CWS_WARNING_5, 6) // PoH
			.geVar(true, VarbitID.CWS_WARNING_6, 6) // Random events dropped items
			.geVar(true, VarbitID.CWS_WARNING_7, 6) // Wildy ditch
			.geVar(true, VarbitID.CWS_WARNING_8, 6) // Trollheim wildy entrance
			.geVar(true, VarbitID.CWS_WARNING_9, 6) // Observatory stairs
			.geVar(true, VarbitID.CWS_WARNING_10, 6) // Shantay pass
			.geVar(true, VarbitID.CWS_WARNING_11, 6) // Icy path
			.geVar(true, VarbitID.CWS_WARNING_12, 6) // Watchtower shaman cave
			.geVar(true, VarbitID.CWS_WARNING_13, 6) // Lumbridge swamp cave rope
			.geVar(true, VarbitID.CWS_WARNING_14, 6) // Ham tunnel from mill
			.geVar(true, VarbitID.CWS_WARNING_15, 6) // Fairy ring to dorg
			.geVar(true, VarbitID.CWS_WARNING_16, 6) // Lumby cellar
			.geVar(true, VarbitID.CWS_WARNING_17, 6) // Elid genie cave
			.geVar(true, VarbitID.CWS_WARNING_18, 6) // Dorg kalphite tunnel
			.geVar(true, VarbitID.CWS_WARNING_19, 6) // Dorg city exit
			.geVar(true, VarbitID.CWS_WARNING_20, 6) // Mort myre
			.geVar(true, VarbitID.CWS_WARNING_23, 6) // ranging guild tower
			.geVar(true, VarbitID.CWS_WARNING_24, 6) // Death plateau
			.geVar(true, VarbitID.CWS_WARNING_25, 6) // Gwd wildy agil route
			.geVar(true, VarbitID.CWS_WARNING_26, 6) // idk
			.build();

		// TODO:
		//Disabled Odovacar's bank cost warning
		//Disabled Pennant's crystal acorn trade warning
		//Disabled Perdu's owned item purchase warning
		//Disabled Nex's Ancient Barrier warning
		//Disabled Araxxor's web tunnel warning
		//Disabled Araxxor's destroy loot warning
		//Disabled Wintertodt's modification warning
		//Disabled the Ancient Prison warning
		//Disabled the crystal item creation warning
		//Disabled the Gauntlet's crystal teleporter entrance warning
		//Disabled the Gauntlet's item storage warning
		//Disabled the Gauntlet escape crystal warning
		//Disabled the Hespori's fight initiation warning
		//Disabled the Daimon's crater entrance warning
		//Disabled the Daimon's crater PK skull prevention warning
		//Disabled the Revenant Cave's payment warning
		//Disabled the Revenant Cave's one-way entrance warning
		//Disabled the Ferox Enclave's barrier exit warning
		//Disabled the Soul Wars clan lobby entrance warning
		//Disabled the Scurrius's broken bars warning
		//Disabled the Wilderness bosses' cave's warning
		//Disabled the Wilderness Agility dispenser cost warning
		//Disabled the Wilderness Agility pipe rewards warning
		//Disabled the Wilderness Agility gate opening warning
		//Disabled the looting bag usage warning
		//Disabled the ornate maul handle attachment warning
		//Disabled the Camdozaal Vault entrance warning
		//Disabled the Camdozaal Vault's dropped items warning
		//Disabled the Blast Furnace conveyor belt warning
		//Disabled the Brimhaven dungeon hole entrance warning
		//Disabled the Vorkath crater warning
		//Disabled the Thermonuclear Smoke Devil area warning
		//Disabled the Kraken area warning
		//Disabled the Phantom Muspah crevice warning
		//Disabled the Tempoross area's dropped items warning
		//Disabled the Tithe Farm instanced area entrance warning
		//Disabled the Character Summary's Time Played warning
		//Disabled the World Switcher's switch warning
		//Disabled the minigame group finder warning
		//Disabled the Chambers of Xeric's shared storage warning
		//Disabled the Theatre of Blood's escape crystal warning
		//Disabled the Tombs of Amascut entry warning
		//Disabled the Icy Cavern entrance warning
		//Disabled the crashed airship opening entrance warning
		//Disabled the Grubby Chest's inventory space warning
		//Disabled the Zalcano prison barrier entrance warning
		//Disabled the Nightmare's fight initiation warning
		//Disabled the pool of Nightmares' fight initiation warning
		//Disabled the Nightmare's Energy Barrier exit warning
		//Disabled the Nightmare staff's orb addition/removal warning
		//Disabled the mounted mythical cape's Building Mode warning no varb/varp
		//Disabled the Clan Coffer's coin deposit warning
		//Disabled the Hallowed Sepulchre's lobby stairs warning
		//Disabled the Hallowed sack's inventory space warning
		//Disabled the Sourhog cave strange hole entrance warning
		//Disabled the Mahogany Homes expert contract warning
		//Disabled the Royal Titans' tunnel warning
		//Disabled the Royal Titans' destroy loot warning
		//Disabled the Moons of Peril encounter warning
		//Disabled the museum's storage crate warning

		add(unlockAllWarningToggles);
	}

}
