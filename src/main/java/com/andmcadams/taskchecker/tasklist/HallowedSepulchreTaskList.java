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

public class HallowedSepulchreTaskList extends TaskList
{

	public HallowedSepulchreTaskList()
	{
		super("Hallowed Sepulchre");
		this.initTasks();
	}

	private void initTasks()
	{

		//Logged a fastest run for the Hallowed Sepulchre
		addTask("Logged a fastest run for the Hallowed Sepulchre", VarbitID.HALLOWED_TIME_PB_ALL); // TODO: Untested

		addTask("Give the Darkmeyer Slave 100 Hallowed Marks", VarbitID.HALLOWED_ADVENTURER_MARKS_GIVEN);

		addTask("Free the Knight of the Owl", VarbitID.HALLOWED_GHOST_OWLKNIGHT_FOUND);

		addTask("Free the Knight of the Lion", VarbitID.HALLOWED_GHOST_LIONKNIGHT_FOUND);

		addTask("Free the Knight of the Wolf", VarbitID.HALLOWED_GHOST_WOLFKNIGHT_FOUND);

		addTask("Free the Knight of the Unicorn", VarbitID.HALLOWED_GHOST_UNICORNKNIGHT_FOUND);

		addTask("Free the Archpriest of the Unicorn", VarbitID.HALLOWED_GHOST_ARCHPRIEST_FOUND);

		addTask("Unlock private instances", VarbitID.HALLOWED_PRIVATE_INSTANCES_PURCHASED);


	}
}

