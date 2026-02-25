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
        Task targetTeleportUnlocked = new Task.TaskBuilder()
                .name("Unlocked Teleport to Target")
                .switchVar(true, VarbitID.BOUNTY_TARGET_TELEPORT)
                .build();
        this.add(targetTeleportUnlocked);
        Task ouraniaTeleportUnlocked = new Task.TaskBuilder()
                .name("Unlocked Ourania Teleport")
                .switchVar(true, VarbitID.RC_ZMI_LUNAR_SPELL)
                .build();
        this.add(ouraniaTeleportUnlocked);
        Task deathChargeUpgrade = new Task.TaskBuilder()
                .name("Unlocked the Death Charge upgrade")
                .switchVar(true, VarbitID.DEATH_CHARGE_SCROLL_USED)
                .build();
        this.add(deathChargeUpgrade);
        Task deadman24HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's Deadman 2024 animation option")
                .switchVar(true, VarbitID.DEADMAN_2024_TELEPORT_UNLOCKED)
                .build();
        this.add(deadman24HomeTele);
        Task deadman26HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's Deadman 2026 animation option")
                .switchVar(true, VarbitID.DEADMAN_2026_TELEPORT_UNLOCKED)
                .build();
        this.add(deadman26HomeTele);
        Task league1HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's League I animation option")
                .switchVar(true, VarbitID.LEAGUE_TWISTED_TELEPORT_UNLOCKED)
                .build();
        this.add(league1HomeTele);
        Task league2HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's League II animation option")
                .switchVar(true, VarbitID.LEAGUE_TRAILBLAZER_TELEPORT_UNLOCKED)
                .build();
        this.add(league2HomeTele);
        Task league3HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's League III animation option")
                .switchVar(true, VarbitID.LEAGUE_3_TELEPORT_UNLOCKED)
                .build();
        this.add(league3HomeTele);
        Task league4HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's League 4 animation option")
                .switchVar(true, VarbitID.LEAGUE_4_HOME_TELEPORT_UNLOCKED)
                .build();
        this.add(league4HomeTele);
        Task league5HomeTele = new Task.TaskBuilder()
                .name("Unlocked the Home Teleport's League 5 animation option")
                .switchVar(true, VarbitID.LEAGUE_5_HOME_TELEPORT_UNLOCKED)
                .build();
        this.add(league5HomeTele);
        Task league4Alchemy = new Task.TaskBuilder()
                .name("Unlocked the Alchemy's League IV animation option")
                .switchVar(true, VarbitID.LEAGUE_4_HIGH_ALCH_ANIMATION_UNLOCKED)
                .build();
        this.add(league4Alchemy);
        Task league4Vengeance = new Task.TaskBuilder()
                .name("Unlocked the Vengeance's League IV animation option")
                .switchVar(true, VarbitID.LEAGUE_4_VENGEANCE_ANIMATION_UNLOCKED)
                .build();
        this.add(league4Vengeance);

        //TODO:
        //Unlocked the NPC Contact's League V animation option couldn't find these two
        //Unlocked the ability to select all characters via NPC Contact

        Task selectedHomeTeleAnimation = new Task.TaskBuilder()
                .name("Selected at least one Home Teleport animation option")
                .geVar(true, VarbitID.HOME_TELEPORT_SELECTED, 1)
                .build();
        this.add(selectedHomeTeleAnimation);

        Task selectedAlchemyAnimation = new Task.TaskBuilder()
                .name("Selected at least one Alchemy animation option\t\t")
                .geVar(false, VarPlayerID.ALCHEMY_ANIM_TOGGLES, 1)
                .build();
        this.add(selectedAlchemyAnimation);

        Task selectedVengeanceAnimation = new Task.TaskBuilder()
                .name("Selected at least one Vengeance animation option\t\t")
                .geVar(false, VarPlayerID.VENGEANCE_ANIM_TOGGLES, 1)
                .build();
        this.add(selectedVengeanceAnimation);

        Task selectedNpcContactAnimation = new Task.TaskBuilder()
                .name("Selected at least one NPC Contact animation option\t\t")
                .geVar(false, VarPlayerID.NPC_CONTACT_ANIM_TOGGLES, 1)
                .build();
        this.add(selectedNpcContactAnimation);
    }
}
