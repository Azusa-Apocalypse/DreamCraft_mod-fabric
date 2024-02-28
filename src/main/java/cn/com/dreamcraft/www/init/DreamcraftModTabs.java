
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cn.com.dreamcraft.www.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import cn.com.dreamcraft.www.DreamcraftMod;

public class DreamcraftModTabs {
	public static ResourceKey<CreativeModeTab> TAB_SPECIAL_ITEMS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DreamcraftMod.MODID, "special_items"));
	public static ResourceKey<CreativeModeTab> TAB_DREAM_CRAFT = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(DreamcraftMod.MODID, "dream_craft"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_SPECIAL_ITEMS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + DreamcraftMod.MODID + ".special_items")).icon(() -> new ItemStack(DreamcraftModItems.AZUSA_APOCALYPSE_ITEM)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_DREAM_CRAFT,
				FabricItemGroup.builder().title(Component.translatable("item_group." + DreamcraftMod.MODID + ".dream_craft")).icon(() -> new ItemStack(DreamcraftModItems.THE_DREAM_CRAFT)).build());
	}
}
