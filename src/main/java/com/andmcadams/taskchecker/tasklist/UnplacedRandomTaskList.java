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
import net.runelite.api.VarPlayer;
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class UnplacedRandomTaskList extends TaskList
{

    public UnplacedRandomTaskList()
    {
        super("Tasks I haven't placed anywhere");
        initTasks();
    }

    public void initTasks() {
        // TODO:!!!!
        //Logged at least 1 count of opening spoils of war
        //
        //Unlocked the effect of Ava's assembler in Castle Wars
        addEqTask(true, "Unlocked the effect of Ava's assembler in Castle Wars", VarbitID.CASTLEWARS_AVA_REWARD_TIER, 3); // confirmed
        //Unlocked the effect of Ava's assembler in Soul Wars
        addEqTask(true, "Unlocked the effect of Ava's assembler in Soul Wars", VarbitID.SOUL_WARS_AVA_REWARD_TIER, 3); // confirmed
        //Unlocked the effect of Ava's assembler on ranging/max capes
        addTask("Unlocked the effect of Ava's assembler on ranging/max capes", VarbitID.DS2_AMMO_COLLECTION); // confirmed
        //Unlocked the effect of Ava's assembler on Dizana's quiver
        addEqTask(true, "Unlocked the effect of Ava's assembler on Dizana's quiver", VarbitID.DIZANAS_QUIVER_AMMO_SAVE, 3); // confirmed
        //
        //Unlocked access to the basement of the Warriors' Guild
        addTask("Unlocked access to the basement of the Warriors' Guild", VarbitID.WARGUILD_BASEMENT_ACCESS);
        //
        //Unlocked all non-holiday music tracks
        addGeTask(true, "Unlocked all non-holiday music tracks", VarbitID.MUSIC_CAPE_STATUS, 1);
        //Unlocked the ability to toggle the music cape's trim
        addGeTask(true, "Unlocked the ability to toggle the music cape's trim", VarbitID.MUSIC_CAPE_STATUS, 2);
        //
        //Unlocked the ring of shadows' full potential
        Task unlockedRingOfShadowTeleports = new Task.TaskBuilder()
                .name("Unlocked the ring of shadows' full potential")
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORT)
                .switchVar(true, VarbitID.DT2_STRANGLEWOOD_TELEPORT)
                .switchVar(true, VarbitID.DT2_GHORROCK_TELEPORT)
                .switchVar(true, VarbitID.DT2_SCAR_TELEPORT)
                .build();
        this.add(unlockedRingOfShadowTeleports);
        //
        //Unlocked the ability to use Drakan's medallion's third teleport
        addTask("Unlocked the ability to use Drakan's medallion's third teleport", VarbitID.SLEPE_TELEPORT_UNLOCKED);
        //
        //Unlocked the ability to use Xeric's talisman's fifth teleport TODO: Unfound
        //
        //Told Litara about what happened to Solztun TODO: Untested
        addEqTask(true, "Told Litara about what happened to Solztun", VarbitID.SOS_BROTHER_FOUND, 2);
        //
        //Completed all 12 easy achievement diaries
        Task completedEasyDiaries = new Task.TaskBuilder()
                .name("Completed all 12 easy achievement diaries")
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_EASY_COMPLETE)
                .eqVar(true, VarbitID.KARAMJA_EASY_COUNT, 10)
                .switchVar(true, VarbitID.KOUREND_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.LUMBRIDGE_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.MORYTANIA_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.VARROCK_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.WESTERN_DIARY_EASY_COMPLETE)
                .switchVar(true, VarbitID.WILDERNESS_DIARY_EASY_COMPLETE)
                .build();
        this.add(completedEasyDiaries);
        //Completed all 12 medium achievement diaries
        Task completedMediumDiaries = new Task.TaskBuilder()
                .name("Completed all 12 medium achievement diaries")
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_MEDIUM_COMPLETE)
                .eqVar(true, VarbitID.KARAMJA_MED_COUNT, 19)
                .switchVar(true, VarbitID.KOUREND_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.LUMBRIDGE_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.MORYTANIA_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.VARROCK_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.WESTERN_DIARY_MEDIUM_COMPLETE)
                .switchVar(true, VarbitID.WILDERNESS_DIARY_MEDIUM_COMPLETE)
                .build();
        this.add(completedMediumDiaries);
        //Completed all 12 hard achievement diaries
        Task completedHardDiaries = new Task.TaskBuilder()
                .name("Completed all 12 hard achievement diaries")
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_HARD_COMPLETE)
                .eqVar(true, VarbitID.KARAMJA_HARD_COUNT, 10)
                .switchVar(true, VarbitID.KOUREND_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.LUMBRIDGE_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.MORYTANIA_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.VARROCK_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.WESTERN_DIARY_HARD_COMPLETE)
                .switchVar(true, VarbitID.WILDERNESS_DIARY_HARD_COMPLETE)
                .build();
        this.add(completedHardDiaries);
        //Completed all 12 elite achievement diaries
        Task completedEliteDiaries = new Task.TaskBuilder()
                .name("Completed all 12 elite achievement diaries")
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KARAMJA_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KOUREND_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.LUMBRIDGE_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.MORYTANIA_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.VARROCK_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.WESTERN_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.WILDERNESS_DIARY_ELITE_COMPLETE)
                .build();
        this.add(completedEliteDiaries);
        //Unlocked the ability to equip a quest point cape (t)
        Task trimmedQuestCape = new Task.TaskBuilder()
                .name("Unlocked the ability to equip a quest point cape (t)")
                .eqVar(false, VarPlayerID.QP, 333)
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KARAMJA_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KOUREND_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.LUMBRIDGE_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.MORYTANIA_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.VARROCK_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.WESTERN_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.WILDERNESS_DIARY_ELITE_COMPLETE)
                .build(); // this could probs be done more cleanly, idk if there's one "can get diary cape" varb/varp
        this.add(trimmedQuestCape);
        //
        //Built all 3 beginner STASH units (do not have to be filled)
        addEqTask(true, "Built all 3 beginner STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_BEGINNER_ALL, 7); // confirmed
        //Built all 30 easy STASH units (do not have to be filled)
        addEqTask(true, "Built all 32 easy STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_EASY_ALL, Integer.MAX_VALUE); // 2^32 - 1 confirmed
        //Built all 25 medium STASH units (do not have to be filled)
        addEqTask(true, "Built all 25 medium STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_MEDIUM_ALL, 33554431); // 2^25 - 1 confirmed
        //Built all 16 hard STASH units (do not have to be filled)
        addEqTask(true, "Built all 16 hard STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_HARD_ALL, 65535); // 2 ^ 16 - 1 confirmed
        //Built all 19 elite STASH units (do not have to be filled)
        addEqTask(true, "Built all 19 elite STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_ELITE_ALL, 524287); // 2^19 - 1 confirmed
        //Built all 25 master STASH units (do not have to be filled)
        addEqTask(true, "Built all 25 master STASH units (do not have to be filled)", VarbitID.HH_CONSTRUCTED_MASTER_ALL, 33554431); // 2^25 - 1 confirmed
        //
        // How do I do these? Just check if the latest event has reached the final varb/varp value?
        //Unlocked the ability to reclaim Crack the Clue III event items
        //Unlocked the ability to reclaim all 35 Birthday holiday items
        //Unlocked the ability to reclaim all 36 Easter holiday items
        //Unlocked the ability to reclaim all 56 Hallowe'en holiday items
        //Unlocked the ability to reclaim all 65 Christmas holiday items
        //Unlocked the ability to reclaim all 10 buyable holiday items
        //Unlocked the ability to reclaim all 7 Pride event items
        //Unlocked the ability to reclaim the mystic cards No varbit/varp
        //Unlocked the ability to reclaim the banana hat No varbit/varp
        //
        //Unlocked Guildmaster Jane's contracts completed option
        addTask("Unlocked Guildmaster Jane's contracts completed option", VarbitID.FARMGUILD_CONTRACT_DISCUSSED); // TODO: Untested idk about this one

        //Unlocked Simon Templeton's pyramid artefacts option
        addTask("Unlocked Simon Templeton's pyramid artefacts option", VarbitID.AGILITY_PYRAMID_SIMON_NAMED); // TODO: Untested
        //Unlocked Farmer Gricoller's visitors option
        addTask("Unlocked Farmer Gricoller's visitors option", VarbitID.DARKMEYER_VYRE_TITHE_DIALOGUE); // TODO: Untested
        //Unlocked Death's death Leagues IV animation option
        addTask("Unlocked Death's death Leagues IV animation option", VarbitID.LEAGUE_4_DEATH_ANIMATION_UNLOCKED);
        //Unlocked Death's death Leagues V animation option
        addTask("Unlocked Death's death Leagues V animation option", VarbitID.LEAGUE_5_DEATH_ANIMATION_UNLOCKED);
        //Unlocked the candle seller's lantern making option
        addTask("Unlocked the candle seller's lantern making option", VarbitID.SWAMP_CANDLE_GUY_CONVERSATION); // confirmed
        //Unlocked the pharaoh's sceptre's Jaltevas teleport option
        addTask("Unlocked the pharaoh's sceptre's Jaltevas teleport option", VarbitID.PHARAOHS_SCEPTRE_NECROPOLIS);
        //
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

        //Unlocked all 4 additional secret santa present colours
        addEqTask(true, "Unlocked all 4 additional secret santa present colours", VarbitID.XM21_REWARD_PRESENT, 4);
        //Unlocked all 7 teleporters in the Lassar Undercity
        Task lassarTeleporters = new Task.TaskBuilder()
                .name("Unlocked all 7 teleporters in the Lassar Undercity")
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_CATHEDRAL)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_PALACE)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_PLAZA)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_RESIDENTIAL_EAST)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_RESIDENTIAL_WEST)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_SCIENCE_NORTH)
                .switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_SCIENCE_SOUTH)
                .build();
        this.add(lassarTeleporters);


        //Selected at least one death animation option
        addGeTask(false, "Selected at least one death animation option", VarPlayerID.DEATH_ANIM_TOGGLES, 1); // confirmed
        //
        //Unlocked all 6 balloon transport system routes
        Task unlockedAllBallooonTransports = new Task.TaskBuilder()
                .name("Unlocked all 6 balloon transport system routes")
                .switchVar(true, VarbitID.ZEP_MULTI_VARR)
                .switchVar(true, VarbitID.ZEP_MULTI_CAST)
                .switchVar(true, VarbitID.ZEP_MULTI_CRAFT)
                .switchVar(true, VarbitID.ZEP_MULTI_GNO)
                .eqVar(true, VarbitID.ZEP_MULTI_BASKET, 2)
                .eqVar(true, VarbitID.ZEP_MULTI_PICCARD, 2)
                .build();
        this.add(unlockedAllBallooonTransports);
        //Selected a preference for the log storage crates doesn't seem to exist
        //
        //Unlocked all 10 random event emotes
        Task unlockedAllRandomEmotes = new Task.TaskBuilder()
                .name("Unlocked all 10 random event emotes")
                // Mime:
                .switchVar(true, VarbitID.EMOTE_GLASSBOX)
                .switchVar(true, VarbitID.EMOTE_CLIMBROPE)
                .switchVar(true, VarbitID.EMOTE_LEAN)
                .switchVar(true, VarbitID.EMOTE_GLASSWALL)
                // Zombie:
                .switchVar(true, VarbitID.EMOTE_ZOMBIE_WALK)
                .switchVar(true, VarbitID.EMOTE_ZOMBIE_DANCE)
                // Drill sergeant:
                .switchVar(true, VarbitID.EMOTE_DRILLDEMON) // this just has one?
                .build();
        this.add(unlockedAllRandomEmotes);

        //Unlocked all 8 holiday emotes
        Task unlockedAllHolidayEmotes = new Task.TaskBuilder()
                .name("Unlocked all 8 holiday emotes")
                .switchVar(true, VarbitID.EMOTE_BUNNY_HOP)
                .switchVar(true, VarbitID.EMOTE_TERRIFIED)
                .switchVar(true, VarbitID.EMOTE_ZOMBIE_HAND)
                .switchVar(true, VarbitID.EMOTE_ASH)
                .switchVar(true, VarbitID.EMOTE_HOTLINE_BLING)
                .switchVar(true, VarbitID.EMOTE_GANGNAM)
                .switchVar(true, VarbitID.EMOTE_PARTY)
                .switchVar(true, VarbitID.EMOTE_TRICK)
                .build();
        this.add(unlockedAllHolidayEmotes);
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
        //Unlocked the ability to respawn at Kourend Castle
        addTask("Unlocked the ability to respawn at Kourend Castle", VarbitID.AKD_ASTEROS_MET);

        //Paid Krystilia for the ability to respawn at Edgeville
        addTask("Paid Krystilia for the ability to respawn at Edgeville", VarbitID.EDGEVILLE_SPAWN_UNLOCKED);
        //Paid Ferox for the ability to respawn at Ferox Enclave not exposed
        //
        //Unlocked the ability to see the last item you smithed
        addGeTask(true, "Unlocked the ability to see the last item you smithed", VarbitID.SMITHING_ITEM_LASTTYPE, 1);
        //Unlocked the ability to see the last gold item you crafted
        addGeTask(true, "Unlocked the ability to see the last gold item you crafted", VarbitID.CRAFTING_GOLD_ITEM_LASTTYPE, 1);
        //Unlocked the ability to see the last silver item you crafted
        addGeTask(true, "Unlocked the ability to see the last silver item you crafted", VarbitID.CRAFTING_SILVER_ITEM_LASTTYPE, 1);
        //
        //Unlocked the ability to reclaim the diamond speedrun trophy
        addTask("Unlocked the ability to reclaim the diamond speedrun trophy", VarbitID.SPEEDRUNNING_DIAMOND_TROPHIES); // TODO: Untested!! Does this just swap to 1 when you unlock trophy?
        //Unlocked the ability to reclaim the tier 1 adventurer's outfit
        //Unlocked the ability to reclaim the tier 2 adventurer's outfit
        //Unlocked the ability to reclaim the tier 3 adventurer's outfit
        //Unlocked the ability to reclaim the giant stopwatch
        //Unlocked the Home Teleport's Speedy animation option
        addTask("Unlocked the Home Teleport's Speedy animation option", VarbitID.SPEEDRUNNING_TELEPORT_UNLOCKED);
        //
        //Filled the word translations scroll with all 77 translations
        addTask("Filled the word translations scroll with all 77 translations", VarbitID.TGOD_FULLY_TRANSLATED); // Unsure, but think it swaps to 1 when fully done
        //Filled the travel log with all 53? fairy ring codes
        Task allFairyRingCodes = new Task.TaskBuilder()
                .name("Filled the travel log with all 53 fairy ring codes")
                // A:
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AIQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AIR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AJP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AJQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AJR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AJS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AKP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AKQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AKR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_AKS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_ALP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_ALQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_ALR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_ALS)
                // B:
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BIP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BIQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BIS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BJP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BJR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BJS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BKP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BKQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BKR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BKS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BLP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BLQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BLR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_BLS)
                // C:
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CIP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CIQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CIR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CIS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CJQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CJR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CKP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CKQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CKR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CKS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CLP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CLR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_CLS)
                // D:
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DIP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DIQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DIR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DIS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DJP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DJR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DKP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DKR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DKS)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DLP)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DLQ)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DLR)
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_DLS)
                // Hideout:
                .switchVar(true, VarbitID.FAIRYRINGS_LOG_HIDEOUT)
                .build();
        this.add(allFairyRingCodes);

        //Filled your Grand Exchange history with 40 completed trades
        //
        //Unlocked the memories stored in the memoriam crystal (1) no varb/varp
        //Unlocked the memories stored in the memoriam crystal (2) no varb/varp
        //Unlocked the memories stored in the memoriam crystal (3) no varb/varp
        //Unlocked the memories stored in the memoriam crystal (4) no varb/varp
        //
        //Unlocked the ability to create Neitiznot faceguards
        addTask("Unlocked the ability to create Neitiznot faceguards", VarbitID.VIKINGEXILE_HELM_UNLOCK);
        //Unlocked the ability to create super antifire potions
        addTask("Unlocked the ability to create super antifire potions", VarbitID.SUPER_ANTIFIRE_UNLOCKED);
        //Unlocked the ability to create sextants and watches no varb/varp
        //Unlocked the ability to create ancient icons
        addTask("Unlocked the ability to create ancient icons", VarbitID.DT2_PLAYER_LEARNED_ICON_FUSING);
        //Revealed the human translation of the Cosmic Being's name
        addTask("Revealed the human translation of the Cosmic Being's name", VarbitID.FAIRY2_UNIVERSAL_MYSTERY); // confirmed
        //Revealed the stranger's true appearance in the Canifis pub
        addTask("Revealed the stranger's true appearance in the Canifis pub", VarbitID.THSFM_VANSTROM_HIDE); // confirmed, ty sophie
        //Revealed the bank camel's name
        addTask("Revealed the bank camel's name", VarbitID.TOA_CAMEL_NAME_LEARNED);
        //
        //Used the blessed lamp from Brother Tranquility
        addTask("Used the blessed lamp from Brother Tranquility", VarbitID.BRAIN_LAMP_USED);

        //Used the combat lamp from the High Priest
        addEqTask(true, "Used the combat lamp from the High Priest", VarbitID.CONTACT_USED_REWARD_LAMP, 2);
        //Used the dreamy lamp from the Oneiromancer
        addTask("Used the dreamy lamp from the Oneiromancer", VarbitID.DREAM_LAMPUSED);
        //Used the antique lamp from Maisa
        addTask("Used the antique lamp from Maisa", VarbitID.ITT_USED_LAMP);
        //Used the dusty lamp from the Strange Old Man
        addTask("Used the dusty lamp from the Strange Old Man", VarbitID.HFS_REWARD_LAMP);
        //Used the crypt map from the Strange Old Man
        addTask("Used the crypt map from the Strange Old Man", VarbitID.BARROWS_MAP); // Untested, likely correct
        //Used both antique lamps from Commander Fullore
        addTask("Used both antique lamps from Commander Fullore", VarbitID.AKD_LAMP_REWARD); // Untested, likely correct

        //Used all 3 tomes of experience from Ivan Strom
        Task ivanStromUsedExpTomes = new Task.TaskBuilder()
                .name("Used all 3 tomes of experience from Ivan Strom")
                .eqVar(true, VarbitID.MYQ3_TOME_XP, 3)
                .eqVar(true, VarbitID.MYQ4_XP_REWARD, 3)
                .eqVar(true, VarbitID.MYQ5_XP_REWARD, 3)
                //.switchVar(true, VarbitID.MYQ5_BONUS_XP_REWARD) what is this?
                .build();
        this.add(ivanStromUsedExpTomes);
        //Used all 3 ancient lamps from the Mysterious Bandit
        addTask("Used all 3 ancient lamps from the Mysterious Bandit", VarbitID.DT2_REWARD_LAMP);
        //Used all 3 antique lamps from Cabin Boy Herbert
        addTask("Used all 3 antique lamps from Cabin Boy Herbert", VarbitID.CLUEQUEST_LAMP_REWARD);
        //Used all 4 antique lamps from the Mysterious Stranger
        Task tobQuestLampsUsed = new Task.TaskBuilder()
                .name("Used all 4 antique lamps from the Mysterious Stranger")
                .eqVar(true, VarbitID.TOBQUEST_LAMPS, 3)
                .switchVar(true, VarbitID.TOBQUEST_BONUS_LAMPS)
                .build();
        this.add(tobQuestLampsUsed);

        //Used all 4 magic lamps from Hazelmere/Narnode Shareen
        Task pathOfGlouphrieLampsUsed = new Task.TaskBuilder()
                .name("Used all 4 magic lamps from Hazelmere/Narnode Shareen")
                .switchVar(true, VarbitID.POG_MAGIC_LAMP)
                .switchVar(true, VarbitID.POG_SLAYER_LAMP)
                .switchVar(true, VarbitID.POG_STRENGTH_LAMP)
                .switchVar(true, VarbitID.POG_THIEVING_LAMP)
                .build();
        this.add(pathOfGlouphrieLampsUsed);
        //
        //Disabled Chambers of Xeric book drops
        Task disabledCoxBooks = new Task.TaskBuilder()
                .name("Disabled Chambers of Xeric book drops")
                .switchVar(true, VarbitID.RAIDS_BOOK_CREATUREKEEPER_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_HOUNDMASTER_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_VASANISTIRIO_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_TEKTON_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_VANGUARD_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_VESPULA_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_REWARDCHEST_READ)
                .build();
        this.add(disabledCoxBooks);
        //Disabled Theatre of Blood book drops couldn't find these
        //Filled my notes with all 26 ancient pages couldnt find these
        //Filled the fossil island note book with all 21 entries couldn't find these
        //Filled the strange Hallowed tome with all 5 mysterious pages
        Task filledHallowedTome = new Task.TaskBuilder()
                .name("Filled the strange Hallowed tome with all 5 mysterious pages")
                .switchVar(true, VarbitID.HALLOWED_TOME_PAGE1)
                .switchVar(true, VarbitID.HALLOWED_TOME_PAGE2)
                .switchVar(true, VarbitID.HALLOWED_TOME_PAGE3)
                .switchVar(true, VarbitID.HALLOWED_TOME_PAGE4)
                .switchVar(true, VarbitID.HALLOWED_TOME_PAGE5)
                .build();
        this.add(filledHallowedTome);
        //Obtained Atlax's diary
        addTask("Obtained Atlax's diary", VarbitID.GOTR_BOOK_OBTAINED); // essentially confirmed
        //Obtained the Overseer's book
        addEqTask(true, "Obtained the Overseer's book", VarbitID.ABYSSALSIRE_LORE, 5); // TODO: Untested, seems kinda random
        //Obtained the Mount Karuulm diary
        addTask("Obtained the Mount Karuulm diary", VarbitID.KARUULM_NOTES_BOOK);
        //Obtained both Shades of Mort'ton texts
        Task obtainedShadesOfMorttonTexts = new Task.TaskBuilder()
                .name("Obtained both Shades of Mort'ton texts")
                .switchVar(true, VarbitID.SHADES_BLOOD_DIARY)
                .switchVar(true, VarbitID.SHADES_SWAMP_DIARY)
                .build();
        this.add(obtainedShadesOfMorttonTexts);
        //Obtained both Dragon Slayer II texts
        Task obtainedDs2Texts = new Task.TaskBuilder()
                .name("Obtained both Dragon Slayer II texts")
                .switchVar(true, VarbitID.DS2_LITHKREN_NOTES) // confirmed
                .switchVar(true, VarbitID.DS2_UNGAEL_NOTES) // confirmed
                .build();
        this.add(obtainedDs2Texts);
        //Obtained all 6 Uhld adventurer texts from the Myths' Guild
        addTask("Obtained all 6 Uhld adventurer texts from the Myths' Guild", VarbitID.DS2_GUILD_BOOKS); // TODO: Unchecked?
        //Obtained all 6 grand bookshelf texts from the Theatre of Blood
        //Obtained all 7 boss texts from the Chambers of Xeric
        Task obtainedAllCoxTexts = new Task.TaskBuilder()
                .name("Obtained all 7 boss texts from the Chambers of Xeric")
                .switchVar(true, VarbitID.RAIDS_BOOK_VESPULA_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_VANGUARD_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_TEKTON_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_REWARDCHEST_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_HOUNDMASTER_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_CREATUREKEEPER_READ)
                .switchVar(true, VarbitID.RAIDS_BOOK_VASANISTIRIO_READ)
                .build();
        this.add(obtainedAllCoxTexts);

        //Obtained all 7 desert god texts from the Tombs of Amascut
        Task obtainedAllToaBooks = new Task.TaskBuilder()
                .name("Obtained all 7 desert god texts from the Tombs of Amascut")
                .switchVar(true, VarbitID.TOA_BOOK_KEPHRI)
                .switchVar(true, VarbitID.TOA_BOOK_BABA)
                .switchVar(true, VarbitID.TOA_BOOK_ZEBAK)
                .switchVar(true, VarbitID.TOA_BOOK_AKKHA)
                .switchVar(true, VarbitID.TOA_BOOK_WARDENS)
                .switchVar(true, VarbitID.TOA_BOOK_ICTHLARIN)
                .switchVar(true, 0) // TODO: What is the last book?
                .build();
        this.add(obtainedAllToaBooks);

        //Obtained all 7 farming patch texts from the Farming Guild
        Task obtainedAllFarmingGuildTexts = new Task.TaskBuilder()
                .name("Obtained all 7 farming patch texts from the Farming Guild")
                .switchVar(true, VarbitID.FGUILD_BOOK_ALLOTMENTS)
                .switchVar(true, VarbitID.FGUILD_BOOK_BUSHES)
                .switchVar(true, VarbitID.FGUILD_BOOK_FLOWERS)
                .switchVar(true, VarbitID.FGUILD_BOOK_FRUIT)
                .switchVar(true, VarbitID.FGUILD_BOOK_HOPS)
                .switchVar(true, VarbitID.FGUILD_BOOK_HERBS)
                .switchVar(true, VarbitID.FGUILD_BOOK_TREES)
                .build();
        this.add(obtainedAllFarmingGuildTexts);

        //Obtained all 16 elven texts from the Prifddinas Grand Library
        addTask("Obtained all 16 elven texts from the Prifddinas Grand Library", VarbitID.PRIF_BOOKS); // TODO: Unchecked
        //Obtained all 93 miscellaneous texts (2 are obtained by default) this is like 50 diff ones
        Task obtainedAllBooks = new Task.TaskBuilder() // anything added has been tested
                .name("Obtained all 93 miscellaneous texts (incomplete!)")
                .switchVar(true, VarbitID.HUEYCOATL_BOOK) // Huey book
                .eqVar(true, VarbitID.SOUL_WARS_TUTORIAL, 16) // Soul wars
                .switchVar(true, VarbitID.SLAYER_FOUND_DIARY) // Entomologist's diary
                .switchVar(true, VarbitID.GODWARS_DIARY_FOUND) // Keldagrim Explorer's Notes
                .switchVar(true, VarbitID.ALDARIN_WINE_BOOK) // Moonrise wines
                .switchVar(true, VarbitID.GA_JOURNAL) // Neilan's journal
                .switchVar(true, VarbitID.DARKMEYER_BOOK) // A taste of hope
                .switchVar(true, VarbitID.DS2_GUILD_BOOKS) // Ds2 myths guild library
                .switchVar(true, VarbitID.VIKINGEXILE_BALLAD) // Ballad of the basilisks or smth
                // ancient diary not transmitted
                // lletya books not transmitted
                // Both ruins of unkah not transmitted
                // Ohn's diary Zulrah not transmitted

                // Diary of Charles Charlington in Tar Swamp
                // Gianne's cookbook
                // Malumac's journal southwest karamjan temple
                // Ghrims book?
                // Memoirs of a Dwarven Explorer (Keldagrim library)?
                // old diary? Serafina search crate in home
                // Final battle tutorial barb assault
                // Taste of hope, Shadum's house in Darkmeyer
                // tome of the moon, sun, temple, think autocompleted after miniquest?
                .build();
        this.add(obtainedAllBooks);

        // TODO:
        //  I don't think any of the trophies are exposed in a varb/varp, but haven't tested
        //Unlocked the big bass fishing trophy option
        //Unlocked the big swordfish fishing trophy option
        //Unlocked the big shark fishing trophy option
        //Unlocked the big harpoonfish fishing trophy option
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
        //Paid Ceto for free entry to the drift net fishing area
        addTask("Paid Ceto for free entry to the drift net fishing area", VarbitID.FOSSIL_DRIFTNET_UNLIMITEDACCESS);
        //Unlocked all 4 Mycelium Transportation System locations no varb/varp
        //Claimed all 3 XP rewards from the information clerk
        Task claimedAll3MuseumXpRewards = new Task.TaskBuilder()
                .name("Claimed all 3 XP rewards from the information clerk")
                .switchVar(true, VarbitID.VM_REWARD_50)
                .switchVar(true, VarbitID.VM_REWARD_100)
                .switchVar(true, VarbitID.VM_REWARD_150)
                .build();
        this.add(claimedAll3MuseumXpRewards);
        //Claimed XP from Orlando Smith
        addTask("Claimed XP from Orlando Smith", VarbitID.VM_NATHIS_REWARD_GIVEN); // why tf is he nathis
        //Claimed fossils from Peter after completing the notice board
        Task claimedFossilsAfterCompletingFossilBoard = new Task.TaskBuilder()
                .name("Claimed fossils from Peter after completing the notice board")
                .switchVar(true, VarbitID.FOSSIL_TASKREWARDS_CAMP)
                .switchVar(true, VarbitID.FOSSIL_TASKREWARDS_EAST)
                .switchVar(true, VarbitID.FOSSIL_TASKREWARDS_NORTH)
                .switchVar(true, VarbitID.FOSSIL_TASKREWARDS_SWAMP)
                .build();
        this.add(claimedFossilsAfterCompletingFossilBoard);
        //Maxed the Museum Kudos counter with 243 Kudos
        addGeTask(true, "Maxed the Museum Kudos counter with 243 Kudos", VarbitID.VM_KUDOS, 243);
        //
        // Unlocked the Expert Dragon Archer title - TODO: couldnt find varb change on kc, maybe on rank change?
        //Logged a personal best at Tears of Guthix
        addGeTask(true, "Logged a personal best at Tears of Guthix", VarbitID.TOG_MAX_TEARS_COLLECTED, 1);

        //Listened to Ru Merald's Gem Crab intro
        addTask("Listened to Ru Merald's gemstone crab directions", VarbitID.GEMSTONE_CRAB_INTRO);
        //Logged at least 1 gp of destroyed loot keys via the Loot Chest
        //Logged at least 1 gp of redeemed loot keys via the Loot Chest
        //Logged at least 1 lap of the sledding course
        //Logged at least 2 laps of the Prifddinas Agility Course
        //Logged at least 2 laps of the Shayzien Basic Agility Course
        //Logged at least 2 laps of the Shayzien Advanced Agility Course
        //Logged at least 2 laps of the Wyrm Basic Agility Course
        //Logged at least 2 laps of the Wyrm Advanced Agility Course
        //Logged at least 2 offerings at the Woodcutting Guild's shrine
        //Logged at least 2 counts of opening Larran's small chest
        //Logged at least 2 counts of opening Larran's big chest
        //Logged at least 2 counts of opening the brimstone chest
        //Logged at least 2 counts of opening the Elven Crystal Chest
        //Logged at least 2 counts of opening the Dark Chest
        //Logged at least 2 counts of opening the Zombie Pirate's Locker
        //Logged at least 2 counts of opening all 8 Grand Gold Chests
        //
        //Claimed free food from Kamen in the Underground Pass
        addTask("Claimed free food from Kamen in the Underground Pass", VarbitID.UPASS_DWARF_FOOD); // confirmed
        //Claimed free food from Koftik in the Underground Pass
        addTask("Claimed free food from Koftik in the Underground Pass", VarbitID.UPASS_PALADIN_FOOD); //
        //Claimed items from Elnock Inquisitor in Impetuous Impulses
        addTask("Claimed items from Elnock Inquisitor in Impetuous Impulses", VarbitID.II_ELNOCK_GIVEN_FREESTUFF);
        //Claimed a free bucket from Fritz the Glassblower no varb/varp
        //Claimed both free beers from Lucy in the Falador Party Room
        addEqTask(true, "Claimed both free beers from Lucy in the Falador Party Room", VarbitID.OSB4_FREEBEERS, 3);
        //Claimed the pet reclaim token discount at Probita ? this is dead isnt it
        //Claimed all free chants for lost crystal equipment from Ilfeen TODO: Unfound
        //Claimed all weapon charge refunds from the Emblem Trader
        Task claimedBountyHunterWeaponChargeRefund = new Task.TaskBuilder()
                .name("Claimed all weapon charge refunds from the Emblem Trader")
                .eqVar(true, VarbitID.BH_MORRIGAN_AXE_REFUND_QUANTITY, 0)
                .eqVar(true, VarbitID.BH_MORRIGAN_JAVELIN_REFUND_QUANTITY, 0)
                .eqVar(true, VarbitID.BH_STATIUS_WARHAMMER_REFUND_QUANTITY, 0)
                .eqVar(true, VarbitID.BH_VESTA_SPEAR_REFUND_QUANTITY, 0)
                .eqVar(true, VarbitID.BH_ZURIEL_STAFF_REFUND_QUANTITY, 0)
                .build();
        this.add(claimedBountyHunterWeaponChargeRefund);

        //Claimed any deposit back from the Shilo Village furnace coffer TODO: Unfound
        //Claimed any additional sunfire armour from the STASH unit) probably doesn't exist
        //Completed all miniquests
        addEqTask(true, "Completed all 19 miniquests", VarbitID.MINIQUESTS_COMPLETED_COUNT, 19);

        // New, two-point-nine
        // Unlocked the ability to trade Thorgel for death talismans
        addTask("Unlocked the ability to trade Thorgel for death talismans", VarbitID.MOURNING_DWARF_STARTEDTASK); // confirmed
        // Unlocked Gabooty's shop open option
        addTask("Unlocked Gabooty's shop open option", VarbitID.GABOOTYSHOPCHAT); // confirmed
        // Listened to Shantay introduce the Shantay Pass no varb/varp
        // Razmire's directions to the Shade Lair (Shades of Mortton) TODO: Unfound will need a before and after on completing this during the quest! It is a bitmap so very difficult to check

        // Listened to the summary of Ulfric's parchment (Olaf's Quest)
        addTask("Listened to the summary of Ulfric's parchment", VarbitID.OLAF2_READ_NOTE); // confirmed
        // Disabled the giant bones bury warning Obor/Bryophyta
        addTask("Disabled the giant bones bury warning", VarbitID.GIANT_BONE_BURY_WARNING_DISABLE); // TODO: Untested
        // Listened to the vineyard foreman's ripe grape request
        addTask("Listened to the vineyard foreman's ripe grape request", VarbitID.ALDARIN_GRAPES_INTRO); // confirmed
        // Unlocked the maximum bow string spool capacity
        addEqTask(true, "Unlocked the maximum bow string spool capacity", VarbitID.BOWSTRING_SPOOL_SIZE, 5); // Idk what the max size is
        // Unlocked all 6 greenman mask variants TODO: Unfound
        // Unlocked all 6 pendant of ates teleport locations
        Task unlockPendantOfAtes = new Task.TaskBuilder()
                .name("Unlocked all 6 pendant of ates teleport locations") // confirmed
                .switchVar(true, VarbitID.PENDANT_OF_ATES_ALDARIN_FOUND)
                .switchVar(true, VarbitID.PENDANT_OF_ATES_AUBURN_FOUND)
                .switchVar(true, VarbitID.PENDANT_OF_ATES_DARKFROST_FOUND)
                .switchVar(true, VarbitID.PENDANT_OF_ATES_RALOS_FOUND)
                .switchVar(true, VarbitID.PENDANT_OF_ATES_TWILIGHT_FOUND)
                .switchVar(true, VarbitID.PENDANT_OF_ATES_TLATI_FOUND)
                .build();
        this.add(unlockPendantOfAtes);
        // Obtained both Hunter Guild texts
        Task obtainedBothHunterGuildBooks = new Task.TaskBuilder()
                .name("Obtained both Hunter Guild texts")
                .switchVar(true, VarbitID.AUBURN_ECOLOGICAL_REPORTS) // confirmed
                .switchVar(true, VarbitID.CUSTODIAN_LOREBOOK) // confirmed
                .build();
        this.add(obtainedBothHunterGuildBooks);
        // Looted the workbench containing iron nails at Tal Teklan
        addTask("Looted the workbench containing iron nails at Tal Teklan", VarbitID.SCRAMBLED_NAILS_GIVEN);
        // Told King her men helped with the egg (Scrambled!)
        addTask("Told King her men helped with the egg", VarbitID.SCRAMBLED_FINAL_KING_DIALOGUE); // confirmed
        // Told Attala about Mokhaiotl (The final dawn)
        addTask("Told Attala about Mokhaiotl", VarbitID.VMQ4_ATTALA_POST_QUEST_CHAT); // confirmed
        // Told Eyatlalli about Mokhaiotl (The final dawn)
        addTask("Told Eyatlalli about Mokhaiotl", VarbitID.VMQ4_EYATLALLI_POST_QUEST_CHAT); // confirmed
        // Told Bernard that Bernina is proud of him
        addEqTask(true, "Told Bernard that Bernina is proud of him", VarbitID.SPIRITOFADVENTURE, 5); // confirmed
        // Told Xilo and Fabia where to find each other
        addEqTask(true, "Told Xilo and Fabia where to find each other", VarbitID.TLATI_LOST_LOVER_FABIA, 2); // confirmed
        // Listened to the Friendly Forester explain Forestry
        addTask("Listened to the Friendly Forester explain Forestry", VarbitID.FORESTRY_FORESTER_MET); // confirmed
        // Listened to the Mountain Guide's offer for help
        addTask("Listened to the Mountain Guide's offer for help", VarbitID.MET_AUBURN_MOUNTAIN_GUIDE); // confirmed
        // Used the antique lamp from Prince Itzla (The final dawn)?
        addTask("Used the antique lamp from Prince Itzla", VarbitID.VMQ4_REWARD_LAMP_USED);
        // Listened to the Pilgrim introduce the Pilgrim Path (https://oldschool.runescape.wiki/w/Pilgrim)
        addTask("Listened to the Pilgrim introduce the Pilgrim Path", VarbitID.VARLAMORE_PILGRIM_MET); // confirmed
        // Claimed a free hunter kit from a hunting expert no varb/varp
        // Unlocked Ali Morisane's gnome question option
        addTask("Unlocked Ali Morisane's gnome question option", VarbitID.ALI_GNOME_RIVALRY); // confirmed
        // Claimed the pet insurance refund at Probita
        addEqTask(true, "Claimed the pet insurance refund at Probita", VarbitID.PET_INSURANCE_RECLAIM, 0); // Guessing this is it. Untested
        // "Unlocked Nevet's trade option"
        addTask("Unlocked Nevet's trade option", VarbitID.EVENTS_SHOP_OWNER_MET);
        // Disabled the Port Roberts jail guard bribe warning
        addTask("Disabled the Port Roberts jail guard bribe warning", VarbitID.PORT_ROBERTS_JAIL_QUICK_ESCAPE); // confirmed
        // Listened to Biles's introduction to the Drumstick Kingdom
        addTask("Listened to Biles's introduction to the Drumstick Kingdom", VarbitID.BILES_MET);
        // Obtained all guaranteed gold ring drops -- seems to be between varb 16551 and 16558, but are not transmitted
        // Built the bridge leading to the Mausoleum in Morytania
        Task mausoleumBridge = new Task.TaskBuilder()
                .name("Built the bridge leading to the Mausoleum in Morytania")
                .eqVar(true, VarbitID.FENK_BUILT_BRIDGE_NORTH, 2) // confirmed
                .eqVar(true, VarbitID.FENK_BUILT_BRIDGE_SOUTH, 2) // confirmed
                .build();
        this.add(mausoleumBridge);
        // Unlocked Durrik's trade option (Deepfin point)
        addTask("Unlocked Durrik's trade option", VarbitID.DEEPFIN_DWARF_DURRIK_MET); // confirmed
        // Unlocked both additional sailors' amulet teleport locations
        Task sailorsAmuletAllTelesUnlocked = new Task.TaskBuilder()
                .name("Unlocked both additional sailors' amulet teleport locations")
                .switchVar(true, VarbitID.SAILORS_AMULET_DEEPFIN)
                .switchVar(true, VarbitID.SAILORS_AMULET_ROBERTS)
                //.switchVar(true, VarbitID.SAILORS_AMULET_REDROCK) ?
                //.switchVar(true, VarbitID.SAILORS_AMULET_BARRACUDA) ?
                .build();
        this.add(sailorsAmuletAllTelesUnlocked);
        // Unlocked the ability to use Chet's coral nurseries.
        addTask("Unlocked the ability to use Chet's coral nurseries.", VarbitID.CONCH_CORAL_PATCHES_UNLOCKED);
        // Disabled the shipwright ship recovery warning
        addTask("Disabled the shipwright ship recovery warning", VarbitID.SAILING_BOAT_CARGOHOLD_WARNING_DISMISSED);
        // Unlocked Sleve McDichael's rename-boat option
        addTask("Unlocked Sleve McDichael's rename-boat option", VarbitID.SLEVE_MCDICHAEL_MET); // confirmed
        // Built all 20 hinged-lid crab traps
        Task builtAllCrabTraps = new Task.TaskBuilder()
                .name("Built all 20 hinged-lid crab traps")
                // Crown jewel
                .switchVar(true, VarbitID.CRAB_TRAP_CROWN_JEWEL_1)
                .switchVar(true, VarbitID.CRAB_TRAP_CROWN_JEWEL_2)
                .switchVar(true, VarbitID.CRAB_TRAP_CROWN_JEWEL_3)
                .switchVar(true, VarbitID.CRAB_TRAP_CROWN_JEWEL_4)
                .switchVar(true, VarbitID.CRAB_TRAP_CROWN_JEWEL_5)
                // Pandemonium
                .switchVar(true, VarbitID.CRAB_TRAP_PANDEMONIUM_1)
                .switchVar(true, VarbitID.CRAB_TRAP_PANDEMONIUM_2)
                .switchVar(true, VarbitID.CRAB_TRAP_PANDEMONIUM_3)
                .switchVar(true, VarbitID.CRAB_TRAP_PANDEMONIUM_4)
                .switchVar(true, VarbitID.CRAB_TRAP_PANDEMONIUM_5)
                // Conch east
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_EAST_1)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_EAST_2)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_EAST_3)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_EAST_4)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_EAST_5)
                // Conch north
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_NORTH_1)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_NORTH_2)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_NORTH_3)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_NORTH_4)
                .switchVar(true, VarbitID.CRAB_TRAP_GREAT_CONCH_NORTH_5)
                .build();
        this.add(builtAllCrabTraps);
        // Listened to the Ship Yard foreman's question no varb/varp
        // Listened to the Zombie pirate's story about his crew's whereabouts I tihnk this is the same as the next one?
        // Unlocked the zombie pirate's check option
        addEqTask(true, "Unlocked the zombie pirate's check option", VarbitID.WILDY_ZOMBIE_PIRATE_FRIENDLY_INTRO_CHAT, 2); // confirmed
        // Told the Carnillean guard about the assassin (DT2)
        addTask("Told the Carnillean guard about the assassin", VarbitID.DT2_GUARD_CARNILLEAN_DIALOGUE); // confirmed
        // Listened to the builders' advice (Final Dawn)
        addTask("Listened to the builders' advice", VarbitID.PMOON_BUILDERS_VMQ4_CHAT); // confirmed
        // Listened to Jessamine about the final dawn
        addTask("Talk to Jessamine after The Final Dawn", VarbitID.PMOON_JESS_VMQ4_CHAT); // confirmed
        // Attached a rope to the Charred Dungeon entrance
        addTask("Attached a rope to the Charred Dungeon entrance", VarbitID.DRAGON_ISLAND_DUNGEON_ENTRANCE_ROPED); // confirmed
        // Unlocked the ability to reclaim the medallion of the deep
        addTask("Unlocked the ability to reclaim the medallion of the deep", VarbitID.MOTD_CRAFTED);
        // Claimed XP from charting all oceans
        addTask("Claimed XP from charting all oceans", VarbitID.SAILING_CHARTING_FULL_COMPLETION_EVER_COMPLETE); //?
        // Looted the chest containing the storm cruiser's outfit
        addTask("Looted the chest containing the storm cruiser's outfit", VarbitID.SAILING_BT_STORMY_KEY_USED);
        // Looted the chest containing the swamp cruiser's outfit
        addTask("Looted the chest containing the swamp cruiser's outfit", VarbitID.SAILING_BT_FETID_KEY_USED);
        // Looted the chest containing the crystal gliders's outfit
        addTask("Looted the chest containing the crystal gliders's outfit", VarbitID.SAILING_BT_SERRATED_KEY_USED);
        // Unlocked the ability to assign all 10 crewmates
        Task gotAllSailingCrewmates = new Task.TaskBuilder()
                .name("Unlocked the ability to assign all 10 crewmates")
                .switchVar(true, VarbitID.SAILING_CREW_GENERIC_1_UNLOCKED) // Jobless Jim
                .switchVar(true, VarbitID.SAILING_CREW_CAPTAIN_SIAD_UNLOCKED) // Captain Siad
                .switchVar(true, VarbitID.SAILING_CREW_GENERIC_2_UNLOCKED) // Adventurer Ada
                .switchVar(true, VarbitID.SAILING_CREW_GHOST_JENKINS_UNLOCKED) // Cabin Boy Jenkins
                .switchVar(true, VarbitID.SAILING_CREW_WEREWOLF_UNLOCKED) // Oarswoman Olga
                .switchVar(true, VarbitID.SAILING_CREW_GENERIC_3_UNLOCKED) // Jittery Jim
                .switchVar(true, VarbitID.SAILING_CREW_FREMENNIK_UNLOCKED) // Bosun Zarah
                .switchVar(true, VarbitID.SAILING_CREW_GENERIC_4_UNLOCKED) // Jolly Jim
                .switchVar(true, VarbitID.SAILING_CREW_SPIRIT_ANGLER_UNLOCKED) // Spotter Virginia
                .switchVar(true, VarbitID.SAILING_CREW_GENERIC_5_UNLOCKED) // Sailor Jakob
                .build();
        this.add(gotAllSailingCrewmates);
        // Listened to the Elder Nama's gryphon warning
        addTask("Listened to the Elder Nama's gryphon warning", VarbitID.SLAYER_GRYPHON_BOSS_GUARDIAN_MET);
        // Unlocked Gull's metamorphosis option VERY LIKELY not transmitted
        // Claimed XP from drinking the melted rocks
        addTask("Claimed XP from drinking the melted rocks", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_ICE); // confirmed
        // Claimed XP from drinking Chuck up's 'stew'
        addTask("Claimed XP from drinking Chuck up's 'stew'", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_STEW); // confirmed
        // Claimed XP from drinking Daddy's special water's special water
        addTask("Claimed XP from drinking Daddy's special water's special water", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_WATER); // confirmed
        // Paid Brass Hand Harry for a sailing cape
        addTask("Paid Brass Hand Harry for a sailing cape", VarbitID.SKILLCAPE_SAILING_PURCHASED); // confirmed
        // Listened to Petrus describe minotaurs
        addTask("Listened to Petrus describe minotaurs", VarbitID.MINOTAURS_REST_BEASTMASTER_MET);
        // Disabled Shipwright Seb's ship repair warning
        addTask("Disabled Shipwright Seb's ship repair warning", VarbitID.BOAT_REPAIR_COST_WARNING_DISMISSED); // confirmed
        // Claimed all 5 mystery boxes from the puzzlers poteen
        addTask("Claimed all 5 mystery boxes from the puzzlers poteen", VarbitID.SAILING_CHARTING_DRINK_CRATE_PUZZLERS_POTEEN_REWARD);
        // Unlocked the ability to reclaim Ralph's fabric roll
        addTask("Unlocked the ability to reclaim Ralph's fabric roll", VarbitID.SAILING_BT_TEMPOR_TANTRUM_MARLIN_FIRST);
        // Unlocked the ability to reclaim Gurtob's fabric roll
        addTask("Unlocked the ability to reclaim Gurtob's fabric roll", VarbitID.SAILING_BT_JUBBLY_JIVE_MARLIN_FIRST);
        // Unlocked the ability to reclaim Gwyna's fabric roll
        addTask("Unlocked the ability to reclaim Gwyna's fabric roll", VarbitID.SAILING_BT_GWENITH_GLIDE_MARLIN_FIRST);
        // Unlocked the ability to reclaim Guthixian paint -- these do not seem to be transmitted
        // Unlocked the ability to reclaim Saradominist paint -- these do not seem to be transmitted
        // Unlocked the ability to reclaim Zamorakian paint -- these do not seem to be transmitted
        // Unlocked the ability to reclaim Armadylean paint -- these do not seem to be transmitted
        // Unlocked the swift marlin fishing trophy option
        // Unlocked the purplefin fishing trophy option
        // Unlocked the huge halibut fishing trophy option
        // Unlocked the golden haddock fishing trophy option
        // Unlocked the giant blue krill fishing trophy option
        // Unlocked the orangefin fishing trophy option
        // Told Betty the meaning of the notes (Ethically Acquired Antiquities)
        addTask("Told Betty the meaning of the notes", VarbitID.EAA_BETTY_TOLD_ABOUT_NOTE); // confirmed
        // Claimed pints of whirlpool suprise from Rum-dashed Ralph
        addTask("Claimed pints of whirlpool suprise from Rum-dashed Ralph", VarbitID.SAILING_BT_TEMPOR_TANTRUM_COLLECTED_WHIRLPOOL_SURPRISE); // confirmed
        // Asked Charlie the Tramp about the black arm gang
        addTask("Asked Charlie the Tramp about the black arm gang", VarbitID.SOA_CHARLIE_MET); // confirmed
        // Listened to Netmaster Kellan introduce deep sea trawling
        addTask("Listened to Netmaster Kellan introduce deep sea trawling", VarbitID.PORT_ROBERTS_NETMASTER_KELLAN_MET); // confirmed
        // Used XP lamp from Cow quest
        addTask("Used the magic lamp from Gillie Groats", VarbitID.COWBOSS_REWARD_LAMP); // confirmed
        // Claimed the Cowbell amulet after Ides of Milk
        addTask("Claim the Cowbell amulet", VarbitID.COWQUEST_REWARD); // confirmed
        // Disabled the warning on releasing Brutus
        addTask("Disabled the warning on releasing Brutus", VarbitID.COWBOSS_REGULAR_DONTASKAGAIN); // confirmed
        // Unlocked both Brutus scoreboards
        addEqTask(true, "Unlocked both Brutus scoreboards", VarbitID.COWBOSS_SCOREBOARDS, 2); // confirmed
        // Read the warning sign at Jiggig
        addTask("Read the warning sign at Jiggig", VarbitID.THZFE_COFFINMESSAGE); // confirmed
    }
}

