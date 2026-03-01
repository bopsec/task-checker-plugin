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

public class LostItemsTaskList extends TaskList
{

	public LostItemsTaskList()
	{
		super("Lost items");
		initTasks();
	}

	public void initTasks()
	{
		//Delivered Sir Gerry's notes to Sir Tiffy Cashien
		addTask("Delivered Sir Gerry's notes to Sir Tiffy Cashien", VarbitID.GODWARS_SCROLL_DELIVERED); // TODO: Untested

		//TODO: Delivered a tangled toad's legs to Longramble

		Task returnZealotsKey = new Task.TaskBuilder()
			.name("Deliver Zealot's key to Zealot")
			.eqVar(true, VarbitID.HAUNTEDMINE_HEARDABOUTKEY, 0)
			.eqVar(false, VarPlayerID.HAUNTEDMINE, 11)
			.build();

		addTask("Return the brooch to Mistag", VarbitID.LOST_TRIBE_RETURNED_BROOCH);

		//add(returnCoppersCollar);
		add(returnZealotsKey);
	}

}

