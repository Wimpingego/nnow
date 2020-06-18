package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.AGSBlock;
import com.github.wimpingego.nnow.objects.blocks.BookshelfChestBlock;
import com.github.wimpingego.nnow.objects.blocks.BookshelfSlabBlock;
import com.github.wimpingego.nnow.objects.blocks.BookshelfStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.CobbleGen;
import com.github.wimpingego.nnow.objects.blocks.CustomStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.DarkGlass;
import com.github.wimpingego.nnow.objects.blocks.EndLantern;
import com.github.wimpingego.nnow.objects.blocks.SeaFishermanPOI;
import com.github.wimpingego.nnow.objects.blocks.LavaWell;
import com.github.wimpingego.nnow.objects.blocks.SuperObsidian;
import com.github.wimpingego.nnow.objects.blocks.SwordInStone;
import com.github.wimpingego.nnow.objects.blocks.SafeChestBlock;
import com.github.wimpingego.nnow.objects.blocks.SeaTraderPOI;
import com.github.wimpingego.nnow.objects.blocks.WaterWell;
import com.github.wimpingego.nnow.objects.blocks.golem.MiniRedstoneGolemHead;
//import com.github.wimpingego.nnow.objects.blocks.golem.RedstoneGolemHead;
import com.github.wimpingego.nnow.objects.blocks.traps.TrapBlock;
import com.github.wimpingego.nnow.objects.blocks.traps.TrapType;
import com.github.wimpingego.nnow.objects.blocks.BeekeeperBlock;
import com.github.wimpingego.nnow.objects.bushs.CoalBerryBush;
import com.github.wimpingego.nnow.objects.bushs.DiamondBerryBush;
import com.github.wimpingego.nnow.objects.bushs.EmeraldBerryBush;
import com.github.wimpingego.nnow.objects.bushs.ExperienceBerryBush;
import com.github.wimpingego.nnow.objects.bushs.FireBerryBush;
import com.github.wimpingego.nnow.objects.bushs.IceberryBush;
import com.github.wimpingego.nnow.objects.bushs.GoldBerryBush;
import com.github.wimpingego.nnow.objects.bushs.IronBerryBush;
import com.github.wimpingego.nnow.objects.bushs.LapisBerryBush;
import com.github.wimpingego.nnow.objects.bushs.QuartzBerryBush;
import com.github.wimpingego.nnow.objects.bushs.RedstoneBerryBush;
import com.github.wimpingego.nnow.objects.bushs.WoodenBerryBush;

//import com.github.wimpingego.nnow.objects.crops.CropBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
//import net.minecraft.block.SoundType;
//import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	//Golem
	
	public static final RegistryObject<Block> MINI_RSG_HEAD = BLOCKS.register("rsg_head",() -> new MiniRedstoneGolemHead<Object>(Block.Properties.from(Blocks.STONE)));
	//public static final RegistryObject<Block> RSG = BLOCKS.register("redstone_golem_head",() -> new RedstoneGolemHead<Object>(Block.Properties.from(Blocks.GRAVEL)));
	//public static final RegistryObject<Block> RSG_REAR = BLOCKS.register("redstone_golem_rear",() -> new RedstoneGolemHead<Object>(Block.Properties.from(Blocks.GRAVEL)));
	//public static final RegistryObject<Block> RSG_REAR_TOP = BLOCKS.register("redstone_golem_rear_top",() -> new RedstoneGolemHead<Object>(Block.Properties.from(Blocks.GRAVEL)));
	//public static final RegistryObject<Block> RSG_LEAR = BLOCKS.register("redstone_golem_lear",() -> new RedstoneGolemHead<Object>(Block.Properties.from(Blocks.GRAVEL)));
	//public static final RegistryObject<Block> RSG_LEAR_TOP = BLOCKS.register("redstone_golem_lear_top",() -> new RedstoneGolemHead<Object>(Block.Properties.from(Blocks.GRAVEL)));

	//Traps
	
	public static final RegistryObject<Block> TRAP_BLOCK = BLOCKS.register("trap_block",() -> new TrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE),TrapType.FAKE));
	public static final RegistryObject<Block> IRON_TRAP = BLOCKS.register("iron_trap",() -> new TrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.IRON));
	public static final RegistryObject<Block> GOLDERN_TRAP = BLOCKS.register("gold_trap",() -> new TrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.GOLD));
	public static final RegistryObject<Block> DIAMOND_TRAP = BLOCKS.register("diamond_trap",() -> new TrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.DIAMOND));
	public static final RegistryObject<Block> WITHER_TRAP = BLOCKS.register("wither_trap",() -> new TrapBlock(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE), TrapType.WITHER));
	
	//POI
	
	public static final RegistryObject<Block> SWORD_IN_STONE = BLOCKS.register("sword_in_stone",() -> new SwordInStone<Object>(Block.Properties.from(Blocks.STONE)));
	public static final RegistryObject<Block> BEEKEEPER_BLOCK = BLOCKS.register("beekeeper_block",() -> new BeekeeperBlock<Object>(Block.Properties.from(Blocks.BOOKSHELF).lightValue(4).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> END_LANTERN = BLOCKS.register("end_lantern",() -> new EndLantern(Block.Properties.from(Blocks.LANTERN)));
	public static final RegistryObject<Block> SEA_FISHERMAN_POI = BLOCKS.register("sea_fisherman",() -> new SeaFishermanPOI<Object>(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> SEA_TRADER_POI = BLOCKS.register("sea_trader",() -> new SeaTraderPOI<Object>(Block.Properties.from(Blocks.STONE)));
	
	public static final RegistryObject<Block> AGG_BLOCK = BLOCKS.register("agg_block",() -> new Block(Block.Properties.from(Blocks.GRAVEL)));
	public static final RegistryObject<Block> AGS_BLOCK = BLOCKS.register("ags_block",() -> new AGSBlock(Block.Properties.from(Blocks.SAND)));
	public static final RegistryObject<Block> AGRS_BLOCK = BLOCKS.register("agrs_block",() -> new AGSBlock(Block.Properties.from(Blocks.RED_SAND)));
	public static final RegistryObject<Block> DARK_GLASS_BLOCK = BLOCKS.register("dark_glass_block",() -> new DarkGlass());
	public static final RegistryObject<Block> SUPER_OBSIDIAN = BLOCKS.register("super_obsidian",() -> new SuperObsidian());
	
	public static final RegistryObject<Block> WATERWELL = BLOCKS.register("waterwell", () -> new WaterWell(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> LAVAWELL = BLOCKS.register("lavawell",() -> new LavaWell(Block.Properties.from(Blocks.IRON_BLOCK).lightValue(8).harvestTool(ToolType.PICKAXE)));
	public static final RegistryObject<Block> COBBLEGEN = BLOCKS.register("cobblegen",() -> new CobbleGen(Block.Properties.from(Blocks.IRON_BLOCK).lightValue(4).harvestTool(ToolType.PICKAXE)));
    	    
	//Stairs
	
	public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> REDSAND_STAIRS = BLOCKS.register("redsand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> COARSEDIRT_STAIRS = BLOCKS.register("coarsedirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> BOOKSHELF_STAIRS = BLOCKS.register("bookshelf_stairs",() -> new BookshelfStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));			
	
	//Slabs
	
	public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab",() -> new SlabBlock(Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));
	public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab",() -> new SlabBlock(Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> REDSAND_SLAB = BLOCKS.register("redsand_slab",() -> new SlabBlock(Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));		
	public static final RegistryObject<Block> COARSEDIRT_SLAB = BLOCKS.register("coarsedirt_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));		
	public static final RegistryObject<Block> BOOKSHELF_SLAB = BLOCKS.register("bookshelf_slab",() -> new BookshelfSlabBlock(AGS_BLOCK.get().getDefaultState(), Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));		
	
	//Chests
	public static final RegistryObject<Block> BOOKSHELF_CHEST = BLOCKS.register("bookshelf_chest",() -> new BookshelfChestBlock(Block.Properties.from(Blocks.BOOKSHELF).hardnessAndResistance(2.5f, 600.0f).harvestTool(ToolType.AXE)));
	public static final RegistryObject<Block> SAFE_CHEST = BLOCKS.register("safe_chest",() -> new SafeChestBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2.5f, 600.0f).harvestTool(ToolType.PICKAXE)));
	
	//No Item Blocks Info
	
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
	
	//Bushes
	
	public static final RegistryObject<Block> IRONBERRY_BUSH = NO_ITEM_BLOCK.register("iron_berry_bush",() -> new IronBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> GOLDBERRY_BUSH = NO_ITEM_BLOCK.register("gold_berry_bush",() -> new GoldBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> COALBERRY_BUSH = NO_ITEM_BLOCK.register("coal_berry_bush",() -> new CoalBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	public static final RegistryObject<Block> REDSTONEBERRY_BUSH = NO_ITEM_BLOCK.register("redstone_berry_bush",() -> new RedstoneBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> QUARTZBERRY_BUSH = NO_ITEM_BLOCK.register("quartz_berry_bush",() -> new QuartzBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> DIAMONDBERRY_BUSH = NO_ITEM_BLOCK.register("diamond_berry_bush",() -> new DiamondBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> EMERALDBERRY_BUSH = NO_ITEM_BLOCK.register("emerald_berry_bush",() -> new EmeraldBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> LAPISBERRY_BUSH = NO_ITEM_BLOCK.register("lapis_berry_bush",() -> new LapisBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> ICEBERRY_BUSH = NO_ITEM_BLOCK.register("ice_berry_bush",() -> new  IceberryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> XP_BUSH = NO_ITEM_BLOCK.register("xp_berry_bush",() -> new  ExperienceBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> FIREBERRY_BUSH = NO_ITEM_BLOCK.register("fire_berry_bush",() -> new  FireBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	public static final RegistryObject<Block> WOODENBERRY_BUSH = NO_ITEM_BLOCK.register("wooden_berry_bush",() -> new  WoodenBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	//Crops
	//public static final RegistryObject<Block> PEPPER_CROP = NO_ITEM_BLOCK.register("pepper_crop",() -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT),"pepper"));
	//public static final RegistryObject<Block> BARLEY_CROP = NO_ITEM_BLOCK.register("barley_crop", () -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "barley"));
	
}
