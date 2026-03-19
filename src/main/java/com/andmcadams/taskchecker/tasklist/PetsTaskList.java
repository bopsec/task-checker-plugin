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

import net.runelite.api.gameval.VarbitID;

public class PetsTaskList extends TaskList
{

	public PetsTaskList()
	{
		super("Legacy pet insurance");
		initTasks();
	}

	public void initTasks()
	{
		//Unlocked the Pet Chaos Elemental
		addTask("Unlocked the Pet Chaos Elemental", VarbitID.PET_INSURANCE_CHAOSELEPET);
		//Unlocked the Pet Dagannoth Supreme
		addTask("Unlocked the Pet Dagannoth Supreme", VarbitID.PET_INSURANCE_SUPREMEPET);
		//Unlocked the Pet Dagannoth Prime
		addTask("Unlocked the Pet Dagannoth Prime", VarbitID.PET_INSURANCE_PRIMEPET);
		//Unlocked the Pet Dagannoth Rex
		addTask("Unlocked the Pet Dagannoth Rex", VarbitID.PET_INSURANCE_REXPET);
		//Unlocked the Pet Penance Queen
		addTask("Unlocked the Pet Penance Queen", VarbitID.PET_INSURANCE_PENANCEPET);
		//Unlocked the Pet Kree'arra
		addTask("Unlocked the Pet Kree'arra", VarbitID.PET_INSURANCE_ARMADYLPET);
		//Unlocked the Pet General Graardor
		addTask("Unlocked the Pet General Graardor", VarbitID.PET_INSURANCE_BANDOSPET);
		//Unlocked the Pet Zilyana
		addTask("Unlocked the Pet Zilyana", VarbitID.PET_INSURANCE_SARADOMINPET);
		//Unlocked the Pet K'ril Tsutsaroth
		addTask("Unlocked the Pet K'ril Tsutsaroth", VarbitID.PET_INSURANCE_ZAMORAKPET);
		//Unlocked the Baby Mole
		addTask("Unlocked the Baby Mole", VarbitID.PET_INSURANCE_MOLEPET);
		//Unlocked the Prince Black Dragon
		addTask("Unlocked the Prince Black Dragon", VarbitID.PET_INSURANCE_KBDPET);
		//Unlocked the Kalphite Princess
		addTask("Unlocked the Kalphite Princess", VarbitID.PET_INSURANCE_KQPET);
		//Unlocked the Pet Smoke Devil
		addTask("Unlocked the Pet Smoke Devil", VarbitID.PET_INSURANCE_SMOKEPET);
		//Unlocked the Pet Kraken
		addTask("Unlocked the Pet Kraken", VarbitID.PET_INSURANCE_KRAKENPET);
		//Unlocked the Pet Dark Core
		addTask("Unlocked the Pet Dark Core", VarbitID.PET_INSURANCE_COREPET);
		//Unlocked the Pet Snakeling
		addTask("Unlocked the Pet Snakeling", VarbitID.PET_INSURANCE_SNAKEPET);
		//Unlocked the Chompy Chick
		addTask("Unlocked the Chompy Chick", VarbitID.PET_INSURANCE_CHOMPYPET);
		//Unlocked the Venenatis Spiderling
		addTask("Unlocked the Venenatis Spiderling", VarbitID.PET_INSURANCE_VENENATISPET);
		//Unlocked the Callisto Cub
		addTask("Unlocked the Callisto Cub", VarbitID.PET_INSURANCE_CALLISTOPET);
		//Unlocked Vet'ion Jr.
		addTask("Unlocked Vet'ion Jr.", VarbitID.PET_INSURANCE_VETIONPET);
		//Unlocked Scorpia's Offspring
		addTask("Unlocked Scorpia's Offspring", VarbitID.PET_INSURANCE_SCORPIAPET);
		//Unlocked TzRek-Jad
		addTask("Unlocked TzRek-Jad", VarbitID.PET_INSURANCE_JADPET);
		//Unlocked the Hellpuppy
		addTask("Unlocked the Hellpuppy", VarbitID.PET_INSURANCE_HELLPET);
		//Unlocked the Abyssal Orphan
		addTask("Unlocked the Abyssal Orphan", VarbitID.PET_INSURANCE_ABYSSALSIREPET);
		//Unlocked the Heron
		addTask("Unlocked the Heron", VarbitID.PET_INSURANCE_SKILLPETFISH);
		//Unlocked the Rock Golem
		addTask("Unlocked the Rock Golem", VarbitID.PET_INSURANCE_SKILLPETMINING);
		//Unlocked the Beaver
		addTask("Unlocked the Beaver", VarbitID.PET_INSURANCE_SKILLPETWC);
		//Unlocked the Baby Chinchompa
		addTask("Unlocked the Baby Chinchompa", VarbitID.PET_INSURANCE_SKILLPETHUNTER);
		//Unlocked the Bloodhound
		addTask("Unlocked the Bloodhound", VarbitID.PET_INSURANCE_BLOODHOUND);
		//Unlocked the Giant Squirrel
		addTask("Unlocked the Giant Squirrel", VarbitID.PET_INSURANCE_SKILLPETAGILITY);
		//Unlocked Tangleroot
		addTask("Unlocked Tangleroot", VarbitID.PET_INSURANCE_SKILLPETFARMING);
		//Unlocked the Rift Guardian
		addTask("Unlocked the Rift Guardian", VarbitID.PET_INSURANCE_SKILLPETRUNECRAFT);
		//Unlocked Rocky
		addTask("Unlocked Rocky", VarbitID.PET_INSURANCE_SKILLPETTHIEVING);
		//Unlocked the Phoenix
		addTask("Unlocked the Phoenix", VarbitID.PET_INSURANCE_PHOENIXPET);
		//Unlocked the Olmlet
		addTask("Unlocked the Olmlet", VarbitID.PET_INSURANCE_OLMPET);
		//Unlocked Skotos
		addTask("Unlocked Skotos", VarbitID.PET_INSURANCE_SKOTUS);
		//Unlocked Jal-Nib-Rek
		addTask("Unlocked Jal-Nib-Rek", VarbitID.PET_INSURANCE_INFERNO);
		//Unlocked Herbi
		addTask("Unlocked Herbi", VarbitID.PET_INSURANCE_HERBIBOAR);
		//Unlocked Noon
		addTask("Unlocked Noon", VarbitID.PET_INSURANCE_GARGBOSS);
		//Unlocked Vorki
		addTask("Unlocked Vorki", VarbitID.PET_INSURANCE_VORKI);
		//Unlocked Lil' Zik
		addTask("Unlocked Lil' Zik", VarbitID.PET_INSURANCE_VERZIK);
		//Unlocked the Ikkle Hydra
		addTask("Unlocked the Ikkle Hydra", VarbitID.PET_INSURANCE_HYDRA);
		//Unlocked Sraracha
		addTask("Unlocked Sraracha", VarbitID.PET_INSURANCE_SARACHNIS);
		//Unlocked Youngllef
		addTask("Unlocked Youngllef", VarbitID.PET_INSURANCE_GAUNTLET);
		//Unlocked Smolcano
		addTask("Unlocked Smolcano", VarbitID.PET_INSURANCE_ZALCANO);
		//Unlocked the Little Nightmare
		addTask("Unlocked the Little Nightmare", VarbitID.PET_INSURANCE_NIGHTMARE);
		//Unlocked the Lil' Creator
		addTask("Unlocked the Lil' Creator", VarbitID.PET_INSURANCE_SOULWARS);
		//Unlocked the Tiny Tempor
		addTask("Unlocked the Tiny Tempor", VarbitID.PET_INSURANCE_TEMPOROSS);
		//Unlocked the Nexling
		addTask("Unlocked the Nexling", VarbitID.PET_INSURANCE_NEX);
		//Unlocked the Abyssal Protector
		addTask("Unlocked the Abyssal Protector", VarbitID.PET_INSURANCE_ABYSSAL);
		//Unlocked Tumeken's Guardian
		addTask("Unlocked Tumeken's Guardian", VarbitID.PET_INSURANCE_WARDENS);
		//Unlocked Muphin
		addTask("Unlocked Muphin", VarbitID.PET_INSURANCE_MUSPAH);
		//Unlocked Baron
		addTask("Unlocked Baron", VarbitID.PET_INSURANCE_DUKE_SUCELLUS);
		//Unlocked Butch
		addTask("Unlocked Butch", VarbitID.PET_INSURANCE_VARDORVIS);
		//Unlocked Lil'viathan
		addTask("Unlocked Lil'viathan", VarbitID.PET_INSURANCE_LEVIATHAN);
		//Unlocked Wisp
		addTask("Unlocked Wisp", VarbitID.PET_INSURANCE_WHISPERER);
		//Unlocked Scurry
		addTask("Unlocked Scurry", VarbitID.PET_INSURANCE_SCURRIUS);
		//Unlocked Smol Heredit
		addTask("Unlocked Smol Heredit", VarbitID.PET_INSURANCE_SOLHEREDIT);
		//Unlocked Quetzin
		addTask("Unlocked Quetzin", VarbitID.PET_INSURANCE_QUETZAL);
		//Unlocked Nid
		addTask("Unlocked Nid", VarbitID.PET_INSURANCE_ARAXXOR);
		//Unlocked Moxi
		addTask("Unlocked Moxi", VarbitID.PET_INSURANCE_AMOXLIATL);
		//Unlocked Huberte
		addTask("Unlocked Huberte", VarbitID.PET_INSURANCE_HUEY);
		//Unlocked Bran
		addTask("Unlocked Bran", VarbitID.PET_INSURANCE_ROYALTITANS);
		//Unlocked Yami
		addTask("Unlocked Yami (not added)", 0); // why does this not exist?
		//Unlocked Dom
		addTask("Unlocked Dom", VarbitID.PET_INSURANCE_DOM);
		//Unlocked soup
		addTask("Unlocked soup", VarbitID.PET_INSURANCE_SKILLPETSAILING);
		//Unlocked Gull
		addTask("Unlocked Gull", VarbitID.PET_INSURANCE_GRYPHON);
		//Unlocked Beef
		addTask("Unlocked Beef (not added)", 0); // why does this not exist?
	}
}


