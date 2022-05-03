package com.github.wimpingego.nnow.datagen;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.setup.Registration;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.minecraftforge.client.model.generators.ModelProvider.BLOCK_FOLDER;

public class NNOWBlockStates extends BlockStateProvider {

    public NNOWBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, NNOW.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        registerAGG_BLOCK();
        registerAGS_BLOCK();
        registerAGRS_BLOCK();
        registerDARK_GLASS();
        registerCOBBLEGEN();
        registerWATERWELL();
        registerLAVAWELL();
    //Metal Storage Blocks
        registerNICKEL_BLOCK();
        registerSILVER_BLOCK();
        registerURANIUM_BLOCK();
        registerLEAD_BLOCK();
        registerALUMINUM_BLOCK();
        registerTIN_BLOCK();
        registerOSMIUM_BLOCK();
        registerBISMUTH_BLOCK();
        registerZINC_BLOCK();
        registerPLATINUM_BLOCK();
        registerIRIDIUM_BLOCK();
    //Slabs
        registerGREVAL_SLAB();
        registerSAND_SLAB();
        registerREDSAND_SLAB();
        registerCOARSE_DIRT_SLAB();
        registerDIRT_SLAB();
        registerCRACKED_STONE_SLAB();
        registerBOOKSHELF_SLAB();
    //Stairs
        registerGRAVEL_STAIRS();
        registerSAND_STAIRS();
        registerREDSAND_STAIRS();
        registerCOARSE_DIRT_STAIRS();
        registerDIRT_STAIRS();
        registerCRACKED_STONE_STAIRS();
        registerBOOKSHELF_STAIRS();

    }

    //Metal Storage Blocks
    private void registerNICKEL_BLOCK() {
        String name = "nickel_block";
        Block block = Registration.NICKEL_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/nickel_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerSILVER_BLOCK() {
        String name = "silver_block";
        Block block = Registration.SILVER_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/silver_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerURANIUM_BLOCK() {
        String name = "uranium_block";
        Block block = Registration.URANIUM_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/uranium_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerLEAD_BLOCK() {
        String name = "lead_block";
        Block block = Registration.LEAD_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/lead_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerALUMINUM_BLOCK() {
        String name = "aluminum_block";
        Block block = Registration.ALUMINUM_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/aluminum_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerTIN_BLOCK() {
        String name = "tin_block";
        Block block = Registration.TIN_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/tin_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerOSMIUM_BLOCK() {
        String name = "osmium_block";
        Block block = Registration.OSMIUM_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/osmium_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerBISMUTH_BLOCK() {
        String name = "bismuth_block";
        Block block = Registration.BISMUTH_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/bismuth_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerZINC_BLOCK() {
        String name = "zinc_block";
        Block block = Registration.ZINC_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/zinc_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerPLATINUM_BLOCK() {
        String name = "platinum_block";
        Block block = Registration.PLATINUM_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/platinum_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerIRIDIUM_BLOCK() {
        String name = "iridium_block";
        Block block = Registration.IRIDIUM_BLOCK.get();
        ResourceLocation all = modLoc("block/storage_blocks/iridium_block");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerAGG_BLOCK() {
        String name = "gravel";
        Block block = Registration.AGG_BLOCK.get();
        ResourceLocation all = mcLoc("block/gravel");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerAGS_BLOCK() {
        String name = "sand";
        Block block = Registration.AGS_BLOCK.get();
        ResourceLocation all = mcLoc("block/sand");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerAGRS_BLOCK() {
        String name = "red_sand";
        Block block = Registration.AGRS_BLOCK.get();
        ResourceLocation all = mcLoc("block/red_sand");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerDARK_GLASS() {
        String name = "dark_glass";
        Block block = Registration.DARK_GLASS.get();
        ResourceLocation all = modLoc("block/dark_glass");
        simpleBlock(block, models().cubeAll(name, all));
    }

    private void registerCOBBLEGEN() {
        String name = "cobblegen";
        Block block = Registration.COBBLEGEN.get();
        ResourceLocation side = modLoc("block/cobblegen/cobblegen_front");
        ResourceLocation top = modLoc("block/cobblegen/cobblegen_top");
        simpleBlock(block,models().cube(name,top, top, side, side, side, side).texture("particle",top));
    }

    private void registerWATERWELL() {
        String name = "waterwell";
        Block block = Registration.WATERWELL.get();
        ResourceLocation side = modLoc("block/waterwell/waterwell_front");
        ResourceLocation top = modLoc("block/cobblegen/cobblegen_top");
        simpleBlock(block,models().cube(name,top, top, side, side, side, side).texture("particle",top));
    }

    private void registerLAVAWELL() {
        String name = "lavawell";
        Block block = Registration.LAVAWELL.get();
        ResourceLocation side = modLoc("block/lavawell/lavawell_front");
        ResourceLocation top = modLoc("block/cobblegen/cobblegen_top");
        simpleBlock(block,models().cube(name,top, top, side, side, side, side).texture("particle",top));
    }
    //Slabs
    private void registerGREVAL_SLAB() {
        Block block = Registration.GRAVEL_SLAB.get();
        ResourceLocation side = mcLoc("block/gravel");
        ResourceLocation tb = mcLoc("block/gravel");
        ResourceLocation doubleslab = mcLoc("block/gravel");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerSAND_SLAB() {
        Block block = Registration.SAND_SLAB.get();
        ResourceLocation side = mcLoc("block/sand");
        ResourceLocation tb = mcLoc("block/sand");
        ResourceLocation doubleslab = mcLoc("block/sand");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerREDSAND_SLAB() {
        Block block = Registration.REDSAND_SLAB.get();
        ResourceLocation side = mcLoc("block/red_sand");
        ResourceLocation tb = mcLoc("block/red_sand");
        ResourceLocation doubleslab = mcLoc("block/red_sand");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerCOARSE_DIRT_SLAB() {
        Block block = Registration.COARSE_DIRT_SLAB.get();
        ResourceLocation side = mcLoc("block/coarse_dirt");
        ResourceLocation tb = mcLoc("block/coarse_dirt");
        ResourceLocation doubleslab = mcLoc("block/coarse_dirt");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerDIRT_SLAB() {
        Block block = Registration.DIRT_SLAB.get();
        ResourceLocation side = mcLoc("block/dirt");
        ResourceLocation tb = mcLoc("block/dirt");
        ResourceLocation doubleslab = mcLoc("block/dirt");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerCRACKED_STONE_SLAB() {
        Block block = Registration.CRACKED_STONE_SLAB.get();
        ResourceLocation side = mcLoc("block/cracked_stone_bricks");
        ResourceLocation tb = mcLoc("block/cracked_stone_bricks");
        ResourceLocation doubleslab = mcLoc("block/cracked_stone_bricks");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }

    private void registerBOOKSHELF_SLAB() {
        Block block = Registration.BOOKSHELF_SLAB.get();
        ResourceLocation side = mcLoc("block/bookshelf");
        ResourceLocation tb = mcLoc("block/oak_planks");
        ResourceLocation doubleslab = mcLoc("block/bookshelf");
        slabBlock((SlabBlock) block, doubleslab, side , tb, tb);
    }
    //Stairs
    public void registerGRAVEL_STAIRS() {
        String name = "gravel_stairs";
        Block block = Registration.GRAVEL_STAIRS.get();
        ResourceLocation all = mcLoc("block/gravel");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerSAND_STAIRS() {
        String name = "sand_stairs";
        Block block = Registration.SAND_STAIRS.get();
        ResourceLocation all = mcLoc("block/sand");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerREDSAND_STAIRS() {
        String name = "redsand_stairs";
        Block block = Registration.REDSAND_STAIRS.get();
        ResourceLocation all = mcLoc("block/red_sand");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerCOARSE_DIRT_STAIRS() {
        String name = "coarse_dirt_stairs";
        Block block = Registration.COARSE_DIRT_STAIRS.get();
        ResourceLocation all = mcLoc("block/coarse_dirt");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerDIRT_STAIRS() {
        String name = "dirt_stairs";
        Block block = Registration.DIRT_STAIRS.get();
        ResourceLocation all = mcLoc("block/dirt");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerCRACKED_STONE_STAIRS() {
        String name = "cracked_stone_bricks_stairs";
        Block block = Registration.CRACKED_STONE_STAIRS.get();
        ResourceLocation all = mcLoc("block/cracked_stone_bricks");
        ModelFile stairs = models().stairs(name, all, all, all);
        ModelFile stairsInner = models().stairsInner(name + "_inner", all, all, all);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", all, all, all);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

    public void registerBOOKSHELF_STAIRS() {
        String name = "bookshelf_stairs";
        Block block = Registration.BOOKSHELF_STAIRS.get();
        ResourceLocation side = mcLoc("block/bookshelf");
        ResourceLocation tb = mcLoc("block/oak_planks");
        ModelFile stairs = models().stairs(name, side, tb, tb);
        ModelFile stairsInner = models().stairsInner(name + "_inner", side, tb, tb);
        ModelFile stairsOuter = models().stairsOuter(name + "_outer", side, tb, tb);
        stairsBlock((StairBlock) block, stairs, stairsInner, stairsOuter);
    }

}