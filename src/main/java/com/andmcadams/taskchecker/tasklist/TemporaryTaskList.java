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
		addTask("Listen to Fairy Aeryka's Puro-Puro introduction", VarbitID.II_FAIRY_VAR); // confirmed

		addTask("Listen to Sil'as Dahcsnu's initial dialogue", VarbitID.SUROK_MONKCHECK); // confirmed

		addTask("Listen to Dampe explain shade coffins", VarbitID.SHADES_DAMPE_INTRO);

		addTask("Listen to the Drunken Dwarf talk about his relative", VarbitID.GIANTDWARF_COUSIN_INTRODUCED); // confirmed

		addTask("Receive thanks from Hamal after completing Mountain Daughter", VarbitID.MDAUGHTER_HAMAL_HEARDOFBURIAL);

		Task claimRagAndBoneManIIRewards = new Task.TaskBuilder()
			.name("Claim the Rams skull helm and Bonesack from the Odd old man")
			.switchVar(true, VarbitID.RAG_HELMET)
			.switchVar(true, VarbitID.RAG_BONESACK)
			.build();

		addGeTask(true, "Unlock the NPC Contact spell's previous contract option", VarbitID.LUNAR_CONTACT_LASTID, 1);

		add(claimRagAndBoneManIIRewards);
	}
}

