package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NNOWItemTags extends ItemTagsProvider {

    public NNOWItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, NNOW.MODID, helper);
    }

    @Override
    protected void addTags() {
    //Other Tags
        tag(Tags.Items.GRAVEL)
                .add(Registration.AGG_BLOCK_ITEM.get());

        tag(ItemTags.SAND) //Mojang
                .add(Registration.AGS_BLOCK_ITEM.get())
                .add(Registration.AGRS_BLOCK_ITEM.get());

        tag(Tags.Items.SAND) //Forge
                .add(Registration.AGS_BLOCK_ITEM.get())
                .add(Registration.AGRS_BLOCK_ITEM.get());

        tag(Tags.Items.SAND_COLORLESS)
                .add(Registration.AGS_BLOCK_ITEM.get());

        tag(Tags.Items.SAND_RED)
                .add(Registration.AGRS_BLOCK_ITEM.get());

        tag(Tags.Items.GLASS)
                .add(Registration.DARK_GLASS_ITEM.get())
                .add(Items.GLASS);

        tag(Tags.Items.GLASS_BLACK)
                .add(Registration.DARK_GLASS_ITEM.get());

        tag(Registration.WITHER_IMMUNE_ITEM)
                .add(Registration.DARK_GLASS_ITEM.get())
                .add(Registration.SUPER_OBSIDIAN_ITEM.get())
                .add(Registration.SUPER_OBSIDIAN_BARS_ITEM.get());

        tag(Registration.TAGS_SUPER_OBSIDIAN_ITEM)
                .add(Registration.SUPER_OBSIDIAN_ITEM.get())
                .add(Registration.SUPER_OBSIDIAN_BARS_ITEM.get());

    //Pickaxes
        tag(Registration.TAG_WOODEN_PICKAXE)
                .add(Items.WOODEN_PICKAXE);

        tag(Registration.TAG_STONE_PICKAXE)
                .add(Items.STONE_PICKAXE);

        tag(Registration.TAG_IRON_PICKAXE)
                .add(Items.IRON_PICKAXE);

        tag(Registration.TAG_GOLDEN_PICKAXE)
                .add(Items.GOLDEN_PICKAXE);

        tag(Registration.TAG_DIAMOND_PICKAXE)
                .add(Items.DIAMOND_PICKAXE);

        tag(Registration.TAG_NETHERITE_PICKAXE)
                .add(Items.NETHERITE_PICKAXE);

    //Poking Sticks
        tag(Registration.TAG_POKING_STICK)
                .add(Registration.POKING_STICK.get())
                .add(Registration.STONE_POKING_STICK.get())
                .add(Registration.IRON_POKING_STICK.get())
                .add(Registration.GOLD_POKING_STICK.get())
                .add(Registration.DIAMOND_POKING_STICK.get())
                .add(Registration.NETHERITE_POKING_STICK.get())
        ;

    //Hammers
        tag(Registration.TAG_STONE_HAMMER)
        ;

        tag(Registration.TAG_IRON_HAMMER)
        ;

        tag(Registration.TAG_GOLDEN_HAMMER)
        ;

        tag(Registration.TAG_DIAMOND_HAMMER)
        ;

        tag(Registration.TAG_EMERALD_HAMMER)
        ;

        tag(Registration.TAG_NETHERITE_HAMMER)
        ;
    //Shears
        tag(Tags.Items.SHEARS)
                .add(Registration.WOODEN_SHEAR.get())
                .add(Registration.GOLDEN_SHEAR.get())
                .add(Registration.DIAMOND_SHEAR.get())
                .add(Registration.NETHERITE_SHEAR.get());

    //Dusts
        tag(Registration.TAGS_STONE_DUST)
                .add(Registration.STONE_DUST.get());

        tag(Registration.TAGS_SAND_DUST)
                .add(Registration.SAND_DUST.get());

        tag(Registration.TAGS_DIRT_DUST)
                .add(Registration.DIRT_DUST.get());

        tag(Registration.TAGS_GRAVEL_DUST)
                .add(Registration.GRAVEL_DUST.get());

        tag(Registration.TAGS_CLAY_DUST)
                .add(Registration.CLAY_DUST.get());
    //Nuggers
        tag(Tags.Items.NUGGETS)
                .add(Registration.COAL_NUGGET.get())
                .add(Registration.COPPER_NUGGET.get())
                .add(Registration.REDSTONE_NUGGET.get())
                .add(Registration.GLOWSTONE_NUGGET.get())
                .add(Registration.QUARTZ_NUGGET.get())
                .add(Registration.DIAMOND_NUGGET.get())
                .add(Registration.EMERALD_NUGGET.get())
                .add(Registration.LAPIS_NUGGET.get())
                .add(Registration.NETHERITE_NUGGET.get())
                .add(Registration.ICE_NUGGET.get())
                .add(Registration.FIRE_NUGGET.get())
                .add(Registration.WOODEN_NUGGET.get());

        tag(Registration.TAGS_ALUMINUM_NUGGET)
                .add(Registration.ALUMINUM_NUGGET.get());

        tag(Registration.TAGS_BISMUTH_NUGGET)
                .add(Registration.BISMUTH_NUGGET.get());

        tag(Registration.TAGS_COAL_NUGGET)
                .add(Registration.COAL_NUGGET.get());

        tag(Registration.TAGS_COPPER_NUGGET)
                .add(Registration.COPPER_NUGGET.get());

        tag(Registration.TAGS_DIAMOND_NUGGET)
                .add(Registration.DIAMOND_NUGGET.get());

        tag(Registration.TAGS_EMERALD_NUGGET)
                .add(Registration.EMERALD_NUGGET.get());

        tag(Registration.TAGS_FIRE_NUGGET)
                .add(Registration.FIRE_NUGGET.get());

        tag(Registration.TAGS_GLOWSTONE_NUGGET)
                .add(Registration.GLOWSTONE_NUGGET.get());

        tag(Registration.TAGS_ICE_NUGGET)
                .add(Registration.ICE_NUGGET.get());

        tag(Registration.TAGS_IRIDIUM_NUGGET)
                .add(Registration.IRIDIUM_NUGGET.get());

        tag(Registration.TAGS_LAPIS_NUGGET)
                .add(Registration.LAPIS_NUGGET.get());

        tag(Registration.TAGS_LEAD_NUGGET)
                .add(Registration.LEAD_NUGGET.get());

        tag(Registration.TAGS_NETHERITE_NUGGET)
                .add(Registration.NETHERITE_NUGGET.get());

        tag(Registration.TAGS_NICKEL_NUGGET)
                .add(Registration.NICKEL_NUGGET.get());

        tag(Registration.TAGS_OSMIUM_NUGGET)
                .add(Registration.OSMIUM_NUGGET.get());

        tag(Registration.TAGS_PLATINUM_NUGGET)
                .add(Registration.PLATINUM_NUGGET.get());

        tag(Registration.TAGS_QUARTZ_NUGGET)
                .add(Registration.QUARTZ_NUGGET.get());

        tag(Registration.TAGS_REDSTONE_NUGGET)
                .add(Registration.REDSTONE_NUGGET.get());

        tag(Registration.TAGS_SILVER_NUGGET)
                .add(Registration.SILVER_NUGGET.get());

        tag(Registration.TAGS_TIN_NUGGET)
                .add(Registration.TIN_NUGGET.get());

        tag(Registration.TAGS_URANIUM_NUGGET)
                .add(Registration.URANIUM_NUGGET.get());

        tag(Registration.TAGS_WOODEN_NUGGET)
                .add(Registration.WOODEN_NUGGET.get());

        tag(Registration.TAGS_ZINC_NUGGET)
                .add(Registration.ZINC_NUGGET.get());

    //Ingots
        tag(Tags.Items.INGOTS)
                .add(Registration.ALUMINUM_INGOT.get())
                .add(Registration.BISMUTH_INGOT.get())
                .add(Registration.IRIDIUM_INGOT.get())
                .add(Registration.LEAD_INGOT.get())
                .add(Registration.NICKEL_INGOT.get())
                .add(Registration.OSMIUM_INGOT.get())
                .add(Registration.PLATINUM_INGOT.get())
                .add(Registration.SILVER_INGOT.get())
                .add(Registration.TIN_INGOT.get())
                .add(Registration.URANIUM_INGOT.get())
                .add(Registration.ZINC_INGOT.get());

        tag(Registration.TAGS_ALUMINUM_INGOT)
                .add(Registration.ALUMINUM_INGOT.get());

        tag(Registration.TAGS_BISMUTH_INGOT)
                .add(Registration.BISMUTH_INGOT.get());

        tag(Registration.TAGS_IRIDIUM_INGOT)
                .add(Registration.IRIDIUM_INGOT.get());

        tag(Registration.TAGS_LEAD_INGOT)
                .add(Registration.LEAD_INGOT.get());

        tag(Registration.TAGS_NICKEL_INGOT)
                .add(Registration.NICKEL_INGOT.get());

        tag(Registration.TAGS_OSMIUM_INGOT)
                .add(Registration.OSMIUM_INGOT.get());

        tag(Registration.TAGS_PLATINUM_INGOT)
                .add(Registration.PLATINUM_INGOT.get());

        tag(Registration.TAGS_SILVER_INGOT)
                .add(Registration.SILVER_INGOT.get());

        tag(Registration.TAGS_TIN_INGOT)
                .add(Registration.TIN_INGOT.get());

        tag(Registration.TAGS_URANIUM_INGOT)
                .add(Registration.URANIUM_INGOT.get());

        tag(Registration.TAGS_ZINC_INGOT)
                .add(Registration.ZINC_INGOT.get());

        //Storage Blocks
        tag(Tags.Items.STORAGE_BLOCKS)
                .add(Registration.ALUMINUM_BLOCK_ITEM.get())
                .add(Registration.BISMUTH_BLOCK_ITEM.get())
                .add(Registration.IRIDIUM_BLOCK_ITEM.get())
                .add(Registration.LEAD_BLOCK_ITEM.get())
                .add(Registration.NICKEL_BLOCK_ITEM.get())
                .add(Registration.OSMIUM_BLOCK_ITEM.get())
                .add(Registration.PLATINUM_BLOCK_ITEM.get())
                .add(Registration.SILVER_BLOCK_ITEM.get())
                .add(Registration.TIN_BLOCK_ITEM.get())
                .add(Registration.URANIUM_BLOCK_ITEM.get())
                .add(Registration.ZINC_BLOCK_ITEM.get());

        tag(Registration.TAGS_ALUMINUM_BLOCK_ITEM)
                .add(Registration.ALUMINUM_BLOCK_ITEM.get());

        tag(Registration.TAGS_BISMUTH_BLOCK_ITEM)
                .add(Registration.BISMUTH_BLOCK_ITEM.get());

        tag(Registration.TAGS_IRIDIUM_BLOCK_ITEM)
                .add(Registration.IRIDIUM_BLOCK_ITEM.get());

        tag(Registration.TAGS_LEAD_BLOCK_ITEM)
                .add(Registration.LEAD_BLOCK_ITEM.get());

        tag(Registration.TAGS_NICKEL_BLOCK_ITEM)
                .add(Registration.NICKEL_BLOCK_ITEM.get());

        tag(Registration.TAGS_OSMIUM_BLOCK_ITEM)
                .add(Registration.OSMIUM_BLOCK_ITEM.get());

        tag(Registration.TAGS_PLATINUM_BLOCK_ITEM)
                .add(Registration.PLATINUM_BLOCK_ITEM.get());

        tag(Registration.TAGS_SILVER_BLOCK_ITEM)
                .add(Registration.SILVER_BLOCK_ITEM.get());

        tag(Registration.TAGS_TIN_BLOCK_ITEM)
                .add(Registration.TIN_BLOCK_ITEM.get());

        tag(Registration.TAGS_URANIUM_BLOCK_ITEM)
                .add(Registration.URANIUM_BLOCK_ITEM.get());

        tag(Registration.TAGS_ZINC_BLOCK_ITEM)
                .add(Registration.ZINC_BLOCK_ITEM.get());
    }

    @Override
    public String getName() {
        return "NNOW Tags";
    }
}
