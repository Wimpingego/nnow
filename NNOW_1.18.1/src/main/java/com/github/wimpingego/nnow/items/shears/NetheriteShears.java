package com.github.wimpingego.nnow.items.shears;

import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.world.item.ShearsItem;

public class NetheriteShears extends ShearsItem {

    static int use = Configs.WOODEN_SHEARS_DURABILITY_MODIFIER.get();

    public NetheriteShears(Properties builder) {
        super(builder.durability(use));
    }
}
