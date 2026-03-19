package com.andmcadams.taskchecker.tasklist;

import com.andmcadams.taskchecker.Task;
import net.runelite.api.gameval.VarbitID;

public class SailingAmenities extends TaskList
{

	public SailingAmenities()
	{
		super("Sailing");
		initTasks();
	}

	public void initTasks()
	{
		// Claimed XP from charting all oceans
		addTask("Claimed XP from charting all oceans", VarbitID.SAILING_CHARTING_FULL_COMPLETION_EVER_COMPLETE); //?
		// Unlocked the ability to reclaim the medallion of the deep
		addTask("Unlocked the ability to reclaim the medallion of the deep", VarbitID.MOTD_CRAFTED);
		// Unlocked all lost sailing schematics
		Task allSchematics = new Task.TaskBuilder()
			.name("Unlocked all lost sailing schematics")
			.switchVar(true, VarbitID.LOST_SCHEMATIC_SALVAGING_STATION)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_GALE_CATCHER)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_ETERNAL_BRAZIER)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_ROSEWOOD_CARGO_HOLD)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_ROSEWOOD_HULL)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_ROSEWOOD_SAIL)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_DRAGON_TILLER)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_DRAGON_KEEL)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_DRAGON_SALVAGING_HOOK)
			.switchVar(true, VarbitID.LOST_SCHEMATIC_DRAGON_CANNON)
			//.switchVar(true, VarbitID.LOST_SCHEMATIC_BALLISTIC_ATTRACTOR)
			.build();
		this.add(allSchematics);
		// Unlocked the ability to assign all 10 crewmates
		Task gotAllSailingCrewmates = new Task.TaskBuilder()
			.name("Unlocked the ability to assign all 10 crewmates")
			.switchVar(true, VarbitID.SAILING_CREW_GENERIC_1_UNLOCKED) // Jobless Jim
			.switchVar(true, VarbitID.SAILING_CREW_CAPTAIN_SIAD_UNLOCKED) // Captain Siad
			.switchVar(true, VarbitID.SAILING_CREW_GENERIC_2_UNLOCKED) // Adventurer Ada
			.switchVar(true, VarbitID.SAILING_CREW_GHOST_JENKINS_UNLOCKED) // Cabin Boy Jenkins
			.switchVar(true, VarbitID.SAILING_CREW_WEREWOLF_UNLOCKED) // Oarswoman Olga
			.switchVar(true, VarbitID.SAILING_CREW_GENERIC_3_UNLOCKED) // Jittery Jim
			.switchVar(true, VarbitID.SAILING_CREW_FREMENNIK_UNLOCKED) // Bosun Zarah
			.switchVar(true, VarbitID.SAILING_CREW_GENERIC_4_UNLOCKED) // Jolly Jim
			.switchVar(true, VarbitID.SAILING_CREW_SPIRIT_ANGLER_UNLOCKED) // Spotter Virginia
			.switchVar(true, VarbitID.SAILING_CREW_GENERIC_5_UNLOCKED) // Sailor Jakob
			.build();
		this.add(gotAllSailingCrewmates);
		// Unlocked the ability to reclaim Ralph's fabric roll
		addTask("Unlocked the ability to reclaim Ralph's fabric roll", VarbitID.SAILING_BT_TEMPOR_TANTRUM_MARLIN_FIRST);
		// Unlocked the ability to reclaim Gurtob's fabric roll
		addTask("Unlocked the ability to reclaim Gurtob's fabric roll", VarbitID.SAILING_BT_JUBBLY_JIVE_MARLIN_FIRST);
		// Unlocked the ability to reclaim Gwyna's fabric roll
		addTask("Unlocked the ability to reclaim Gwyna's fabric roll", VarbitID.SAILING_BT_GWENITH_GLIDE_MARLIN_FIRST);
		// Claimed XP from drinking the melted rocks
		addTask("Claimed XP from drinking the melted rocks", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_ICE); // confirmed
		// Claimed XP from drinking Chuck up's 'stew'
		addTask("Claimed XP from drinking Chuck up's 'stew'", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_STEW); // confirmed
		// Claimed XP from drinking Daddy's special water's special water
		addTask("Claimed XP from drinking Daddy's special water's special water", VarbitID.SAILING_CHARTING_DRINK_CRATE_FISHIER_STOUT_WATER); // confirmed
		// Claimed all 5 mystery boxes from the puzzlers poteen
		addTask("Claimed all 5 mystery boxes from the puzzlers poteen", VarbitID.SAILING_CHARTING_DRINK_CRATE_PUZZLERS_POTEEN_REWARD);
		// Anglers
		addTask("Built anglers' retreat cooking pot", VarbitID.AMENITY_COOKING_POT_ANGLERS);
		addTask("Built anglers' retreat rowboat", VarbitID.AMENITY_ROWBOAT_ANGLERS);
		addTask("Built anglers' retreat spinning wheel", VarbitID.AMENITY_SPINNING_WHEEL_ANGLERS);

		// Buccaneers
		addTask("Built buccaneers anvil", VarbitID.AMENITY_ANVIL_BUCCANEERS);
		addTask("Built buccaneers bank chest", VarbitID.AMENITY_BANKCHEST_BUCCANEERS);
		addTask("Built buccaneers furnace", VarbitID.AMENITY_FURNACE_BUCCANEERS);
		addTask("Built buccaneers rowboat", VarbitID.AMENITY_ROWBOAT_BUCCANEERS);

		// Charred Island
		addTask("Built charred Island anvil", VarbitID.AMENITY_ANVIL_CHARRED_ISLAND);
		addTask("Built charred Island bank chest", VarbitID.AMENITY_BANKCHEST_CHARRED_ISLAND);

		// Chinchompa Island
		addTask("Built chinchompa Island cooking pot", VarbitID.AMENITY_COOKING_POT_CHINCHOMPA);

		// Crown Jewel
		addTask("Built crown Jewel cooking pot", VarbitID.AMENITY_COOKING_POT_CROWN_JEWEL);

		// Deepfin
		addTask("Built deepfin bank chest 1", VarbitID.AMENITY_BANKCHEST_DEEPFIN_1);
		addTask("Built deepfin bank chest 2", VarbitID.AMENITY_BANKCHEST_DEEPFIN_2);

		// Laguna Aurorae
		addTask("Built laguna Aurorae cooking pot", VarbitID.AMENITY_COOKING_POT_LAGUNA_AURORAE);
		addTask("Built laguna Aurorae loom", VarbitID.AMENITY_LOOM_LAGUNA_AURORAE);
		addTask("Built laguna Aurorae water pump", VarbitID.AMENITY_WATER_PUMP_LAGUNA_AURORAE);

		// Onyx Crest
		addTask("Built onyx Crest bank chest", VarbitID.AMENITY_BANKCHEST_ONYX_CREST);
		addTask("Built onyx Crest furnace", VarbitID.AMENITY_FURNACE_ONYX_CREST);
		addTask("Built onyx Crest water pump", VarbitID.AMENITY_WATER_PUMP_ONYX_CREST);

		// Soul Tear
		addTask("Built soul Tear rowboat", VarbitID.AMENITY_ROWBOAT_SOUL_TEAR);

		// Sunbleak
		addTask("Built sunbleak bank chest", VarbitID.AMENITY_BANKCHEST_SUNBLEAK);
		addTask("Built sunbleak cooking pot", VarbitID.AMENITY_COOKING_POT_SUNBLEAK);
		addTask("Built sunbleak water pump", VarbitID.AMENITY_WATER_PUMP_SUNBLEAK);

		// Vatrachos
		addTask("Built vatrachos pottery oven", VarbitID.AMENITY_POTTERY_OVEN_VATRACHOS);
		addTask("Built vatrachos pottery wheel", VarbitID.AMENITY_POTTERY_WHEEL_VATRACHOS);
		addTask("Built vatrachos rowboat", VarbitID.AMENITY_ROWBOAT_VATRACHOS);
		addTask("Built vatrachos water pump", VarbitID.AMENITY_WATER_PUMP_VATRACHOS);

		// Ynysdail
		addTask("Built ynysdail rowboat", VarbitID.AMENITY_ROWBOAT_YNYSDAIL);
	}
}
