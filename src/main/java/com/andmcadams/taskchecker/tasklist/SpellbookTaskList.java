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
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class SpellbookTaskList extends TaskList
{

	public SpellbookTaskList()
	{
		super("Miscellaneous spellbook related");
		initTasks();
	}

	public void initTasks()
	{
		addTask("Unlocked Teleport to Target", VarbitID.BOUNTY_TARGET_TELEPORT);
		addTask("Unlocked Ourania Teleport", VarbitID.RC_ZMI_LUNAR_SPELL);
		addTask("Unlocked the Death Charge upgrade", VarbitID.DEATH_CHARGE_SCROLL_USED);
		addTask("Unlocked the Home Teleport's Deadman 2024 animation option", VarbitID.DEADMAN_2024_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's Deadman 2026 animation option", VarbitID.DEADMAN_2026_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League I animation option", VarbitID.LEAGUE_TWISTED_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League II animation option", VarbitID.LEAGUE_TRAILBLAZER_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League III animation option", VarbitID.LEAGUE_3_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League 4 animation option", VarbitID.LEAGUE_4_HOME_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League 5 animation option", VarbitID.LEAGUE_5_HOME_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's League VI animation option", VarbitID.LEAGUE_6_HOME_TELEPORT_UNLOCKED);
		addTask("Unlocked the Home Teleport's Speedy animation option", VarbitID.SPEEDRUNNING_TELEPORT_UNLOCKED);
		addTask("Unlocked the Alchemy's League IV animation option", VarbitID.LEAGUE_4_HIGH_ALCH_ANIMATION_UNLOCKED);
		addTask("Unlocked the Vengeance's League IV animation option", VarbitID.LEAGUE_4_VENGEANCE_ANIMATION_UNLOCKED);
		//Unlocked Death's death Leagues IV animation option
		addTask("Unlocked Death's death Leagues IV animation option", VarbitID.LEAGUE_4_DEATH_ANIMATION_UNLOCKED);
		//Unlocked Death's death Leagues V animation option
		addTask("Unlocked Death's death Leagues V animation option", VarbitID.LEAGUE_5_DEATH_ANIMATION_UNLOCKED);
		//Unlocked the NPC Contact's League V animation option
		addGeTask(false, "Unlocked the Astral Contact's League V animation option", VarPlayerID.NPC_CONTACT_UNLOCKS, 3); // confirmed
		// Unlocked the imp thrall model
		addTask("Unlocked the Thrall's Leagues VI recolour option", VarbitID.LEAGUE_6_THRALL_OVERRIDE_UNLOCKED);

		//Unlocked the ability to select all characters via NPC Contact
		Task npcContactAllNpcs = new Task.TaskBuilder()
			.name("Unlocked the ability to select all characters via Astral Contact")
			// cooking >= 40 honest jimothy 1
			.geVar(true, VarbitID.HANDSAND_QUEST, 160) // Bert 2
			.geVar(false, VarPlayerID.MISC_QUEST, 100) // Advisor Ghrim 3
			.geVar(false, VarPlayerID.ABYSSAL_MINIQUEST, 4) // Dark mage 4
			// Lanthus default 5
			.geVar(true, VarbitID.PORCINE, 40) // Spria 6
			//.geVar(true, VarbitID.WGS_HERO_PART_1_VIS, 0) // Duradel and Turael -> Kuradal and Aya 7 and 8
			//.geVar(true, VarbitID.WGS_HERO_PART_1_VIS, 1) // Mazchna or the other fella 9
			//.geVar(true, VarbitID.MM2_SLAYER_MASTER, 1) // Nieve or Steve? 10
			// Vannaka default 11
			// Chaeldar default 12
			.geVar(true, VarbitID.WILDERNESS_MASTER_WARNING, 1) // Krystilia 13
			.geVar(true, VarbitID.KONAR_SPOKEN, 1) // Konar 14
			.geVar(true, VarbitID.MORTIMER_INTRODUCTION, 1) // Mortimer 15
			// fishing >= 15 murphy 16
			.geVar(true, VarbitID.DREAM_PROG, 16) // Cyrisus, wgs > 660 he is dead though :( 17
			.geVar(true, VarbitID.ZEAH_PLAYERHASVISITED, 1) // Smoggy 18
			.geVar(true, VarbitID.ZEAH_SHAYZIEN_METCRIMEFIGHTER, 1) // Shayzien captain ginea 19
			.geVar(true, VarbitID.TRAIL_WATSON_SPOKEN, 1) // Watson 20
			.eqVar(false, VarPlayerID.BARCRAWL, 0) // Barbarian fella 21
			.geVar(true, VarbitID.CON_CONTRACT_DISCUSSED, 1) // Amy
			.geVar(true, VarbitID.DREAM_PROG, 28) // random 22
			.build();
		this.add(npcContactAllNpcs);
		addGeTask(true, "Unlocked the Astral Contact spell's previous contract option", VarbitID.LUNAR_CONTACT_LASTID, 1);
	}
}

