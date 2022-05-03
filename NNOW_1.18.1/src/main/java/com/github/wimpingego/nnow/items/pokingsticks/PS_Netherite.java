package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;

public class PS_Netherite extends PS_Base_Info {

    static int use = Configs.NETHERITE_MAX_USES.get();

    public PS_Netherite(Properties builder) {
        super(builder.durability(use));
    }

}
