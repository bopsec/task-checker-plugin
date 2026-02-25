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

public class PetTransmogsTaskList extends TaskList
{

    public PetTransmogsTaskList()
    {
        super("Pet transmogs");
        initTasks();
    }

    public void initTasks()
    {
        // Skilling pets
        // Unlocked the ability to recolour the Beaver
        Task beaverRecolour = new Task.TaskBuilder()
                .name("Unlocked the ability to recolour the Beaver")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the Beaver's pheasant metamorphosis option
        Task beaverPheasant = new Task.TaskBuilder()
                .name("Unlocked the Beaver's pheasant metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        Task beaverFox = new Task.TaskBuilder()
                .name("Unlocked the Beaver's fox metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the Heron's reduced metamorphosis cost
        Task heronMetamorphosis = new Task.TaskBuilder()
                .name("Unlocked the Heron's reduced metamorphosis cost")
                .switchVar(true, 0)
                .build();
        // Unlocked the pet phoenix's green metamorphosis option
        Task phoenixGreen = new Task.TaskBuilder()
                .name("Unlocked the pet phoenix's green metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the pet phoenix's blue metamorphosis option
        Task phoenixBlue = new Task.TaskBuilder()
                .name("Unlocked the pet phoenix's blue metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the pet phoenix's white metamorphosis option
        Task phoenixWhite = new Task.TaskBuilder()
                .name("Unlocked the pet phoenix's white metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the pet phoenix's purple metamorphosis option
        Task phoenixPurple = new Task.TaskBuilder()
                .name("Unlocked the pet phoenix's purple metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();

        Task squirrelDark = new Task.TaskBuilder()
                .name("Unlocked the Giant Squirrel's dark metamorphosis option")
                .switchVar(true, VarbitID.HALLOWED_SKILLPET_DARK_UNLOCKED)
                .build();
        Task squirrelBone = new Task.TaskBuilder()
                .name("Unlocked the Giant Squirrel's bone metamorphosis option")
                .switchVar(true, VarbitID.AGILITY_SKILLPET_BONE_UNLOCKED)
                .build();

        // Bossing pets
        // Unlocked Muphin's metamorphosis option
        Task muphinMetamorphosis = new Task.TaskBuilder()
                .name("Unlocked Muphin's metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked Nid's metamorphosis option
        Task nidMetamorphosis = new Task.TaskBuilder()
                .name("Unlocked Nid's metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        // Unlocked the Little Nightmare's metamorphosis option
        Task lilNightmareMetamorphosis = new Task.TaskBuilder()
                .name("Unlocked the Little Nightmare's metamorphosis option")
                .switchVar(true, VarbitID.NIGHTMARE_PET_PARASITE_UNLOCKED)
                .build();
        // Unlocked Sraracha's orange metamorphosis option
        Task srarachaOrange = new Task.TaskBuilder()
                .name("Unlocked Sraracha's orange metamorphosis option")
                .switchVar(true, VarbitID.SARACHNISPET_ORANGE_TRANSMOG)
                .build();
        // Unlocked Sraracha's blue metamorphosis option
        Task srarachaBlue = new Task.TaskBuilder()
                .name("Unlocked Sraracha's blue metamorphosis option")
                .switchVar(true, VarbitID.SARACHNISPET_BLUE_TRANSMOG)
                .build();

        // Raids pets
        Task olmletTransmog = new Task.TaskBuilder()
                .name("Unlocked the Olmlet's metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();
        Task zikTransmog = new Task.TaskBuilder()
                .name("Unlocked Lil' Zik's metamorphosis option")
                .switchVar(true, 0) // TODO
                .build();

        Task akkhito = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's Akkhito metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_AKKHA)
                .build();
        Task babi = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's Babi metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_BABA)
                .build();
        Task kephriti = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's Kephriti metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_KEPHRI)
                .build();
        Task zebo = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's Zebo metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_ZEBAK)
                .build();
        Task damagedGuardian = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's damaged metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_DESTROYED_ELIDINIS)
                // and the other one? VarbitID.TOA_UNLOCKED_PET_MORPH_DESTROYED_TUMEKEN
                .build();

        //this.add(beaverRecolour);
//        this.add(beaverPheasant);
//        this.add(beaverFox);
//        this.add(heronMetamorphosis);
//        this.add(phoenixGreen);
//        this.add(phoenixBlue);
//        this.add(phoenixWhite);
//        this.add(phoenixPurple);

        this.add(squirrelDark);
        this.add(squirrelBone);

//        this.add(muphinMetamorphosis); //
//        this.add(nidMetamorphosis); //

        this.add(lilNightmareMetamorphosis);
        this.add(srarachaOrange);
        this.add(srarachaBlue);

//        this.add(olmletTransmog); //
//        this.add(zikTransmog); //

        this.add(akkhito);
        this.add(babi);
        this.add(kephriti);
        this.add(zebo);
        this.add(damagedGuardian);
    }

}
