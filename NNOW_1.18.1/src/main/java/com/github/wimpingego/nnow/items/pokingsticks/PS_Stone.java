package com.github.wimpingego.nnow.items.pokingsticks;


import com.github.wimpingego.nnow.setup.Configs;

public class PS_Stone extends PS_Base_Info {

    static int use = Configs.STONE_MAX_USES.get();

    public PS_Stone(Properties builder) {
        super(builder.durability(use));
    }

}

