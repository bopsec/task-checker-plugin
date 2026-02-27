package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import net.runelite.api.gameval.VarbitID;

public class GodBookTaskList extends TaskList
{

    public GodBookTaskList()
    {
        super("God books");
        initTasks();
    }

    public void initTasks()
    {
        // These varbits are not exposed.
        //Filled the holy book with all 4 Saradomin pages
        //Filled the book of balance with all 4 Guthix pages
        //Filled the unholy book with all 4 Zamorak pages
        //Filled the book of law with all 4 Armadyl pages
        //Filled the book of war with all 4 Bandos pages
        //Filled the book of darkness with all 4 ancient pages
    }
}
