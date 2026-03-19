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
		//Claimed XP from smithing an emberlight not transmitted
		//Claimed XP from crafting a purging staff not transmitted
		//Claimed XP from fletching a scorching bow not transmitted
		//Claimed a clue scroll from a monkey from Ardougne Zoo not transmitted i think
		//Claimed a medium pouch from Archmage Sedridor
		addEqTask(true, "Claimed a medium pouch from Archmage Sedridor", VarbitID.TOTE_OWED_POUCH, 0);
		//Claimed a keris partisan from Maisa's tent
		addEqTask(true, "Claimed a keris partisan from Maisa's tent", VarbitID.BCS_OWED_PARTISAN, 0);
		//Claimed the circlet of water from the High Priest of Sophanem
		addEqTask(true, "Claimed the circlet of water from the High Priest of Sophanem", VarbitID.BCS_OWED_CIRCLET, 0);
		//Claimed an unholy mould from the Spirit of Scorpius no varbit/varp
		//Claimed all 3 rewards from Tiadeche, Tinsay and Tamayu, doesnt seem to exist
		//Claimed all 4 XP drops (or lamps) from Radimus Erkle
		addEqTask(true, "Claimed all 4 XP drops (or lamps) from Radimus Erkle", VarbitID.LEGENDS_BONUS_LAMPS, 0);

		//Claimed all 6 XP drops from Combat Training Camp dummies not transmitted
		//TODO:Claimed all 14 XP drops from Perdu who even has an acc with this not done atp
		//TODO:Claimed all Adventure Paths task rewards and starter kits

		addEqTask(false, "Claim wine from the Observatory assistant", VarPlayerID.ITGRONIGEN, 8);

		addTask("Claim coins from Bill Teach", VarbitID.FEVER_GIVEN_BOOK);

		addTask("Claim coins from Gordon", VarbitID.GA_REWARD);

		addTask("Claim coins from Lady Shauna Piscarillius", VarbitID.PISCQUEST_REWARD);

		addGeTask(true, "Claim experience from Duke", VarbitID.MM2_PROGRESS, 200);

		addEqTask(true, "Claim experience from Ellen", VarbitID.DS2_COMBAT_TRAINING, 4);

		addTask("Claim experience from Mandy", VarbitID.MISTMYST_XPREWARD);

		addTask("Claim a clue scroll (beginner) from Veos", VarbitID.CLUEQUEST_CLUE_REWARD);

		addEqTask(true, "Claim a beer from Ali the Barman", VarbitID.FEUD_REPORT_DRINK, 2);
		Task claimRagAndBoneManIIRewards = new Task.TaskBuilder()
			.name("Claim the Rams skull helm and Bonesack from the Odd old man")
			.switchVar(true, VarbitID.RAG_HELMET)
			.switchVar(true, VarbitID.RAG_BONESACK)
			.build();
		add(claimRagAndBoneManIIRewards);
		//Used the blessed lamp from Brother Tranquility
		addTask("Used the blessed lamp from Brother Tranquility", VarbitID.BRAIN_LAMP_USED);
		//Used the combat lamp from the High Priest
		addEqTask(true, "Used the combat lamp from the High Priest", VarbitID.CONTACT_USED_REWARD_LAMP, 2);
		//Used the dreamy lamp from the Oneiromancer
		addTask("Used the dreamy lamp from the Oneiromancer", VarbitID.DREAM_LAMPUSED);
		//Used the antique lamp from Maisa
		addTask("Used the antique lamp from Maisa", VarbitID.ITT_USED_LAMP);
		//Used the dusty lamp from the Strange Old Man
		addTask("Used the dusty lamp from the Strange Old Man", VarbitID.HFS_REWARD_LAMP);
		//Used the crypt map from the Strange Old Man
		addTask("Used the crypt map from the Strange Old Man", VarbitID.BARROWS_MAP); // Untested, likely correct
		//Used both antique lamps from Commander Fullore
		addTask("Used both antique lamps from Commander Fullore", VarbitID.AKD_LAMP_REWARD); // Untested, likely correct

		//Used all 3 tomes of experience from Ivan Strom
		Task ivanStromUsedExpTomes = new Task.TaskBuilder()
			.name("Used all 3 tomes of experience from Ivan Strom")
			.eqVar(true, VarbitID.MYQ3_TOME_XP, 3)
			.eqVar(true, VarbitID.MYQ4_XP_REWARD, 3)
			.eqVar(true, VarbitID.MYQ5_XP_REWARD, 3)
			//.switchVar(true, VarbitID.MYQ5_BONUS_XP_REWARD) what is this?
			.build();
		this.add(ivanStromUsedExpTomes);
		//Used all 3 ancient lamps from the Mysterious Bandit
		addTask("Used all 3 ancient lamps from the Mysterious Bandit", VarbitID.DT2_REWARD_LAMP);
		//Used all 3 antique lamps from Cabin Boy Herbert
		addTask("Used all 3 antique lamps from Cabin Boy Herbert", VarbitID.CLUEQUEST_LAMP_REWARD);
		//Used all 4 antique lamps from the Mysterious Stranger
		Task tobQuestLampsUsed = new Task.TaskBuilder()
			.name("Used all 4 antique lamps from the Mysterious Stranger")
			.eqVar(true, VarbitID.TOBQUEST_LAMPS, 3)
			.switchVar(true, VarbitID.TOBQUEST_BONUS_LAMPS)
			.build();
		this.add(tobQuestLampsUsed);

		//Used all 4 magic lamps from Hazelmere/Narnode Shareen
		Task pathOfGlouphrieLampsUsed = new Task.TaskBuilder()
			.name("Used all 4 magic lamps from Hazelmere/Narnode Shareen")
			.switchVar(true, VarbitID.POG_MAGIC_LAMP)
			.switchVar(true, VarbitID.POG_SLAYER_LAMP)
			.switchVar(true, VarbitID.POG_STRENGTH_LAMP)
			.switchVar(true, VarbitID.POG_THIEVING_LAMP)
			.build();
		this.add(pathOfGlouphrieLampsUsed);
		//Claimed all 3 XP rewards from the information clerk
		Task claimedAll3MuseumXpRewards = new Task.TaskBuilder()
			.name("Claimed all 3 XP rewards from the information clerk")
			.switchVar(true, VarbitID.VM_REWARD_50)
			.switchVar(true, VarbitID.VM_REWARD_100)
			.switchVar(true, VarbitID.VM_REWARD_150)
			.build();
		this.add(claimedAll3MuseumXpRewards);
		//Claimed XP from Orlando Smith
		addTask("Claimed XP from Orlando Smith", VarbitID.VM_NATHIS_REWARD_GIVEN); // why tf is he nathis
		//Claimed fossils from Peter after completing the notice board
		Task claimedFossilsAfterCompletingFossilBoard = new Task.TaskBuilder()
			.name("Claimed fossils from Peter after completing the notice board")
			.switchVar(true, VarbitID.FOSSIL_TASKREWARDS_CAMP)
			.switchVar(true, VarbitID.FOSSIL_TASKREWARDS_EAST)
			.switchVar(true, VarbitID.FOSSIL_TASKREWARDS_NORTH)
			.switchVar(true, VarbitID.FOSSIL_TASKREWARDS_SWAMP)
			.build();
		this.add(claimedFossilsAfterCompletingFossilBoard);
		//Claimed free food from Kamen in the Underground Pass
		addTask("Claimed free food from Kamen in the Underground Pass", VarbitID.UPASS_DWARF_FOOD); // confirmed
		//Claimed free food from Koftik in the Underground Pass
		addTask("Claimed free food from Koftik in the Underground Pass", VarbitID.REGICIDE_KOFTIK_FOOD); //
		//Claimed items from Elnock Inquisitor in Impetuous Impulses
		addTask("Claimed items from Elnock Inquisitor in Impetuous Impulses", VarbitID.II_ELNOCK_GIVEN_FREESTUFF);
		// Used the antique lamp from Prince Itzla (The final dawn)?
		addTask("Used the antique lamp from Prince Itzla", VarbitID.VMQ4_REWARD_LAMP_USED);
		// Claimed pints of whirlpool suprise from Rum-dashed Ralph
		addTask("Claimed pints of whirlpool suprise from Rum-dashed Ralph", VarbitID.SAILING_BT_TEMPOR_TANTRUM_COLLECTED_WHIRLPOOL_SURPRISE); // confirmed
		// Used XP lamp from Cow quest
		addTask("Used the magic lamp from Gillie Groats", VarbitID.COWBOSS_REWARD_LAMP); // confirmed
		// Claimed the Cowbell amulet after Ides of Milk
		addTask("Claim the Cowbell amulet", VarbitID.COWQUEST_REWARD); // confirmed
	}
}

