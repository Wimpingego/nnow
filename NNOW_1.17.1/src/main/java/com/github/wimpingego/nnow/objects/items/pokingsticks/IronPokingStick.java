package com.github.wimpingego.nnow.objects.items.pokingsticks;

import com.github.wimpingego.nnow.util.config.ModConfigs;

import net.minecraft.world.item.Item.Properties;

public class IronPokingStick extends PokingStickBase{

	static int use = ModConfigs.IRON_MAX_USES.get();
	
	public IronPokingStick(Properties builder) {
		super(builder.durability(use));
	}

}
