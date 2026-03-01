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
import net.runelite.api.gameval.VarPlayerID;
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
        addPet("Unlocked the Pet Chaos Elemental", VarbitID.PET_INSURANCE_CHAOSELEPET);
        //Unlocked the Pet Dagannoth Supreme
        addPet("Unlocked the Pet Dagannoth Supreme", VarbitID.PET_INSURANCE_SUPREMEPET);
        //Unlocked the Pet Dagannoth Prime
        addPet("Unlocked the Pet Dagannoth Prime", VarbitID.PET_INSURANCE_PRIMEPET);
        //Unlocked the Pet Dagannoth Rex
        addPet("Unlocked the Pet Dagannoth Rex", VarbitID.PET_INSURANCE_REXPET);
        //Unlocked the Pet Penance Queen
        addPet("Unlocked the Pet Penance Queen", VarbitID.PET_INSURANCE_PENANCEPET);
        //Unlocked the Pet Kree'arra
        addPet("Unlocked the Pet Kree'arra", VarbitID.PET_INSURANCE_ARMADYLPET);
        //Unlocked the Pet General Graardor
        addPet("Unlocked the Pet General Graardor", VarbitID.PET_INSURANCE_BANDOSPET);
        //Unlocked the Pet Zilyana
        addPet("Unlocked the Pet Zilyana", VarbitID.PET_INSURANCE_SARADOMINPET);
        //Unlocked the Pet K'ril Tsutsaroth
        addPet("Unlocked the Pet K'ril Tsutsaroth", VarbitID.PET_INSURANCE_ZAMORAKPET);
        //Unlocked the Baby Mole
        addPet("Unlocked the Baby Mole", VarbitID.PET_INSURANCE_MOLEPET);
        //Unlocked the Prince Black Dragon
        addPet("Unlocked the Prince Black Dragon", VarbitID.PET_INSURANCE_KBDPET);
        //Unlocked the Kalphite Princess
        addPet("Unlocked the Kalphite Princess", VarbitID.PET_INSURANCE_KQPET);
        //Unlocked the Pet Smoke Devil
        addPet("Unlocked the Pet Smoke Devil", VarbitID.PET_INSURANCE_SMOKEPET);
        //Unlocked the Pet Kraken
        addPet("Unlocked the Pet Kraken", VarbitID.PET_INSURANCE_KRAKENPET);
        //Unlocked the Pet Dark Core
        addPet("Unlocked the Pet Dark Core", VarbitID.PET_INSURANCE_COREPET);
        //Unlocked the Pet Snakeling
        addPet("Unlocked the Pet Snakeling", VarbitID.PET_INSURANCE_SNAKEPET);
        //Unlocked the Chompy Chick
        addPet("Unlocked the Chompy Chick", VarbitID.PET_INSURANCE_CHOMPYPET);
        //Unlocked the Venenatis Spiderling
        addPet("Unlocked the Venenatis Spiderling", VarbitID.PET_INSURANCE_VENENATISPET);
        //Unlocked the Callisto Cub
        addPet("Unlocked the Callisto Cub", VarbitID.PET_INSURANCE_CALLISTOPET);
        //Unlocked Vet'ion Jr.
        addPet("Unlocked Vet'ion Jr.", VarbitID.PET_INSURANCE_VETIONPET);
        //Unlocked Scorpia's Offspring
        addPet("Unlocked Scorpia's Offspring", VarbitID.PET_INSURANCE_SCORPIAPET);
        //Unlocked TzRek-Jad
        addPet("Unlocked TzRek-Jad", VarbitID.PET_INSURANCE_JADPET);
        //Unlocked the Hellpuppy
        addPet("Unlocked the Hellpuppy", VarbitID.PET_INSURANCE_HELLPET);
        //Unlocked the Abyssal Orphan
        addPet("Unlocked the Abyssal Orphan", VarbitID.PET_INSURANCE_ABYSSALSIREPET);
        //Unlocked the Heron
        addPet("Unlocked the Heron", VarbitID.PET_INSURANCE_SKILLPETFISH);
        //Unlocked the Rock Golem
        addPet("Unlocked the Rock Golem", VarbitID.PET_INSURANCE_SKILLPETMINING);
        //Unlocked the Beaver
        addPet("Unlocked the Beaver", VarbitID.PET_INSURANCE_SKILLPETWC);
        //Unlocked the Baby Chinchompa
        addPet("Unlocked the Baby Chinchompa", VarbitID.PET_INSURANCE_SKILLPETHUNTER);
        //Unlocked the Bloodhound
        addPet("Unlocked the Bloodhound", VarbitID.PET_INSURANCE_BLOODHOUND);
        //Unlocked the Giant Squirrel
        addPet("Unlocked the Giant Squirrel", VarbitID.PET_INSURANCE_SKILLPETAGILITY);
        //Unlocked Tangleroot
        addPet("Unlocked Tangleroot", VarbitID.PET_INSURANCE_SKILLPETFARMING);
        //Unlocked the Rift Guardian
        addPet("Unlocked the Rift Guardian", VarbitID.PET_INSURANCE_SKILLPETRUNECRAFT);
        //Unlocked Rocky
        addPet("Unlocked Rocky", VarbitID.PET_INSURANCE_SKILLPETTHIEVING);
        //Unlocked the Phoenix
        addPet("Unlocked the Phoenix", VarbitID.PET_INSURANCE_PHOENIXPET);
        //Unlocked the Olmlet
        addPet("Unlocked the Olmlet", VarbitID.PET_INSURANCE_OLMPET);
        //Unlocked Skotos
        addPet("Unlocked Skotos", VarbitID.PET_INSURANCE_SKOTUS);
        //Unlocked Jal-Nib-Rek
        addPet("Unlocked Jal-Nib-Rek", VarbitID.PET_INSURANCE_INFERNO);
        //Unlocked Herbi
        addPet("Unlocked Herbi", VarbitID.PET_INSURANCE_HERBIBOAR);
        //Unlocked Noon
        addPet("Unlocked Noon", VarbitID.PET_INSURANCE_GARGBOSS);
        //Unlocked Vorki
        addPet("Unlocked Vorki", VarbitID.PET_INSURANCE_VORKI);
        //Unlocked Lil' Zik
        addPet("Unlocked Lil' Zik", VarbitID.PET_INSURANCE_VERZIK);
        //Unlocked the Ikkle Hydra
        addPet("Unlocked the Ikkle Hydra", VarbitID.PET_INSURANCE_HYDRA);
        //Unlocked Sraracha
        addPet("Unlocked Sraracha", VarbitID.PET_INSURANCE_SARACHNIS);
        //Unlocked Youngllef
        addPet("Unlocked Youngllef", VarbitID.PET_INSURANCE_GAUNTLET);
        //Unlocked Smolcano
        addPet("Unlocked Smolcano", VarbitID.PET_INSURANCE_ZALCANO);
        //Unlocked the Little Nightmare
        addPet("Unlocked the Little Nightmare", VarbitID.PET_INSURANCE_NIGHTMARE);
        //Unlocked the Lil' Creator
        addPet("Unlocked the Lil' Creator", VarbitID.PET_INSURANCE_SOULWARS);
        //Unlocked the Tiny Tempor
        addPet("Unlocked the Tiny Tempor", VarbitID.PET_INSURANCE_TEMPOROSS);
        //Unlocked the Nexling
        addPet("Unlocked the Nexling", VarbitID.PET_INSURANCE_NEX);
        //Unlocked the Abyssal Protector
        addPet("Unlocked the Abyssal Protector", VarbitID.PET_INSURANCE_ABYSSAL);
        //Unlocked Tumeken's Guardian
        addPet("Unlocked Tumeken's Guardian", VarbitID.PET_INSURANCE_WARDENS);
        //Unlocked Muphin
        addPet("Unlocked Muphin", VarbitID.PET_INSURANCE_MUSPAH);
        //Unlocked Baron
        addPet("Unlocked Baron", VarbitID.PET_INSURANCE_DUKE_SUCELLUS);
        //Unlocked Butch
        addPet("Unlocked Butch", VarbitID.PET_INSURANCE_VARDORVIS);
        //Unlocked Lil'viathan
        addPet("Unlocked Lil'viathan", VarbitID.PET_INSURANCE_LEVIATHAN);
        //Unlocked Wisp
        addPet("Unlocked Wisp", VarbitID.PET_INSURANCE_WHISPERER);
        //Unlocked Scurry
        addPet("Unlocked Scurry", VarbitID.PET_INSURANCE_SCURRIUS);
        //Unlocked Smol Heredit
        addPet("Unlocked Smol Heredit", VarbitID.PET_INSURANCE_SOLHEREDIT);
        //Unlocked Quetzin
        addPet("Unlocked Quetzin", VarbitID.PET_INSURANCE_QUETZAL);
        //Unlocked Nid
        addPet("Unlocked Nid", VarbitID.PET_INSURANCE_ARAXXOR);
        //Unlocked Moxi
        addPet("Unlocked Moxi", VarbitID.PET_INSURANCE_AMOXLIATL);
        //Unlocked Huberte
        addPet("Unlocked Huberte", VarbitID.PET_INSURANCE_HUEY);
        //Unlocked Bran
        addPet("Unlocked Bran", VarbitID.PET_INSURANCE_ROYALTITANS);
        //Unlocked Yami
        addPet("Unlocked Yami (not added)", 0); // TODO: why does this not exist?
        //Unlocked Dom
        addPet("Unlocked Dom", VarbitID.PET_INSURANCE_DOM);
        //Unlocked soup
        addPet("Unlocked soup", VarbitID.PET_INSURANCE_SKILLPETSAILING);
        //Unlocked Gull
        addPet("Unlocked Gull", VarbitID.PET_INSURANCE_GRYPHON);
        //Unlocked Beef
        addPet("Unlocked Beef (not added)", 0); // TODO: Why does this not exist?
    }

    public void addPet(String taskName, int varbitID) {
        Task task = new Task.TaskBuilder()
                .name(taskName)
                .switchVar(true, varbitID)
                .build();
        this.add(task);
    }

}


