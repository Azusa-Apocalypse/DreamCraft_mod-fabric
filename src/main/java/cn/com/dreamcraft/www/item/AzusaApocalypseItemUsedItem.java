
package cn.com.dreamcraft.www.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class AzusaApocalypseItemUsedItem extends Item {
	public AzusaApocalypseItemUsedItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("mod\u4F5C\u8005Azusa_Apocalypse\u7684\u4E13\u5C5E\u7269\u54C1"));
		list.add(Component.literal("\u62A4\u7B26\u5185\u7684\u62A4\u4F51\u80FD\u91CF\u5DF2\u7ECF\u6D88\u5931..."));
		list.add(Component.literal("\u6216\u8BB8\u9700\u8981\u4F7F\u7528\u4EC0\u4E48\u65B9\u6CD5\u6765\u8BA9\u5B83\u6062\u590D\u80FD\u91CF?"));
	}
}
