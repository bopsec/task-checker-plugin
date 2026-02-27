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
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class UnlimitedServicesTaskList extends TaskList
{

	public UnlimitedServicesTaskList()
	{
		super("Unlimited services");
		initTasks();
	}

	public void initTasks()
	{
		// TODO:
		//Paid Fossegrimen for free enchanted lyre imbues
		// VarbitID.FREMMY_TELE_FIXY?

		//Paid Petrified Pete for free entry to the Volcanic Mine couldnt find
		//Paid Matthias for free falcon rentals couldnt find
		//Paid Skully for the ability to toggle loot keys couldnt find
		//Paid the ghost captain for free trips to Dragontooth Island couldnt find

		Task boughtAllBankSlots = new Task.TaskBuilder()
				.name("Paid any banker for all 360 additional bank slots")
				.eqVar(true, VarbitID.BANK_EXTRA_BLOCKS_PURCHASED, 9)
				.build();

		Task enhanceCamulet = new Task.TaskBuilder()
			.name("Enhance the Camulet for one million coins")
			.eqVar(true, VarbitID.ENAKH_CAMULET_CHARGE, 7)
			.build();

		Task paySaniboch = new Task.TaskBuilder()
			.name("Pay Saniboch one million coins for permanent access to Brimhaven dungeon")
			.switchVar(true, VarbitID.KARAM_DUNGEON_PERMANENTACCESS)
			.build();

		Task payAndras = new Task.TaskBuilder()
			.name("Pay Andras for free trips to Slepe")
			.switchVar(true, VarbitID.ANDRAS_PERM_UNLOCK)
			.build();

		add(enhanceCamulet);
		add(paySaniboch);
		add(payAndras);
		add(boughtAllBankSlots);
	}
}
