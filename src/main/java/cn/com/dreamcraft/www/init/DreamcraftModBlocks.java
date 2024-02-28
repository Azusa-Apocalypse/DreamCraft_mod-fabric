
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cn.com.dreamcraft.www.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import cn.com.dreamcraft.www.block.DreamUniverseBolckBlock;
import cn.com.dreamcraft.www.block.CreeperXuanBlockBlock;
import cn.com.dreamcraft.www.DreamcraftMod;

public class DreamcraftModBlocks {
	public static Block DREAM_UNIVERSE_BOLCK;
	public static Block CREEPER_XUAN_BLOCK;

	public static void load() {
		DREAM_UNIVERSE_BOLCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DreamcraftMod.MODID, "dream_universe_bolck"), new DreamUniverseBolckBlock());
		CREEPER_XUAN_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DreamcraftMod.MODID, "creeper_xuan_block"), new CreeperXuanBlockBlock());
	}

	public static void clientLoad() {
		DreamUniverseBolckBlock.clientInit();
		CreeperXuanBlockBlock.clientInit();
	}
}
