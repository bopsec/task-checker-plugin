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

public class CombatAchievementsTaskList extends TaskList
{

    public CombatAchievementsTaskList()
    {
        super("CAs");
        initTasks();
    }

    public void initTasks()
    {
        //TODO: Unlocked the permanent slayer bonus in Mor Ul Rek caves
        //Claimed all Combat Achievement rewards for every tier
        addEqTask(true, "Claimed all Combat Achievement rewards for every tier", VarbitID.CA_TIER_STATUS_GRANDMASTER, 2);
        addTask("Used the antique lamp (easy tier)", VarbitID.CA_LAMP_CLAIMED_EASY);
        addTask("Used the antique lamp (medium tier)",  VarbitID.CA_LAMP_CLAIMED_MEDIUM);
        addTask("Used the antique lamp (hard tier)", VarbitID.CA_LAMP_CLAIMED_HARD);
        addTask("Used the antique lamp (elite tier)", VarbitID.CA_LAMP_CLAIMED_ELITE);
        addTask("Used the antique lamp (master tier)", VarbitID.CA_LAMP_CLAIMED_MASTER);
        addTask("Used the antique lamp (grandmaster tier)", VarbitID.CA_LAMP_CLAIMED_GRANDMASTER);
    }

}

