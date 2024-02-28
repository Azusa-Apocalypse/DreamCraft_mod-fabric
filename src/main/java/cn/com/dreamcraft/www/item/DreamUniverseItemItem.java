
package cn.com.dreamcraft.www.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

import cn.com.dreamcraft.www.procedures.DreamUniverseStarProcedure;
import cn.com.dreamcraft.www.init.DreamcraftModTabs;

public class DreamUniverseItemItem extends Item {
	public DreamUniverseItemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		ItemGroupEvents.modifyEntriesEvent(DreamcraftModTabs.TAB_SPECIAL_ITEMS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u661F\u68A6\u5DE5\u827A\u521B\u59CB\u4EBA\uFF0Cmod\u4EE3\u7801\u65B9\u9762\u652F\u63F4\u8005\uFF0CDreamUniverse\u7684\u4E13\u5C5E\u7269\u54C1\u3002"));
		list.add(Component.literal("\u4E07\u4F17\u7684\u7406\u60F3\u5728\u6B64\u4EA4\u6C47\u4E3A\u552F\u4E00\u7684\u5B8F\u613F\u2014\u2014"));
		list.add(Component.literal("\u6B64\u5373\uFF0C\u65E0\u4E0A\u7684\u300C\u59CB\u6E90\u300D\u4E4B\u661F\uFF01"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DreamUniverseStarProcedure.execute(entity);
	}
}
