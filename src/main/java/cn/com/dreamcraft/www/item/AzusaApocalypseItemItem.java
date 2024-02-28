
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

import cn.com.dreamcraft.www.procedures.XiedaihufuProcedure;
import cn.com.dreamcraft.www.init.DreamcraftModTabs;

public class AzusaApocalypseItemItem extends Item {
	public AzusaApocalypseItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
		ItemGroupEvents.modifyEntriesEvent(DreamcraftModTabs.TAB_SPECIAL_ITEMS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("mod\u4F5C\u8005Azusa_Apocalypse\u7684\u4E13\u5C5E\u7269\u54C1"));
		list.add(Component.literal("\u989C\u8272\u7EDA\u4E3D\u7684\u62A4\u8EAB\u7B26\uFF0C\u5E26\u5728\u8EAB\u4E0A\u6216\u8BB8\u4F1A\u6709\u4EC0\u4E48\u597D\u4E8B?"));
		list.add(Component.literal("\u62A4\u7B26\u6709\u7740\u767D\u7B71\u6893\u7684\u529B\u91CF\uFF0C\u975E\u5E38\u5F3A\u5927"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		XiedaihufuProcedure.execute(entity);
	}
}
