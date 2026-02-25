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
import net.runelite.api.gameval.VarPlayerID;
import net.runelite.api.gameval.VarbitID;

public class RaidsCapesTaskList extends TaskList
{

    public RaidsCapesTaskList()
    {
        super("Raids capes");
        initTasks();
    }

    public void initTasks()
    {
        Task coxCape1 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Xeric's guard")
                .geVar(false, VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 100)
                .build();
        this.add(coxCape1);
        Task coxCape2 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Xeric's warrior")
                .geVar(false, VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 500)
                .build();
        this.add(coxCape2);
        Task coxCape3 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Xeric's sentinel")
                .geVar(false, VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 1000)
                .build();
        this.add(coxCape3);
        Task coxCape4 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Xeric's general")
                .geVar(false, VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 1500)
                .build();
        this.add(coxCape4);
        Task coxCape5 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Xeric's champion")
                .geVar(false, VarPlayerID.TOTAL_COMPLETED_XERICCHAMBERS_CHALLENGE, 2000)
                .build();
        this.add(coxCape5);

        //
        Task tobCape1 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim a Sinhaza shroud tier 1")
                .geSumVars(false, 100, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
                .build();
        this.add(tobCape1);
        Task tobCape2 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim a Sinhaza shroud tier 2")
                .geSumVars(false, 500, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
                .build();
        this.add(tobCape2);
        Task tobCape3 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim a Sinhaza shroud tier 3")
                .geSumVars(false, 1000, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
                .build();
        this.add(tobCape3);
        Task tobCape4 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim a Sinhaza shroud tier 4")
                .geSumVars(false, 1500, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
                .build();
        this.add(tobCape4);
        Task tobCape5 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim a Sinhaza shroud tier 5")
                .geSumVars(false, 2000, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD, VarPlayerID.TOTAL_COMPLETED_THEATREOFBLOOD_HARD)
                .build();
        this.add(tobCape5);
        //
        Task toaCape1 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Icthlarin's shroud (tier 1)")
                .geSumVars(false, 100, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
                .build();
        this.add(toaCape1);
        Task toaCape2 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Icthlarin's shroud (tier 2)")
                .geSumVars(false, 500, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
                .build();
        this.add(toaCape2);
        Task toaCape3 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Icthlarin's shroud (tier 3)")
                .geSumVars(false, 1000, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
                .build();
        this.add(toaCape3);
        Task toaCape4 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Icthlarin's shroud (tier 4)")
                .geSumVars(false, 1500, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
                .build();
        this.add(toaCape4);
        Task toaCape5 = new Task.TaskBuilder()
                .name("Unlocked the ability to claim Icthlarin's shroud (tier 5)")
                .geSumVars(false, 2000, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT, VarPlayerID.TOTAL_COMPLETED_TOMBSOFAMASCUT_EXPERT)
                .build();
        this.add(toaCape5);
    }
}
