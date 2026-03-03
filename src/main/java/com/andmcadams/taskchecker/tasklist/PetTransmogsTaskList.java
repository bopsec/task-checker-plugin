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
        //addTask("Unlocked the ability to recolour the Beaver", 0); // TODO
        // Unlocked the Beaver's pheasant metamorphosis option
        //addTask("Unlocked the Beaver's pheasant metamorphosis option", 0); // TODO
        //addTask("Unlocked the Beaver's fox metamorphosis option", 0); // TODO
        // Unlocked the Heron's reduced metamorphosis cost
        //addTask("Unlocked the Heron's reduced metamorphosis cost", 0); // TODO
        // Unlocked the pet phoenix's green metamorphosis option
        //addTask("Unlocked the pet phoenix's green metamorphosis option", 0); // TODO
        // Unlocked the pet phoenix's blue metamorphosis option
        //addTask("Unlocked the pet phoenix's blue metamorphosis option", 0); // TODO
        // Unlocked the pet phoenix's white metamorphosis option
        //addTask("Unlocked the pet phoenix's white metamorphosis option", 0); // TODO
        // Unlocked the pet phoenix's purple metamorphosis option
        //addTask("Unlocked the pet phoenix's purple metamorphosis option", 0); // TODO

        addTask("Unlocked the Giant Squirrel's dark metamorphosis option", VarbitID.HALLOWED_SKILLPET_DARK_UNLOCKED);
        addTask("Unlocked the Giant Squirrel's bone metamorphosis option", VarbitID.AGILITY_SKILLPET_BONE_UNLOCKED);

        // Bossing pets
        // Unlocked Muphin's metamorphosis option
        //addTask("Unlocked Muphin's metamorphosis option", 0); // TODO
        // Unlocked Nid's metamorphosis option
        //addTask("Unlocked Nid's metamorphosis option", 0); // TODO
        // Unlocked the Little Nightmare's metamorphosis option
        addTask("Unlocked the Little Nightmare's metamorphosis option", VarbitID.NIGHTMARE_PET_PARASITE_UNLOCKED);
        // Unlocked Sraracha's orange metamorphosis option
        addTask("Unlocked Sraracha's orange metamorphosis option", VarbitID.SARACHNISPET_ORANGE_TRANSMOG);
        // Unlocked Sraracha's blue metamorphosis option
        addTask("Unlocked Sraracha's blue metamorphosis option", VarbitID.SARACHNISPET_BLUE_TRANSMOG);

        // Raids pets
        //addTask("Unlocked the Olmlet's metamorphosis option", 0); // TODO
        //addTask("Unlocked Lil' Zik's metamorphosis option", 0); // TODO

        addTask("Unlocked Tumeken's Guardian's Akkhito metamorphosis", VarbitID.TOA_UNLOCKED_PET_MORPH_AKKHA);
        addTask("Unlocked Tumeken's Guardian's Babi metamorphosis", VarbitID.TOA_UNLOCKED_PET_MORPH_BABA);
        addTask("Unlocked Tumeken's Guardian's Kephriti metamorphosis", VarbitID.TOA_UNLOCKED_PET_MORPH_KEPHRI);
        addTask("Unlocked Tumeken's Guardian's Zebo metamorphosis", VarbitID.TOA_UNLOCKED_PET_MORPH_ZEBAK);
        Task damagedGuardian = new Task.TaskBuilder()
                .name("Unlocked Tumeken's Guardian's damaged metamorphosis")
                .switchVar(true, VarbitID.TOA_UNLOCKED_PET_MORPH_DESTROYED_ELIDINIS)
                // and the other one? VarbitID.TOA_UNLOCKED_PET_MORPH_DESTROYED_TUMEKEN
                .build();

        this.add(damagedGuardian);
    }

}

