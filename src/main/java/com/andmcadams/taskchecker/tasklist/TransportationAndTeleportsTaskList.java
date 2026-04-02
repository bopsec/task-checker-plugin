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

public class TransportationAndTeleportsTaskList extends TaskList
{

	public TransportationAndTeleportsTaskList()
	{
		super("Transportation and teleports");
		initTasks();
	}

	public void initTasks()
	{
		//Filled the travel log with all 53? fairy ring codes
		Task allFairyRingCodes = new Task.TaskBuilder()
			.name("Filled the travel log with all 53 fairy ring codes")
			// A:
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AIQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AIR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AJP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AJQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AJR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AJS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AKP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AKQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AKR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_AKS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_ALP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_ALQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_ALR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_ALS)
			// B:
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BIP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BIQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BIS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BJP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BJR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BJS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BKP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BKQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BKR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BKS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BLP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BLQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BLR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_BLS)
			// C:
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CIP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CIQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CIR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CIS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CJQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CJR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CKP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CKQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CKR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CKS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CLP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CLR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_CLS)
			// D:
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DIP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DIQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DIR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DIS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DJP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DJR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DKP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DKR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DKS)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DLP)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DLQ)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DLR)
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_DLS)
			// Hideout:
			.switchVar(true, VarbitID.FAIRYRINGS_LOG_HIDEOUT)
			.build();
		this.add(allFairyRingCodes);
		//Unlocked all 6 balloon transport system routes
		Task unlockedAllBallooonTransports = new Task.TaskBuilder()
			.name("Unlocked all 6 balloon transport system routes")
			.switchVar(true, VarbitID.ZEP_MULTI_VARR)
			.switchVar(true, VarbitID.ZEP_MULTI_CAST)
			.switchVar(true, VarbitID.ZEP_MULTI_CRAFT)
			.switchVar(true, VarbitID.ZEP_MULTI_GNO)
			.eqVar(true, VarbitID.ZEP_MULTI_BASKET, 2)
			.eqVar(true, VarbitID.ZEP_MULTI_PICCARD, 2)
			.build();
		this.add(unlockedAllBallooonTransports);
		//Unlocked the pharaoh's sceptre's Jaltevas teleport option
		addTask("Unlocked the pharaoh's sceptre's Jaltevas teleport option", VarbitID.PHARAOHS_SCEPTRE_NECROPOLIS);
		//Unlocked the ability to use Xeric's talisman's fifth teleport TODO: Unfound
		//Unlocked the ring of shadows' full potential
		Task unlockedRingOfShadowTeleports = new Task.TaskBuilder()
			.name("Unlocked the ring of shadows' full potential")
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORT)
			.switchVar(true, VarbitID.DT2_STRANGLEWOOD_TELEPORT)
			.switchVar(true, VarbitID.DT2_GHORROCK_TELEPORT)
			.switchVar(true, VarbitID.DT2_SCAR_TELEPORT)
			.build();
		this.add(unlockedRingOfShadowTeleports);
		//Unlocked all 7 teleporters in the Lassar Undercity
		Task lassarTeleporters = new Task.TaskBuilder()
			.name("Unlocked all 7 teleporters in the Lassar Undercity")
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_CATHEDRAL)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_PALACE)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_PLAZA)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_RESIDENTIAL_EAST)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_RESIDENTIAL_WEST)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_SCIENCE_NORTH)
			.switchVar(true, VarbitID.DT2_LASSAR_TELEPORTER_SCIENCE_SOUTH)
			.build();
		this.add(lassarTeleporters);
		//
		//Unlocked the ability to use Drakan's medallion's third teleport
		addTask("Unlocked the ability to use Drakan's medallion's third teleport", VarbitID.SLEPE_TELEPORT_UNLOCKED);
		// Unlocked all 6 pendant of ates teleport locations
		Task unlockPendantOfAtes = new Task.TaskBuilder()
			.name("Unlocked all 6 pendant of ates teleport locations") // confirmed
			.switchVar(true, VarbitID.PENDANT_OF_ATES_ALDARIN_FOUND)
			.switchVar(true, VarbitID.PENDANT_OF_ATES_AUBURN_FOUND)
			.switchVar(true, VarbitID.PENDANT_OF_ATES_DARKFROST_FOUND)
			.switchVar(true, VarbitID.PENDANT_OF_ATES_RALOS_FOUND)
			.switchVar(true, VarbitID.PENDANT_OF_ATES_TWILIGHT_FOUND)
			.switchVar(true, VarbitID.PENDANT_OF_ATES_TLATI_FOUND)
			.build();
		this.add(unlockPendantOfAtes);
		// Unlocked both additional sailors' amulet teleport locations
		Task sailorsAmuletAllTelesUnlocked = new Task.TaskBuilder()
			.name("Unlocked both additional sailors' amulet teleport locations")
			.switchVar(true, VarbitID.SAILORS_AMULET_DEEPFIN)
			.switchVar(true, VarbitID.SAILORS_AMULET_ROBERTS)
			//.switchVar(true, VarbitID.SAILORS_AMULET_REDROCK) ?
			//.switchVar(true, VarbitID.SAILORS_AMULET_BARRACUDA) ?
			.build();
		this.add(sailorsAmuletAllTelesUnlocked);
		// Unlocked a last destination option on spirit trees
		addGeTask(true, "Unlocked a last destination option on Spirit Trees", VarbitID.SPIRIT_TREE_PREVIOUS, 1);
	}
}

