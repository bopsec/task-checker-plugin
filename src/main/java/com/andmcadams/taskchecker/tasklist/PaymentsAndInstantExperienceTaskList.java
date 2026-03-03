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

public class PaymentsAndInstantExperienceTaskList extends TaskList
{

	public PaymentsAndInstantExperienceTaskList()
	{
		super("Payments and Instant experience");
		initTasks();
	}

	public void initTasks()
	{
		//TODO:Claimed Castle Wars tickets from Lanthus maybe VarbitID.PVPA_OWED_JOIN_REFUND?
		//TODO:Claimed blood runes from the Vyre well
		//Claimed coins from Willow's bag
		addTask("Claimed coins from Willow's bag", VarbitID.BIM_CLAIMED_REWARD); // Untested, but likely
		//TODO:Claimed coins from a Lovakengj minecart station conductor
		//TODO:Claimed coins from Trossa
		//Claimed XP from smithing a chromium ingot
		addEqTask(true, "Claimed XP from smithing a chromium ingot", VarbitID.CHROMIUM_CRAFTING_UNLOCKED, 3); // confirmed
		//TODO:Claimed XP from smithing an emberlight
		//TODO:Claimed XP from crafting a purging staff
		//TODO:Claimed XP from fletching a scorching bow
		//TODO:Claimed a clue scroll from a monkey from Ardougne Zoo not transmitted i think
		//Claimed a medium pouch from Archmage Sedridor
		addEqTask(true,"Claimed a medium pouch from Archmage Sedridor", VarbitID.TOTE_OWED_POUCH, 0);
		//Claimed a keris partisan from Maisa's tent
		addEqTask(true, "Claimed a keris partisan from Maisa's tent", VarbitID.BCS_OWED_PARTISAN, 0);
		//Claimed the circlet of water from the High Priest of Sophanem
		addEqTask(true, "Claimed the circlet of water from the High Priest of Sophanem", VarbitID.BCS_OWED_CIRCLET, 0);
		//TODO:Claimed an unholy mould from the Spirit of Scorpius
		//TODO:Claimed all 3 rewards from Tiadeche, Tinsay and Tamayu
		//Claimed all 4 XP drops (or lamps) from Radimus Erkle
		addEqTask(true, "Claimed all 4 XP drops (or lamps) from Radimus Erkle", VarbitID.LEGENDS_BONUS_LAMPS, 4);

		//TODO:Claimed all 6 XP drops from Combat Training Camp dummies
		//TODO:Claimed all 14 XP drops from Perdu
		//TODO:Claimed all Adventure Paths task rewards and starter kits

		addEqTask(false, "Claim wine from the Observatory assistant", VarPlayerID.ITGRONIGEN, 8);

		addTask("Claim coins from Bill Teach", VarbitID.FEVER_GIVEN_BOOK);

		addTask("Claim coins from Gordon", VarbitID.GA_REWARD);

		addTask("Claim coins from Lady Shauna Piscarillius", VarbitID.PISCQUEST_REWARD);

		addGeTask(true, "Claim experience from Duke", Varbits.MONKEY_MADNESS_II_PROGRESS.getId(), 200);

		addEqTask(true, "Claim experience from Ellen", VarbitID.DS2_COMBAT_TRAINING, 4);

		addTask("Claim experience from Mandy", VarbitID.MISTMYST_XPREWARD);

		addTask("Claim a clue scroll (beginner) from Veos", VarbitID.CLUEQUEST_CLUE_REWARD);

		addEqTask(true, "Claim a beer from Ali the Barman", VarbitID.FEUD_REPORT_DRINK, 2);

	}
}

