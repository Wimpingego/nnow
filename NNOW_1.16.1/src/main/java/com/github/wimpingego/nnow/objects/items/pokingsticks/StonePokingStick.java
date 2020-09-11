package com.github.wimpingego.nnow.objects.items.pokingsticks;

import com.github.wimpingego.nnow.util.ModConfigs;

public class StonePokingStick extends PokingStickBase{

	static int use = ModConfigs.STONE_MAX_USES.get();
	
	public StonePokingStick(Properties builder) {
		super(builder.maxDamage(use));
	}

}
