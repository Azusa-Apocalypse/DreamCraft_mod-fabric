/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package cn.com.dreamcraft.www;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import cn.com.dreamcraft.www.init.DreamcraftModTrades;
import cn.com.dreamcraft.www.init.DreamcraftModTabs;
import cn.com.dreamcraft.www.init.DreamcraftModProcedures;
import cn.com.dreamcraft.www.init.DreamcraftModMobEffects;
import cn.com.dreamcraft.www.init.DreamcraftModItems;
import cn.com.dreamcraft.www.init.DreamcraftModBlocks;

public class DreamcraftMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "dreamcraft";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing DreamcraftMod");

		DreamcraftModTabs.load();

		DreamcraftModMobEffects.load();

		DreamcraftModBlocks.load();
		DreamcraftModItems.load();

		DreamcraftModProcedures.load();

		DreamcraftModTrades.registerTrades();

	}
}
