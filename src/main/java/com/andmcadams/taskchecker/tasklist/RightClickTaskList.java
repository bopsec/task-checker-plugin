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
		Task unlockedRickBuyCrystal = new Task.TaskBuilder()
				.name("Unlocked Rick's buy-crystals option")
				.switchVar(true, VarbitID.RICK_HAS_OPENED_SHOP)
				.build();
		this.add(unlockedRickBuyCrystal);

		//Unlocked Historian Aldo's trade option
		Task unlockedHistorianAldoTradeOption = new Task.TaskBuilder()
				.name("Unlocked Historian Aldo's trade option")
				.switchVar(true, VarbitID.RAT_BOSS_BIOLOGIST_DIALOG)
				.build();
		this.add(unlockedHistorianAldoTradeOption);

		//TODO:Unlocked the Theatre of Blood chest's custom buy option couldn't find

		Task unlockJarvaldTravel = new Task.TaskBuilder()
			.name("Unlock Jarvald's travel option")
			.switchVar(true, VarbitID.DAG_ISLAND_QUICK_TRAVEL)
			.build();

		Task unlockMaryTan = new Task.TaskBuilder()
			.name("Unlock Mary's trade option")
			.switchVar(true, VarbitID.GA_MARY_DIALOGUE)
			.build();

		Task unlockIlfeenEnchant = new Task.TaskBuilder()
			.name("Unlock Ilfeen's enchant option")
			.switchVar(true, VarbitID.ILFEEN_PRIF)
			.build();

		Task unlockConwennaAndReeseSing = new Task.TaskBuilder()
			.name("Unlock Conwenna and Reese's sing option")
			.switchVar(true, VarbitID.PRIF_LEARNT_CRYSTAL_SINGING)
			.build();

		Task unlockNorannaConvertShards = new Task.TaskBuilder()
			.name("Unlock Noranna Tytanin's convert-shards option")
			.switchVar(true, VarbitID.DMINE_DAEYALT_CONVERTER_INTRO)
			.build();

		Task unlockMountainGuideTravel = new Task.TaskBuilder()
			.name("Unlock the Mountain Guide's travel option")
			.switchVar(true, VarbitID.RAIDS_GUIDE_TRAVEL_UNLOCK)
			.build();

		Task unlockCloisterBellQuickStart = new Task.TaskBuilder()
			.name("Unlock the Cloister Bell's quick-start option")
			.geVar(false, VarPlayerID.TOTAL_GARGBOSS_KILLS, 5)
			.build();


		Task unlockJewelleryBoxLastTeleport = new Task.TaskBuilder()
			.name("Unlock the Jewellery Box's previous teleport option")
			.geVar(true, VarbitID.POH_JEWELLERYBOX_MULTI, 1)
			.build();

		Task unlockCharterShipLastDestination = new Task.TaskBuilder()
			.name("Unlock the Charter Ship's previous destination option")
			.geVar(true, VarbitID.CHARTERING_PREVIOUS_DESTINATION, 1)
			.build();

		add(unlockJarvaldTravel);
		add(unlockMaryTan);
		add(unlockIlfeenEnchant);
		add(unlockConwennaAndReeseSing);
		add(unlockNorannaConvertShards);
		add(unlockMountainGuideTravel);
		add(unlockCloisterBellQuickStart);
		add(unlockJewelleryBoxLastTeleport);
		add(unlockCharterShipLastDestination);
	}
}
