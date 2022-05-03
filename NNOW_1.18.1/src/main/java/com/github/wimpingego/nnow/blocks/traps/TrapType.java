package com.github.wimpingego.nnow.blocks.traps;

import com.github.wimpingego.nnow.setup.Configs;

/*
@author: Naxanria

@edits: Wimpingego
*/
public class TrapType {
    static int G_Attack = Configs.GOLDERN_ATTACK_POWER.get();
    static int D_Attack = Configs.DIAMOND_ATTACK_POWER.get();
    static int W_Attack = Configs.WITHER_ATTACK_POWER.get();

    public static final TrapType IRON = new TrapType("iron", 1f, false, false, false);
    public static final TrapType GOLDEN = new TrapType("golden", G_Attack, true, false, false);
    public static final TrapType DIAMOND = new TrapType("diamond", D_Attack, true, true, true);
    public static final TrapType WITHER = new TrapType("wither", W_Attack, true, true, true);

    public final String name;
    public final float damage;
    public final boolean lethal;
    public final boolean dropXP;
    public final boolean isPlayer;

    public TrapType(String name, float damage, boolean lethal, boolean dropXP, boolean isPlayer) {
        this.name = name;
        this.damage = damage;
        this.lethal = lethal;
        this.dropXP = dropXP;
        this.isPlayer = isPlayer;
    }
}

