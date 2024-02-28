/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cn.com.dreamcraft.www.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import cn.com.dreamcraft.www.item.XCHeadItem;
import cn.com.dreamcraft.www.item.TheDreamCraftItem;
import cn.com.dreamcraft.www.item.DreamUniverseItemItem;
import cn.com.dreamcraft.www.item.DreamUniverseHeadItem;
import cn.com.dreamcraft.www.item.DreamUniverseHeadCopyTemplateItem;
import cn.com.dreamcraft.www.item.DeBugSwordItem;
import cn.com.dreamcraft.www.item.CreeperXuanItemItem;
import cn.com.dreamcraft.www.item.AzusaHeadItem;
import cn.com.dreamcraft.www.item.AzusaApocalypseItemUsedItem;
import cn.com.dreamcraft.www.item.AzusaApocalypseItemItem;
import cn.com.dreamcraft.www.item.ABottleOfAirItem;
import cn.com.dreamcraft.www.DreamcraftMod;

public class DreamcraftModItems {
	public static Item THE_DREAM_CRAFT;
	public static Item DREAM_UNIVERSE_HEAD;
	public static Item DREAM_UNIVERSE_HEAD_COPY_TEMPLATE;
	public static Item XC_HEAD;
	public static Item DREAM_UNIVERSE_BOLCK;
	public static Item A_BOTTLE_OF_AIR;
	public static Item AZUSA_HEAD;
	public static Item CREEPER_XUAN_BLOCK;
	public static Item CREEPER_XUAN_ITEM;
	public static Item DEBUG_SWORD;
	public static Item AZUSA_APOCALYPSE_ITEM;
	public static Item DREAM_UNIVERSE_ITEM;
	public static Item AZUSA_APOCALYPSE_ITEM_USED;

	public static void load() {
		THE_DREAM_CRAFT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "the_dream_craft"), new TheDreamCraftItem());
		DREAM_UNIVERSE_HEAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "dream_universe_head"), new DreamUniverseHeadItem());
		DREAM_UNIVERSE_HEAD_COPY_TEMPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "dream_universe_head_copy_template"), new DreamUniverseHeadCopyTemplateItem());
		XC_HEAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "xc_head"), new XCHeadItem());
		DREAM_UNIVERSE_BOLCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "dream_universe_bolck"), new BlockItem(DreamcraftModBlocks.DREAM_UNIVERSE_BOLCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DreamcraftModTabs.TAB_DREAM_CRAFT).register(content -> content.accept(DREAM_UNIVERSE_BOLCK));
		A_BOTTLE_OF_AIR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "a_bottle_of_air"), new ABottleOfAirItem());
		AZUSA_HEAD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "azusa_head"), new AzusaHeadItem());
		CREEPER_XUAN_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "creeper_xuan_block"), new BlockItem(DreamcraftModBlocks.CREEPER_XUAN_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(DreamcraftModTabs.TAB_DREAM_CRAFT).register(content -> content.accept(CREEPER_XUAN_BLOCK));
		CREEPER_XUAN_ITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "creeper_xuan_item"), new CreeperXuanItemItem());
		DEBUG_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "debug_sword"), new DeBugSwordItem());
		AZUSA_APOCALYPSE_ITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "azusa_apocalypse_item"), new AzusaApocalypseItemItem());
		DREAM_UNIVERSE_ITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "dream_universe_item"), new DreamUniverseItemItem());
		AZUSA_APOCALYPSE_ITEM_USED = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DreamcraftMod.MODID, "azusa_apocalypse_item_used"), new AzusaApocalypseItemUsedItem());
	}

	public static void clientLoad() {
	}
}
