package com.github.wimpingego.nnow.bushes.base;

import com.github.wimpingego.nnow.setup.Configs;

public class BushType {
    static int Tier1 = Configs.TIER1_DROPS.get();
    static int Tier2 = Configs.TIER2_DROPS.get();
    static int Tier3 = Configs.TIER3_DROPS.get();
    static int Tier4 = Configs.TIER4_DROPS.get();
    static int Tier5 = Configs.TIER5_DROPS.get();
    static int TierE = Configs.TIERE_DROPS.get();

    static int TierXP = Configs.XP_POINTS.get();

    public static final BushType T1 = new BushType(Tier1);
    public static final BushType T2 = new BushType(Tier2);
    public static final BushType T3 = new BushType(Tier3);
    public static final BushType T4 = new BushType(Tier4);
    public static final BushType T5 = new BushType(Tier5);
    public static final BushType TE = new BushType(TierE);
    public static final BushType XP = new BushType(TierXP);

    public final float nuggets;

    public BushType(float Tier) {
        this.nuggets = Tier;
    }
}

