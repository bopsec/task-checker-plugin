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
package com.andmcadams.taskchecker;

import com.andmcadams.taskchecker.tasklist.CapesTaskList;
import com.andmcadams.taskchecker.tasklist.ChampionsChallengeTaskList;
import com.andmcadams.taskchecker.tasklist.CombatAchievementsTaskList;
import com.andmcadams.taskchecker.tasklist.DoomsayerToggleTaskList;
import com.andmcadams.taskchecker.tasklist.EntrancesAndObstaclesTaskList;
import com.andmcadams.taskchecker.tasklist.EnvironmentalAlterationsTaskList;
import com.andmcadams.taskchecker.tasklist.ForgottenPrayerTaskList;
import com.andmcadams.taskchecker.tasklist.HallowedSepulchreTaskList;
import com.andmcadams.taskchecker.tasklist.HiddenShopsTaskList;
import com.andmcadams.taskchecker.tasklist.HolidaysAndRandomEventsTaskList;
import com.andmcadams.taskchecker.tasklist.InvisibleTaskList;
import com.andmcadams.taskchecker.tasklist.LMSandBHTaskList;
import com.andmcadams.taskchecker.tasklist.LootTaskList;
import com.andmcadams.taskchecker.tasklist.LostItemsTaskList;
import com.andmcadams.taskchecker.tasklist.MotherlodeMineTaskList;
import com.andmcadams.taskchecker.tasklist.PaymentsAndInstantExperienceTaskList;
import com.andmcadams.taskchecker.tasklist.PetTransmogsTaskList;
import com.andmcadams.taskchecker.tasklist.PetsTaskList;
import com.andmcadams.taskchecker.tasklist.PohBookcaseTaskList;
import com.andmcadams.taskchecker.tasklist.RedeemableQuestItemsTaskList;
import com.andmcadams.taskchecker.tasklist.RightClickTaskList;
import com.andmcadams.taskchecker.tasklist.SailingAmenities;
import com.andmcadams.taskchecker.tasklist.SkillingPerksTaskList;
import com.andmcadams.taskchecker.tasklist.SlayerRewardsTaskList;
import com.andmcadams.taskchecker.tasklist.SpellbookTaskList;
import com.andmcadams.taskchecker.tasklist.TaskList;
import com.andmcadams.taskchecker.tasklist.TitheFarmTaskList;
import com.andmcadams.taskchecker.tasklist.TransportationAndTeleportsTaskList;
import com.andmcadams.taskchecker.tasklist.TrappedSoulsTaskList;
import com.andmcadams.taskchecker.tasklist.TreasureTrailsTaskList;
import com.andmcadams.taskchecker.tasklist.UniqueDialoguePathsTaskList;
import com.andmcadams.taskchecker.tasklist.UnlimitedServicesTaskList;
import com.andmcadams.taskchecker.tasklist.UnplacedRandomTaskList;
import com.andmcadams.taskchecker.tasklist.UtilityItemTaskList;
import java.util.ArrayList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompleteTaskList
{

	private ArrayList<Task> tasks;

	@Getter
	private ArrayList<TaskList> taskLists = new ArrayList<>();

	public CompleteTaskList()
	{
		tasks = new ArrayList<>();
		this.initTasks();
	}

	public ArrayList<Task> getTasks()
	{
		// Shallow copy
		return (ArrayList<Task>) tasks.clone();
	}

	private void initTasks()
	{
		TaskList unplacedTasks = new UnplacedRandomTaskList();
		TaskList spellBookStuff = new SpellbookTaskList();
		TaskList hallowedSepulchre = new HallowedSepulchreTaskList();
		TaskList combatAchievements = new CombatAchievementsTaskList();
		TaskList petTransmogs = new PetTransmogsTaskList();
		TaskList sailingAmenities = new SailingAmenities();
		TaskList skillingPerks = new SkillingPerksTaskList();
		TaskList titheFarm = new TitheFarmTaskList();
		TaskList motherlodeMine = new MotherlodeMineTaskList();
		TaskList forgottenPrayers = new ForgottenPrayerTaskList();
		TaskList treasureTrails = new TreasureTrailsTaskList();
		TaskList championsChallenge = new ChampionsChallengeTaskList();
		TaskList slayerRewards = new SlayerRewardsTaskList();
		TaskList entrancesAndObstacles = new EntrancesAndObstaclesTaskList();
		TaskList rightClick = new RightClickTaskList();
		TaskList doomsayerWarnings = new DoomsayerToggleTaskList();
		TaskList unlimitedServices = new UnlimitedServicesTaskList();
		TaskList utilityItems = new UtilityItemTaskList();
		TaskList uniqueDialoguePaths = new UniqueDialoguePathsTaskList();
		TaskList loot = new LootTaskList();
		TaskList firePits = new EnvironmentalAlterationsTaskList();
		TaskList paymentsAndInstantExperience = new PaymentsAndInstantExperienceTaskList();
		TaskList hiddenShops = new HiddenShopsTaskList();
		TaskList lostItems = new LostItemsTaskList();
		TaskList trappedSouls = new TrappedSoulsTaskList();
		TaskList redeemableQuestItems = new RedeemableQuestItemsTaskList();
		TaskList invisible = new InvisibleTaskList();
		TaskList lmsAndBh = new LMSandBHTaskList();
		TaskList allPets = new PetsTaskList();
		TaskList transportsAndTeleports = new TransportationAndTeleportsTaskList();
		TaskList pohBookcase = new PohBookcaseTaskList();
		TaskList capes = new CapesTaskList();
		TaskList holidaysAndRandoms = new HolidaysAndRandomEventsTaskList();

		taskLists.add(capes);
		taskLists.add(championsChallenge);
		taskLists.add(combatAchievements);
		taskLists.add(doomsayerWarnings);
		taskLists.add(entrancesAndObstacles);
		taskLists.add(firePits);
		taskLists.add(forgottenPrayers);
		taskLists.add(hallowedSepulchre);
		taskLists.add(hiddenShops);
		taskLists.add(holidaysAndRandoms);
		taskLists.add(lmsAndBh);
		taskLists.add(loot);
		taskLists.add(lostItems);
		taskLists.add(motherlodeMine);
		taskLists.add(paymentsAndInstantExperience);
		//taskLists.add(allPets); // Discontinued, idk how to fix this
		taskLists.add(petTransmogs);
		taskLists.add(pohBookcase);
		taskLists.add(redeemableQuestItems);
		taskLists.add(rightClick);
		taskLists.add(sailingAmenities);
		taskLists.add(skillingPerks);
		taskLists.add(slayerRewards);
		taskLists.add(spellBookStuff);
		taskLists.add(titheFarm);
		taskLists.add(transportsAndTeleports);
		taskLists.add(trappedSouls);
		taskLists.add(treasureTrails);
		taskLists.add(uniqueDialoguePaths);
		taskLists.add(unlimitedServices);
		taskLists.add(unplacedTasks);
		taskLists.add(utilityItems);
		taskLists.add(invisible);

		int sum = 0;
		for (TaskList taskList : taskLists)
		{
			sum += taskList.getTasks().size();
		}
		log.info("Loaded " + sum + " tasks.");

	}

}
