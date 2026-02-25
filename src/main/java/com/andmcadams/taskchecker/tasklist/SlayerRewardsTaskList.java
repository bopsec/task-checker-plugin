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
import com.andmcadams.taskchecker.var.Var;
import net.runelite.api.gameval.VarbitID;

public class SlayerRewardsTaskList extends TaskList
{

	public SlayerRewardsTaskList()
	{
		super("Slayer Rewards");
		initTasks();
	}

	public void initTasks()
	{
		Task unlockGargoyleSmasher = new Task.TaskBuilder()
			.name("Unlock Gargoyle Smasher")
			.switchVar(true, VarbitID.SLAYER_AUTOKILL_GARGOYLES)
			.build();

		Task unlockSlugSalter = new Task.TaskBuilder()
			.name("Unlock Slug Salter")
			.switchVar(true, VarbitID.SLAYER_AUTOKILL_ROCKSLUGS)
			.build();

		Task unlockReptileFreezer = new Task.TaskBuilder()
			.name("Unlock Reptile Freezer")
			.switchVar(true, VarbitID.SLAYER_AUTOKILL_DESERTLIZARDS)
			.build();

		Task unlockShroomSprayer = new Task.TaskBuilder()
			.name("Unlock 'Shroom Sprayer")
			.switchVar(true, VarbitID.SLAYER_AUTOKILL_ZYGOMITES)
			.build();

		Task unlockBroaderFletching = new Task.TaskBuilder()
			.name("Unlock Broader Fletching")
			.switchVar(true, VarbitID.SLAYER_AMMO_UNLOCKED)
			.build();

		Task unlockMalevolentMasquerade = new Task.TaskBuilder()
			.name("Unlock Malevolent Masquerade")
			.switchVar(true, VarbitID.SLAYER_HELM_UNLOCKED)
			.build();

		Task unlockRingBling = new Task.TaskBuilder()
			.name("Unlock Ring Bling")
			.switchVar(true, VarbitID.SLAYER_RING_UNLOCKED)
			.build();

		Task unlockBiggerAndBadder = new Task.TaskBuilder()
			.name("Unlock Bigger and Badder")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_SUPERIORMOBS)
			.build();

		Task unlockKingBlackBonnet = new Task.TaskBuilder()
			.name("Unlock King Black Bonnet")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_BLACK)
			.build();

		Task unlockKalphiteKhat = new Task.TaskBuilder()
			.name("Unlock Kalphite Khat")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_GREEN)
			.build();

		Task unlockUnholyHelmet = new Task.TaskBuilder()
			.name("Unlock Unholy Helmet")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_RED)
			.build();

		Task unlockDarkMantle = new Task.TaskBuilder()
			.name("Unlock Dark Mantle")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_PURPLE)
			.build();

		Task unlockUndeadHead = new Task.TaskBuilder()
			.name("Unlock Undead Head")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_TURQUOISE)
			.build();

		Task unlockUseMoreHead = new Task.TaskBuilder()
			.name("Unlock Use More Head")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_HYDRA)
			.build();

		Task unlockDulyNoted = new Task.TaskBuilder()
			.name("Unlock Duly Noted")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_NOTEDMITHRILBARS)
			.build();

		Task unlockStopTheWyvern = new Task.TaskBuilder()
			.name("Unlock Stop the Wyvern")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_FOSSILWYVERNBLOCK)
			.build();

		Task unlockTwistedVision = new Task.TaskBuilder()
			.name("Unlock Twisted Vision")
			.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_TWISTED)
			.build();

		Task unlockTaskStorage = new Task.TaskBuilder()
				.name("Unlock Task Storage")
				.switchVar(true, VarbitID.SLAYER_UNLOCK_STORAGE)
				.build();

		Task unlockedRevenenenenenants = new Task.TaskBuilder()
				.name("Unlock Revenenenenenants")
				.switchVar(true, VarbitID.SLAYER_LONGER_REVENANTS)
				.build();

		Task unlockedEyeSeeYou = new Task.TaskBuilder()
				.name("Unlocked Eye See You")
				.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_ARAXYTE)
				.build();

		Task unlockedHoodedSlayerHelmet = new Task.TaskBuilder()
				.name("Unlocked hooded slayer helmet")
				.switchVar(true, VarbitID.SLAYER_UNLOCK_HELM_HOODED)
				.build();

		Task unlockedShayzienHelmEffect = new Task.TaskBuilder()
				.name("Unlocked Shayzien(5) effect on slayer helmet")
				.switchVar(true, VarbitID.KOUREND_SLAYER_HELM_BONUS)
				.build();

		add(unlockGargoyleSmasher);
		add(unlockSlugSalter);
		add(unlockReptileFreezer);
		add(unlockShroomSprayer);
		add(unlockBroaderFletching);
		add(unlockMalevolentMasquerade);
		add(unlockRingBling);
		add(unlockBiggerAndBadder);
		add(unlockKingBlackBonnet);
		add(unlockKalphiteKhat);
		add(unlockUnholyHelmet);
		add(unlockDarkMantle);
		add(unlockUndeadHead);
		add(unlockUseMoreHead);
		add(unlockDulyNoted);
		add(unlockStopTheWyvern);
		add(unlockTwistedVision);
		add(unlockTaskStorage);
		add(unlockedRevenenenenenants);
		add(unlockedEyeSeeYou);
		add(unlockedHoodedSlayerHelmet);
		add(unlockedShayzienHelmEffect);
	}
}
