package cn.com.dreamcraft.www.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

import cn.com.dreamcraft.www.init.DreamcraftModItems;

public class GetSpecialItemProcedure {
	public GetSpecialItemProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			execute(handler.getPlayer());
		});
	}

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("entered", entity) == 1) {
			if (entity instanceof Player _player)
				_player.causeFoodExhaustion(0);
		} else {
			if ((entity.getDisplayName().getString()).equals("Creeper_Xuan")) {
				if ((entity.getStringUUID()).equals("335da4e5-ddf1-4139-a8fd-9ec2b45f8e4b")) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DreamcraftModItems.CREEPER_XUAN_ITEM);
						_setstack.setCount(1);
						_player.getInventory().add(_setstack);
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("entered");
						if (_so == null)
							_so = _sc.addObjective("entered", ObjectiveCriteria.DUMMY, Component.literal("entered"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
					}
				}
			}
		}
		if (new Object() {
			public int getScore(String score, Entity _ent) {
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective(score);
				if (_so != null)
					return _sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).getScore();
				return 0;
			}
		}.getScore("entered", entity) == 1) {
			if (entity instanceof Player _player)
				_player.causeFoodExhaustion(0);
		} else {
			if ((entity.getDisplayName().getString()).equals("Azusa_Apocalypse")) {
				if ((entity.getStringUUID()).equals("0bb8ecad-a153-43bc-a2d3-95058761eb33")) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DreamcraftModItems.AZUSA_APOCALYPSE_ITEM);
						_setstack.setCount(1);
						_player.getInventory().add(_setstack);
					}
					{
						Entity _ent = entity;
						Scoreboard _sc = _ent.level().getScoreboard();
						Objective _so = _sc.getObjective("entered");
						if (_so == null)
							_so = _sc.addObjective("entered", ObjectiveCriteria.DUMMY, Component.literal("entered"), ObjectiveCriteria.RenderType.INTEGER);
						_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore(1);
					}
				}
			}
		}
	}
}
