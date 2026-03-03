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
		//Paid Fossegrimen for free enchanted lyre imbues TODO: Unfound? VarbitID.FREMMY_TELE_FIXY?
		//Paid Petrified Pete for free entry to the Volcanic Mine TODO: couldnt find
		//Paid Matthias for free falcon rentals TODO: couldnt find
		//Paid Skully for the ability to toggle loot keys TODO: couldnt find
		//Paid the ghost captain for free trips to Dragontooth Island TODO: couldnt find

		addEqTask(true, "Paid any banker for all 360 additional bank slots", VarbitID.BANK_EXTRA_BLOCKS_PURCHASED, 9);

		addEqTask(true, "Enhance the Camulet for one million coins", VarbitID.ENAKH_CAMULET_CHARGE, 7);

		addTask("Pay Saniboch one million coins for permanent access to Brimhaven dungeon", VarbitID.KARAM_DUNGEON_PERMANENTACCESS);

		addTask("Pay Andras for free trips to Slepe", VarbitID.ANDRAS_PERM_UNLOCK);

	}
}

