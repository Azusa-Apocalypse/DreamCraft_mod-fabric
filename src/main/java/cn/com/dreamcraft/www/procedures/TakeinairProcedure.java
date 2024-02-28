package cn.com.dreamcraft.www.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import cn.com.dreamcraft.www.init.DreamcraftModMobEffects;

public class TakeinairProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(DreamcraftModMobEffects.BRAIN, 6000, 1));
	}
}
