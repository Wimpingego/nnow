package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.objects.blocks.AGSBlock;
import com.github.wimpingego.nnow.objects.blocks.BookshelfChestBlock;
import com.github.wimpingego.nnow.objects.blocks.CustomStairsBlock;
import com.github.wimpingego.nnow.objects.blocks.bushs.CoalBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.DiamondBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.EmeraldBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.FrostberryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.GoldBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.IronBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.LapisBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.QuartzBerryBush;
import com.github.wimpingego.nnow.objects.blocks.bushs.RedstoneBerryBush;
import com.github.wimpingego.nnow.objects.blocks.crops.CropBlock;

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
	
	//public static final RegistryObject<Block> GRASS_STAIRS = BLOCKS.register("grass_stairs",
			//() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.GRASS_BLOCK).harvestTool(ToolType.SHOVEL)));
	
	//public static final RegistryObject<Block> PATH_STAIRS = BLOCKS.register("path_stairs",
			//() -> new CustomStairsBlock(AGS_BLOCK.get().getDefaultState(),Block.Properties.from(Blocks.GRASS_PATH).harvestTool(ToolType.SHOVEL)));	
	
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
	
	//public static final RegistryObject<Block> GRASS_SLAB = BLOCKS.register("grass_slab",
			//() -> new SlabBlock(Block.Properties.from(Blocks.GRASS_BLOCK).harvestTool(ToolType.SHOVEL)));		
	
	//public static final RegistryObject<Block> PATH_SLAB = BLOCKS.register("path_slab",
			//() -> new SlabBlock(Block.Properties.from(Blocks.GRASS_PATH).harvestTool(ToolType.SHOVEL)));	
	
	//Chests
	public static final RegistryObject<Block> BOOKSHELF_CHEST = BLOCKS.register("bookshelf_chest",
			() -> new BookshelfChestBlock(Block.Properties.from(Blocks.BOOKSHELF).hardnessAndResistance(2.5f, 600.0f).harvestTool(ToolType.AXE)));
	
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
	
	public static final RegistryObject<Block> FROSTBERRY_BUSH = NO_ITEM_BLOCK.register("frost_berry_bush",
			() -> new  FrostberryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH).tickRandomly()));	
	
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
