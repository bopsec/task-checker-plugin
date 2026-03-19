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
import net.runelite.api.gameval.VarbitID;

public class LMSandBHTaskList extends TaskList
{

	public LMSandBHTaskList()
	{
		super("PvP Minigame Unlocks");
		initTasks();
	}

	public void initTasks()
	{
		addGeTask(true, "Unlocked the Golden Armadyl Special", VarbitID.BH_UNLOCKS_AGS_SPEC, 1);
		//Unlocked the Golden Bandos Special
		addGeTask(true, "Unlocked the Golden Bandos Special", VarbitID.BH_UNLOCKS_BGS_SPEC, 1);
		//Unlocked the Golden Saradomin Special
		addGeTask(true, "Unlocked the Golden Saradomin Special", VarbitID.BH_UNLOCKS_SGS_SPEC, 1);
		//Unlocked the Golden Zamorak Special
		addGeTask(true, "Unlocked the Golden Zamorak Special", VarbitID.BH_UNLOCKS_ZGS_SPEC, 1);
		//
		//TODO: Couldn't find LMS wins varb/varp
		//Unlocked the ability to claim a victor's cape (1)
		//Unlocked the ability to claim a victor's cape (10)
		//Unlocked the ability to claim a victor's cape (50)
		//Unlocked the ability to claim a victor's cape (100)
		//Unlocked the ability to claim a victor's cape (500)
		//Unlocked the ability to claim a victor's cape (1000)
		//
		//TODO: Couldn't find BH wins (only the 2023 version?)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 1)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 2)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 3)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 4)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 5)
		//Unlocked the ability to claim a Bounty Hunter hat (tier 6)

		//Logged at least 1 count of opening spoils of war
		//
		//Unlocked the effect of Ava's assembler in Castle Wars
		addEqTask(true, "Unlocked the effect of Ava's assembler in Castle Wars", VarbitID.CASTLEWARS_AVA_REWARD_TIER, 3); // confirmed
		//Unlocked the effect of Ava's assembler in Soul Wars
		addEqTask(true, "Unlocked the effect of Ava's assembler in Soul Wars", VarbitID.SOUL_WARS_AVA_REWARD_TIER, 3); // confirmed


		//Claimed all weapon charge refunds from the Emblem Trader
		Task claimedBountyHunterWeaponChargeRefund = new Task.TaskBuilder()
			.name("Claimed all weapon charge refunds from the Emblem Trader")
			.eqVar(true, VarbitID.BH_MORRIGAN_AXE_REFUND_QUANTITY, 0)
			.eqVar(true, VarbitID.BH_MORRIGAN_JAVELIN_REFUND_QUANTITY, 0)
			.eqVar(true, VarbitID.BH_STATIUS_WARHAMMER_REFUND_QUANTITY, 0)
			.eqVar(true, VarbitID.BH_VESTA_SPEAR_REFUND_QUANTITY, 0)
			.eqVar(true, VarbitID.BH_ZURIEL_STAFF_REFUND_QUANTITY, 0)
			.build();
		this.add(claimedBountyHunterWeaponChargeRefund);


	}
}

