package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.*;
import com.github.wimpingego.nnow.objects.blocks.cakes.*;
import com.github.wimpingego.nnow.objects.blocks.slabs.*;
import com.github.wimpingego.nnow.objects.blocks.stairs.*;
import com.github.wimpingego.nnow.objects.blocks.traps.*;
import com.github.wimpingego.nnow.objects.blocks.poi.*;
import com.github.wimpingego.nnow.objects.bushs.*;
import com.github.wimpingego.nnow.objects.bushs.dusts.*;
import com.github.wimpingego.nnow.objects.bushs.ores.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	public static final RegistryObject<Block> END_LANTERN = BLOCKS.register("end_lantern",() -> new LanternBlock(Block.Properties.from(Blocks.LANTERN).harvestTool(ToolType.PICKAXE)));
	
	//Traps
	public static final RegistryObject<Block> IRON_TRAP = BLOCKS.register("iron_trap",() -> new IronTrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.IRON));
	public static final RegistryObject<Block> GOLDERN_TRAP = BLOCKS.register("gold_trap",() -> new GoldTrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.GOLD));
	public static final RegistryObject<Block> DIAMOND_TRAP = BLOCKS.register("diamond_trap",() -> new DiamondTrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.DIAMOND));
	public static final RegistryObject<Block> WITHER_TRAP = BLOCKS.register("wither_trap",() -> new WitherTrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.WITHER));
	
	//POI
	public static final RegistryObject<Block> MONSTER_TRAPPER_POI = BLOCKS.register("monster_trapper_poi",() -> new MonsterTrapperBlock(Block.Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BANKER_POI = BLOCKS.register("banker_poi",() -> new TableBlock<Object>(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> END_TRADER_POI = BLOCKS.register("end_trader_poi",() -> new EndTraderBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> OLD_DERPY_POI = BLOCKS.register("old_derpy_poi",() -> new DoubleHighBlock(Block.Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BEEKEEPER_POI = BLOCKS.register("beekeeper_poi",() -> new TableBlock<Object>(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> SEA_FISHERMAN_POI = BLOCKS.register("sea_fisherman_poi",() -> new DoubleHighBlock(Block.Properties.from(Blocks.STONE).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> SEA_TRADER_POI = BLOCKS.register("sea_trader_poi",() -> new DoubleHighBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> NETHER_TRADER_POI = BLOCKS.register("nether_trader_poi",() -> new DoubleHighBlock(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	
	//Blocks
	public static final RegistryObject<Block> AGG_BLOCK = BLOCKS.register("agg_block",() -> new AGBlock(Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> AGS_BLOCK = BLOCKS.register("ags_block",() -> new AGBlock(Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> AGRS_BLOCK = BLOCKS.register("agrs_block",() -> new AGBlock(Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));
	
	public static final RegistryObject<Block> DARK_GLASS_BLOCK = BLOCKS.register("dark_glass_block",() -> new DarkGlass()); //Set to Pickaxe
	public static final RegistryObject<Block> SUPER_OBSIDIAN = BLOCKS.register("super_obsidian",() -> new SuperObsidian()); //Set to Pickaxe
	public static final RegistryObject<Block> SUPER_OBSIDIAN_BARS = BLOCKS.register("super_obsidian_bars",() -> new SuperObsidian()); //Set to Pickaxe
	public static final RegistryObject<Block> HYDROTANK = BLOCKS.register("hydrotank", () -> new HydroTank(Block.Properties.from(Blocks.IRON_BLOCK).notSolid().harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> HYDROTANK_LIGHT = BLOCKS.register("hydrotank_light", () -> new HydroTankLight(Block.Properties.from(Blocks.IRON_BLOCK).notSolid().harvestTool(ToolType.PICKAXE)));
	
	//Cauldron
	public static final RegistryObject<Block> ACACIA_CAULDRON = BLOCKS.register("cauldron_acacia", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> BIRCH_CAULDRON = BLOCKS.register("cauldron_birch", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> DARK_OAK_CAULDRON = BLOCKS.register("cauldron_dark_oak", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> JUNGLE_CAULDRON = BLOCKS.register("cauldron_jungle", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> OAK_CAULDRON = BLOCKS.register("cauldron_oak", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> SPRUCE_CAULDRON = BLOCKS.register("cauldron_spruce", () -> new WoodenCauldron(Block.Properties.from(Blocks.OAK_PLANKS).harvestTool(ToolType.AXE)));
	    
	//Stairs
	public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> REDSAND_STAIRS = BLOCKS.register("redsand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> COARSEDIRT_STAIRS = BLOCKS.register("coarsedirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> CRACKED_STONE_STAIRS = BLOCKS.register("cracked_stone_bricks_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BOOKSHELF_STAIRS = BLOCKS.register("bookshelf_stairs",() -> new BookshelfStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));			
	
	public static final RegistryObject<Block> OAK_LEAVES_STAIRS = BLOCKS.register("oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.OAK_LEAVES)));	
	public static final RegistryObject<Block> DARK_OAK_LEAVES_STAIRS = BLOCKS.register("dark_oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DARK_OAK_LEAVES)));	
	public static final RegistryObject<Block> JUNGLE_LEAVES_STAIRS = BLOCKS.register("jungle_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.JUNGLE_LEAVES)));	
	public static final RegistryObject<Block> ACACIA_LEAVES_STAIRS = BLOCKS.register("acacia_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.ACACIA_LEAVES)));	
	public static final RegistryObject<Block> SPRUCE_LEAVES_STAIRS = BLOCKS.register("spruce_leaves_stairs",() -> new SpruceStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.SPRUCE_LEAVES)));	
	public static final RegistryObject<Block> BIRCH_LEAVES_STAIRS = BLOCKS.register("birch_leaves_stairs",() -> new BirchStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.BIRCH_LEAVES)));	
	
	//Slabs
	public static final RegistryObject<Block> GRASS_SLAB = BLOCKS.register("grass_slab",() -> new GrassSlab(Block.Properties.from(Blocks.GRASS_BLOCK).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab",() -> new SlabBlock(Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab",() -> new SlabBlock(Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> REDSAND_SLAB = BLOCKS.register("redsand_slab",() -> new SlabBlock(Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));		
	public static final RegistryObject<Block> COARSEDIRT_SLAB = BLOCKS.register("coarsedirt_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> PATH_SLAB = BLOCKS.register("path_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));
	//public static final RegistryObject<Block> PATH_SLAB = BLOCKS.register("path_slab",() -> new PathSlab());
	public static final RegistryObject<Block> CRACKED_STONE_SLAB = BLOCKS.register("cracked_stone_bricks_slab",() -> new SlabBlock(Block.Properties.from(Blocks.STONE).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> BOOKSHELF_SLAB = BLOCKS.register("bookshelf_slab",() -> new BookshelfSlabBlock(Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));		
	
	public static final RegistryObject<Block> OAK_LEAVES_SLAB = BLOCKS.register("oak_leaves_slab",() -> new LeafSlab(Block.Properties.from(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> DARK_OAK_LEAVES_SLAB = BLOCKS.register("dark_oak_leaves_slab",() -> new LeafSlab(Block.Properties.from(Blocks.DARK_OAK_LEAVES)));
	public static final RegistryObject<Block> JUNGLE_LEAVES_SLAB = BLOCKS.register("jungle_leaves_slab",() -> new LeafSlab(Block.Properties.from(Blocks.JUNGLE_LEAVES)));
	public static final RegistryObject<Block> ACACIA_LEAVES_SLAB = BLOCKS.register("acacia_leaves_slab",() -> new LeafSlab(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> SPRUCE_LEAVES_SLAB = BLOCKS.register("spruce_leaves_slab",() -> new SpruceSlab(Block.Properties.from(Blocks.SPRUCE_LEAVES)));
	public static final RegistryObject<Block> BIRCH_LEAVES_SLAB = BLOCKS.register("birch_leaves_slab",() -> new BirchSlab(Block.Properties.from(Blocks.BIRCH_LEAVES)));
	
	//Others

	public static final RegistryObject<Block> NETHER_CAKE = BLOCKS.register("nether_cake", () -> new BlockNetherCake(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
	public static final RegistryObject<Block> END_CAKE = BLOCKS.register("end_cake", () -> new BlockEndCake(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));
	public static final RegistryObject<Block> OVERWORLD_CAKE = BLOCKS.register("overworld_cake", () -> new BlockOverworldCake(AbstractBlock.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)));

	
	//No Item Blocks Info
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
	
	//Bushes
	public static final RegistryObject<Block> IRON_BERRY_BUSH = NO_ITEM_BLOCK.register("iron_berry_bush",() -> new IronBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> GOLD_BERRY_BUSH = NO_ITEM_BLOCK.register("gold_berry_bush",() -> new GoldBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> COAL_BERRY_BUSH = NO_ITEM_BLOCK.register("coal_berry_bush",() -> new CoalBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> REDSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("redstone_berry_bush",() -> new RedstoneBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> GLOWSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("glowstone_berry_bush",() -> new GlowstoneBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> QUARTZ_BERRY_BUSH = NO_ITEM_BLOCK.register("quartz_berry_bush",() -> new QuartzBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> DIAMOND_BERRY_BUSH = NO_ITEM_BLOCK.register("diamond_berry_bush",() -> new DiamondBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> EMERALD_BERRY_BUSH = NO_ITEM_BLOCK.register("emerald_berry_bush",() -> new EmeraldBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> NETHERITE_BERRY_BUSH = NO_ITEM_BLOCK.register("netherite_berry_bush",() -> new NetheriteBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> LAPIS_BERRY_BUSH = NO_ITEM_BLOCK.register("lapis_berry_bush",() -> new LapisBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> ICE_BERRY_BUSH = NO_ITEM_BLOCK.register("ice_berry_bush",() -> new IceBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> XP_BERRY_BUSH = NO_ITEM_BLOCK.register("xp_berry_bush",() -> new ExperienceBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> FIRE_BERRY_BUSH = NO_ITEM_BLOCK.register("fire_berry_bush",() -> new FireBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> WOODEN_BERRY_BUSH = NO_ITEM_BLOCK.register("wooden_berry_bush",() -> new WoodenBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> STONE_BERRY_BUSH = NO_ITEM_BLOCK.register("stone_berry_bush",() -> new StoneBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> SAND_BERRY_BUSH = NO_ITEM_BLOCK.register("sand_berry_bush",() -> new SandBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> CLAY_BERRY_BUSH = NO_ITEM_BLOCK.register("clay_berry_bush",() -> new ClayBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> DIRT_BERRY_BUSH = NO_ITEM_BLOCK.register("dirt_berry_bush",() -> new DirtBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> GRAVEL_BERRY_BUSH = NO_ITEM_BLOCK.register("gravel_berry_bush",() -> new GravelBerryBush(AbstractBlock.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	
	//POI
	public static final RegistryObject<Block> INGOT_TRADER_POI = NO_ITEM_BLOCK.register("ingot_trader_poi",() -> new IngotTraderBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	
	//Config Loaded Blocks
	public static final DeferredRegister<Block> WATER = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> WATERWELL = BLOCKS.register("waterwell", () -> new WaterWell(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	
	public static final DeferredRegister<Block> LAVA = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> LAVAWELL = BLOCKS.register("lavawell",() -> new LavaWell(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	
	public static final DeferredRegister<Block> COBBLE_GEN = DeferredRegister.create(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	public static final RegistryObject<Block> COBBLEGEN = BLOCKS.register("cobblegen",() -> new CobbleGen(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	
	//Crops
	//public static final RegistryObject<Block> PEPPER_CROP = NO_ITEM_BLOCK.register("pepper_crop",() -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT),"pepper"));
	//public static final RegistryObject<Block> BARLEY_CROP = NO_ITEM_BLOCK.register("barley_crop", () -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "barley"));
}
