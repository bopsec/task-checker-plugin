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

public class TemporaryTaskList extends TaskList
{

	public TemporaryTaskList()
	{
		super("Other tasks");
		initTasks();
	}

	public void initTasks()
	{
		Task meetFairyAeryka = new Task.TaskBuilder()
			.name("Listen to Fairy Aeryka's Puro-Puro introduction")
			.switchVar(true, VarbitID.II_FAIRY_VAR)
			.build();

		Task meetSilasDahcsnu = new Task.TaskBuilder()
			.name("Listen to Sil'as Dahcsnu's initial dialogue")
			.switchVar(true, VarbitID.SUROK_MONKCHECK)
			.build();

		Task meetDampe = new Task.TaskBuilder()
			.name("Listen to Dampe explain shade coffins")
			.switchVar(true, VarbitID.SHADES_DAMPE_INTRO)
			.build();

		Task meetDrunkenDwarf = new Task.TaskBuilder()
			.name("Listen to the Drunken Dwarf talk about his relative")
			.switchVar(true, VarbitID.GIANTDWARF_COUSIN_INTRODUCED)
			.build();

		Task receiveThanksFromHamal = new Task.TaskBuilder()
			.name("Receive thanks from Hamal after completing Mountain Daughter")
			.switchVar(true, VarbitID.MDAUGHTER_HAMAL_HEARDOFBURIAL)
			.build();

		Task buyCandleFromCandleSeller = new Task.TaskBuilder()
			.name("Buy a candle from the Candle Seller in Lumbridge Swamp and listen to his warning")
			.switchVar(true, VarbitID.SWAMP_CANDLE_GUY_CONVERSATION)
			.build();

		Task claimRagAndBoneManIIRewards = new Task.TaskBuilder()
			.name("Claim the Rams skull helm and Bonesack from the Odd old man")
			.switchVar(true, VarbitID.RAG_HELMET)
			.switchVar(true, VarbitID.RAG_BONESACK)
			.build();

		Task zeahWorkbenchNails = new Task.TaskBuilder()
			.name("Loot the workbench containing iron nails at Gordon's farm")
			.switchVar(true, VarbitID.GA_NAILS_GIVEN)
			.build();

		Task piscatorisTools = new Task.TaskBuilder()
			.name("Loot the bronze axe and pickaxe in the Piscatoris fishing colony")
			.switchVar(true, VarbitID.SWANSONG_PICKAXE)
			.switchVar(true, VarbitID.SWANSONG_HATCHET)
			.build();

		Task unlockNPCContactLastContact = new Task.TaskBuilder()
			.name("Unlock the NPC Contact spell's previous contract option")
			.geVar(true, VarbitID.LUNAR_CONTACT_LASTID, 1)
			.build();

		add(meetFairyAeryka);
		add(meetSilasDahcsnu);
		add(meetDampe);
		add(meetDrunkenDwarf);
		add(receiveThanksFromHamal);
		add(buyCandleFromCandleSeller);
		add(claimRagAndBoneManIIRewards);
		add(zeahWorkbenchNails);
		add(piscatorisTools);
		add(unlockNPCContactLastContact);
	}
}
