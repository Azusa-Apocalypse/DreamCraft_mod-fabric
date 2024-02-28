
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package cn.com.dreamcraft.www.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import cn.com.dreamcraft.www.potion.XcguguguMobEffect;
import cn.com.dreamcraft.www.potion.ShenHuBiYouMobEffect;
import cn.com.dreamcraft.www.potion.BrainMobEffect;
import cn.com.dreamcraft.www.potion.BaiBingChanShenMobEffect;
import cn.com.dreamcraft.www.DreamcraftMod;

public class DreamcraftModMobEffects {
	public static MobEffect BRAIN;
	public static MobEffect XCGUGUGU;
	public static MobEffect SHEN_HU_BI_YOU;
	public static MobEffect BAI_BING_CHAN_SHEN;

	public static void load() {
		BRAIN = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(DreamcraftMod.MODID, "brain"), new BrainMobEffect());
		XCGUGUGU = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(DreamcraftMod.MODID, "xcgugugu"), new XcguguguMobEffect());
		SHEN_HU_BI_YOU = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(DreamcraftMod.MODID, "shen_hu_bi_you"), new ShenHuBiYouMobEffect());
		BAI_BING_CHAN_SHEN = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(DreamcraftMod.MODID, "bai_bing_chan_shen"), new BaiBingChanShenMobEffect());
	}
}
