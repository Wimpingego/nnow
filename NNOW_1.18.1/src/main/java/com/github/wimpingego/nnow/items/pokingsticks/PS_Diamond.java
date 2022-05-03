package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;

public class PS_Diamond extends PS_Base_Info {

    static int use = Configs.DIAMOND_MAX_USES.get();

    public PS_Diamond(Properties builder) {
        super(builder.durability(use));
    }
}
