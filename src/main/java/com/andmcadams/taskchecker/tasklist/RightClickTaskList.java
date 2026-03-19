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

import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class RightClickTaskList extends TaskList
{

	public RightClickTaskList()
	{
		super("Right click menu options");
		initTasks();
	}

	public void initTasks()
	{
		//Unlocked Rick's buy-crystals option
		addTask("Unlocked Rick's buy-crystals option", VarbitID.RICK_HAS_OPENED_SHOP); // confirmed

		//Unlocked Historian Aldo's trade option
		addTask("Unlocked Historian Aldo's trade option", VarbitID.RAT_BOSS_BIOLOGIST_DIALOG);

		//Unlocked the Theatre of Blood chest's custom buy option
		addGeTask(true, "Unlocked the Theatre of Blood chest's custom buy option", VarbitID.TOB_MIDWAYCHEST_LAST_X, 1);

		addTask("Unlock Jarvald's travel option", VarbitID.DAG_ISLAND_QUICK_TRAVEL);

		addTask("Unlock Mary's trade option", VarbitID.GA_MARY_DIALOGUE);

		addTask("Unlock Ilfeen's enchant option", VarbitID.ILFEEN_PRIF);

		addTask("Unlock Conwenna and Reese's sing option", VarbitID.PRIF_LEARNT_CRYSTAL_SINGING);

		addTask("Unlock Noranna Tytanin's convert-shards option", VarbitID.DMINE_DAEYALT_CONVERTER_INTRO);

		addTask("Unlock the Mountain Guide's travel option", VarbitID.RAIDS_GUIDE_TRAVEL_UNLOCK);

		addGeTask(false, "Unlock the Cloister Bell's quick-start option", VarPlayerID.TOTAL_GARGBOSS_KILLS, 5);


		addGeTask(true, "Unlock the Jewellery Box's previous teleport option", VarbitID.POH_JEWELLERYBOX_MULTI, 1);

		addGeTask(true, "Unlock the Charter Ship's previous destination option", VarbitID.CHARTERING_PREVIOUS_DESTINATION, 1);
		//Unlocked Guildmaster Jane's contracts completed option
		addTask("Unlocked Guildmaster Jane's contracts option", VarbitID.FARMGUILD_CONTRACT_DISCUSSED); // technically superseded, but the contract count is not transmitted
		addTask("Unlocked the Trade option on Pennant", VarbitID.PRIF_ACORN_TRADE);
		// Listened to the Zombie pirate's story about his crew's whereabouts I tihnk this is the same as the next one?
		// Unlocked the zombie pirate's check option
		addEqTask(true, "Unlocked the zombie pirate's check option", VarbitID.WILDY_ZOMBIE_PIRATE_FRIENDLY_INTRO_CHAT, 2); // confirmed
		// Unlocked Sleve McDichael's rename-boat option
		addTask("Unlocked Sleve McDichael's rename-boat option", VarbitID.SLEVE_MCDICHAEL_MET); // confirmed
		// Unlocked both Brutus scoreboards
		addEqTask(true, "Unlocked both Brutus scoreboards", VarbitID.COWBOSS_SCOREBOARDS, 2); // confirmed
	}
}

