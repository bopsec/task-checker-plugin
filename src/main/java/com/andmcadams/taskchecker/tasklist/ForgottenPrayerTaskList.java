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

public class ForgottenPrayerTaskList extends TaskList
{

	public ForgottenPrayerTaskList()
	{
		super("Additional scroll unlocks");
		initTasks();
	}

	public void initTasks()
	{
		Task avoidAbyssalDemonTeleports = new Task.TaskBuilder()
				.name("Unlocked the ability to avoid teleport attacks")
				.switchVar(true, VarbitID.BLIP_BLOCKING_SCROLL_USED)
				.build();
		this.add(avoidAbyssalDemonTeleports);

		Task unlockRigour = new Task.TaskBuilder()
			.name("Unlock Rigour")
			.switchVar(true, VarbitID.PRAYER_RIGOUR_UNLOCKED)
			.build();

		Task unlockAugury = new Task.TaskBuilder()
			.name("Unlock Augury")
			.switchVar(true, VarbitID.PRAYER_AUGURY_UNLOCKED)
			.build();

		Task unlockPreserve = new Task.TaskBuilder()
			.name("Unlock Preserve")
			.switchVar(true, VarbitID.PRAYER_PRESERVE_UNLOCKED)
			.build();

		Task unlockDeadeye = new Task.TaskBuilder()
				.name("Unlock Deadeye")
				.switchVar(true, VarbitID.PRAYER_DEADEYE_UNLOCKED)
				.build();

		Task unlockMysticVigour = new Task.TaskBuilder()
				.name("Unlock Mystic Vigour")
				.switchVar(true, VarbitID.PRAYER_MYSTIC_VIGOUR_UNLOCKED)
				.build();

		this.add(unlockPreserve);
		this.add(unlockRigour);
		this.add(unlockAugury);
		this.add(unlockDeadeye);
		this.add(unlockMysticVigour);
	}
}
