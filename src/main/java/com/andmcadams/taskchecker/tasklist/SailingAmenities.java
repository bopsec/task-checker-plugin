package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import com.andmcadams.taskchecker.Varbits;
import net.runelite.api.gameval.VarbitID;

public class SailingAmenities extends TaskList
{

    public SailingAmenities()
    {
        super("Sailing Amenities");
        initTasks();
    }

    public void initTasks()
    {
        // Anglers
        addTask("Anglers' retreat cooking pot", VarbitID.AMENITY_COOKING_POT_ANGLERS);
        addTask("Anglers' retreat rowboat", VarbitID.AMENITY_ROWBOAT_ANGLERS);
        addTask("Anglers' retreat spinning wheel", VarbitID.AMENITY_SPINNING_WHEEL_ANGLERS);

        // Buccaneers
        addTask("Buccaneers anvil", VarbitID.AMENITY_ANVIL_BUCCANEERS);
        addTask("Buccaneers bank chest", VarbitID.AMENITY_BANKCHEST_BUCCANEERS);
        addTask("Buccaneers furnace", VarbitID.AMENITY_FURNACE_BUCCANEERS);
        addTask("Buccaneers rowboat", VarbitID.AMENITY_ROWBOAT_BUCCANEERS);

        // Charred Island
        addTask("Charred Island anvil", VarbitID.AMENITY_ANVIL_CHARRED_ISLAND);
        addTask("Charred Island bank chest", VarbitID.AMENITY_BANKCHEST_CHARRED_ISLAND);

        // Chinchompa Island
        addTask("Chinchompa Island cooking pot", VarbitID.AMENITY_COOKING_POT_CHINCHOMPA);

        // Crown Jewel
        addTask("Crown Jewel cooking pot", VarbitID.AMENITY_COOKING_POT_CROWN_JEWEL);

        // Deepfin
        addTask("Deepfin bank chest 1", VarbitID.AMENITY_BANKCHEST_DEEPFIN_1);
        addTask("Deepfin bank chest 2", VarbitID.AMENITY_BANKCHEST_DEEPFIN_2);

        // Laguna Aurorae
        addTask("Laguna Aurorae cooking pot", VarbitID.AMENITY_COOKING_POT_LAGUNA_AURORAE);
        addTask("Laguna Aurorae loom", VarbitID.AMENITY_LOOM_LAGUNA_AURORAE);
        addTask("Laguna Aurorae water pump", VarbitID.AMENITY_WATER_PUMP_LAGUNA_AURORAE);

        // Onyx Crest
        addTask("Onyx Crest bank chest", VarbitID.AMENITY_BANKCHEST_ONYX_CREST);
        addTask("Onyx Crest furnace", VarbitID.AMENITY_FURNACE_ONYX_CREST);
        addTask("Onyx Crest water pump", VarbitID.AMENITY_WATER_PUMP_ONYX_CREST);

        // Soul Tear
        addTask("Soul Tear rowboat", VarbitID.AMENITY_ROWBOAT_SOUL_TEAR);

        // Sunbleak
        addTask("Sunbleak bank chest", VarbitID.AMENITY_BANKCHEST_SUNBLEAK);
        addTask("Sunbleak cooking pot", VarbitID.AMENITY_COOKING_POT_SUNBLEAK);
        addTask("Sunbleak water pump", VarbitID.AMENITY_WATER_PUMP_SUNBLEAK);

        // Vatrachos
        addTask("Vatrachos pottery oven", VarbitID.AMENITY_POTTERY_OVEN_VATRACHOS);
        addTask("Vatrachos pottery wheel", VarbitID.AMENITY_POTTERY_WHEEL_VATRACHOS);
        addTask("Vatrachos rowboat", VarbitID.AMENITY_ROWBOAT_VATRACHOS);
        addTask("Vatrachos water pump", VarbitID.AMENITY_WATER_PUMP_VATRACHOS);

        // Ynysdail
        addTask("Ynysdail rowboat", VarbitID.AMENITY_ROWBOAT_YNYSDAIL);
    }
}
