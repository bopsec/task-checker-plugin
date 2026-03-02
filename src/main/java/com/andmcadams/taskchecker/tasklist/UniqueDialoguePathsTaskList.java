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
		addGeTask(true, "Paid Atlas for at least 2 training sessions", VarbitID.BIM_WORKOUT_COUNTER, 2); // TODO: Unsure

		//Paid Madam Sikaro to make the voidwaker
		addTask("Paid Madam Sikaro to make the voidwaker", VarbitID.WBR_ASSEMBLED_VOIDWAKER);

		//Listened to Selim explain Osman's absence
		addTask("Listened to Selim explain Osman's absence", VarbitID.BCS_MET_SELIM); // TODO: Untested

		//Listened to Raqueel introduce herself and Gem
		//addTask("Listened to Raqueel introduce herself and Gem", 0); // TODO: Unfound

		//Listened to Tarik's request for pyramid loot
		addTask("Listened to Tarik's request for pyramid loot", VarbitID.TARIK_MET);

		//Listened to Al the Camel's confession of love for Ellie
		addTask("Listened to Al the Camel's confession of love for Ellie", VarbitID.AL_CAMEL_ADVICEGIVEN);

		//Listened to Death's tutorial after dying a dangerous death
		//addTask("Listened to Death's tutorial after dying a dangerous death", 0); // TODO: Unfound

		//Listened to Nathifa's gratitude
		addTask("Listened to Nathifa's gratitude", VarbitID.CONTACT_MET_BAKER);

		//Listened to Ali the Tea Seller's introduction
		addTask("Listened to Ali the Tea Seller's introduction", VarbitID.OASIS_TEA_SELLER_MET);

		//Listened to Cassim's introduction
		addTask("Listened to Cassim's introduction", VarbitID.OASIS_MAGE_MET);

		//Listened to Morgiana's introduction
		addTask("Listened to Morgiana's introduction", VarbitID.OASIS_KNIGHT_MET);

		//Listened to Hagus' gratitude for supporting the cause
		//addTask("Listened to Hagus' gratitude for supporting the cause", 0); // TODO: Unfound
		//Listened to Marcellus give permission to use his farming patch
		addTask("Listened to Marcellus give permission to use his farming patch", VarbitID.FROG_QUEST_PATCH_UNLOCKED);

		//Listened to Sir Tiffy Cashien's news from Akrisae
		//addTask("Listened to Sir Tiffy Cashien's news from Akrisae", VarbitID.WGS_TIFFY_CHAT); // TODO: Unfound, current is wrong

		//Listened to Gloria talk about Grand Champion rank
		addTask("Listened to Gloria talk about Grand Champion rank", VarbitID.COLOSSEUM_GLORIA_MET); // TODO: Untested

		//Listened to Harminia farming patch protection offer
		addTask("Listened to Harminia farming patch protection offer", VarbitID.COLOSSEUM_HERB_PATCH_CHAT);

		//Listened to Overseer Khougo interrogation about Mistrock
		addEqTask(true, "Listened to Overseer Khougo interrogation about Mistrock", VarbitID.VARLAMORE_MISTROCK_OVERSEER, 3);

		//Listened to your spirit tree's rotation complaints
		addTask("Listened to your spirit tree's rotation complaints", VarbitID.POH_SPIRIT_TREE_UPROOTED);

		//Listened to Taala's Hueycoatl introduction
		addTask("Listened to Taala's Hueycoatl introduction", VarbitID.HUEY_INTRO);

		//Listened to Izel introduce Hugh
		addTask("Listened to Izel's Hugh introduction", VarbitID.VARLAMORE_IZEL_MET);

		//Listened to Mage of Zamorak's incantation description
		addTask("Listened to Mage of Zamorak's incantation description", VarbitID.TOTE_RECEIVED_INCANTATION_BEFORE); // TODO: Untested

		//Listened to a Street urchin's admiration for gladiators
		addTask("Listened to a Street urchin's admiration for gladiators", VarbitID.VARLAMORE_THIEVING_HOUSE_URCHIN_GLORY_MENTIONED);

		//Listened to the Windbreaker worker's Darkfrost introduction
		addTask("Listened to the Windbreaker worker's Darkfrost introduction", VarbitID.HUEY_MET_DWARF_WORKER);

		//Listened to the natural historians' introductions
		//addTask("Listened to the natural historians' introductions", 0); // TODO: Unfound, probably VM_something

		//Listened to the Mage of Zamorak's Z.M.I. origin story
		addTask("Listened to the Mage of Zamorak's Z.M.I. origin story", VarbitID.TOTE_ZMI_POSTQUEST_CHAT); // TODO: Untested

		//Listened to the Mysterious Bandit's introduction
		addTask("Listened to the Mysterious Bandit's introduction", VarbitID.DT2_RING_NPC_MET_BEFORE); // TODO: Untested

		//Listened to the Wise Old Man's bank robbery confession
		addEqTask(true, "Listened to the Wise Old Man's bank robbery confession", VarbitID.WOM_BANKJOB, 3);

		//Listened to Oriana's bargain for valuables
		addTask("Listened to Oriana's bargain for valuables", VarbitID.VARLAMORE_THIEVING_HOUSE_STRANGER_MET);

		//Listened to all 3 of the haunted wine bottle's initial dialogues
		//addTask("Listened to all 3 of the haunted wine bottle's initial dialogues", 0); // TODO: Unfound

		//Listened to Jim explain his wet cloth
		addEqTask(true, "Listened to Jim explain his wet cloth", VarbitID.YAMA_IMP_CONTRACT_SIGNED, 2);

		//Listened to the sergeant's advice
		addTask("Listened to the sergeant's advice", 0); // TOOD: Unfound

		//Told Apprentice Felix about Wizard Persten's fate
		addTask("Told Apprentice Felix about Wizard Persten's fate", VarbitID.DT2_FELIX_DIALOGUE); // tested, correct

		//Told Miazrqa about her cousin's activities
		//addTask("Told Miazrqa about her cousin's activities", 0); // TODO: Unfound, probably GRIM_ something

		//Told Ramarno about Ketla's fate
		addTask("Told Ramarno about Ketla's fate", VarbitID.DT2_RAMARNO_SLISKE_DIALOGUE); // TODO: Idk! This does not seem right but maybe?

		//Told Sir Tiffy Cashien about the assassin's identity
		addTask("Told Sir Tiffy Cashien about the assassin's identity", VarbitID.DT2_TIFFY_CHAT);

		//Told King Bolren about Arposandra
		addTask("Told King Bolren about Arposandra", VarbitID.POG_KING_BOLREN_DONE);

		//Told Golrie about Yewnock's machine
		addTask("Told Golrie about Yewnock's machine", VarbitID.POG_GOLRIE_RETURN);

		//Told Longramble about the entrance to Arposandra
		addTask("Told Longramble about the entrance to Arposandra", VarbitID.POG_LONGRAMBLE_DONE);

		//addTask("Told Weave about the jar of venom", 0); // TODO: Unfound

		//Told the head butler you won't join the union
		addTask("Told the head butler you won't join the union", VarbitID.DOTI_MASK_DIALOGUE);

		addTask("Unlocked Rosie", VarbitID.PORCINE_ROSIE);

		addEqTask(false, "Get directions from Baraek", VarPlayerID.PHOENIXGANG, 4);

		addTask("Pay Eblis for an ancient staff", VarbitID.FD_GOT_ZAROS_STAFF);

		addTask("Asked Chieftain Brundt about the Mountain Camp", VarbitID.MDAUGHTER_BRUNDT_DONE);

		// Unsure about this one, but looks this way from chisel data
		addEqTask(false, "Talk to Trufitus after completing Shilo Village", VarPlayerID.ZOMBIEQUEEN, 17);

		// CAT - UNKNOWN
		addEqTask(true, "Listen to your cat explain Icthlarin and the devourer again", VarbitID.ICS_TALKED_CATABOUTPRO, 3);

		addTask("Asked the Dwarven Boatman about transporting gold", VarbitID.DWARFROCK_GOLD_BOATMAN_MET);

		Task tellThreeDwarves = new Task.TaskBuilder()
			.name("Tell the three dwarven boatmen about the dwarven quests")
			.switchVar(true, VarbitID.DWARFROCK_BROTHERS_TOLDVICTORY)
			.switchVar(true, VarbitID.GIANTDWARF_BROTHERS_TOLDSUCCESS)
			.switchVar(true, VarbitID.FORGET_BROTHERS_TOLDSUCCESS)
			.build();
		add(tellThreeDwarves);
		// MIAZRQA - UNKNOWN

		addTask("Tell the Street urchin to lure another villager", VarbitID.FEUD_VAR_URCHIN);

		addTask("Tell the Knight of Varlamore about the sun altar",  VarbitID.VARLAMORE_SUN_KNIGHT);
	}

}

