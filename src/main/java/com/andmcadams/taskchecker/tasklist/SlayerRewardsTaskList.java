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

import net.runelite.api.gameval.VarbitID;

public class SlayerRewardsTaskList extends TaskList {

    public SlayerRewardsTaskList() {
        super("Slayer Rewards");
        initTasks();
    }

    public void initTasks() {
        addTask("Unlock Gargoyle Smasher", VarbitID.SLAYER_AUTOKILL_GARGOYLES);

        addTask("Unlock Slug Salter", VarbitID.SLAYER_AUTOKILL_ROCKSLUGS);

        addTask("Unlock Reptile Freezer", VarbitID.SLAYER_AUTOKILL_DESERTLIZARDS);

        addTask("Unlock 'Shroom Sprayer", VarbitID.SLAYER_AUTOKILL_ZYGOMITES);

        addTask("Unlock Broader Fletching", VarbitID.SLAYER_AMMO_UNLOCKED);

        addTask("Unlock Malevolent Masquerade", VarbitID.SLAYER_HELM_UNLOCKED);

        addTask("Unlock Ring Bling", VarbitID.SLAYER_RING_UNLOCKED);

        addTask("Unlock Bigger and Badder", VarbitID.SLAYER_UNLOCK_SUPERIORMOBS);

        addTask("Unlock King Black Bonnet", VarbitID.SLAYER_UNLOCK_HELM_BLACK);

        addTask("Unlock Kalphite Khat", VarbitID.SLAYER_UNLOCK_HELM_GREEN);

        addTask("Unlock Unholy Helmet", VarbitID.SLAYER_UNLOCK_HELM_RED);

        addTask("Unlock Dark Mantle", VarbitID.SLAYER_UNLOCK_HELM_PURPLE);

        addTask("Unlock Undead Head", VarbitID.SLAYER_UNLOCK_HELM_TURQUOISE);

        addTask("Unlock Use More Head", VarbitID.SLAYER_UNLOCK_HELM_HYDRA);

        addTask("Unlock Duly Noted", VarbitID.SLAYER_UNLOCK_NOTEDMITHRILBARS);

        addTask("Unlock Stop the Wyvern", VarbitID.SLAYER_UNLOCK_FOSSILWYVERNBLOCK);

        addTask("Unlock Twisted Vision", VarbitID.SLAYER_UNLOCK_HELM_TWISTED);

        addTask("Unlock Task Storage", VarbitID.SLAYER_UNLOCK_STORAGE);

        addTask("Unlock Revenenenenenants", VarbitID.SLAYER_LONGER_REVENANTS);

        addTask("Unlocked Eye See You", VarbitID.SLAYER_UNLOCK_HELM_ARAXYTE);

        addTask("Unlocked hooded slayer helmet", VarbitID.SLAYER_UNLOCK_HELM_HOODED);

        addTask("Unlocked Shayzien(5) effect on slayer helmet", VarbitID.KOUREND_SLAYER_HELM_BONUS);

    }
}

