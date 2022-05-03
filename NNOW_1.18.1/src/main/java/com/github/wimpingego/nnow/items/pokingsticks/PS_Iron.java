package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;

public class PS_Iron extends PS_Base_Info {

    static int use = Configs.IRON_MAX_USES.get();

    public PS_Iron(Properties builder) {
        super(builder.durability(use));
    }

}

