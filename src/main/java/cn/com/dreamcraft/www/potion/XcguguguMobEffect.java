
package cn.com.dreamcraft.www.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import cn.com.dreamcraft.www.procedures.Gugugu_1Procedure;

public class XcguguguMobEffect extends MobEffect {
	public XcguguguMobEffect() {
		super(MobEffectCategory.HARMFUL, -62105);
	}

	@Override
	public String getDescriptionId() {
		return "effect.dreamcraft.xcgugugu";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Gugugu_1Procedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
