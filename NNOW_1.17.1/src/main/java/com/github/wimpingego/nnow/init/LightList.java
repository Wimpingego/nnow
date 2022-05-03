package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.NNOWLightBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LightBlock;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LightList {

    //Blocks
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MOD_ID);

    public static final RegistryObject<Block> LIGHT_BASE_BLOCK= BLOCKS.register("light_base_block",() -> new NNOWLightBlock(Block.Properties.copy(Blocks.STONE).strength(0.05F, 3600000.8F).lightLevel(LightBlock.LIGHT_EMISSION)));
    public static final RegistryObject<Block> LIGHT_DIRT = BLOCKS.register("light_dirt",() -> new NNOWLightBlock(Block.Properties.copy(Blocks.DIRT).strength(0.05F, 3600000.8F).lightLevel(LightBlock.LIGHT_EMISSION)));

    //No Item Blocks Info
    public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
}
