package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;

public class PS_Gold extends PS_Base_Info {

    static int use = Configs.GOLD_MAX_USES.get();

    public PS_Gold(Properties builder) {
        super(builder.durability(use));
    }
}
