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

import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class UnplacedRandomTaskList extends TaskList {

    public UnplacedRandomTaskList() {
        super("Tasks I haven't placed anywhere");
        initTasks();
    }

    public void initTasks() {
        // Unlocked the ability to select the princely monkey transformation not transmitted?

        //
        //Selected a preference for the log storage crates not transmitted
        //
        //Unlocked the ability to peek inside Callisto's Den
        addGeTask(false, "Unlocked the ability to peek inside Callisto's Den", VarPlayerID.TOTAL_CALLISTO_KILLS, 20);
        //Unlocked the ability to peek inside Venenatis' Silk Chasm
        addGeTask(false, "Unlocked the ability to peek inside Venenatis' Silk Chasm", VarPlayerID.TOTAL_VENENATIS_KILLS, 20);
        //Unlocked the ability to peek inside Vet'ion's Rest
        addGeTask(false, "Unlocked the ability to peek inside Vet'ion's Rest", VarPlayerID.TOTAL_VETION_KILLS, 20);
        //Unlocked the ability to peek inside Artio's Hunter's End
        addGeTask(false, "Unlocked the ability to peek inside Artio's Hunter's End", VarPlayerID.TOTAL_ARTIO_KILLS, 20);
        //Unlocked the ability to peek inside Spindel's Web Chasm
        addGeTask(false, "Unlocked the ability to peek inside Spindel's Web Chasm", VarPlayerID.TOTAL_SPINDEL_KILLS, 20);
        //Unlocked the ability to peek inside Calvar'ion's Skeletal Tomb
        addGeTask(false, "Unlocked the ability to peek inside Calvar'ion's Skeletal Tomb", VarPlayerID.TOTAL_CALVARION_KILLS, 20);
        //
        //Paid Krystilia for the ability to respawn at Edgeville
        addTask("Paid Krystilia for the ability to respawn at Edgeville", VarbitID.EDGEVILLE_SPAWN_UNLOCKED);
        //Paid Ferox for the ability to respawn at Ferox Enclave not transmitted
        //
        //Unlocked the ability to see the last item you smithed
        addGeTask(true, "Unlocked the ability to see the last item you smithed", VarbitID.SMITHING_ITEM_LASTTYPE, 1);
        //Unlocked the ability to see the last gold item you crafted
        addGeTask(true, "Unlocked the ability to see the last gold item you crafted", VarbitID.CRAFTING_GOLD_ITEM_LASTTYPE, 1);
        //Unlocked the ability to see the last silver item you crafted
        addGeTask(true, "Unlocked the ability to see the last silver item you crafted", VarbitID.CRAFTING_SILVER_ITEM_LASTTYPE, 1);
        //
        //Unlocked the ability to reclaim the diamond speedrun trophy doesn't look like this is exposed, the varbs are only set on QSR worlds
        //addTask("Unlocked the ability to reclaim the diamond speedrun trophy", VarbitID.SPEEDRUNNING_DIAMOND_TROPHIES);
        //Unlocked the ability to reclaim the tier 1 adventurer's outfit
        //Unlocked the ability to reclaim the tier 2 adventurer's outfit
        //Unlocked the ability to reclaim the tier 3 adventurer's outfit
        //Unlocked the ability to reclaim the giant stopwatch
        //
        //Filled the word translations scroll with all 77 translations
        addTask("Filled the word translations scroll with all 77 translations", VarbitID.TGOD_FULLY_TRANSLATED); // Unsure, but think it swaps to 1 when fully done

        //Filled your Grand Exchange history with 40 completed trades
        //
        //Unlocked the memories stored in the memoriam crystal (1) not transmitted
        //Unlocked the memories stored in the memoriam crystal (2) not transmitted
        //Unlocked the memories stored in the memoriam crystal (3) not transmitted
        //Unlocked the memories stored in the memoriam crystal (4) not transmitted
        // TODO:
        //  I don't think any of the trophies are exposed in a varb/varp, but haven't tested
        //Unlocked the big bass fishing trophy option
        //Unlocked the big swordfish fishing trophy option
        //Unlocked the big shark fishing trophy option
        //Unlocked the big harpoonfish fishing trophy option
        // Unlocked the swift marlin fishing trophy option
        // Unlocked the purplefin fishing trophy option
        // Unlocked the huge halibut fishing trophy option
        // Unlocked the golden haddock fishing trophy option
        // Unlocked the giant blue krill fishing trophy option
        // Unlocked the orangefin fishing trophy option

        //Unlocked the crawling hand head trophy option
        //Unlocked the cockatrice head trophy option
        //Unlocked the basilisk head trophy option
        //Unlocked the kurask head trophy option
        //Unlocked the KBD heads trophy option
        //Unlocked the Vorkath head trophy option
        //Unlocked the Alchemical Hydra head trophy option
        //Unlocked the KQ head trophy option
        //Unlocked the abyssal head trophy option tested, not transmitted
        //Obtained the guaranteed KQ head (tattered) drop
        //Unlocked all 5 additional ornate combat dummy options
        //
        //Unlocked all 4 Mycelium Transportation System locations not transmitted
        //Maxed the Museum Kudos counter with 243 Kudos
        addGeTask(true, "Maxed the Museum Kudos counter with 243 Kudos", VarbitID.VM_KUDOS, 243);
        //
        // Unlocked the Expert Dragon Archer title - TODO: couldnt find varb change on kc, maybe on rank change?
        //Logged a personal best at Tears of Guthix
        addGeTask(true, "Logged a personal best at Tears of Guthix", VarbitID.TOG_MAX_TEARS_COLLECTED, 1);

        //Logged at least 1 gp of destroyed loot keys via the Loot Chest
        //Logged at least 1 gp of redeemed loot keys via the Loot Chest
        //Logged at least 1 lap of the sledding course
        //Logged at least 2 laps of the Prifddinas Agility Course
        //Logged at least 2 laps of the Shayzien Basic Agility Course
        //Logged at least 2 laps of the Shayzien Advanced Agility Course
        //Logged at least 2 laps of the Wyrm Basic Agility Course not transmitted
        //Logged at least 2 laps of the Wyrm Advanced Agility Course not transmitted
        //Logged at least 2 offerings at the Woodcutting Guild's shrine
        //Logged at least 2 counts of opening Larran's small chest
        //Logged at least 2 counts of opening Larran's big chest
        //Logged at least 2 counts of opening the brimstone chest
        //Logged at least 2 counts of opening the Elven Crystal Chest
        //Logged at least 2 counts of opening the Dark Chest
        //Logged at least 2 counts of opening the Zombie Pirate's Locker
        //Logged at least 2 counts of opening all 8 Grand Gold Chests
        //
        //Claimed a free bucket from Fritz the Glassblower not transmitted
        //Claimed the pet reclaim token discount at Probita ? this is dead isnt it
        //Claimed all free chants for lost crystal equipment from Ilfeen TODO: Unfound

        //Claimed any deposit back from the Shilo Village furnace coffer not transmitted
        //Claimed any additional sunfire armour from the STASH unit) probably doesn't exist
        //Completed all miniquests
        addEqTask(true, "Completed all 19 miniquests", VarbitID.MINIQUESTS_COMPLETED_COUNT, 19);

        // New, two-point-nine
        // Unlocked the maximum bow string spool capacity
        addEqTask(true, "Unlocked the maximum bow string spool capacity", VarbitID.BOWSTRING_SPOOL_SIZE, 5); // Idk what the max size is
        // Unlocked all 6 greenman mask variants TODO: Unfound

        // Claimed a free hunter kit from a hunting expert not transmitted
        // Claimed the pet insurance refund at Probita
        addEqTask(true, "Claimed the pet insurance refund at Probita", VarbitID.PET_INSURANCE_RECLAIM, 0); // Guessing this is it. Untested
        // Obtained all guaranteed gold ring drops -- seems to be between varb 16551 and 16558, but are not transmitted
        // Listened to the Ship Yard foreman's question not transmitted
        // Unlocked the ability to reclaim Guthixian paint -- not transmitted
        // Unlocked the ability to reclaim Saradominist paint -- not transmitted
        // Unlocked the ability to reclaim Zamorakian paint -- not transmitted
        // Unlocked the ability to reclaim Armadylean paint -- not transmitted
    }
}

