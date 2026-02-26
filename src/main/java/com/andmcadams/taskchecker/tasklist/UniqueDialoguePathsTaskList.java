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

public class UniqueDialoguePathsTaskList extends TaskList
{

	public UniqueDialoguePathsTaskList()
	{
		super("Unique dialogue paths");
		initTasks();
	}

	public void initTasks()
	{

		//TODO:
		//Unlocked the ability to equip comp ogre bows
		Task unlockedCompOgreBows = new Task.TaskBuilder()
				.name("Unlocked the ability to equip comp ogre bows")
				.switchVar(true, VarbitID.THZFE_MAKECOMPOZOGREBOW)
				.build();
		this.add(unlockedCompOgreBows);
		//Unlocked the ability to recharge the pharaoh's sceptre
		Task rechargePharaohsSceptre = new Task.TaskBuilder()
				.name("Unlocked the ability to recharge the pharaoh's sceptre")
				.switchVar(true, VarbitID.PHARAOHS_SCEPTRE_MUMMY_MET) // TODO: Untested
				.build();
		//this.add(rechargePharaohsSceptre);

		//Unlocked the ability to offer Viero extra redberry antelopes
		Task vieroRedberryAntelopes = new Task.TaskBuilder()
				.name("Unlocked the ability to offer Viero extra redberry antelopes")
				.eqVar(true, VarbitID.HUEY_FOOD_ERRAND_STATE, 3)
				.build();
		this.add(vieroRedberryAntelopes);

		//Unlocked the ability to recolour weapons with Nigel
		Task nigelWeapons2024 = new Task.TaskBuilder()
				.name("Unlocked the ability to recolour 2024 weapons with Nigel")
				.switchVar(true, VarbitID.DEADMAN_2024_WEAPON_ORNAMENT_UNLOCKED)
				.build();
		this.add(nigelWeapons2024);

		Task nigelCapes2024 = new Task.TaskBuilder()
				.name("Unlocked the ability to recolour capes with Nigel")
				.switchVar(true, VarbitID.DEADMAN_2024_CAPE_ORNAMENT_UNLOCKED)
				.build();
		this.add(nigelCapes2024);

		Task deadmanAnnihilationPohUnlocked = new Task.TaskBuilder()
				.name("Unlocked the deadman annihilation house theme")
				.switchVar(true, VarbitID.DEADMAN_2026_POH_ORNAMENT_UNLOCKED)
				.build();
		this.add(deadmanAnnihilationPohUnlocked);

		Task deadmanAnnihilationWeapon = new Task.TaskBuilder()
				.name("Unlocked the deadman annihilation weapon themes")
				.switchVar(true, VarbitID.DEADMAN_2026_WEAPON_ORNAMENT_UNLOCKED)
				.build();
		this.add(deadmanAnnihilationWeapon);

		//Unlocked the ability to trade giantsoul amulets
		Task giantsoulAmuletTrade = new Task.TaskBuilder()
				.name("Unlocked the ability to trade giantsoul amulets")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(giantsoulAmuletTrade);

		//Paid Atlas for at least 2 training sessions
		Task atlasTwoOrMoreSessions = new Task.TaskBuilder()
				.name("Paid Atlas for at least 2 training sessions")
				.geVar(true, VarbitID.BIM_WORKOUT_COUNTER, 1) // idk kinda untested
				.build();
		this.add(atlasTwoOrMoreSessions);

		//Paid Madam Sikaro to make the voidwaker
		Task sikaroMadeVoidwaker = new Task.TaskBuilder()
				.name("Paid Madam Sikaro to make the voidwaker")
				.switchVar(true, VarbitID.WBR_ASSEMBLED_VOIDWAKER)
				.build();
		this.add(sikaroMadeVoidwaker);

		//Listened to Selim explain Osman's absence
		Task selimExplanation = new Task.TaskBuilder()
				.name("Listened to Selim explain Osman's absence")
				.switchVar(true, VarbitID.BCS_MET_SELIM) // TODO: Untested
				.build();
		this.add(selimExplanation);

		//Listened to Raqueel introduce herself and Gem
		Task raqueelIntroduction = new Task.TaskBuilder()
				.name("Listened to Raqueel introduce herself and Gem")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(raqueelIntroduction);

		//Listened to Tarik's request for pyramid loot
		Task tarikLootRequest = new Task.TaskBuilder()
				.name("Listened to Tarik's request for pyramid loot")
				.switchVar(true, VarbitID.TARIK_MET)
				.build();
		this.add(tarikLootRequest);

		//Listened to Al the Camel's confession of love for Ellie
		Task camelLoveConfession = new Task.TaskBuilder()
				.name("Listened to Al the Camel's confession of love for Ellie")
				.switchVar(true, VarbitID.AL_CAMEL_ADVICEGIVEN)
				.build();
		this.add(camelLoveConfession);

		//Listened to Death's tutorial after dying a dangerous death
		Task deathTutorial = new Task.TaskBuilder()
				.name("Listened to Death's tutorial after dying a dangerous death")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(deathTutorial);

		//Listened to Nathifa's gratitude
		Task nathifasGratitude = new Task.TaskBuilder()
				.name("Listened to Nathifa's gratitude")
				.switchVar(true, VarbitID.CONTACT_MET_BAKER)
				.build();
		this.add(nathifasGratitude);

		//Listened to Ali the Tea Seller's introduction
		Task aliTeaSellerIntro = new Task.TaskBuilder()
				.name("Listened to Ali the Tea Seller's introduction")
				.switchVar(true, VarbitID.OASIS_TEA_SELLER_MET)
				.build();
		this.add(aliTeaSellerIntro);

		//Listened to Cassim's introduction
		Task cassimIntroduction = new Task.TaskBuilder()
				.name("Listened to Cassim's introduction")
				.switchVar(true, VarbitID.OASIS_MAGE_MET)
				.build();
		this.add(cassimIntroduction);

		//Listened to Morgiana's introduction
		Task morgianaIntroduction = new Task.TaskBuilder()
				.name("Listened to Morgiana's introduction")
				.switchVar(true, VarbitID.OASIS_KNIGHT_MET)
				.build();
		this.add(morgianaIntroduction);

		//Listened to Hagus' gratitude for supporting the cause
		Task hagus1000Wraths = new Task.TaskBuilder()
				.name("Listened to Hagus' gratitude for supporting the cause")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(hagus1000Wraths);
		//Listened to Marcellus give permission to use his farming patch
		Task marcellusFarmingPermission = new Task.TaskBuilder()
				.name("Listened to Marcellus give permission to use his farming patch")
				.switchVar(true, VarbitID.FROG_QUEST_PATCH_UNLOCKED)
				.build();
		this.add(marcellusFarmingPermission);

		//Listened to Sir Tiffy Cashien's news from Akrisae
		Task sirTiffyAkrisaeNews = new Task.TaskBuilder()
				.name("Listened to Sir Tiffy Cashien's news from Akrisae")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(sirTiffyAkrisaeNews);

		//Listened to Gloria talk about Grand Champion rank
		Task gloriaGrandChampionTalk = new Task.TaskBuilder()
				.name("Listened to Gloria talk about Grand Champion rank")
				.switchVar(true, VarbitID.COLOSSEUM_GLORIA_MET) // TODO: Untested
				.build();
		this.add(gloriaGrandChampionTalk);

		//Listened to Harminia farming patch protection offer
		Task harminiaFarmingPatchProtection = new Task.TaskBuilder()
				.name("Listened to Harminia farming patch protection offer")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(harminiaFarmingPatchProtection);

		//Listened to Overseer Khougo interrogation about Mistrock
		Task khougoMistrockInterrogation = new Task.TaskBuilder()
				.name("Listened to Overseer Khougo interrogation about Mistrock")
				.switchVar(true, VarbitID.VARLAMORE_MISTROCK_OVERSEER) // TODO: Untested
				.build();
		this.add(khougoMistrockInterrogation);

		//Listened to your spirit tree's rotation complaints
		Task spiritTreeRotationComplaints = new Task.TaskBuilder()
				.name("Listened to your spirit tree's rotation complaints")
				.switchVar(true, VarbitID.POH_SPIRIT_TREE_UPROOTED) // TODO: Untested
				.build();
		this.add(spiritTreeRotationComplaints);

		//Listened to Taala's Hueycoatl introduction
		Task taalaIntroduction = new Task.TaskBuilder()
				.name("Listened to Taala's Hueycoatl introduction")
				.switchVar(true, VarbitID.HUEY_INTRO)
				.build();
		this.add(taalaIntroduction);

		//Listened to Izel introduce Hugh
		Task izelIntroduction = new Task.TaskBuilder()
				.name("Listened to Taala's Hueycoatl introduction")
				.switchVar(true, VarbitID.VARLAMORE_IZEL_MET)
				.build();
		this.add(izelIntroduction);

		//Listened to Mage of Zamorak's incantation description
		Task mageOfZammyIncantationDescription = new Task.TaskBuilder()
				.name("Listened to Mage of Zamorak's incantation description")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(mageOfZammyIncantationDescription);

		//Listened to a Street urchin's admiration for gladiators
		Task streetUrchinGladiatorAdmiration = new Task.TaskBuilder()
				.name("Listened to a Street urchin's admiration for gladiators")
				.switchVar(true, VarbitID.VARLAMORE_THIEVING_HOUSE_URCHIN_GLORY_MENTIONED)
				.build();
		this.add(streetUrchinGladiatorAdmiration);

		//Listened to the Windbreaker worker's Darkfrost introduction
		Task windbreakerDarkfrostIntroduction = new Task.TaskBuilder()
				.name("Listened to the Windbreaker worker's Darkfrost introduction")
				.switchVar(true, VarbitID.HUEY_MET_DWARF_WORKER)
				.build();
		this.add(windbreakerDarkfrostIntroduction);

		//Listened to the natural historians' introductions
		Task naturalHistorianIntroduction = new Task.TaskBuilder()
				.name("Listened to the natural historians' introductions")
				.switchVar(true, 0) // TODO: Unfound, probably VM_something
				.build();
		// this.add(naturalHistorianIntroduction);

		//Listened to the Mage of Zamorak's Z.M.I. origin story
		Task mageOfZammyZMIIntroduction = new Task.TaskBuilder()
				.name("Listened to the Mage of Zamorak's Z.M.I. origin story")
				.switchVar(true, VarbitID.TOTE_ZMI_POSTQUEST_CHAT) // TODO: Untested
				.build();
		this.add(mageOfZammyZMIIntroduction);

		//Listened to the Mysterious Bandit's introduction
		Task mysteriousBanditIntro = new Task.TaskBuilder()
				.name("Listened to the Mysterious Bandit's introduction")
				.switchVar(true, VarbitID.DT2_RING_NPC_MET_BEFORE) // TODO: Untested
				.build();
		this.add(mysteriousBanditIntro);

		//Listened to the Wise Old Man's bank robbery confession
		Task wiseOldManConfession = new Task.TaskBuilder()
				.name("Listened to the Wise Old Man's bank robbery confession")
				.eqVar(true, VarbitID.WOM_BANKJOB, 3) // TODO: Untested
				.build();
		this.add(wiseOldManConfession);

		//Listened to Oriana's bargain for valuables
		Task orianaValuablesBargain = new Task.TaskBuilder()
				.name("Listened to Oriana's bargain for valuables")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(orianaValuablesBargain);

		//Listened to all 3 of the haunted wine bottle's initial dialogues
		Task hauntedWineBottleDialogues = new Task.TaskBuilder()
				.name("Listened to all 3 of the haunted wine bottle's initial dialogues")
				.switchVar(true, VarbitID.HW21_SCARE_PROGRESS) // TODO: Unfound
				.build();
		//this.add(hauntedWineBottleDialogues);

		//Listened to Jim explain his wet cloth
		Task jimWetClothExplanation = new Task.TaskBuilder()
				.name("Listened to Jim explain his wet cloth")
				.switchVar(true, VarbitID.YAMA_IMP_CONTRACT_SIGNED) // TODO: Untested
				.build();
		this.add(jimWetClothExplanation);

		//Listened to the sergeant's advice
		Task sergeantsAdvice = new Task.TaskBuilder()
				.name("Listened to the sergeant's advice")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(sergeantsAdvice);

		//Told Archmage Sedridor about Wizard Persten's fate
		Task toldSedridorAboutPersten = new Task.TaskBuilder()
				.name("Told Archmage Sedridor about Wizard Persten's fate")
				.switchVar(true, VarbitID.DT2_SEDRIDOR_PERSTEN_DIALOGUE)
				.build();
		this.add(toldSedridorAboutPersten);

		//Told Miazrqa about her cousin's activities
		Task miazrqaCousins = new Task.TaskBuilder()
				.name("Told Miazrqa about her cousin's activities")
				.switchVar(true, 0) // TODO: Unfound, probably GRIM_something
				.build();
		//this.add(miazrqaCousins);

		//Told Ramarno about Ketla's fate
		Task toldRamarnoAboutKetla = new Task.TaskBuilder()
				.name("Told Ramarno about Ketla's fate")
				.switchVar(true, VarbitID.DT2_RAMARNO_KETLA_DIALOGUE)
				.build();
		this.add(toldRamarnoAboutKetla);

		//Told Sir Tiffy Cashien about the assassin's identity
		Task toldSirTiffyAboutAssassin = new Task.TaskBuilder()
				.name("Told Sir Tiffy Cashien about the assassin's identity")
				.switchVar(true, VarbitID.DT2_TIFFY_CHAT)
				.build();
		this.add(toldSirTiffyAboutAssassin);

		//Told King Bolren about Arposandra
		Task toldKingBolrenAboutArposandra = new Task.TaskBuilder()
				.name("Told King Bolren about Arposandra")
				.switchVar(true, VarbitID.POG_KING_BOLREN_DONE)
				.build();
		this.add(toldKingBolrenAboutArposandra);

		//Told Golrie about Yewnock's machine
		Task toldGolrieAboutYewnock = new Task.TaskBuilder()
				.name("Told Golrie about Yewnock's machine")
				.switchVar(true, VarbitID.POG_GOLRIE_RETURN)
				.build();
		this.add(toldGolrieAboutYewnock);

		//Told Longramble about the entrance to Arposandra
		Task toldLongrambleAboutArposandra = new Task.TaskBuilder()
				.name("Told Longramble about the entrance to Arposandra")
				.switchVar(true, VarbitID.POG_LONGRAMBLE_DONE)
				.build();
		this.add(toldLongrambleAboutArposandra);

		//Told Weave about the jar of venom
		Task toldWeaveAboutJarOfVenom = new Task.TaskBuilder()
				.name("Told Weave about the jar of venom")
				.switchVar(true, 0) // TODO: Unfound
				.build();
		//this.add(toldWeaveAboutJarOfVenom);

		//Told the head butler you won't join the union
		Task toldHeadButlerWontJoinUnion = new Task.TaskBuilder()
				.name("Told the head butler you won't join the union")
				.switchVar(true, 0) // TODO: Unfound, something DOTI_
				.build();
		//this.add(toldHeadButlerWontJoinUnion);


		Task unlockRosie = new Task.TaskBuilder()
			.name("Unlocked Rosie")
			.switchVar(true, VarbitID.PORCINE_ROSIE)
			.build();

		Task getDirectionsFromBaraek = new Task.TaskBuilder()
			.name("Get directions from Baraek")
			.geVar(false, VarPlayerID.PHOENIXGANG, 4)
			.build();

		Task buyStaffFromEblis = new Task.TaskBuilder()
			.name("Pay Eblis for an ancient staff")
			.switchVar(true, VarbitID.FD_GOT_ZAROS_STAFF)
			.build();

		Task askBrundtAboutMtnCamp = new Task.TaskBuilder()
			.name("Asked Chieftain Brundt about the Mountain Camp")
			.switchVar(true, VarbitID.MDAUGHTER_BRUNDT_DONE)
			.build();

		// Unsure about this one, but looks this way from chisel data
		Task talkToTrufitus = new Task.TaskBuilder()
			.name("Talk to Trufitus after completing Shilo Village")
			.eqVar(false, VarPlayerID.ZOMBIEQUEEN, 17)
			.build();

		// CAT - UNKNOWN
		Task listenToCatExplain = new Task.TaskBuilder()
			.name("Listen to your cat explain Icthlarin and the devourer again")
			.eqVar(true, VarbitID.ICS_TALKED_CATABOUTPRO, 3)
			.build();

		Task askDwarvenBoatmanAboutGold = new Task.TaskBuilder()
			.name("Asked the Dwarven Boatman about transporting gold")
			.switchVar(true, VarbitID.DWARFROCK_GOLD_BOATMAN_MET)
			.build();

		Task tellThreeDwarves = new Task.TaskBuilder()
			.name("Tell the three dwarven boatmen about the dwarven quests")
			.switchVar(true, VarbitID.DWARFROCK_BROTHERS_TOLDVICTORY)
			.switchVar(true, VarbitID.GIANTDWARF_BROTHERS_TOLDSUCCESS)
			.switchVar(true, VarbitID.FORGET_BROTHERS_TOLDSUCCESS)
			.build();

		// MIAZRQA - UNKNOWN

		Task askStreetUrchinToLureAgain = new Task.TaskBuilder()
			.name("Tell the Street urchin to lure another villager")
			.switchVar(true, VarbitID.FEUD_VAR_URCHIN)
			.build();

		Task informKnightOfVarlamore = new Task.TaskBuilder()
			.name("Tell the Knight of Varlamore about the sun altar")
			.switchVar(true, VarbitID.VARLAMORE_SUN_KNIGHT)
			.build();

		add(unlockRosie);
		add(getDirectionsFromBaraek);
		add(buyStaffFromEblis);
		add(askBrundtAboutMtnCamp);
		add(talkToTrufitus);
		add(listenToCatExplain);
		add(askDwarvenBoatmanAboutGold);
		add(tellThreeDwarves);
		add(askStreetUrchinToLureAgain);
		add(informKnightOfVarlamore);
	}

}
