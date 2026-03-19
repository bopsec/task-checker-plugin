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

public class UtilityItemTaskList extends TaskList {

    public UtilityItemTaskList() {
        super("Utility items");
        initTasks();
    }

    public void initTasks() {
        addTask("Attached a long rope to the rock in the Viyeldi caves", VarbitID.VIYELDI_SHORTCUT);

        Task attachKalphiteRopes = new Task.TaskBuilder()
                .name("Attach ropes to both Kalphite Hives tunnel entrances (you may need to enter the Kalphite Hive)")
                .switchVar(true, VarbitID.KALPHITE_ROPE_1)
                .geVar(true, VarbitID.KALPHITE_ROPE_2, 1)
                .build();

        addTask("Attach a grapple to the rocks next to the Observatory", VarbitID.OBSERVATORY_SHORTCUT_ROPE);

        Task attachDarkmeyerRopes = new Task.TaskBuilder()
                .name("Attach both long ropes to both sides of the Darkmeyer wall")
                .switchVar(true, VarbitID.DARKM_SHORTCUT_INNER)
                .switchVar(true, VarbitID.DARKM_SHORTCUT_OUTER)
                .build();

        add(attachKalphiteRopes);
        add(attachDarkmeyerRopes);

        // Built the bridge leading to the Mausoleum in Morytania
        Task mausoleumBridge = new Task.TaskBuilder()
                .name("Built the bridge leading to the Mausoleum in Morytania")
                .eqVar(true, VarbitID.FENK_BUILT_BRIDGE_NORTH, 2) // confirmed
                .eqVar(true, VarbitID.FENK_BUILT_BRIDGE_SOUTH, 2) // confirmed
                .build();
        this.add(mausoleumBridge);

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
        //
    }
}

