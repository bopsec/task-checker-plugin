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

public class PohBookcaseTaskList extends TaskList
{

	public PohBookcaseTaskList()
	{
		super("Books");
		initTasks();
	}

	public void initTasks()
	{
		//Disabled Chambers of Xeric book drops
		Task disabledCoxBooks = new Task.TaskBuilder()
			.name("Disabled Chambers of Xeric book drops")
			.switchVar(true, VarbitID.RAIDS_BOOK_CREATUREKEEPER_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_HOUNDMASTER_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_VASANISTIRIO_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_TEKTON_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_VANGUARD_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_VESPULA_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_REWARDCHEST_READ)
			.build();
		this.add(disabledCoxBooks);
		//Disabled Theatre of Blood book drops couldn't find these
		//Filled my notes with all 26 ancient pages couldnt find these
		//Filled the fossil island note book with all 21 entries couldn't see any varb changes
		//Filled the strange Hallowed tome with all 5 mysterious pages
		Task filledHallowedTome = new Task.TaskBuilder()
			.name("Filled the strange Hallowed tome with all 5 mysterious pages")
			.switchVar(true, VarbitID.HALLOWED_TOME_PAGE1)
			.switchVar(true, VarbitID.HALLOWED_TOME_PAGE2)
			.switchVar(true, VarbitID.HALLOWED_TOME_PAGE3)
			.switchVar(true, VarbitID.HALLOWED_TOME_PAGE4)
			.switchVar(true, VarbitID.HALLOWED_TOME_PAGE5)
			.build();
		this.add(filledHallowedTome);
		//Obtained Atlax's diary
		addTask("Obtained Atlax's diary", VarbitID.GOTR_BOOK_OBTAINED); // essentially confirmed
		//Obtained the Overseer's book
		addEqTask(true, "Obtained the Overseer's book", VarbitID.ABYSSALSIRE_LORE, 5); // TODO: Untested, seems kinda random
		//Obtained the Mount Karuulm diary
		addTask("Obtained the Mount Karuulm diary", VarbitID.KARUULM_NOTES_BOOK);
		//Obtained both Shades of Mort'ton texts
		Task obtainedShadesOfMorttonTexts = new Task.TaskBuilder()
			.name("Obtained both Shades of Mort'ton texts")
			.switchVar(true, VarbitID.SHADES_BLOOD_DIARY)
			.switchVar(true, VarbitID.SHADES_SWAMP_DIARY)
			.build();
		this.add(obtainedShadesOfMorttonTexts);
		//Obtained both Dragon Slayer II texts
		Task obtainedDs2Texts = new Task.TaskBuilder()
			.name("Obtained both Dragon Slayer II texts")
			.switchVar(true, VarbitID.DS2_LITHKREN_NOTES) // confirmed
			.switchVar(true, VarbitID.DS2_UNGAEL_NOTES) // confirmed
			.build();
		this.add(obtainedDs2Texts);
		//Obtained all 6 Uhld adventurer texts from the Myths' Guild
		addTask("Obtained all 6 Uhld adventurer texts from the Myths' Guild", VarbitID.DS2_GUILD_BOOKS); // TODO: Unchecked?
		//Obtained all 6 grand bookshelf texts from the Theatre of Blood
		//Obtained all 7 boss texts from the Chambers of Xeric
		Task obtainedAllCoxTexts = new Task.TaskBuilder()
			.name("Obtained all 7 boss texts from the Chambers of Xeric")
			.switchVar(true, VarbitID.RAIDS_BOOK_VESPULA_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_VANGUARD_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_TEKTON_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_REWARDCHEST_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_HOUNDMASTER_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_CREATUREKEEPER_READ)
			.switchVar(true, VarbitID.RAIDS_BOOK_VASANISTIRIO_READ)
			.build();
		this.add(obtainedAllCoxTexts);

		//Obtained all 7 desert god texts from the Tombs of Amascut
		Task obtainedAllToaBooks = new Task.TaskBuilder()
			.name("Obtained all 7 desert god texts from the Tombs of Amascut")
			.switchVar(true, VarbitID.TOA_BOOK_KEPHRI)
			.switchVar(true, VarbitID.TOA_BOOK_BABA)
			.switchVar(true, VarbitID.TOA_BOOK_ZEBAK)
			.switchVar(true, VarbitID.TOA_BOOK_AKKHA)
			.switchVar(true, VarbitID.TOA_BOOK_WARDENS)
			.switchVar(true, VarbitID.TOA_BOOK_ICTHLARIN)
			.switchVar(true, 0) // TODO: What is the last book?
			.build();
		this.add(obtainedAllToaBooks);

		//Obtained all 7 farming patch texts from the Farming Guild
		Task obtainedAllFarmingGuildTexts = new Task.TaskBuilder()
			.name("Obtained all 7 farming patch texts from the Farming Guild")
			.switchVar(true, VarbitID.FGUILD_BOOK_ALLOTMENTS)
			.switchVar(true, VarbitID.FGUILD_BOOK_BUSHES)
			.switchVar(true, VarbitID.FGUILD_BOOK_FLOWERS)
			.switchVar(true, VarbitID.FGUILD_BOOK_FRUIT)
			.switchVar(true, VarbitID.FGUILD_BOOK_HOPS)
			.switchVar(true, VarbitID.FGUILD_BOOK_HERBS)
			.switchVar(true, VarbitID.FGUILD_BOOK_TREES)
			.build();
		this.add(obtainedAllFarmingGuildTexts);
		// Obtained both Hunter Guild texts
		Task obtainedBothHunterGuildBooks = new Task.TaskBuilder()
			.name("Obtained both Hunter Guild texts")
			.switchVar(true, VarbitID.AUBURN_ECOLOGICAL_REPORTS) // confirmed
			.switchVar(true, VarbitID.CUSTODIAN_LOREBOOK) // confirmed
			.build();
		this.add(obtainedBothHunterGuildBooks);
		//Obtained all 16 elven texts from the Prifddinas Grand Library
		addTask("Obtained all 16 elven texts from the Prifddinas Grand Library", VarbitID.PRIF_BOOKS);
		//Obtained all 93 miscellaneous texts (2 are obtained by default) this is like 50 diff ones
		Task obtainedAllBooks = new Task.TaskBuilder() // anything added has been tested
			.name("Obtained all 93 miscellaneous texts (incomplete!)")
			.switchVar(true, VarbitID.HUEYCOATL_BOOK) // Huey book
			.switchVar(true, VarbitID.SLAYER_FOUND_DIARY) // Entomologist's diary
			.switchVar(true, VarbitID.GODWARS_DIARY_FOUND) // Keldagrim Explorer's Notes
			.switchVar(true, VarbitID.ALDARIN_WINE_BOOK) // Moonrise wines
			.switchVar(true, VarbitID.GA_JOURNAL) // Neilan's journal
			.switchVar(true, VarbitID.DARKMEYER_BOOK) // A taste of hope
			.switchVar(true, VarbitID.VIKINGEXILE_BALLAD) // Ballad of the basilisks or smth
			.switchVar(true, VarbitID.DS2_KARAMJA_DIARY) // Malumac's journal southwest karamjan temple
			.switchVar(true, VarbitID.MYQ4_SERAFINA_BOOK) // old diary? Serafina search crate in home
			// ancient diary not transmitted
			// lletya books not transmitted
			// Both ruins of unkah not transmitted
			// Ohn's diary Zulrah not transmitted
			// Diary of Charles Charlington in Tar Swamp not transmitted

			// Gianne's cookbook maybe auto after completing the diary step?
			// tome of the moon, sun, temple, think autocompleted after miniquest?
			.build();
		this.add(obtainedAllBooks);
	}
}

