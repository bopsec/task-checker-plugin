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

public class SpellbookTaskList extends TaskList
{

    public SpellbookTaskList()
    {
        super("Miscellaneous spellbook related");
        initTasks();
    }

    public void initTasks()
    {
        addTask("Unlocked Teleport to Target", VarbitID.BOUNTY_TARGET_TELEPORT);
        addTask("Unlocked Ourania Teleport", VarbitID.RC_ZMI_LUNAR_SPELL);
        addTask("Unlocked the Death Charge upgrade", VarbitID.DEATH_CHARGE_SCROLL_USED);
        addTask("Unlocked the Home Teleport's Deadman 2024 animation option", VarbitID.DEADMAN_2024_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's Deadman 2026 animation option", VarbitID.DEADMAN_2026_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's League I animation option", VarbitID.LEAGUE_TWISTED_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's League II animation option", VarbitID.LEAGUE_TRAILBLAZER_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's League III animation option", VarbitID.LEAGUE_3_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's League 4 animation option", VarbitID.LEAGUE_4_HOME_TELEPORT_UNLOCKED);
        addTask("Unlocked the Home Teleport's League 5 animation option", VarbitID.LEAGUE_5_HOME_TELEPORT_UNLOCKED);
        addTask("Unlocked the Alchemy's League IV animation option", VarbitID.LEAGUE_4_HIGH_ALCH_ANIMATION_UNLOCKED);
        addTask("Unlocked the Vengeance's League IV animation option", VarbitID.LEAGUE_4_VENGEANCE_ANIMATION_UNLOCKED);

        //Unlocked the NPC Contact's League V animation option
        addGeTask(false, "Unlocked the NPC Contact's League V animation option", VarPlayerID.NPC_CONTACT_UNLOCKS, 3); // confirmed

        //Unlocked the ability to select all characters via NPC Contact not transmitted

        addGeTask(true, "Selected at least one Home Teleport animation option", VarbitID.HOME_TELEPORT_SELECTED, 1);

        addGeTask(false, "Selected at least one Alchemy animation option", VarPlayerID.ALCHEMY_ANIM_TOGGLES, 1);

        addGeTask(false, "Selected at least one Vengeance animation option", VarPlayerID.VENGEANCE_ANIM_TOGGLES, 1);

        addGeTask(false, "Selected at least one NPC Contact animation option", VarPlayerID.NPC_CONTACT_ANIM_TOGGLES, 1);
    }
}

