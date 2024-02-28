package cn.com.dreamcraft.www.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import cn.com.dreamcraft.www.init.DreamcraftModItems;

public class XiedaihufuProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 5) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 4));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(DreamcraftModItems.AZUSA_APOCALYPSE_ITEM);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DreamcraftModItems.AZUSA_APOCALYPSE_ITEM_USED);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
