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
		this.add(unlockAllWarningToggles);

		//Disabled Odovacar's bank cost warning not transmitted
		//Disabled Pennant's crystal acorn trade warning
		addTask("Disabled Pennant's crystal acorn trade warning",  VarbitID.PRIF_ACORN_TRADE);
		//Disabled Perdu's owned item purchase warning
		addTask("Disabled Perdu's owned item purchase warning", VarbitID.PERDU_BUY_MULTIPLE_WARNING);
		//Disabled Nex's Ancient Barrier warning
		addTask("Disabled Nex's Ancient Barrier warning",  VarbitID.NEX_BARRIER_WARNING_HIDDEN);
		//Disabled Araxxor's web tunnel warning TODO: Unfound/untested
		//Disabled Araxxor's destroy loot warning TODO: Unfound/untested
		//Disabled Wintertodt's modification warning TODO: Unfound/untested
		//Disabled the Ancient Prison warning
		addTask("Disabled the Ancient Prison warning", VarbitID.NEX_PRISON_DOOR_WARNING_HIDDEN);
		//Disabled the crystal item creation warning TODO: Unfound/untested
		//Disabled the Gauntlet's crystal teleporter entrance warning TODO: Unfound/untested
		//Disabled the Gauntlet's item storage warning TODO: Unfound/untested
		//Disabled the Gauntlet escape crystal warning not transmitted

		//Disabled the Hespori's fight initiation warning
		addTask("Disabled the Hespori's fight initiation warning",  VarbitID.HESPORI_WARNING);
		//Disabled the Daimon's crater entrance warning
		addTask("Disabled the Daimon's crater entrance warning", VarbitID.BH_ARENA_ENTER_WARNING);
		//Disabled the Daimon's crater PK skull prevention warning
		addTask("Disabled the Daimon's crater PK skull prevention warning", VarbitID.BH_SKULL_SETTING_WARNING);
		//Disabled the Revenant Cave's payment warning not transmitted
		//Disabled the Revenant Cave's one-way entrance warning
		addTask("Disabled the Revenant Cave's one-way entrance warning", VarbitID.WILDERNESS_CAVE_MID_WARNING); // confirmed
		//Disabled the Soul Wars clan lobby entrance warning TODO: Unfound/untested
		//Disabled the Scurrius's broken bars warning
		addTask("Disabled the Scurrius's broken bars warning", VarbitID.RAT_BOSS_ENTER_WARNING);
		//Disabled the Wilderness bosses' cave's warning
		addTask("Disabled the Wilderness bosses' cave's warning", VarbitID.WBR_ENTRANCE_FEE_WARNING); //TODO: Untested probs correct
		//Disabled the Wilderness Agility dispenser cost warning
		addTask("Disabled the Wilderness Agility dispenser cost warning", VarbitID.WILDY_AGILITY_PAYMENT_WARNING);
		//Disabled the Wilderness Agility pipe rewards warning
		addTask("Disabled the Wilderness Agility pipe rewards warning", VarbitID.WILDY_AGILITY_START_WARNING);
		//Disabled the Wilderness Agility gate opening warning
		addTask("Disabled the Wilderness Agility gate opening warning", VarbitID.WILDY_AGILITY_EXIT_WARNING);
		//Disabled the looting bag usage warning not exposed
		//Disabled the ornate maul handle attachment warning not transmitted
		//Disabled the Camdozaal Vault entrance warning
		addTask("Disabled the Camdozaal Vault entrance warning", VarbitID.CAMDOZAAL_VAULT_WARNING);
		//Disabled the Camdozaal Vault's dropped items warning
		addTask("Disabled the Camdozaal Vault's dropped items warning", VarbitID.CAMDOZAAL_VAULT_DROP_WARNING);
		//Disabled the Blast Furnace conveyor belt warning TODO: Unfound/untested
		//Disabled the Brimhaven dungeon hole entrance warning TODO: Unfound/untested
		//Disabled the Vorkath crater warning
		addTask("Disabled the Vorkath crater warning",  VarbitID.DS2_UNGAEL_WARNING); // TODO: Untested probs correct
		//Disabled the Thermonuclear Smoke Devil area warning TODO: Unfound/untested
		//Disabled the Kraken area warning TODO: Unfound/untested
		//Disabled the Phantom Muspah crevice warning
		addTask("Disabled the Phantom Muspah crevice warning", VarbitID.MUSPAH_WARNING); //TODO: Untested probs correct
		//Disabled the Tempoross area's dropped items warning TODO: Unfound/untested
		//Disabled the Tithe Farm instanced area entrance warning TODO: Unfound/untested
		//Disabled the Character Summary's Time Played warning
		addTask("Disabled the Character Summary's Time Played warning", VarbitID.ACCOUNT_SUMMARY_DISPLAY_PLAYTIME_REMIND_DISABLE);
		//Disabled the World Switcher's switch warning
		addTask("Disabled the World Switcher's switch warning",  VarbitID.WORLDSWITCHER_DISABLE_CONFIRMATION);
		//Disabled the minigame group finder warning
		addTask("Disabled the minigame group finder warning", VarbitID.WORLDSWITCHER_MINIGAME_PROMPT); // TODO:Unchecked probs correct
		//Disabled the Chambers of Xeric's shared storage warning TODO: untested
		addTask("Disabled the Chambers of Xeric's shared storage warning", VarbitID.RAIDS_SHAREDSTORAGE_WARNING_DISMISSED); // surely?
		//Disabled the Theatre of Blood's escape crystal warning TODO: Unfound/untested
		//Disabled the Tombs of Amascut entry warning TODO: Unfound/untested
		//Disabled the Icy Cavern entrance warning TODO: untested
		addTask("Disabled the Icy Cavern entrance warning", VarbitID.WYVERN_ENTRANCE_WARNING); // surely?
		//Disabled the crashed airship opening entrance warning TODO: Unfound/untested
		//Disabled the Grubby Chest's inventory space warning
		addTask("Disabled the Grubby Chest's inventory space warning",  VarbitID.HOSDUN_CHEST_WARNING);
		//Disabled the Zalcano prison barrier entrance warning not transmitted
		//Disabled the Nightmare's fight initiation warning
		addTask("Disabled the Nightmare's fight initiation warning",  VarbitID.NIGHTMARE_ENTRY_CHECK); // confirmed
		//Disabled the pool of Nightmares' fight initiation warning
		addTask("Disabled the pool of Nightmares' fight initiation warning", VarbitID.NIGHTMARE_CHALLENGE_ENTRY_CHECK); // TODO:Unchecked
		//Disabled the Nightmare's Energy Barrier exit warning not transmitted
		//Disabled the Nightmare staff's orb addition/removal warning
		addTask("Disabled the Nightmare staff's orb addition/removal warning", VarbitID.NIGHTMARE_STAFF_CHECK); // TODO:Unchecked
		//Disabled the mounted mythical cape's Building Mode warning no varb/varp
		//Disabled the Clan Coffer's coin deposit warning TODO: Unfound/untested
		//Disabled the Hallowed Sepulchre's lobby stairs warning
		addTask("Disabled the Hallowed Sepulchre's lobby stairs warning", VarbitID.HALLOWED_ENTRY_CHECK); // confirmed
		//Disabled the Hallowed sack's inventory space warning TODO: Unfound/untested
		//Disabled the Sourhog cave strange hole entrance warning
		addTask("Disabled the Sourhog cave strange hole entrance warning", VarbitID.PORCINE_STOP_WARNING); // confirmed
		//Disabled the Mahogany Homes expert contract warning TODO: Unfound/untested
		//Disabled the Royal Titans' tunnel warning
		addTask("Disabled the Royal Titans' tunnel warning", VarbitID.ROYAL_TITANS_ENTER_WARNING);
		//Disabled the Royal Titans' destroy loot warning TODO: Unfound/untested
		//Disabled the Moons of Peril encounter warning
		addTask("Disabled the Moons of Peril encounter warning", VarbitID.PMOON_DROP_ITEM_WARNING); // confirmed
		//Disabled the museum's storage crate warning
	}

}

