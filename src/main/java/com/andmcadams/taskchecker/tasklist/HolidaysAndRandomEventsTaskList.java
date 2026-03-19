package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import net.runelite.api.gameval.VarbitID;

public class HolidaysAndRandomEventsTaskList extends TaskList {

    public HolidaysAndRandomEventsTaskList() {
        super("Holidays and Random events");
        initTasks();
    }

    public void initTasks() {
        //
        // How do I do these? Just check if the latest event has reached the final varb/varp value?
        //Unlocked the ability to reclaim Crack the Clue III event items not transmitted
        //Unlocked the ability to reclaim all 35 Birthday holiday items
        addGeTask(true, "Unlocked the ability to reclaim all Birthday holiday items", VarbitID._25TH_PROGRESS, 30);
        //Unlocked the ability to reclaim all 36 Easter holiday items
        addGeTask(true, "Unlocked the ability to reclaim all Easter holiday items", VarbitID.EASTER25_TRACKING, 100);
        //Unlocked the ability to reclaim all 56 Hallowe'en holiday items
        addGeTask(true, "Unlocked the ability to reclaim all Hallowe'en holiday items", VarbitID.HW25_MAIN, 60);
        //Unlocked the ability to reclaim all 65 Christmas holiday items
        addGeTask(true, "Unlocked the ability to reclaim all Christmas holiday items", VarbitID.XMAS_25_MAIN, 115);
        //Unlocked the ability to reclaim all 10 buyable holiday items not transmitted
        //Unlocked the ability to reclaim all 7 Pride event items not transmitted
        //Unlocked the ability to reclaim the mystic cards not transmitted
        //Unlocked the ability to reclaim the banana hat not transmitted
        //
        //

        //Unlocked all 4 additional secret santa present colours
        addEqTask(true, "Unlocked all 4 additional secret santa present colours", VarbitID.XM21_REWARD_PRESENT, 4);

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
    }
}
