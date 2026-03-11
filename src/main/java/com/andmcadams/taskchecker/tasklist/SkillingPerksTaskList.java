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

public class SkillingPerksTaskList extends TaskList
{

    public SkillingPerksTaskList()
    {
        super("Skilling minigames etc.");
        this.initTasks();
    }

    private void initTasks()
    {
        addEqTask(true, "Unlocked access to Kylie Minnow's fishing platform", VarbitID.MINNOW_ACCESS, 2);

        addTask("Unlocked the ability to make abyssal needles", VarbitID.GOTR_UNLOCKED_NEEDLE);
        addTask("Unlocked the ability to reclaim the amulet of the Eye", VarbitID.GOTR_AMULET_OF_THE_EYE_OBTAINED);
        addTask("Unlocked the ability to reclaim the lost bag", VarbitID.GOTR_BAG_OBTAINED);
        //Unlocked the ring of the elements' previous teleport option
        addGeTask(true, "Unlocked the ring of the elements' previous teleport option", VarbitID.RING_OF_ELEMENTS_LAST_DESTINATION, 1);
        //Unlocked Apprentice Tamara's quick-lock option
        addTask("Unlocked Apprentice Tamara's quick-lock option", VarbitID.GOTR_TAMARA_LOCK_OP); // TODO: Unchecked
        //Unlocked Apprentice Cordelia's ability to repair pouches
        addTask("Unlocked Apprentice Cordelia's ability to repair pouches", VarbitID.GOTR_CORDELIA_REPAIR_POUCH);

        //Disabled torn perfected quetzal whistle blueprint drops
        //addTask("Disabled torn perfected quetzal whistle blueprint drops", 0); // TODO: not found

        //Claimed a free basic quetzal whistle blueprint
        //addTask("Claimed a free basic quetzal whistle blueprint", 0); // TODO: Not found
        //Unlocked the Hunter Guild teleport on a hunter/max cape not exposed
        //Unlocked the ability to reclaim Apatura's items not exposed
        //
        //Unlocked the forestry kit/basket's outfit storage ability
        //addTask("Unlocked the forestry kit/basket's outfit storage ability", 0); // TODO: Not found
        //Unlocked the forestry kit/basket's cape storage ability
        //addTask("Unlocked the forestry kit/basket's cape storage ability", 0); // TODO: Not found
        //
        //Unlocked the ability to redecorate to the Hosidius house style
        //addTask("Unlocked the ability to redecorate to the Hosidius house style", 0); // TODO: Not found
        //
        //Logged a fastest commission at the highest quality of 199 TODO: probs not transmitted? idk
        // ?
        //Unlocked the ability to purchase colossal blades from Perdu
        //addTask("Unlocked the ability to purchase colossal blades from Perdu", 0); // TODO: Not found
        //Unlocked the crucible's custom quantity option not transmitted
        //Unlocked all 15 additional sword moulds
        Task giantsFoundryAllMoulds = new Task.TaskBuilder()
                .name("Unlocked all 15 additional sword moulds")
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_BLADE_7)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_BLADE_8)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_BLADE_9)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_BLADE_10)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_BLADE_11)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_RICASSO_7)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_RICASSO_8)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_RICASSO_9)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_RICASSO_10)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_RICASSO_11)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_TIP_7)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_TIP_8)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_TIP_9)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_TIP_10)
                .switchVar(true, VarbitID.GIANTS_FOUNDRY_UNLOCKED_MOULD_TIP_11)
                .build();
        this.add(giantsFoundryAllMoulds);
        //
        //Unlocked potion storage
        addTask("Unlocked potion storage", VarbitID.MM_POTION_STORAGE_UNLOCKED);
        //
        //Unlocked the Camdozaal fishing buff
        addTask("Unlocked the Camdozaal fishing buff", VarbitID.CAMDOZAAL_FISH_CATCH_BUFF);
        //Unlocked the Camdozaal preparation buff
        addTask("Unlocked the Camdozaal preparation buff", VarbitID.CAMDOZAAL_FISH_PREP_BUFF);
        //Unlocked the Camdozaal defence buff
        addTask("Unlocked the Camdozaal defence buff", VarbitID.CAMDOZAAL_DEFENCE_BUFF);
        //Unlocked the Camdozaal mining buff
        addTask("Unlocked the Camdozaal mining buff", VarbitID.CAMDOZAAL_MINING_BUFF);
        //Unlocked the Camdozaal luck buff
        addTask("Unlocked the Camdozaal luck buff", VarbitID.CAMDOZAAL_REWARDS_BUFF);
        //
        //Unlocked access to Belona's amethyst cave // TODO: Unfound
        //
        //Unlocked the ability to toggle the full spirit angler outfit // TODO: Unfound
        //Listened to Captain Pudi's explanation of Tempoross not transmitted
        //
        //Unlocked the large water container
        addTask("Unlocked the large water container", VarbitID.FOSSIL_MINE_UNLOCKED_MOREWATER);
        //Disabled the Fertile Soil's non-upgraded spell warning
        //addTask("Disabled the Fertile Soil's non-upgraded spell warning", 0); // TODO: Unfound

        //Unlocked the ability to create swampbark armours
        addTask("Unlocked the ability to create swampbark armours", VarbitID.SHADES_SWAMP_UNLOCK);
        //Unlocked the ability to create bloodbark armours
        addTask("Unlocked the ability to create bloodbark armours", VarbitID.SHADES_BLOOD_UNLOCK);

        //Unlocked Dusuri's trade option
        addTask("Unlocked Dusuri's trade option", VarbitID.STAR_TRADER_MET);
        //
        //Unlocked the blood rift in the Abyss
        addEqTask(true, "Unlocked the blood rift in the Abyss", VarbitID.ZEAH_BLOOD_ALTAR_UNLOCKED, 2);
        //Unlocked the soul rift in the Abyss
        addEqTask(true, "Unlocked the soul rift in the Abyss", VarbitID.ZEAH_SOUL_ALTAR_UNLOCKED, 2);
    }
}

