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

		//TODO:
		//Logged a fastest run for the Hallowed Sepulchre

		Task freeDarkmeyerSlave = new Task.TaskBuilder()
			.name("Give the Darkmeyer Slave 100 Hallowed Marks")
			.switchVar(true, VarbitID.HALLOWED_ADVENTURER_MARKS_GIVEN)
			.build();

		Task freeKnightOfTheOwl = new Task.TaskBuilder()
			.name("Free the Knight of the Owl")
			.switchVar(true, VarbitID.HALLOWED_GHOST_OWLKNIGHT_FOUND)
			.build();

		Task freeKnightOfTheLion = new Task.TaskBuilder()
			.name("Free the Knight of the Lion")
			.switchVar(true, VarbitID.HALLOWED_GHOST_LIONKNIGHT_FOUND)
			.build();

		Task freeKnightOfTheWolf = new Task.TaskBuilder()
			.name("Free the Knight of the Wolf")
			.switchVar(true, VarbitID.HALLOWED_GHOST_WOLFKNIGHT_FOUND)
			.build();

		Task freeKnightOfTheUnicorn = new Task.TaskBuilder()
			.name("Free the Knight of the Unicorn")
			.switchVar(true, VarbitID.HALLOWED_GHOST_UNICORNKNIGHT_FOUND)
			.build();

		Task freeArchpriestOfTheUnicorn = new Task.TaskBuilder()
			.name("Free the Archpriest of the Unicorn")
			.switchVar(true, VarbitID.HALLOWED_GHOST_ARCHPRIEST_FOUND)
			.build();

		Task unlockPrivateInstances = new Task.TaskBuilder()
				.name("Unlock private instances")
				.switchVar(true, VarbitID.HALLOWED_PRIVATE_INSTANCES_PURCHASED)
				.build();

		this.add(freeDarkmeyerSlave);
		this.add(freeKnightOfTheLion);
		this.add(freeKnightOfTheOwl);
		this.add(freeKnightOfTheUnicorn);
		this.add(freeKnightOfTheWolf);
		this.add(freeArchpriestOfTheUnicorn);
		this.add(unlockPrivateInstances);

	}
}
