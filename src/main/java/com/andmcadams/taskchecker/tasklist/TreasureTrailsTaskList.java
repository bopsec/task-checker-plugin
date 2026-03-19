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

public class TreasureTrailsTaskList extends TaskList {

    public TreasureTrailsTaskList() {
        super("Treasure Trails");
        initTasks();
    }

    public void initTasks() {

        addGeTask(false, "Unlock the Explore emote", VarPlayerID.COMPLETED_CLUES5, 600);

        addGeTask(false, "Unlock the Large spade", VarPlayerID.COMPLETED_CLUES, 500);

        addGeTask(false, "Unlock the Clueless scroll", VarPlayerID.COMPLETED_CLUES1, 400);

        addGeTask(false, "Unlock the Uri transform emote", VarPlayerID.COMPLETED_CLUES2, 300);

        addGeTask(false, "Unlock the Heavy casket", VarPlayerID.COMPLETED_CLUES3, 200);

        addGeTask(false, "Unlock the Scroll sack", VarPlayerID.COMPLETED_CLUES4, 100);

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
    }
}

