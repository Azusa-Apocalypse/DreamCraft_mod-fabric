
package cn.com.dreamcraft.www.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BrainMobEffect extends MobEffect {
	public BrainMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711867);
	}

	@Override
	public String getDescriptionId() {
		return "effect.dreamcraft.brain";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
