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
        //TODO:
        Task minnows = new Task.TaskBuilder()
                .name("Unlocked access to Kylie Minnow's fishing platform")
                .eqVar(true, VarbitID.MINNOW_ACCESS, 2)
                .build();
        this.add(minnows);

        Task abyssalNeedles = new Task.TaskBuilder()
                .name("Unlocked the ability to make abyssal needles")
                .switchVar(true, VarbitID.GOTR_UNLOCKED_NEEDLE)
                .build();
        this.add(abyssalNeedles);
        Task amuletOfTheEye = new Task.TaskBuilder()
                .name("Unlocked the ability to reclaim the amulet of the Eye")
                .switchVar(true, VarbitID.GOTR_AMULET_OF_THE_EYE_OBTAINED)
                .build();
        this.add(amuletOfTheEye);
        Task lostBag = new Task.TaskBuilder()
                .name("Unlocked the ability to reclaim the lost bag")
                .switchVar(true, VarbitID.GOTR_BAG_OBTAINED)
                .build();
        this.add(lostBag);
        //Unlocked the ring of the elements' previous teleport option
        Task rotePrevious = new Task.TaskBuilder()
                .name("Unlocked the ring of the elements' previous teleport option")
                .geVar(true, VarbitID.RING_OF_ELEMENTS_LAST_DESTINATION, 1)
                .build();
        this.add(rotePrevious);
        //Unlocked Apprentice Tamara's quick-lock option
        Task tamaraQuickLock = new Task.TaskBuilder()
                .name("Unlocked Apprentice Tamara's quick-lock option")
                .switchVar(true, VarbitID.GOTR_TAMARA_LOCK_OP) // TODO: Unchecked
                .build();
        this.add(tamaraQuickLock);
        //Unlocked Apprentice Cordelia's ability to repair pouches
        Task cordeliaRepairUnlocked = new Task.TaskBuilder()
                .name("Unlocked Apprentice Cordelia's ability to repair pouches")
                .switchVar(true, VarbitID.GOTR_CORDELIA_REPAIR_POUCH)
                .build();
        this.add(cordeliaRepairUnlocked);

        //Disabled torn perfected quetzal whistle blueprint drops
        Task disabledTornPerfectedQuetzalWhistleBlueprint = new Task.TaskBuilder()
                .name("Disabled torn perfected quetzal whistle blueprint drops")
                .switchVar(true, 0) // TODO: not found
                .build();
        //this.add(disabledTornPerfectedQuetzalWhistleBlueprint);

        //Claimed a free basic quetzal whistle blueprint
        Task claimedFreeWhistle = new Task.TaskBuilder()
                .name("Claimed a free basic quetzal whistle blueprint")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(claimedFreeWhistle);
        //Unlocked the Hunter Guild teleport on a hunter/max cape
        Task hunterGuildTeleport = new Task.TaskBuilder()
                .name("Unlocked the Hunter Guild teleport on a hunter/max cape")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(hunterGuildTeleport);
        //Unlocked the ability to reclaim Apatura's items
        Task apaturasItems = new Task.TaskBuilder()
                .name("Unlocked the ability to reclaim Apatura's items")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(apaturasItems);
        //
        //Unlocked the forestry kit/basket's outfit storage ability
        Task forestryKitBasketOutfit = new Task.TaskBuilder()
                .name("Unlocked the forestry kit/basket's outfit storage ability")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(forestryKitBasketOutfit);
        //Unlocked the forestry kit/basket's cape storage ability
        Task forestryKitBasketCape = new Task.TaskBuilder()
                .name("Unlocked the forestry kit/basket's cape storage ability")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(forestryKitBasketCape);
        //
        //Unlocked the ability to redecorate to the Hosidius house style
        Task hosidiusHouseStyle = new Task.TaskBuilder()
                .name("Unlocked the ability to redecorate to the Hosidius house style")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(hosidiusHouseStyle);
        //
        //Logged a fastest commission at the highest quality of 199
        // ?
        //Unlocked the ability to purchase colossal blades from Perdu
        Task colossalBlade = new Task.TaskBuilder()
                .name("Unlocked the ability to purchase colossal blades from Perdu")
                .switchVar(true, 0) // TODO: Not found
                .build();
        //this.add(colossalBlade);
        //Unlocked the crucible's custom quantity option
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
        Task potionStorage = new Task.TaskBuilder()
                .name("Unlocked potion storage")
                .switchVar(true, VarbitID.MM_POTION_STORAGE_UNLOCKED)
                .build();
        this.add(potionStorage);
        //
        //Unlocked the Camdozaal fishing buff
        Task camdozaalFishingBuff = new Task.TaskBuilder()
                .name("Unlocked the Camdozaal fishing buff")
                .switchVar(true, VarbitID.CAMDOZAAL_FISH_CATCH_BUFF)
                .build();
        this.add(camdozaalFishingBuff);
        //Unlocked the Camdozaal preparation buff
        Task camdozaalPrepBuff = new Task.TaskBuilder()
                .name("Unlocked the Camdozaal preparation buff")
                .switchVar(true, VarbitID.CAMDOZAAL_FISH_PREP_BUFF)
                .build();
        this.add(camdozaalPrepBuff);
        //Unlocked the Camdozaal defence buff
        Task camdozaalDefBuff = new Task.TaskBuilder()
                .name("Unlocked the Camdozaal defence buff")
                .switchVar(true, VarbitID.CAMDOZAAL_DEFENCE_BUFF)
                .build();
        this.add(camdozaalDefBuff);
        //Unlocked the Camdozaal mining buff
        Task camdozaalMiningBuff = new Task.TaskBuilder()
                .name("Unlocked the Camdozaal mining buff")
                .switchVar(true, VarbitID.CAMDOZAAL_MINING_BUFF)
                .build();
        this.add(camdozaalMiningBuff);
        //Unlocked the Camdozaal luck buff
        Task camdozaalLuckBuff = new Task.TaskBuilder()
                .name("Unlocked the Camdozaal luck buff")
                .switchVar(true, VarbitID.CAMDOZAAL_REWARDS_BUFF)
                .build();
        this.add(camdozaalLuckBuff);
        //
        //Unlocked access to Belona's amethyst cave
        Task belonasAmethystCave = new Task.TaskBuilder()
                .name("Unlocked access to Belona's amethyst cave")
                .switchVar(true, 0) // TODO: Unfound
                .build();
        //this.add(belonasAmethystCave);
        //
        //Unlocked the ability to toggle the full spirit angler outfit
        Task spiritAngler = new Task.TaskBuilder()
                .name("Unlocked the ability to toggle the full spirit angler outfit")
                .switchVar(true, 0) // TODO: Unfound
                .build();
        //this.add(spiritAngler);
        //Listened to Captain Pudi's explanation of Tempoross
        Task captainPudiExplanation = new Task.TaskBuilder()
                .name("Unlocked the ability to toggle the full spirit angler outfit")
                .switchVar(true, 0) // TODO: Unfound
                .build();
        //this.add(captainPudiExplanation);
        //
        //Unlocked the large water container
        Task largeWaterContainer = new Task.TaskBuilder()
                .name("Unlocked the large water container")
                .switchVar(true, VarbitID.FOSSIL_MINE_UNLOCKED_MOREWATER)
                .build();
        //this.add(largeWaterContainer);
        //Disabled the Fertile Soil's non-upgraded spell warning
        Task fertileSoilWarningDisabled = new Task.TaskBuilder()
                .name("Disabled the Fertile Soil's non-upgraded spell warning")
                .switchVar(true, 0) // TODO: Unfound
                .build();
        //this.add(fertileSoilWarningDisabled);

        //Unlocked the ability to create swampbark armours
        Task unlockedSwampbark = new Task.TaskBuilder()
                .name("Unlocked the ability to create swampbark armours")
                .switchVar(true, VarbitID.SHADES_SWAMP_UNLOCK)
                .build();
        this.add(unlockedSwampbark);
        //Unlocked the ability to create bloodbark armours
        Task unlockedBloodbark = new Task.TaskBuilder()
                .name("Unlocked the ability to create bloodbark armours")
                .switchVar(true, VarbitID.SHADES_BLOOD_UNLOCK)
                .build();
        this.add(unlockedBloodbark);

        //Unlocked Dusuri's trade option
        Task unlockedDusuriTrade = new Task.TaskBuilder()
                .name("Unlocked Dusuri's trade option")
                .switchVar(true, VarbitID.STAR_TRADER_MET)
                .build();
        this.add(unlockedDusuriTrade);
        //
        //Unlocked the blood rift in the Abyss
        Task unlockedBloodAbyss = new Task.TaskBuilder()
            .name("Unlocked the blood rift in the Abyss")
            .switchVar(true, 0) // TODO: Unfound
            .build();
        //this.add(unlockedBloodAbyss);
        //Unlocked the soul rift in the Abyss
        Task unlockedSoulAbyss = new Task.TaskBuilder()
                .name("Unlocked the soul rift in the Abyss")
                .switchVar(true, 0) // TODO: Unfound
                .build();
        //this.add(unlockedSoulAbyss);
    }
}
