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

public class TreasureTrailsTaskList extends TaskList
{

	public TreasureTrailsTaskList()
	{
		super("Treasure Trails");
		initTasks();
	}

	public void initTasks()
	{

		Task unlockExploreEmote = new Task.TaskBuilder()
			.name("Unlock the Explore emote")
			.geVar(false, VarPlayerID.COMPLETED_CLUES5, 600)
			.build();

		Task unlockLargeSpade = new Task.TaskBuilder()
			.name("Unlock the Large spade")
			.geVar(false, VarPlayerID.COMPLETED_CLUES, 500)
			.build();

		Task unlockCluelessScroll = new Task.TaskBuilder()
			.name("Unlock the Clueless scroll")
			.geVar(false, VarPlayerID.COMPLETED_CLUES1, 400)
			.build();

		Task unlockUriTransformEmote = new Task.TaskBuilder()
			.name("Unlock the Uri transform emote")
			.geVar(false, VarPlayerID.COMPLETED_CLUES2, 300)
			.build();

		Task unlockHeavyCasket = new Task.TaskBuilder()
			.name("Unlock the Heavy casket")
			.geVar(false, VarPlayerID.COMPLETED_CLUES3, 200)
			.build();

		Task unlockScrollSack = new Task.TaskBuilder()
			.name("Unlock the Scroll sack")
			.geVar(false, VarPlayerID.COMPLETED_CLUES4, 100)
			.build();

		this.add(unlockExploreEmote);
		this.add(unlockLargeSpade);
		this.add(unlockCluelessScroll);
		this.add(unlockUriTransformEmote);
		this.add(unlockHeavyCasket);
		this.add(unlockScrollSack);
	}
}
