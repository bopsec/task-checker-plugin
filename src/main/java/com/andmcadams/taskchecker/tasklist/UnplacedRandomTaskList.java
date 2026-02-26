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

    public void initTasks()
    {
        // TODO:!!!!
        //Logged at least 1 count of opening spoils of war
        //
        //Unlocked the effect of Ava's assembler in Castle Wars
        Task cwAvasEffect = new Task.TaskBuilder()
                .name("Unlocked the effect of Ava's assembler in Castle Wars")
                .eqVar(true, VarbitID.CASTLEWARS_AVA_REWARD_TIER, 3)
                .build();
        this.add(cwAvasEffect);
        //Unlocked the effect of Ava's assembler in Soul Wars
        Task swAvasEffect = new Task.TaskBuilder()
                .name("")
                .eqVar(true, VarbitID.SOUL_WARS_AVA_REWARD_TIER, 3)
                .build();
        this.add(swAvasEffect);
        //Unlocked the effect of Ava's assembler on ranging/max capes
        Task maxCapeAvasEffect = new Task.TaskBuilder()
                .name("Unlocked the effect of Ava's assembler on ranging/max capes")
                .switchVar(true, VarbitID.DS2_AMMO_COLLECTION)
                .build();
        this.add(maxCapeAvasEffect);
        //Unlocked the effect of Ava's assembler on Dizana's quiver
        Task quiverAvasEffect = new Task.TaskBuilder()
                .name("Unlocked the effect of Ava's assembler on Dizana's quiver")
                .eqVar(true, VarbitID.DIZANAS_QUIVER_AMMO_SAVE, 3)
                .build();
        this.add(quiverAvasEffect);
        //
        //Unlocked access to the basement of the Warriors' Guild
        Task warriorGuildBasement = new Task.TaskBuilder()
                .name("Unlocked access to the basement of the Warriors' Guild")
                .switchVar(true, VarbitID.WARGUILD_BASEMENT_ACCESS)
                .build();
        this.add(warriorGuildBasement);
        //
        //Unlocked all non-holiday music tracks
        Task unlockedMusicCape = new Task.TaskBuilder()
                .name("Unlocked all non-holiday music tracks")
                .geVar(true, VarbitID.MUSIC_CAPE_STATUS, 1)
                .build();
        this.add(unlockedMusicCape);
        //Unlocked the ability to toggle the music cape's trim
        Task unlockedMusicCapeTrim = new Task.TaskBuilder()
                .name("Unlocked the ability to toggle the music cape's trim")
                .geVar(true, VarbitID.MUSIC_CAPE_STATUS, 2)
                .build();
        this.add(unlockedMusicCapeTrim);
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
        Task unlockedSlepeTeleport = new Task.TaskBuilder()
                .name("Unlocked the ability to use Drakan's medallion's third teleport")
                .switchVar(true, VarbitID.SLEPE_TELEPORT_UNLOCKED)
                .build();
        this.add(unlockedSlepeTeleport);
        //
        //Unlocked the ability to use Xeric's talisman's fifth teleport TODO: Unfound
        //
        //Told Litara about what happened to Solztun TODO: Untested
        Task toldLitaraAboutSolztun = new Task.TaskBuilder()
                .name("Told Litara about what happened to Solztun")
                .eqVar(true, VarbitID.SOS_BROTHER_FOUND, 2)
                .build();
        this.add(toldLitaraAboutSolztun);
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
                .switchVar(true, VarbitID.KANDARIN_DIARY_EASY_COMPLETE)
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
                .eqVar(true, VarPlayerID.QP, 333)
                .switchVar(true, VarbitID.ARDOUGNE_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.DESERT_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FALADOR_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.FREMENNIK_DIARY_ELITE_COMPLETE)
                .switchVar(true, VarbitID.KANDARIN_DIARY_EASY_COMPLETE)
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
        Task allBeginnerStashUnits = new Task.TaskBuilder()
                .name("Built all 3 beginner STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_BEGINNER_ALL, 7)
                .build();
        this.add(allBeginnerStashUnits);
        //Built all 30 easy STASH units (do not have to be filled)
        Task allEasyStashUnits = new Task.TaskBuilder()
                .name("Built all 32 easy STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_EASY_ALL, Integer.MAX_VALUE) // 2^32 - 1
                .build();
        this.add(allEasyStashUnits);
        //Built all 25 medium STASH units (do not have to be filled)
        Task allMediumStashUnits = new Task.TaskBuilder()
                .name("Built all 25 medium STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_MEDIUM_ALL, 33554431) // 2^25 - 1
                .build();
        this.add(allMediumStashUnits);
        //Built all 16 hard STASH units (do not have to be filled)
        Task allHardStashUnits = new Task.TaskBuilder()
                .name("Built all 16 hard STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_HARD_ALL, 65535) // 2 ^ 16 - 1
                .build();
        this.add(allHardStashUnits);
        //Built all 19 elite STASH units (do not have to be filled)
        Task allEliteStashUnits = new Task.TaskBuilder()
                .name("Built all 19 elite STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_ELITE_ALL, 524287) // 2^19 - 1
                .build();
        this.add(allEliteStashUnits);
        //Built all 25 master STASH units (do not have to be filled)
        Task allMasterStashUnits = new Task.TaskBuilder()
                .name("Built all 25 master STASH units (do not have to be filled)")
                .eqVar(true, VarbitID.HH_CONSTRUCTED_MASTER_ALL, 33554431) // 2^25 - 1
                .build();
        this.add(allMasterStashUnits);
        //
        //Unlocked the ability to reclaim Crack the Clue III event items
        //Unlocked the ability to reclaim all 35 Birthday holiday items
        //Unlocked the ability to reclaim all 36 Easter holiday items
        //Unlocked the ability to reclaim all 56 Hallowe'en holiday items
        //Unlocked the ability to reclaim all 65 Christmas holiday items
        //Unlocked the ability to reclaim all 10 buyable holiday items
        //Unlocked the ability to reclaim all 7 Pride event items
        //Unlocked the ability to reclaim the mystic cards
        //Unlocked the ability to reclaim the banana hat
        //
        //Unlocked Guildmaster Jane's contracts completed option
        Task unlockedFarmingGuildContractsOption = new Task.TaskBuilder()
                .name("")
                .switchVar(true, VarbitID.FARMGUILD_CONTRACT_DISCUSSED) // TODO: Untested idk about this one
                .build();

        //Unlocked Simon Templeton's pyramid artefacts option
        Task simonTempletonPyramidArtefacts = new Task.TaskBuilder()
                .name("Unlocked Simon Templeton's pyramid artefacts option")
                .switchVar(true, VarbitID.AGILITY_PYRAMID_SIMON_NAMED) // TODO: Untested
                .build();
        this.add(simonTempletonPyramidArtefacts);
        //Unlocked Farmer Gricoller's visitors option
        Task gricollerVisitorsOption = new Task.TaskBuilder()
                .name("Unlocked Farmer Gricoller's visitors option")
                .switchVar(true, VarbitID.DARKMEYER_VYRE_TITHE_DIALOGUE) // TODO: Untested
                .build();
        this.add(gricollerVisitorsOption);
        //Unlocked Death's death Leagues IV animation option
        Task leagues4DeathAnim = new Task.TaskBuilder()
                .name("Unlocked Death's death Leagues IV animation option")
                .switchVar(true, VarbitID.LEAGUE_4_DEATH_ANIMATION_UNLOCKED)
                .build();
        this.add(leagues4DeathAnim);
        //Unlocked Death's death Leagues V animation option
        Task leagues5DeathAnim = new Task.TaskBuilder()
                .name("Unlocked Death's death Leagues V animation option")
                .switchVar(true, VarbitID.LEAGUE_5_DEATH_ANIMATION_UNLOCKED)
                .build();
        this.add(leagues5DeathAnim);
        //Unlocked the candle seller's lantern making option
        Task candleSellerLanternOption = new Task.TaskBuilder()
                .name("Unlocked the candle seller's lantern making option")
                .switchVar(true, VarbitID.SWAMP_CANDLE_GUY_CONVERSATION) // TODO: Think untested
                .build();
        this.add(candleSellerLanternOption);
        //Unlocked the pharaoh's sceptre's Jaltevas teleport option
        Task unlockedPharaohsSceptreJaltevas = new Task.TaskBuilder()
                .name("Unlocked the pharaoh's sceptre's Jaltevas teleport option")
                .switchVar(true, VarbitID.PHARAOHS_SCEPTRE_NECROPOLIS)
                .build();
        this.add(unlockedPharaohsSceptreJaltevas);
        //
        //Unlocked all 3 of Juna's story options
        Task unlockedAll3JunaStories = new Task.TaskBuilder()
                .name("Unlocked all 3 of Juna's story options")
                .eqVar(true, VarbitID.TOG_JUNA_STORIES, 4)
                .build();
        this.add(unlockedAll3JunaStories);
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
        Task secretSantaPresentColours = new Task.TaskBuilder()
                .name("Unlocked all 4 additional secret santa present colours")
                .eqVar(true, VarbitID.XM21_REWARD_PRESENT, 4)
                .build();
        this.add(secretSantaPresentColours);
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
        Task toggledDeathAnimation = new Task.TaskBuilder()
                .name("Selected at least one death animation option")
                .geVar(false, VarPlayerID.DEATH_ANIM_TOGGLES, 1)
                .build();
        this.add(toggledDeathAnimation);
        //
        //Unlocked all 6 balloon transport system routes
        Task unlockedAllBallooonTransports = new Task.TaskBuilder()
                .name("Unlocked all 6 balloon transport system routes")
                .switchVar(true, VarbitID.ZEP_MULTI_VARR)
                .switchVar(true, VarbitID.ZEP_MULTI_CAST)
                .switchVar(true, VarbitID.ZEP_MULTI_CRAFT)
                .switchVar(true, VarbitID.ZEP_MULTI_GNO)
                .switchVar(true, VarbitID.ZEP_MULTI_BASKET)
                .switchVar(true, VarbitID.ZEP_MULTI_PICCARD)
                .build();
        this.add(unlockedAllBallooonTransports);
        //Selected a preference for the log storage crates TODO: Didn't change when already done, so couldn't fint it
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
        Task peekInsideCallistoDen = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Callisto's Den")
                .geVar(false, VarPlayerID.TOTAL_CALLISTO_KILLS, 20)
                .build();
        this.add(peekInsideCallistoDen);
        //Unlocked the ability to peek inside Venenatis' Silk Chasm
        Task peekInsideVenenatisChasm = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Venenatis' Silk Chasm")
                .geVar(false, VarPlayerID.TOTAL_VENENATIS_KILLS, 20)
                .build();
        this.add(peekInsideVenenatisChasm);
        //Unlocked the ability to peek inside Vet'ion's Rest
        Task peekInsideVetionRest = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Vet'ion's Rest")
                .geVar(false, VarPlayerID.TOTAL_VETION_KILLS, 20)
                .build();
        this.add(peekInsideVetionRest);
        //Unlocked the ability to peek inside Artio's Hunter's End
        Task peekInsideArtioEnd = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Artio's Hunter's End")
                .geVar(false, VarPlayerID.TOTAL_ARTIO_KILLS, 20)
                .build();
        this.add(peekInsideArtioEnd);
        //Unlocked the ability to peek inside Spindel's Web Chasm
        Task peekInsideSpindelChasm = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Spindel's Web Chasm")
                .geVar(false, VarPlayerID.TOTAL_SPINDEL_KILLS, 20)
                .build();
        this.add(peekInsideSpindelChasm);
        //Unlocked the ability to peek inside Calvar'ion's Skeletal Tomb
        Task peekInsideCalvarionTomb = new Task.TaskBuilder()
                .name("Unlocked the ability to peek inside Calvar'ion's Skeletal Tomb")
                .geVar(false, VarPlayerID.TOTAL_CALVARION_KILLS, 20)
                .build();
        this.add(peekInsideCalvarionTomb);
        //
        //Unlocked the ability to respawn at Kourend Castle
        Task unlockedKourendRespawn = new Task.TaskBuilder()
                .name("Unlocked the ability to respawn at Kourend Castle")
                .switchVar(true, VarbitID.AKD_ASTEROS_MET)
                .build();
        this.add(unlockedKourendRespawn);

        //Paid Krystilia for the ability to respawn at Edgeville
        Task unlockedEdgeRespawn = new Task.TaskBuilder()
                .name("Paid Krystilia for the ability to respawn at Edgeville")
                .switchVar(true, VarbitID.EDGEVILLE_SPAWN_UNLOCKED)
                .build();
        this.add(unlockedEdgeRespawn);
        //Paid Ferox for the ability to respawn at Ferox Enclave
        Task unlockedFeroxRespawn = new Task.TaskBuilder()
                .name("Paid Ferox for the ability to respawn at Ferox Enclave")
                .switchVar(true, VarbitID.WILDERNESS_SPAWN_UNLOCKED)
                .build();
        this.add(unlockedFeroxRespawn);
        //
        //Unlocked the ability to see the last item you smithed
        //Unlocked the ability to see the last gold item you crafted
        //Unlocked the ability to see the last silver item you crafted
        //
        //Unlocked the ability to reclaim the diamond speedrun trophy
        //Unlocked the ability to reclaim the tier 1 adventurer's outfit
        //Unlocked the ability to reclaim the tier 2 adventurer's outfit
        //Unlocked the ability to reclaim the tier 3 adventurer's outfit
        //Unlocked the ability to reclaim the giant stopwatch
        //Unlocked the Home Teleport's Speedy animation option
        //
        //Filled the word translations scroll with all 77 translations
        //Filled the travel log with all 52 fairy ring codes
        //Filled your Grand Exchange history with 40 completed trades
        //
        //Unlocked the memories stored in the memoriam crystal (1)
        //Unlocked the memories stored in the memoriam crystal (2)
        //Unlocked the memories stored in the memoriam crystal (3)
        //Unlocked the memories stored in the memoriam crystal (4)
        //
        //Unlocked the ability to create Neitiznot faceguards
        //Unlocked the ability to create super antifire potions
        //Unlocked thFroe ability to create sextants and watches
        //Unlocked the ability to create ancient icons
        //Unlocked the ability to create tormented synapse weapons
        //
        //Revealed the human translation of the Cosmic Being's name
        //Revealed the stranger's true appearance in the Canifis pub
        //Revealed the bank camel's name
        //
        //Used the blessed lamp from Brother Tranquility
        //Used the combat lamp from the High Priest
        //Used the dreamy lamp from the Oneiromancer
        //Used the antique lamp from Maisa
        //Used the dusty lamp from the Strange Old Man
        //Used the crypt map from the Strange Old Man
        //Used both antique lamps from Commander Fullore
        //Used all 3 tomes of experience from Ivan Strom
        //Used all 3 ancient lamps from the Mysterious Bandit
        //Used all 3 antique lamps from Cabin Boy Herbert
        //Used all 4 antique lamps from the Mysterious Stranger
        //Used all 4 magic lamps from Hazelmere/Narnode Shareen
        //
        //Disabled Chambers of Xeric book drops
        //Disabled Theatre of Blood book drops
        //Filled my notes with all 26 ancient pages
        //Filled the fossil island note book with all 21 entries
        //Filled the strange Hallowed tome with all 5 mysterious pages
        //Obtained Atlax's diary
        //Obtained the Overseer's book
        //Obtained the Mount Karuulm diary
        //Obtained both Shades of Mort'ton texts
        //Obtained both Dragon Slayer II texts
        //Obtained all 6 Uhld adventurer texts from the Myths' Guild
        //Obtained all 6 grand bookshelf texts from the Theatre of Blood
        //Obtained all 7 boss texts from the Chambers of Xeric
        //Obtained all 7 desert god texts from the Tombs of Amascut
        //Obtained all 7 farming patch texts from the Farming Guild
        //Obtained all 16 elven texts from the Prifddinas Grand Library
        //Obtained all 93 miscellaneous texts (2 are obtained by default)
        //
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
        //Unlocked the abyssal head trophy option
        //Obtained the guaranteed KQ head (tattered) drop
        //Unlocked all 5 additional ornate combat dummy options
        //
        //Paid Ceto for free entry to the drift net fishing area
        //Unlocked all 4 Mycelium Transportation System locations
        //Claimed all 3 XP rewards from the information clerk
        //Claimed XP from Orlando Smith
        //Claimed fossils from Peter after completing the notice board
        //Maxed the Museum Kudos counter with 235 Kudos
        //
        //Unlocked the Expert Dragon Archer title
        //
        //Logged a personal best at Tears of Guthix
        //Logged at least 1 gp of destroyed loot keys via the Loot Chest
        //Logged at least 1 gp of redeemed loot keys via the Loot Chest
        //Logged at least 1 lap of the sledding course
        //Logged at least 2 laps of the Prifddinas Agility Course
        //Logged at least 2 laps of the Shayzien Basic Agility Course
        //Logged at least 2 laps of the Shayzien Advanced Agility Course
        //Logged at least 2  laps of the Wyrm Basic Agility Course
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
        //Claimed free food from Koftik in the Underground Pass
        //Claimed items from Elnock Inquisitor in Impetuous Impulses
        //Claimed a free bucket from Fritz the Glassblower
        //Claimed both free beers from Lucy in the Falador Party Room
        //Claimed the pet reclaim token discount at Probita
        //Claimed all free chants for lost crystal equipment from Ilfeen
        //Claimed all weapon charge refunds from the Emblem Trader
        //Claimed any deposit back from the Shilo Village furnace coffer
        //Claimed any additional sunfire armour from the STASH unit)

    }
}
