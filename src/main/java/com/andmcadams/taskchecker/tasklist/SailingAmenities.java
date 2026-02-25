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
        addAmenity("Anglers' retreat cooking pot", VarbitID.AMENITY_COOKING_POT_ANGLERS);
        addAmenity("Anglers' retreat rowboat", VarbitID.AMENITY_ROWBOAT_ANGLERS);
        addAmenity("Anglers' retreat spinning wheel", VarbitID.AMENITY_SPINNING_WHEEL_ANGLERS);

        // Buccaneers
        addAmenity("Buccaneers anvil", VarbitID.AMENITY_ANVIL_BUCCANEERS);
        addAmenity("Buccaneers bank chest", VarbitID.AMENITY_BANKCHEST_BUCCANEERS);
        addAmenity("Buccaneers furnace", VarbitID.AMENITY_FURNACE_BUCCANEERS);
        addAmenity("Buccaneers rowboat", VarbitID.AMENITY_ROWBOAT_BUCCANEERS);

        // Charred Island
        addAmenity("Charred Island anvil", VarbitID.AMENITY_ANVIL_CHARRED_ISLAND);
        addAmenity("Charred Island bank chest", VarbitID.AMENITY_BANKCHEST_CHARRED_ISLAND);

        // Chinchompa Island
        addAmenity("Chinchompa Island cooking pot", VarbitID.AMENITY_COOKING_POT_CHINCHOMPA);

        // Crown Jewel
        addAmenity("Crown Jewel cooking pot", VarbitID.AMENITY_COOKING_POT_CROWN_JEWEL);

        // Deepfin
        addAmenity("Deepfin bank chest 1", VarbitID.AMENITY_BANKCHEST_DEEPFIN_1);
        addAmenity("Deepfin bank chest 2", VarbitID.AMENITY_BANKCHEST_DEEPFIN_2);

        // Laguna Aurorae
        addAmenity("Laguna Aurorae cooking pot", VarbitID.AMENITY_COOKING_POT_LAGUNA_AURORAE);
        addAmenity("Laguna Aurorae loom", VarbitID.AMENITY_LOOM_LAGUNA_AURORAE);
        addAmenity("Laguna Aurorae water pump", VarbitID.AMENITY_WATER_PUMP_LAGUNA_AURORAE);

        // Onyx Crest
        addAmenity("Onyx Crest bank chest", VarbitID.AMENITY_BANKCHEST_ONYX_CREST);
        addAmenity("Onyx Crest furnace", VarbitID.AMENITY_FURNACE_ONYX_CREST);
        addAmenity("Onyx Crest water pump", VarbitID.AMENITY_WATER_PUMP_ONYX_CREST);

        // Soul Tear
        addAmenity("Soul Tear rowboat", VarbitID.AMENITY_ROWBOAT_SOUL_TEAR);

        // Sunbleak
        addAmenity("Sunbleak bank chest", VarbitID.AMENITY_BANKCHEST_SUNBLEAK);
        addAmenity("Sunbleak cooking pot", VarbitID.AMENITY_COOKING_POT_SUNBLEAK);
        addAmenity("Sunbleak water pump", VarbitID.AMENITY_WATER_PUMP_SUNBLEAK);

        // Vatrachos
        addAmenity("Vatrachos pottery oven", VarbitID.AMENITY_POTTERY_OVEN_VATRACHOS);
        addAmenity("Vatrachos pottery wheel", VarbitID.AMENITY_POTTERY_WHEEL_VATRACHOS);
        addAmenity("Vatrachos rowboat", VarbitID.AMENITY_ROWBOAT_VATRACHOS);
        addAmenity("Vatrachos water pump", VarbitID.AMENITY_WATER_PUMP_VATRACHOS);

        // Ynysdail
        addAmenity("Ynysdail rowboat", VarbitID.AMENITY_ROWBOAT_YNYSDAIL);
    }

    private void addAmenity(String name, int varbit)
    {
        add(new Task.TaskBuilder()
                .name(name)
                .switchVar(true, varbit)
                .build());
    }
}
