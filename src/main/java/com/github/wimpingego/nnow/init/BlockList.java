package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.AGSBlock;
import com.github.wimpingego.nnow.objects.blocks.BookshelfChestBlock;
import com.github.wimpingego.nnow.objects.blocks.CustomStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.DarkGlass;
import com.github.wimpingego.nnow.objects.blocks.EndLantern;
import com.github.wimpingego.nnow.objects.blocks.SafeChestBlock;
import com.github.wimpingego.nnow.objects.blocks.TrapBlock;
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
import com.github.wimpingego.nnow.objects.crops.CropBlock;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
//import net.minecraft.block.FenceBlock;
//import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
//import net.minecraft.block.material.Material;
//import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,NNOW.MOD_ID);
	
	public static final RegistryObject<Block> AGG_BLOCK = BLOCKS.register("agg_block",
			() -> new Block(Block.Properties.from(Blocks.GRAVEL)));

	public static final RegistryObject<Block> AGS_BLOCK = BLOCKS.register("ags_block",
			() -> new AGSBlock(Block.Properties.from(Blocks.SAND)));
	
	public static final RegistryObject<Block> AGRS_BLOCK = BLOCKS.register("agrs_block",
			() -> new AGSBlock(Block.Properties.from(Blocks.RED_SAND)));
	
	public static final RegistryObject<Block> DARK_GLASS_BLOCK = BLOCKS.register("dark_glass_block",
			() -> new DarkGlass());
	
	public static final RegistryObject<Block> BEEKEEPER_BLOCK = BLOCKS.register("beekeeper_block",
			() -> new BeekeeperBlock<Object>(Block.Properties.from(Blocks.BOOKSHELF).lightValue(4).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> TRAP_BLOCK = BLOCKS.register("trap_block",
			() -> new TrapBlock<Object>(Block.Properties.from(Blocks.IRON_BLOCK).harvestTool(ToolType.PICKAXE)));
	
	public static final RegistryObject<Block> END_LANTERN = BLOCKS.register("end_lantern",
			() -> new EndLantern(Block.Properties.from(Blocks.LANTERN)));
	
	//Stairs
	
	public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> REDSAND_STAIRS = BLOCKS.register("redsand_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> COARSEDIRT_STAIRS = BLOCKS.register("coarsedirt_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	

	public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> BOOKSHELF_STAIRS = BLOCKS.register("bookshelf_stairs",
			() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));			
	
	//Slabs
	
	public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.GRAVEL).harvestTool(ToolType.SHOVEL)));
	
	public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.SAND).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> REDSAND_SLAB = BLOCKS.register("redsand_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.RED_SAND).harvestTool(ToolType.SHOVEL)));		
	
	public static final RegistryObject<Block> COARSEDIRT_SLAB = BLOCKS.register("coarsedirt_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));	
	
	public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.DIRT).harvestTool(ToolType.SHOVEL)));		
	
	public static final RegistryObject<Block> BOOKSHELF_SLAB = BLOCKS.register("bookshelf_slab",
			() -> new SlabBlock(Block.Properties.from(Blocks.BOOKSHELF).harvestTool(ToolType.AXE)));		
	
	//Chests
	public static final RegistryObject<Block> BOOKSHELF_CHEST = BLOCKS.register("bookshelf_chest",
			() -> new BookshelfChestBlock(Block.Properties.from(Blocks.BOOKSHELF).hardnessAndResistance(2.5f, 600.0f).harvestTool(ToolType.AXE)));
	
	public static final RegistryObject<Block> SAFE_CHEST = BLOCKS.register("safe_chest",
			() -> new SafeChestBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(2.5f, 600.0f).harvestTool(ToolType.PICKAXE)));
	
	//No Item Blocks
	
	public static final DeferredRegister<Block> NO_ITEM_BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS, NNOW.MOD_ID);
	
	//Crops
	public static final RegistryObject<Block> PEPPER_CROP = NO_ITEM_BLOCK.register("pepper_crop",
			() -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.PLANT),"pepper"));
	public static final RegistryObject<Block> BARLEY_CROP = NO_ITEM_BLOCK.register("barley_crop", 
			() -> new CropBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0).sound(SoundType.CROP), "barley"));
	
	//Bushes
	
	public static final RegistryObject<Block> IRONBERRY_BUSH = NO_ITEM_BLOCK.register("iron_berry_bush",
			() -> new IronBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	
	public static final RegistryObject<Block> GOLDBERRY_BUSH = NO_ITEM_BLOCK.register("gold_berry_bush",
			() -> new GoldBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	
	public static final RegistryObject<Block> COALBERRY_BUSH = NO_ITEM_BLOCK.register("coal_berry_bush",
			() -> new CoalBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));
	
	public static final RegistryObject<Block> REDSTONEBERRY_BUSH = NO_ITEM_BLOCK.register("redstone_berry_bush",
			() -> new RedstoneBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> QUARTZBERRY_BUSH = NO_ITEM_BLOCK.register("quartz_berry_bush",
			() -> new QuartzBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> DIAMONDBERRY_BUSH = NO_ITEM_BLOCK.register("diamond_berry_bush",
			() -> new DiamondBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> EMERALDBERRY_BUSH = NO_ITEM_BLOCK.register("emerald_berry_bush",
			() -> new EmeraldBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> LAPISBERRY_BUSH = NO_ITEM_BLOCK.register("lapis_berry_bush",
			() -> new LapisBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> ICEBERRY_BUSH = NO_ITEM_BLOCK.register("ice_berry_bush",
			() -> new  IceberryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> XP_BUSH = NO_ITEM_BLOCK.register("xp_berry_bush",
			() -> new  ExperienceBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> FIREBERRY_BUSH = NO_ITEM_BLOCK.register("fire_berry_bush",
			() -> new  FireBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	public static final RegistryObject<Block> WOODENBERRY_BUSH = NO_ITEM_BLOCK.register("wooden_berry_bush",
			() -> new  WoodenBerryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
	//Example	
	
	//public static final RegistryObject<Block> EXAMPLE_FENCE = BLOCKS.register("example_fence",
	//		() -> new FenceBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	//
	//public static final RegistryObject<Block> EXAMPLE_BUTTON = BLOCKS.register("example_button",
	//		() -> new ModWoodButtonBlock(Block.Properties.create(Material.SAND, MaterialColor.GOLD)));
	
	//public static final RegistryObject<Block> EXAMPLE_PRESSURE_PLATE = BLOCKS.register("example_pressure_plate",
	//		() -> new ModPressurePlateBlock(Sensitivity.EVERYTHING,
	//				Block.Properties.create(Material.SAND, MaterialColor.GOLD)));	
}
