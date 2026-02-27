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
import net.runelite.api.gameval.VarbitID;

public class PetsTaskList extends TaskList
{

    public PetsTaskList()
    {
        super("All pets");
        initTasks();
    }

    public void initTasks()
    {
        //Unlocked the Pet Chaos Elemental
        Task chaosElyPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Chaos Elemental")
                .switchVar(true, VarbitID.PET_INSURANCE_CHAOSELEPET)
                .build();
        this.add(chaosElyPet);
        //Unlocked the Pet Dagannoth Supreme
        Task dagannothSupremePet = new Task.TaskBuilder()
                .name("Unlocked the Pet Dagannoth Supreme")
                .switchVar(true, VarbitID.PET_INSURANCE_SUPREMEPET)
                .build();
        this.add(dagannothSupremePet);
        //Unlocked the Pet Dagannoth Prime
        Task dagannothPrimePet = new Task.TaskBuilder()
                .name("Unlocked the Pet Dagannoth Prime")
                .switchVar(true, VarbitID.PET_INSURANCE_PRIMEPET)
                .build();
        this.add(dagannothPrimePet);
        //Unlocked the Pet Dagannoth Rex
        Task dagannothRexPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Dagannoth Rex")
                .switchVar(true, VarbitID.PET_INSURANCE_REXPET)
                .build();
        this.add(dagannothRexPet);
        //Unlocked the Pet Penance Queen
        Task penanceQueenPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Penance Queen")
                .switchVar(true, VarbitID.PET_INSURANCE_PENANCEPET)
                .build();
        this.add(penanceQueenPet);
        //Unlocked the Pet Kree'arra
        Task kreeArraPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Kree'arra")
                .switchVar(true, VarbitID.PET_INSURANCE_ARMADYLPET)
                .build();
        this.add(kreeArraPet);
        //Unlocked the Pet General Graardor
        Task generalGraardorPet = new Task.TaskBuilder()
                .name("Unlocked the Pet General Graardor")
                .switchVar(true, VarbitID.PET_INSURANCE_BANDOSPET)
                .build();
        this.add(generalGraardorPet);
        //Unlocked the Pet Zilyana
        Task commanderZilyanaPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Zilyana")
                .switchVar(true, VarbitID.PET_INSURANCE_SARADOMINPET)
                .build();
        this.add(commanderZilyanaPet);
        //Unlocked the Pet K'ril Tsutsaroth
        Task krilTsutsarothPet = new Task.TaskBuilder()
                .name("Unlocked the Pet K'ril Tsutsaroth")
                .switchVar(true, VarbitID.PET_INSURANCE_ZAMORAKPET)
                .build();
        this.add(krilTsutsarothPet);
        //Unlocked the Baby Mole
        Task molePet = new Task.TaskBuilder()
                .name("Unlocked the Baby Mole")
                .switchVar(true, VarbitID.PET_INSURANCE_MOLEPET)
                .build();
        this.add(molePet);
        //Unlocked the Prince Black Dragon
        Task kingBlackDragonPet = new Task.TaskBuilder()
                .name("Unlocked the Prince Black Dragon")
                .switchVar(true, VarbitID.PET_INSURANCE_KBDPET)
                .build();
        this.add(kingBlackDragonPet);
        //Unlocked the Kalphite Princess
        Task kalphiteQueenPet = new Task.TaskBuilder()
                .name("Unlocked the Kalphite Princess")
                .switchVar(true, VarbitID.PET_INSURANCE_KQPET)
                .build();
        this.add(kalphiteQueenPet);
        //Unlocked the Pet Smoke Devil
        Task smokeDevilPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Smoke Devil")
                .switchVar(true, VarbitID.PET_INSURANCE_SMOKEPET)
                .build();
        this.add(smokeDevilPet);
        //Unlocked the Pet Kraken
        Task krakenPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Kraken")
                .switchVar(true, VarbitID.PET_INSURANCE_KRAKENPET)
                .build();
        this.add(krakenPet);
        //Unlocked the Pet Dark Core
        Task corporealBeastPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Dark Core")
                .switchVar(true, VarbitID.PET_INSURANCE_COREPET)
                .build();
        this.add(corporealBeastPet);
        //Unlocked the Pet Snakeling
        Task zulrahPet = new Task.TaskBuilder()
                .name("Unlocked the Pet Snakeling")
                .switchVar(true, VarbitID.PET_INSURANCE_SNAKEPET)
                .build();
        this.add(zulrahPet);
        //Unlocked the Chompy Chick
        Task chompyPet = new Task.TaskBuilder()
                .name("Unlocked the Chompy Chick")
                .switchVar(true, VarbitID.PET_INSURANCE_CHOMPYPET)
                .build();
        this.add(chompyPet);
        //Unlocked the Venenatis Spiderling
        Task venenatisPet = new Task.TaskBuilder()
                .name("Unlocked the Venenatis Spiderling")
                .switchVar(true, VarbitID.PET_INSURANCE_VENENATISPET)
                .build();
        this.add(venenatisPet);
        //Unlocked the Callisto Cub
        Task callistoPet = new Task.TaskBuilder()
                .name("Unlocked the Callisto Cub")
                .switchVar(true, VarbitID.PET_INSURANCE_CALLISTOPET)
                .build();
        this.add(callistoPet);
        //Unlocked Vet'ion Jr.
        Task vetionPet = new Task.TaskBuilder()
                .name("Unlocked Vet'ion Jr.")
                .switchVar(true, VarbitID.PET_INSURANCE_VETIONPET)
                .build();
        this.add(vetionPet);
        //Unlocked Scorpia's Offspring
        Task scorpiaPet = new Task.TaskBuilder()
                .name("Unlocked Scorpia's Offspring")
                .switchVar(true, VarbitID.PET_INSURANCE_SCORPIAPET)
                .build();
        this.add(scorpiaPet);
        //Unlocked TzRek-Jad
        Task jadPet = new Task.TaskBuilder()
                .name("Unlocked TzRek-Jad")
                .switchVar(true, VarbitID.PET_INSURANCE_JADPET)
                .build();
        this.add(jadPet);
        //Unlocked the Hellpuppy
        Task cerberusPet = new Task.TaskBuilder()
                .name("Unlocked the Hellpuppy")
                .switchVar(true, VarbitID.PET_INSURANCE_HELLPET)
                .build();
        this.add(cerberusPet);
        //Unlocked the Abyssal Orphan
        Task abyssalSirePet = new Task.TaskBuilder()
                .name("Unlocked the Abyssal Orphan")
                .switchVar(true, VarbitID.PET_INSURANCE_ABYSSALSIREPET)
                .build();
        this.add(abyssalSirePet);
        //Unlocked the Heron
        Task fishingPet = new Task.TaskBuilder()
                .name("Unlocked the Heron")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETFISH)
                .build();
        this.add(fishingPet);
        //Unlocked the Rock Golem
        Task miningPet = new Task.TaskBuilder()
                .name("Unlocked the Rock Golem")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETMINING)
                .build();
        this.add(miningPet);
        //Unlocked the Beaver
        Task woodcuttingPet = new Task.TaskBuilder()
                .name("Unlocked the Beaver")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETWC)
                .build();
        this.add(woodcuttingPet);
        //Unlocked the Baby Chinchompa
        Task chinchompaPet = new Task.TaskBuilder()
                .name("Unlocked the Baby Chinchompa")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETHUNTER)
                .build();
        this.add(chinchompaPet);
        //Unlocked the Bloodhound
        Task bloodhoundPet = new Task.TaskBuilder()
                .name("Unlocked the Bloodhound")
                .switchVar(true, VarbitID.PET_INSURANCE_BLOODHOUND)
                .build();
        this.add(bloodhoundPet);
        //Unlocked the Giant Squirrel
        Task agilityPet = new Task.TaskBuilder()
                .name("Unlocked the Giant Squirrel")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETAGILITY)
                .build();
        this.add(agilityPet);
        //Unlocked Tangleroot
        Task farmingPet = new Task.TaskBuilder()
                .name("Unlocked Tangleroot")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETFARMING)
                .build();
        this.add(farmingPet);
        //Unlocked the Rift Guardian
        Task runecraftPet = new Task.TaskBuilder()
                .name("Unlocked the Rift Guardian")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETRUNECRAFT)
                .build();
        this.add(runecraftPet);
        //Unlocked Rocky
        Task thievingPet = new Task.TaskBuilder()
                .name("Unlocked Rocky")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETTHIEVING)
                .build();
        this.add(thievingPet);
        //Unlocked the Phoenix
        Task phoenixPet = new Task.TaskBuilder()
                .name("Unlocked the Phoenix")
                .switchVar(true, VarbitID.PET_INSURANCE_PHOENIXPET)
                .build();
        this.add(phoenixPet);
        //Unlocked the Olmlet
        Task olmletPet = new Task.TaskBuilder()
                .name("Unlocked the Olmlet")
                .switchVar(true, VarbitID.PET_INSURANCE_OLMPET)
                .build();
        this.add(olmletPet);
        //Unlocked Skotos
        Task skotizoPet = new Task.TaskBuilder()
                .name("Unlocked Skotos")
                .switchVar(true, VarbitID.PET_INSURANCE_SKOTUS)
                .build();
        this.add(skotizoPet);
        //Unlocked Jal-Nib-Rek
        Task infernoPet = new Task.TaskBuilder()
                .name("Unlocked Jal-Nib-Rek")
                .switchVar(true, VarbitID.PET_INSURANCE_INFERNO)
                .build();
        this.add(infernoPet);
        //Unlocked Herbi
        Task herbiboarPet = new Task.TaskBuilder()
                .name("Unlocked Herbi")
                .switchVar(true, VarbitID.PET_INSURANCE_HERBIBOAR)
                .build();
        this.add(herbiboarPet);
        //Unlocked Noon
        Task grotesqueGuardiansPet = new Task.TaskBuilder()
                .name("Unlocked Noon")
                .switchVar(true, VarbitID.PET_INSURANCE_GARGBOSS)
                .build();
        this.add(grotesqueGuardiansPet);
        //Unlocked Vorki
        Task vorkathPet = new Task.TaskBuilder()
                .name("Unlocked Vorki")
                .switchVar(true, VarbitID.PET_INSURANCE_VORKI)
                .build();
        this.add(vorkathPet);
        //Unlocked Lil' Zik
        Task verzikPet = new Task.TaskBuilder()
                .name("Unlocked Lil' Zik")
                .switchVar(true, VarbitID.PET_INSURANCE_VERZIK)
                .build();
        this.add(verzikPet);
        //Unlocked the Ikkle Hydra
        Task hydraPet = new Task.TaskBuilder()
                .name("Unlocked the Ikkle Hydra")
                .switchVar(true, VarbitID.PET_INSURANCE_HYDRA)
                .build();
        this.add(hydraPet);
        //Unlocked Sraracha
        Task sarachnisPet = new Task.TaskBuilder()
                .name("Unlocked Sraracha")
                .switchVar(true, VarbitID.PET_INSURANCE_SARACHNIS)
                .build();
        this.add(sarachnisPet);
        //Unlocked Youngllef
        Task gauntletPet = new Task.TaskBuilder()
                .name("Unlocked Youngllef")
                .switchVar(true, VarbitID.PET_INSURANCE_GAUNTLET)
                .build();
        this.add(gauntletPet);
        //Unlocked Smolcano
        Task zalcanoPet = new Task.TaskBuilder()
                .name("Unlocked Smolcano")
                .switchVar(true, VarbitID.PET_INSURANCE_ZALCANO)
                .build();
        this.add(zalcanoPet);
        //Unlocked the Little Nightmare
        Task nightmarePet = new Task.TaskBuilder()
                .name("Unlocked the Little Nightmare")
                .switchVar(true, VarbitID.PET_INSURANCE_NIGHTMARE)
                .build();
        this.add(nightmarePet);
        //Unlocked the Lil' Creator
        Task soulWarsPet = new Task.TaskBuilder()
                .name("Unlocked the Lil' Creator")
                .switchVar(true, VarbitID.PET_INSURANCE_SOULWARS)
                .build();
        this.add(soulWarsPet);
        //Unlocked the Tiny Tempor
        Task temporossPet = new Task.TaskBuilder()
                .name("Unlocked the Tiny Tempor")
                .switchVar(true, VarbitID.PET_INSURANCE_TEMPOROSS)
                .build();
        this.add(temporossPet);
        //Unlocked the Nexling
        Task nexPet = new Task.TaskBuilder()
                .name("Unlocked the Nexling")
                .switchVar(true, VarbitID.PET_INSURANCE_NEX)
                .build();
        this.add(nexPet);
        //Unlocked the Abyssal Protector
        Task guardiansOfTheRiftPet = new Task.TaskBuilder()
                .name("Unlocked the Abyssal Protector")
                .switchVar(true, VarbitID.PET_INSURANCE_ABYSSAL)
                .build();
        this.add(guardiansOfTheRiftPet);
        //Unlocked Tumeken's Guardian
        Task tombsOfAmascutPet = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian")
                .switchVar(true, VarbitID.PET_INSURANCE_WARDENS)
                .build();
        this.add(tombsOfAmascutPet);
        //Unlocked Muphin
        Task muspahPet = new Task.TaskBuilder()
                .name("Unlocked Muphin")
                .switchVar(true, VarbitID.PET_INSURANCE_MUSPAH)
                .build();
        this.add(muspahPet);
        //Unlocked Baron
        Task dukeSucellusPet = new Task.TaskBuilder()
                .name("Unlocked Baron")
                .switchVar(true, VarbitID.PET_INSURANCE_DUKE_SUCELLUS)
                .build();
        this.add(dukeSucellusPet);
        //Unlocked Butch
        Task vardorvisPet = new Task.TaskBuilder()
                .name("Unlocked Butch")
                .switchVar(true, VarbitID.PET_INSURANCE_VARDORVIS)
                .build();
        this.add(vardorvisPet);
        //Unlocked Lil'viathan
        Task leviathanPet = new Task.TaskBuilder()
                .name("Unlocked Lil'viathan")
                .switchVar(true, VarbitID.PET_INSURANCE_LEVIATHAN)
                .build();
        this.add(leviathanPet);
        //Unlocked Wisp
        Task whispererPet = new Task.TaskBuilder()
                .name("Unlocked Wisp")
                .switchVar(true, VarbitID.PET_INSURANCE_WHISPERER)
                .build();
        this.add(whispererPet);
        //Unlocked Scurry
        Task scurriusPet = new Task.TaskBuilder()
                .name("Unlocked Scurry")
                .switchVar(true, VarbitID.PET_INSURANCE_SCURRIUS)
                .build();
        this.add(scurriusPet);
        //Unlocked Smol Heredit
        Task solHereditPet = new Task.TaskBuilder()
                .name("Unlocked Smol Heredit")
                .switchVar(true, VarbitID.PET_INSURANCE_SOLHEREDIT)
                .build();
        this.add(solHereditPet);
        //Unlocked Quetzin
        Task hunterRumourPet = new Task.TaskBuilder()
                .name("Unlocked Quetzin")
                .switchVar(true, VarbitID.PET_INSURANCE_QUETZAL)
                .build();
        this.add(hunterRumourPet);
        //Unlocked Nid
        Task araxxorPet = new Task.TaskBuilder()
                .name("Unlocked Nid")
                .switchVar(true, VarbitID.PET_INSURANCE_ARAXXOR)
                .build();
        this.add(araxxorPet);
        //Unlocked Moxi
        Task amoxliatlPet = new Task.TaskBuilder()
                .name("Unlocked Moxi")
                .switchVar(true, VarbitID.PET_INSURANCE_AMOXLIATL)
                .build();
        this.add(amoxliatlPet);
        //Unlocked Huberte
        Task hueycoatlPet = new Task.TaskBuilder()
                .name("Unlocked Huberte")
                .switchVar(true, VarbitID.PET_INSURANCE_HUEY)
                .build();
        this.add(hueycoatlPet);
        //Unlocked Bran
        Task royalTitansPet = new Task.TaskBuilder()
                .name("Unlocked Bran")
                .switchVar(true, VarbitID.PET_INSURANCE_ROYALTITANS)
                .build();
        this.add(royalTitansPet);
        //Unlocked Yami
        Task yamaPet = new Task.TaskBuilder()
                .name("Unlocked Yami (not added)")
                .switchVar(true, 0) // TODO: does this not exist?
                .build();
        this.add(yamaPet);
        //Unlocked Dom
        Task doomPet = new Task.TaskBuilder()
                .name("Unlocked Dom")
                .switchVar(true, VarbitID.PET_INSURANCE_DOM)
                .build();
        this.add(doomPet);
        //Unlocked soup
        Task sailingPet = new Task.TaskBuilder()
                .name("Unlocked soup")
                .switchVar(true, VarbitID.PET_INSURANCE_SKILLPETSAILING)
                .build();
        this.add(sailingPet);
        //Unlocked Gull
        Task gryphonPet = new Task.TaskBuilder()
                .name("Unlocked Gull")
                .switchVar(true, VarbitID.PET_INSURANCE_GRYPHON)
                .build();
        this.add(gryphonPet);
        //Unlocked Beef
        Task cowbossPet = new Task.TaskBuilder()
                .name("Unlocked Beef (not added)")
                .switchVar(true, 0) // TODO: why tf does this not exist?
                .build();
        this.add(cowbossPet);
    }

}
