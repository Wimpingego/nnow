package com.github.wimpingego.nnow.items.shears;

import com.github.wimpingego.nnow.setup.Configs;
import net.minecraft.world.item.ShearsItem;

public class WoodenShears extends ShearsItem {

    static int use = Configs.WOODEN_SHEARS_DURABILITY_MODIFIER.get();

    public WoodenShears(Properties builder) {
        super(builder.durability(use));
    }
}
