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

public class UniqueDialoguePathsTaskList extends TaskList
{

	public UniqueDialoguePathsTaskList()
	{
		super("Unique dialogue paths");
		initTasks();
	}

	public void initTasks()
	{
		//Unlocked the ability to equip comp ogre bows
		addTask("Unlocked the ability to equip comp ogre bows", VarbitID.THZFE_MAKECOMPOZOGREBOW);
		//Unlocked the ability to recharge the pharaoh's sceptre
		addTask("Unlocked the ability to recharge the pharaoh's sceptre", VarbitID.PHARAOHS_SCEPTRE_MUMMY_MET);
		//Unlocked the ability to offer Viero extra redberry antelopes
		addEqTask(true, "Unlocked the ability to offer Viero extra redberry antelopes", VarbitID.HUEY_FOOD_ERRAND_STATE, 3);

		//Unlocked the ability to recolour weapons with Nigel
		addTask("Unlocked the ability to recolour 2024 weapons with Nigel", VarbitID.DEADMAN_2024_WEAPON_ORNAMENT_UNLOCKED);

		addTask("Unlocked the ability to recolour capes with Nigel", VarbitID.DEADMAN_2024_CAPE_ORNAMENT_UNLOCKED);

		addTask("Unlocked the deadman annihilation house theme", VarbitID.DEADMAN_2026_POH_ORNAMENT_UNLOCKED);

		addTask("Unlocked the deadman annihilation weapon themes", VarbitID.DEADMAN_2026_WEAPON_ORNAMENT_UNLOCKED);

		//Unlocked the ability to trade giantsoul amulets
		//addTask("Unlocked the ability to trade giantsoul amulets", 0); // TODO: Unfound

		//Paid Atlas for at least 2 training sessions
		addGeTask(true, "Paid Atlas for at least 2 training sessions", VarbitID.BIM_WORKOUT_COUNTER, 2); // Unsure, probably fine like this

		//Paid Madam Sikaro to make the voidwaker
		addTask("Paid Madam Sikaro to make the voidwaker", VarbitID.WBR_ASSEMBLED_VOIDWAKER);

		//Listened to Selim explain Osman's absence
		addTask("Listened to Selim explain Osman's absence", VarbitID.BCS_MET_SELIM); // confirmed

		//Listened to Raqueel introduce herself and Gem // TODO: Unfound, might not exist

		//Listened to Tarik's request for pyramid loot
		addTask("Listened to Tarik's request for pyramid loot", VarbitID.TARIK_MET); // confirmed

		//Listened to Al the Camel's confession of love for Ellie
		addTask("Give some advice to Al the Camel", VarbitID.AL_CAMEL_ADVICEGIVEN); // confirmed, thanks sophie

		//Listened to Death's tutorial after dying a dangerous death
		//addTask("Listened to Death's tutorial after dying a dangerous death", 0); // TODO: Unfound

		//Listened to Nathifa's gratitude
		addTask("Listened to Nathifa's gratitude", VarbitID.CONTACT_MET_BAKER); // confirmed

		//Listened to Ali the Tea Seller's introduction
		addTask("Listened to Ali the Tea Seller's introduction", VarbitID.OASIS_TEA_SELLER_MET); // confirmed

		//Listened to Cassim's introduction
		addTask("Listened to Cassim's introduction", VarbitID.OASIS_MAGE_MET); // confirmed

		//Listened to Morgiana's introduction
		addTask("Listened to Morgiana's introduction", VarbitID.OASIS_KNIGHT_MET); // confirmed

		//Listened to Hagus' gratitude for supporting the cause
		//addTask("Listened to Hagus' gratitude for supporting the cause", 0); // TODO: Unfound
		//Listened to Marcellus give permission to use his farming patch
		addTask("Listened to Marcellus give permission to use his farming patch", VarbitID.FROG_QUEST_PATCH_UNLOCKED);

		//Listened to Sir Tiffy Cashien's news from Akrisae
		addTask("Listened to Sir Tiffy Cashien's news from Akrisae", VarbitID.WGS_TIFFY_CHAT); // i was wrong, current was right

		//Listened to Gloria talk about Grand Champion rank
		addTask("Listened to Gloria talk about Grand Champion rank", VarbitID.COLOSSEUM_GLORIA_MET); // confirmed

		//Listened to Harminia farming patch protection offer
		addTask("Listened to Harminia farming patch protection offer", VarbitID.COLOSSEUM_HERB_PATCH_CHAT); // confirmed

		//Listened to Overseer Khougo interrogation about Mistrock
		addEqTask(true, "Listened to Overseer Khougo interrogation about Mistrock", VarbitID.VARLAMORE_MISTROCK_OVERSEER, 3); // confirmed

		//Listened to your spirit tree's rotation complaints
		addTask("Listened to your spirit tree's rotation complaints", VarbitID.POH_SPIRIT_TREE_UPROOTED); // confirmed

		//Listened to Taala's Hueycoatl introduction
		addTask("Listened to Taala's Hueycoatl introduction", VarbitID.HUEY_INTRO); // confirmed

		//Listened to Izel introduce Hugh
		addTask("Listened to Izel's Hugh introduction", VarbitID.VARLAMORE_IZEL_MET); // confirmed

		//Listened to Mage of Zamorak's incantation description
		addTask("Listened to Mage of Zamorak's incantation description", VarbitID.TOTE_ZMI_POSTQUEST_CHAT); // confirmed

		//Listened to a Street urchin's admiration for gladiators
		addTask("Listened to a Street urchin's admiration for gladiators", VarbitID.VARLAMORE_THIEVING_HOUSE_URCHIN_GLORY_MENTIONED); // confirmed

		//Listened to the Windbreaker worker's Darkfrost introduction
		addTask("Listened to the Windbreaker worker's Darkfrost introduction", VarbitID.HUEY_MET_DWARF_WORKER); // confirmed

		//Listened to the natural historians' introductions
		addTask("Listened to the natural historians' introductions", VarbitID.VM_NATHIS_GOT_SPIEL); // confirmed

		//Listened to the Mage of Zamorak's Z.M.I. origin story
		addTask("Listened to the Mage of Zamorak's Z.M.I. origin story", VarbitID.TOWER_BURNING_ZAM_STORY); // confirmed

		//Listened to the Mysterious Bandit's introduction
		addTask("Listened to the Mysterious Bandit's introduction", VarbitID.DT2_RING_NPC_MET_BEFORE); // confirmed

		//Listened to the Wise Old Man's bank robbery confession
		addEqTask(true, "Listened to the Wise Old Man's bank robbery confession", VarbitID.WOM_BANKJOB, 3); // confirmed

		//Listened to Oriana's bargain for valuables
		addTask("Listened to Oriana's bargain for valuables", VarbitID.VARLAMORE_THIEVING_HOUSE_STRANGER_MET); // confirmed

		//Listened to all 3 of the haunted wine bottle's initial dialogue untransmitted

		//Listened to Jim explain his wet cloth
		addEqTask(true, "Listened to Jim explain his wet cloth", VarbitID.YAMA_IMP_CONTRACT_SIGNED, 2); // confirmed

		//Listened to the sergeant's advice not transmitted

		//Told Apprentice Felix about Wizard Persten's fate
		addTask("Told Apprentice Felix about Wizard Persten's fate", VarbitID.DT2_FELIX_DIALOGUE); // tested, correct

		//Told Miazrqa about her cousin's activities
		//addTask("Told Miazrqa about her cousin's activities", 0); // TODO: Unfound, probably GRIM_ something

		//Told Ramarno about Ketla's fate
		addTask("Told Ramarno about Ketla's fate", VarbitID.DT2_RAMARNO_SLISKE_DIALOGUE); // confirmed

		//Told Sir Tiffy Cashien about the assassin's identity
		addTask("Told Sir Tiffy Cashien about the assassin's identity", VarbitID.SOTN_TIFFY_CHAT); // confirmed

		//Told King Bolren about Arposandra
		addTask("Told King Bolren about Arposandra", VarbitID.POG_KING_BOLREN_DONE);

		//Told Golrie about Yewnock's machine
		addTask("Told Golrie about Yewnock's machine", VarbitID.POG_GOLRIE_RETURN);

		//Told Longramble about the entrance to Arposandra
		addTask("Told Longramble about the entrance to Arposandra", VarbitID.POG_LONGRAMBLE_DONE); // confirmed

		//addTask("Told Weave about the jar of venom", 0); // TODO: Unfound

		//Told the head butler you won't join the union
		addTask("Told the head butler you won't join the union", VarbitID.DOTI_MASK_DIALOGUE); // confirmed

		addTask("Unlocked Rosie", VarbitID.PORCINE_ROSIE);

		//addGeTask(false, "Get directions from Baraek", VarPlayerID.PHOENIXGANG, 4); this task seems to be discontinued

		addTask("Pay Eblis for an ancient staff", VarbitID.FD_GOT_ZAROS_STAFF);

		addTask("Asked Chieftain Brundt about the Mountain Camp", VarbitID.MDAUGHTER_BRUNDT_DONE);

		// Unsure about this one, but looks this way from chisel data
		addEqTask(false, "Talk to Trufitus after completing Shilo Village", VarPlayerID.ZOMBIEQUEEN, 17);


		addTask("Asked the Dwarven Boatman about transporting gold", VarbitID.DWARFROCK_GOLD_BOATMAN_MET);

		Task tellThreeDwarves = new Task.TaskBuilder()
			.name("Tell the three dwarven boatmen about the dwarven quests")
			.switchVar(true, VarbitID.DWARFROCK_BROTHERS_TOLDVICTORY)
			.switchVar(true, VarbitID.GIANTDWARF_BROTHERS_TOLDSUCCESS)
			.switchVar(true, VarbitID.FORGET_BROTHERS_TOLDSUCCESS)
			.build();
		add(tellThreeDwarves);
		// MIAZRQA - UNKNOWN
		//Unlocked the ability to respawn at Kourend Castle
		addTask("Unlocked the ability to respawn at Kourend Castle", VarbitID.AKD_ASTEROS_MET);
		//Told Litara about what happened to Solztun
		addEqTask(true, "Told Litara about what happened to Solztun", VarbitID.SOS_BROTHER_FOUND, 2);
		addTask("Tell the Street urchin to lure another villager", VarbitID.FEUD_VAR_URCHIN); // confirmed
		addTask("Listen to Fairy Aeryka's Puro-Puro introduction", VarbitID.II_FAIRY_VAR); // confirmed

		addTask("Listen to Sil'as Dahcsnu's initial dialogue", VarbitID.SUROK_MONKCHECK); // confirmed

		addTask("Listen to Dampe explain shade coffins", VarbitID.SHADES_DAMPE_INTRO);

		addTask("Listen to the Drunken Dwarf talk about his relative", VarbitID.GIANTDWARF_COUSIN_INTRODUCED); // confirmed

		addTask("Receive thanks from Hamal after completing Mountain Daughter", VarbitID.MDAUGHTER_HAMAL_HEARDOFBURIAL);
		//Unlocked the candle seller's lantern making option
		addTask("Unlocked the candle seller's lantern making option", VarbitID.SWAMP_CANDLE_GUY_CONVERSATION); // confirmed

		addTask("Tell the Knight of Varlamore about the sun altar", VarbitID.VARLAMORE_SUN_KNIGHT);
		//Unlocked the ability to create Neitiznot faceguards
		addTask("Unlocked the ability to create Neitiznot faceguards", VarbitID.VIKINGEXILE_HELM_UNLOCK);
		//Unlocked the ability to create super antifire potions
		addTask("Unlocked the ability to create super antifire potions", VarbitID.SUPER_ANTIFIRE_UNLOCKED);
		//Unlocked the ability to create sextants and watches no varb/varp
		//Unlocked the ability to create ancient icons
		addTask("Unlocked the ability to create ancient icons", VarbitID.DT2_PLAYER_LEARNED_ICON_FUSING);
		//Revealed the bank camel's name
		addTask("Revealed the bank camel's name", VarbitID.TOA_CAMEL_NAME_LEARNED);
		//Unlocked access to the basement of the Warriors' Guild
		addTask("Unlocked access to the basement of the Warriors' Guild", VarbitID.WARGUILD_BASEMENT_ACCESS);
		//Revealed the human translation of the Cosmic Being's name
		addTask("Revealed the human translation of the Cosmic Being's name", VarbitID.FAIRY2_UNIVERSAL_MYSTERY); // confirmed
		//Revealed the stranger's true appearance in the Canifis pub
		addTask("Revealed the stranger's true appearance in the Canifis pub", VarbitID.THSFM_VANSTROM_HIDE); // confirmed, ty sophie
		//Listened to Ru Merald's Gem Crab intro
		addTask("Listened to Ru Merald's gemstone crab directions", VarbitID.GEMSTONE_CRAB_INTRO);

		//Unlocked Simon Templeton's pyramid artefacts option
		addTask("Unlocked Simon Templeton's pyramid artefacts option", VarbitID.AGILITY_PYRAMID_SIMON_JOB_DONE); // tested

		//Unlocked all 3 of Juna's story options
		addEqTask(true, "Unlocked all 3 of Juna's story options", VarbitID.TOG_JUNA_STORIES, 4); // confirmed
		//Unlocked all 4 of Ali Morrisane workers' threatening option
		Task unlockedAllMorrisaneWorkersThreateningOption = new Task.TaskBuilder()
			.name("Unlocked all 4 of Ali Morrisane workers' threatening option")
			.switchVar(true, VarbitID.FARMER_THREATEN)
			.switchVar(true, VarbitID.SMITH_THREATEN)
			.switchVar(true, VarbitID.TAILOR_THREATEN)
			.switchVar(true, VarbitID.GUARD_THREATEN)
			.build();
		this.add(unlockedAllMorrisaneWorkersThreateningOption);

		//Unlocked Farmer Gricoller's visitors option
		addTask("Unlocked Farmer Gricoller's visitors option", VarbitID.DARKMEYER_VYRE_TITHE_DIALOGUE); // TODO: Untested
		// Unlocked Gabooty's shop open option
		addTask("Unlocked Gabooty's shop open option", VarbitID.GABOOTYSHOPCHAT); // confirmed
		// Listened to Shantay introduce the Shantay Pass no varb/varp
		// Listened to Razmire's directions to the Shade Lair
		addBitTask(false, "Listened to Razmire's directions to the Shade Lair", VarPlayerID.MORTTONMULTI, 29);
		// 1128137189 -> 1665008101 (1000011001111100000000111100101 -> 1100011001111100000000111100101) diff is in bit 29
		// Told the Carnillean guard about the assassin (DT2)
		addTask("Told the Carnillean guard about the assassin", VarbitID.DT2_GUARD_CARNILLEAN_DIALOGUE); // confirmed
		// Listened to the builders' advice (Final Dawn)
		addTask("Listened to the builders' advice", VarbitID.PMOON_BUILDERS_VMQ4_CHAT); // confirmed
		// Listened to Jessamine about the final dawn
		addTask("Talk to Jessamine after The Final Dawn", VarbitID.PMOON_JESS_VMQ4_CHAT); // confirmed
		// Listened to the Elder Nama's gryphon warning
		addTask("Listened to the Elder Nama's gryphon warning", VarbitID.SLAYER_GRYPHON_BOSS_GUARDIAN_MET);
		// Told King her men helped with the egg (Scrambled!)
		addTask("Told King her men helped with the egg", VarbitID.SCRAMBLED_FINAL_KING_DIALOGUE); // confirmed
		// Told Attala about Mokhaiotl (The final dawn)
		addTask("Told Attala about Mokhaiotl", VarbitID.VMQ4_ATTALA_POST_QUEST_CHAT); // confirmed
		// Told Eyatlalli about Mokhaiotl (The final dawn)
		addTask("Told Eyatlalli about Mokhaiotl", VarbitID.VMQ4_EYATLALLI_POST_QUEST_CHAT); // confirmed
		// Told Bernard that Bernina is proud of him
		addEqTask(true, "Talk to Bernard on top of The Proudspire", VarbitID.SPIRITOFADVENTURE, 6); // confirmed
		// Told Xilo and Fabia where to find each other
		//addEqTask(true, "Told Xilo and Fabia where to find each other", VarbitID.TLATI_LOST_LOVER_FABIA, 2); // confirmed
		Task xiloAndFabia = new Task.TaskBuilder()
			.name("Told Xilo and Fabia where to find each other")
			.geSumVars(true, 2, VarbitID.TLATI_LOST_LOVER_FABIA, VarbitID.TLATI_LOST_LOVER_XILO)
			.build(); // why does this "quest" have two different outcomes l0l
		this.add(xiloAndFabia);
		// Unlocked the ability to trade Thorgel for death talismans
		addTask("Unlocked the ability to trade Thorgel for death talismans", VarbitID.MOURNING_DWARF_STARTEDTASK); // confirmed
		// Listened to the summary of Ulfric's parchment (Olaf's Quest)
		addTask("Listened to the summary of Ulfric's parchment", VarbitID.OLAF2_READ_NOTE); // confirmed
		// Listened to the Friendly Forester explain Forestry
		addTask("Listened to the Friendly Forester explain Forestry", VarbitID.FORESTRY_FORESTER_MET); // confirmed
		// Listened to the Mountain Guide's offer for help
		addTask("Listened to the Mountain Guide's offer for help", VarbitID.MET_AUBURN_MOUNTAIN_GUIDE); // confirmed
		// Listened to the Pilgrim introduce the Pilgrim Path (https://oldschool.runescape.wiki/w/Pilgrim)
		addTask("Listened to the Pilgrim introduce the Pilgrim Path", VarbitID.VARLAMORE_PILGRIM_MET); // confirmed
		// Told Betty the meaning of the notes (Ethically Acquired Antiquities)
		addTask("Told Betty the meaning of the notes", VarbitID.EAA_BETTY_TOLD_ABOUT_NOTE); // confirmed
		// Asked Charlie the Tramp about the black arm gang
		addTask("Asked Charlie the Tramp about the black arm gang", VarbitID.SOA_CHARLIE_MET); // confirmed
		// Listened to Netmaster Kellan introduce deep sea trawling
		addTask("Listened to Netmaster Kellan introduce deep sea trawling", VarbitID.PORT_ROBERTS_NETMASTER_KELLAN_MET); // confirmed
		// Read the warning sign at Jiggig
		addTask("Attempt to pick-lock the northernmost coffin just outside Jiggig", VarbitID.THZFE_COFFINMESSAGE); // confirmed
		// Listened to Biles's introduction to the Drumstick Kingdom
		addTask("Listened to Biles's introduction to the Drumstick Kingdom", VarbitID.BILES_MET);
		// Unlocked Ali Morisane's gnome question option
		addTask("Unlocked Ali Morisane's gnome question option", VarbitID.ALI_GNOME_RIVALRY); // confirmed
		// Listened to the vineyard foreman's ripe grape request
		addTask("Listened to the vineyard foreman's ripe grape request", VarbitID.ALDARIN_GRAPES_INTRO); // confirmed
		// Listened to Petrus describe minotaurs
		addTask("Listened to Petrus describe minotaurs", VarbitID.MINOTAURS_REST_BEASTMASTER_MET);
		// Paid Brass Hand Harry for a sailing cape
		addTask("Paid Brass Hand Harry for a sailing cape", VarbitID.SKILLCAPE_SAILING_PURCHASED); // confirmed
		// Unlocked the ability to use Chet's coral nurseries.
		addTask("Unlocked the ability to use Chet's coral nurseries.", VarbitID.CONCH_CORAL_PATCHES_UNLOCKED);
		// Pet Gus after the final dawn
		addTask("Pet Gus the dog after The Final Dawn", VarbitID.NPC_DOG_GUS_DIALOGUE);
	}

}

