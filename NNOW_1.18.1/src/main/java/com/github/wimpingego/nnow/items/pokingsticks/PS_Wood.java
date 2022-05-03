package com.github.wimpingego.nnow.items.pokingsticks;

import com.github.wimpingego.nnow.setup.Configs;

public class PS_Wood extends PS_Base_Info {

    static int use = Configs.BASE_MAX_USES.get();

    public PS_Wood(Properties builder) {
        super(builder.durability(use));
    }

}

