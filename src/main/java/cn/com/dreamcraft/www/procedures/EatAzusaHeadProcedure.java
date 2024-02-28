package cn.com.dreamcraft.www.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import cn.com.dreamcraft.www.init.DreamcraftModMobEffects;

public class EatAzusaHeadProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(DreamcraftModMobEffects.BAI_BING_CHAN_SHEN, 60, 10));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(DreamcraftModMobEffects.SHEN_HU_BI_YOU, 60, 10));
		}
	}
}
