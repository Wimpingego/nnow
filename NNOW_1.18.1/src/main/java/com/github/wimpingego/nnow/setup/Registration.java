package com.github.wimpingego.nnow.setup;

import com.github.wimpingego.nnow.NNOW;
import com.github.wimpingego.nnow.blocks.*;
import com.github.wimpingego.nnow.blocks.slabs.*;
import com.github.wimpingego.nnow.blocks.stairs.*;
import com.github.wimpingego.nnow.blocks.traps.*;
import com.github.wimpingego.nnow.bushes.ExperienceBerryBush;
import com.github.wimpingego.nnow.bushes.element.FireBerryBush;
import com.github.wimpingego.nnow.bushes.element.IceBerryBush;
import com.github.wimpingego.nnow.bushes.base.WoodenBerryBush;
import com.github.wimpingego.nnow.bushes.base.*;
import com.github.wimpingego.nnow.bushes.metals.*;
import com.github.wimpingego.nnow.bushes.ores.*;
import com.github.wimpingego.nnow.items.*;
import com.github.wimpingego.nnow.items.pokingsticks.*;
import com.github.wimpingego.nnow.items.shears.DiamondShears;
import com.github.wimpingego.nnow.items.shears.GoldenShears;
import com.github.wimpingego.nnow.items.shears.NetheriteShears;
import com.github.wimpingego.nnow.items.shears.WoodenShears;
import com.github.wimpingego.nnow.util.ArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.github.wimpingego.nnow.NNOW.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<Block> NO_ITEM_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, NNOW.MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        NO_ITEM_BLOCK.register(bus);
    }

    // Some common properties for our blocks and items
    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.METAL)
            .strength(5.0F, 6.0F).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    //Blocks
    public static final RegistryObject<Block> AGG_BLOCK = BLOCKS.register("agg_block",() -> new AGBlock(Block.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Item> AGG_BLOCK_ITEM = fromBlock(AGG_BLOCK);
    public static final RegistryObject<Block> AGS_BLOCK = BLOCKS.register("ags_block",() -> new AGBlock(Block.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Item> AGS_BLOCK_ITEM = fromBlock(AGS_BLOCK);
    public static final RegistryObject<Block> AGRS_BLOCK = BLOCKS.register("agrs_block",() -> new AGBlock(Block.Properties.copy(Blocks.RED_SAND)));
    public static final RegistryObject<Item> AGRS_BLOCK_ITEM = fromBlock(AGRS_BLOCK);
    public static final RegistryObject<Block> DARK_GLASS = BLOCKS.register("dark_glass", DarkGlass::new);
    public static final RegistryObject<Item> DARK_GLASS_ITEM = fromBlock(DARK_GLASS);
    public static final RegistryObject<Block> SUPER_OBSIDIAN = BLOCKS.register("super_obsidian", SuperObsidian::new);
    public static final RegistryObject<Item> SUPER_OBSIDIAN_ITEM = fromBlock(SUPER_OBSIDIAN);
    public static final RegistryObject<Block> SUPER_OBSIDIAN_BARS = BLOCKS.register("super_obsidian_bars", SuperObsidian::new);
    public static final RegistryObject<Item> SUPER_OBSIDIAN_BARS_ITEM = fromBlock(SUPER_OBSIDIAN_BARS);
    public static final RegistryObject<Block> HYDROTANK = BLOCKS.register("hydrotank", HydroTank::new);
    public static final RegistryObject<Item> HYDROTANK_ITEM = fromBlock(HYDROTANK);
    public static final RegistryObject<Block> HYDROTANK_LIGHT = BLOCKS.register("hydrotank_light", HydroTankLight::new);
    public static final RegistryObject<Item> HYDROTANK_LIGHT_ITEM = fromBlock(HYDROTANK_LIGHT);
    public static final RegistryObject<Block> COBBLEGEN = BLOCKS.register("cobblegen", CobbleGen::new);
    public static final RegistryObject<Item> COBBLEGEN_ITEM = fromBlock(COBBLEGEN);
    public static final RegistryObject<Block> WATERWELL = BLOCKS.register("waterwell", WaterWell::new);
    public static final RegistryObject<Item> WATERWELL_ITEM = fromBlock(WATERWELL);
    public static final RegistryObject<Block> LAVAWELL= BLOCKS.register("lavawell", LavaWell::new);
    public static final RegistryObject<Item> LAVAWELL_ITEM = fromBlock(LAVAWELL);

    //Ore Storage Blocks
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = fromBlock(NICKEL_BLOCK);
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> SILVER_BLOCK_ITEM = fromBlock(SILVER_BLOCK);
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> URANIUM_BLOCK_ITEM = fromBlock(URANIUM_BLOCK);
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = fromBlock(LEAD_BLOCK);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = fromBlock(ALUMINUM_BLOCK);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> TIN_BLOCK_ITEM = fromBlock(TIN_BLOCK);
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> OSMIUM_BLOCK_ITEM = fromBlock(OSMIUM_BLOCK);
    public static final RegistryObject<Block> BISMUTH_BLOCK = BLOCKS.register("bismuth_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> BISMUTH_BLOCK_ITEM = fromBlock(BISMUTH_BLOCK);
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> ZINC_BLOCK_ITEM = fromBlock(ZINC_BLOCK);
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_BLOCK_ITEM = fromBlock(PLATINUM_BLOCK);
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block" , () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Item> IRIDIUM_BLOCK_ITEM = fromBlock(IRIDIUM_BLOCK);

    public static final RegistryObject<Block> GRAVEL_SLAB = BLOCKS.register("gravel_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Item> GRAVEL_SLAB_ITEM = fromBlock(GRAVEL_SLAB);
    public static final RegistryObject<Block> SAND_SLAB = BLOCKS.register("sand_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Item> SAND_SLAB_ITEM = fromBlock(SAND_SLAB);
    public static final RegistryObject<Block> REDSAND_SLAB = BLOCKS.register("redsand_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.RED_SAND)));
    public static final RegistryObject<Item> REDSAND_SLAB_ITEM = fromBlock(REDSAND_SLAB);
    public static final RegistryObject<Block> COARSE_DIRT_SLAB = BLOCKS.register("coarse_dirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<Item> COARSE_DIRT_SLAB_ITEM = fromBlock(COARSE_DIRT_SLAB);
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Item> DIRT_SLAB_ITEM = fromBlock(DIRT_SLAB);
    public static final RegistryObject<Block> CRACKED_STONE_SLAB = BLOCKS.register("cracked_stone_bricks_slab",() -> new SlabBlock(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Item> CRACKED_STONE_SLAB_ITEM = fromBlock(CRACKED_STONE_SLAB);
    public static final RegistryObject<Block> BOOKSHELF_SLAB = BLOCKS.register("bookshelf_slab",() -> new BookshelfSlabBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<Item> BOOKSHELF_SLAB_ITEM = fromBlock(BOOKSHELF_SLAB);

    public static final RegistryObject<Block> GRASS_SLAB = BLOCKS.register("grass_slab",() -> new GrassSlab(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Item> GRASS_SLAB_ITEM = fromBlock(GRASS_SLAB);
    public static final RegistryObject<Block> OAK_LEAVES_SLAB = BLOCKS.register("oak_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> OAK_LEAVES_SLAB_ITEM = fromBlock(OAK_LEAVES_SLAB);
    public static final RegistryObject<Block> DARK_OAK_LEAVES_SLAB = BLOCKS.register("dark_oak_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.DARK_OAK_LEAVES)));
    public static final RegistryObject<Item> DARK_OAK_LEAVES_SLAB_ITEM = fromBlock(DARK_OAK_LEAVES_SLAB);
    public static final RegistryObject<Block> JUNGLE_LEAVES_SLAB = BLOCKS.register("jungle_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.JUNGLE_LEAVES)));
    public static final RegistryObject<Item> JUNGLE_LEAVES_SLAB_ITEM = fromBlock(JUNGLE_LEAVES_SLAB);
    public static final RegistryObject<Block> ACACIA_LEAVES_SLAB = BLOCKS.register("acacia_leaves_slab",() -> new LeafSlab(Block.Properties.copy(Blocks.ACACIA_LEAVES)));
    public static final RegistryObject<Item> ACACIA_LEAVES_SLAB_ITEM = fromBlock(ACACIA_LEAVES_SLAB);
    public static final RegistryObject<Block> SPRUCE_LEAVES_SLAB = BLOCKS.register("spruce_leaves_slab",() -> new SpruceSlab(Block.Properties.copy(Blocks.SPRUCE_LEAVES)));
    public static final RegistryObject<Item> SPRUCE_LEAVES_SLAB_ITEM = fromBlock(SPRUCE_LEAVES_SLAB);
    public static final RegistryObject<Block> BIRCH_LEAVES_SLAB = BLOCKS.register("birch_leaves_slab",() -> new BirchSlab(Block.Properties.copy(Blocks.BIRCH_LEAVES)));
    public static final RegistryObject<Item> BIRCH_LEAVES_SLAB_ITEM = fromBlock(BIRCH_LEAVES_SLAB);

    public static final RegistryObject<Block> GRAVEL_STAIRS = BLOCKS.register("gravel_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Item> GRAVEL_STAIRS_ITEM = fromBlock(GRAVEL_STAIRS);
    public static final RegistryObject<Block> SAND_STAIRS = BLOCKS.register("sand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Item> SAND_STAIRS_ITEM = fromBlock(SAND_STAIRS);
    public static final RegistryObject<Block> REDSAND_STAIRS = BLOCKS.register("redsand_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.RED_SAND)));
    public static final RegistryObject<Item> REDSAND_STAIRS_ITEM = fromBlock(REDSAND_STAIRS);
    public static final RegistryObject<Block> COARSE_DIRT_STAIRS = BLOCKS.register("coarse_dirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<Item> COARSE_DIRT_STAIRS_ITEM = fromBlock(COARSE_DIRT_STAIRS);
    public static final RegistryObject<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Item> DIRT_STAIRS_ITEM = fromBlock(DIRT_STAIRS);
    public static final RegistryObject<Block> CRACKED_STONE_STAIRS = BLOCKS.register("cracked_stone_bricks_stairs",() -> new CustomStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Item> CRACKED_STONE_STAIRS_ITEM = fromBlock(CRACKED_STONE_STAIRS);
    public static final RegistryObject<Block> BOOKSHELF_STAIRS = BLOCKS.register("bookshelf_stairs",() -> new BookshelfStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<Item> BOOKSHELF_STAIRS_ITEM = fromBlock(BOOKSHELF_STAIRS);

    public static final RegistryObject<Block> OAK_LEAVES_STAIRS = BLOCKS.register("oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Item> OAK_LEAVES_STAIRS_ITEM = fromBlock(OAK_LEAVES_STAIRS);
    public static final RegistryObject<Block> DARK_OAK_LEAVES_STAIRS = BLOCKS.register("dark_oak_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.DARK_OAK_LEAVES)));
    public static final RegistryObject<Item> DARK_OAK_LEAVES_STAIRS_ITEM = fromBlock(DARK_OAK_LEAVES_STAIRS);
    public static final RegistryObject<Block> JUNGLE_LEAVES_STAIRS = BLOCKS.register("jungle_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.JUNGLE_LEAVES)));
    public static final RegistryObject<Item> JUNGLE_LEAVES_STAIRS_ITEM = fromBlock(JUNGLE_LEAVES_STAIRS);
    public static final RegistryObject<Block> ACACIA_LEAVES_STAIRS = BLOCKS.register("acacia_leaves_stairs",() -> new LeafStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.ACACIA_LEAVES)));
    public static final RegistryObject<Item> ACACIA_LEAVES_STAIRS_ITEM = fromBlock(ACACIA_LEAVES_STAIRS);
    public static final RegistryObject<Block> SPRUCE_LEAVES_STAIRS = BLOCKS.register("spruce_leaves_stairs",() -> new SpruceStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.SPRUCE_LEAVES)));
    public static final RegistryObject<Item> SPRUCE_LEAVES_STAIRS_ITEM = fromBlock(SPRUCE_LEAVES_STAIRS);
    public static final RegistryObject<Block> BIRCH_LEAVES_STAIRS = BLOCKS.register("birch_leaves_stairs",() -> new BirchStairsBlock(AGS_BLOCK.get().defaultBlockState(),Block.Properties.copy(Blocks.BIRCH_LEAVES)));
    public static final RegistryObject<Item> BIRCH_LEAVES_STAIRS_ITEM = fromBlock(BIRCH_LEAVES_STAIRS);
    //Traps
    public static final RegistryObject<Block> IRON_TRAP = BLOCKS.register("iron_trap",() -> new IronTrap(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.IRON));
    public static final RegistryObject<Item> IRON_TRAP_ITEM = fromBlock(IRON_TRAP);
    public static final RegistryObject<Block> GOLDEN_TRAP = BLOCKS.register("golden_trap",() -> new GoldTrap(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.GOLDEN));
    public static final RegistryObject<Item> GOLDEN_TRAP_ITEM = fromBlock(GOLDEN_TRAP);
    public static final RegistryObject<Block> DIAMOND_TRAP = BLOCKS.register("diamond_trap",() -> new DiamondTrap(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.DIAMOND));
    public static final RegistryObject<Item> DIAMOND_TRAP_ITEM = fromBlock(DIAMOND_TRAP);
    public static final RegistryObject<Block> WITHER_TRAP = BLOCKS.register("wither_trap",() -> new WitherTrap(Block.Properties.copy(Blocks.IRON_BLOCK), TrapType.WITHER));
    public static final RegistryObject<Item> WITHER_TRAP_ITEM = fromBlock(WITHER_TRAP);
    //Other Items
    public static final RegistryObject<Item> ENDER_BAG = ITEMS.register("ender_bag", () -> new EnderBag (new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> BITO_EGG = ITEMS.register("bun_in_the_oven", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet", () -> new Magnet(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    //Poking Stick
    public static final RegistryObject<Item> POKING_STICK = ITEMS.register("poking_stick", () -> new PS_Wood(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> STONE_POKING_STICK = ITEMS.register("stone_poking_stick", () -> new PS_Stone(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> IRON_POKING_STICK = ITEMS.register("iron_poking_stick", () -> new PS_Iron(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_POKING_STICK = ITEMS.register("gold_poking_stick", () -> new PS_Gold(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_POKING_STICK = ITEMS.register("diamond_poking_stick", () -> new PS_Diamond(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_POKING_STICK = ITEMS.register("netherite_poking_stick", () -> new PS_Netherite(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1).fireResistant()));
    //Bowls
    public static final RegistryObject<Item> BUNDLE_LEAVES = ITEMS.register("bundle_of_leaves", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LEAF_ROPE = ITEMS.register("leaf_hemp_rope", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BOWL_OF_WATER = ITEMS.register("bowl_of_water", () -> new WaterBowl (new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> STONE_LINED_BOWL = ITEMS.register("stone_lined_bowl", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BOWL_OF_RAW_LAVA = ITEMS.register("bowl_of_raw_lava", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    public static final RegistryObject<Item> BOWL_OF_LAVA = ITEMS.register("bowl_of_lava", () -> new LavaBowl (new Item.Properties().tab(ModSetup.ITEM_GROUP).stacksTo(1)));
    //Shears
    public static final RegistryObject<Item> WOODEN_SHEAR = ITEMS.register("wooden_shears", () -> new WoodenShears(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GOLDEN_SHEAR = ITEMS.register("golden_shears", () -> new GoldenShears(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> DIAMOND_SHEAR = ITEMS.register("diamond_shears", () -> new DiamondShears(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHERITE_SHEAR = ITEMS.register("netherite_shears", () -> new NetheriteShears(new Item.Properties().tab(ModSetup.ITEM_GROUP).fireResistant()));
    //Armour
    public static final RegistryObject<ArmorItem> CL_HELMET = ITEMS.register("clear_leather_helmet",() -> new ArmorItem(ArmorMaterials.LC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> CC_HELMET = ITEMS.register("clear_chain_helmet",() -> new ArmorItem(ArmorMaterials.CC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> CI_HELMET = ITEMS.register("clear_iron_helmet",() -> new ArmorItem(ArmorMaterials.IC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> CG_HELMET = ITEMS.register("clear_golden_helmet",() -> new ArmorItem(ArmorMaterials.GC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> CD_HELMET = ITEMS.register("clear_diamond_helmet",() -> new ArmorItem(ArmorMaterials.DC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> CN_HELMET = ITEMS.register("clear_netherite_helmet",() -> new ArmorItem(ArmorMaterials.NC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP).fireResistant()));
    public static final RegistryObject<ArmorItem> CT_HELMET = ITEMS.register("clear_turtle_helmet",() -> new CustomArmorTC(ArmorMaterials.TC, EquipmentSlot.HEAD, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    //Dust
    public static final RegistryObject<Item> STONE_DUST = ITEMS.register("stone_dust", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> SAND_DUST = ITEMS.register("sand_dust", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> DIRT_DUST = ITEMS.register("dirt_dust", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GRAVEL_DUST = ITEMS.register("gravel_dust", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> CLAY_DUST = ITEMS.register("clay_dust", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> WOODEN_NUGGET = ITEMS.register("wooden_nugget", () -> new Item(ITEM_PROPERTIES));
    //Nuggets
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", () -> new CoalNugget(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_NUGGET = ITEMS.register("redstone_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> GLOWSTONE_NUGGET = ITEMS.register("glowstone_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> QUARTZ_NUGGET = ITEMS.register("quartz_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LAPIS_NUGGET = ITEMS.register("lapis_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP).fireResistant()));
    //Elements Nuggets
    public static final RegistryObject<Item> ICE_NUGGET = ITEMS.register("ice_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> FIRE_NUGGET = ITEMS.register("fire_nugget", () -> new Item(ITEM_PROPERTIES));
    //Metal Nuggets
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", () -> new Item(ITEM_PROPERTIES));
    //Metal Ingots
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", () -> new Item(ITEM_PROPERTIES));

    //Base Berries
    public static final RegistryObject<Item> STONE_BERRY = ITEMS.register("stone_berry", () -> new BlockItem(Registration.STONE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GRAVEL_BERRY = ITEMS.register("gravel_berry", () -> new BlockItem(Registration.GRAVEL_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> SAND_BERRY = ITEMS.register("sand_berry", () -> new BlockItem(Registration.SAND_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> DIRT_BERRY = ITEMS.register("dirt_berry", () -> new BlockItem(Registration.DIRT_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> CLAY_BERRY = ITEMS.register("clay_berry", () -> new BlockItem(Registration.CLAY_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> WOODEN_BERRY = ITEMS.register("wooden_berry", () -> new BlockItem(Registration.WOODEN_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    //Ore Berries
    public static final RegistryObject<Item> XP_BERRY = ITEMS.register("xp_berry", () -> new BlockItem(Registration.XP_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> IRON_BERRY = ITEMS.register("iron_berry", () -> new BlockItem(Registration.IRON_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> COPPER_BERRY = ITEMS.register("copper_berry", () -> new BlockItem(Registration.COPPER_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GOLD_BERRY = ITEMS.register("gold_berry", () -> new BlockItem(Registration.GOLD_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> COAL_BERRY = ITEMS.register("coal_berry", () -> new BlockItem(Registration.COAL_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> REDSTONE_BERRY = ITEMS.register("redstone_berry", () -> new BlockItem(Registration.REDSTONE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> GLOWSTONE_BERRY = ITEMS.register("glowstone_berry", () -> new BlockItem(Registration.GLOWSTONE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> QUARTZ_BERRY = ITEMS.register("quartz_berry", () -> new BlockItem(Registration.QUARTZ_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> DIAMOND_BERRY = ITEMS.register("diamond_berry", () -> new BlockItem(Registration.DIAMOND_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> EMERALD_BERRY = ITEMS.register("emerald_berry", () -> new BlockItem(Registration.EMERALD_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> LAPIS_BERRY = ITEMS.register("lapis_berry", () -> new BlockItem(Registration.LAPIS_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> NETHERITE_BERRY = ITEMS.register("netherite_berry", () -> new BlockItem(Registration.NETHERITE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP).fireResistant()));
    //Elements Berries
    public static final RegistryObject<Item> ICE_BERRY = ITEMS.register("ice_berry", () -> new BlockItem(Registration.ICE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> FIRE_BERRY = ITEMS.register("fire_berry", () -> new BlockItem(Registration.FIRE_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    //Metal Berries
    public static final RegistryObject<Item> NICKEL_BERRY = ITEMS.register("nickel_berry", () -> new BlockItem(Registration.NICKEL_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> SILVER_BERRY = ITEMS.register("silver_berry", () -> new BlockItem(Registration.SILVER_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> URANIUM_BERRY = ITEMS.register("uranium_berry", () -> new BlockItem(Registration.URANIUM_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> LEAD_BERRY = ITEMS.register("lead_berry", () -> new BlockItem(Registration.LEAD_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> ALUMINUM_BERRY = ITEMS.register("aluminum_berry", () -> new BlockItem(Registration.ALUMINUM_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> TIN_BERRY = ITEMS.register("tin_berry", () -> new BlockItem(Registration.TIN_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> OSMIUM_BERRY = ITEMS.register("osmium_berry", () -> new BlockItem(Registration.OSMIUM_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> BISMUTH_BERRY = ITEMS.register("bismuth_berry", () -> new BlockItem(Registration.BISMUTH_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> ZINC_BERRY = ITEMS.register("zinc_berry", () -> new BlockItem(Registration.ZINC_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> PLATINUM_BERRY = ITEMS.register("platinum_berry", () -> new BlockItem(Registration.PLATINUM_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> IRIDIUM_BERRY = ITEMS.register("iridium_berry", () -> new BlockItem(Registration.IRIDIUM_BERRY_BUSH.get(), new Item.Properties().tab(ModSetup.ITEM_GROUP)));

    //Base Berries Blocks
    public static final RegistryObject<Block> STONE_BERRY_BUSH = NO_ITEM_BLOCK.register("stone_berry_bush",() -> new StoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> GRAVEL_BERRY_BUSH = NO_ITEM_BLOCK.register("gravel_berry_bush",() -> new GravelBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> SAND_BERRY_BUSH = NO_ITEM_BLOCK.register("sand_berry_bush",() -> new SandBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> DIRT_BERRY_BUSH = NO_ITEM_BLOCK.register("dirt_berry_bush",() -> new DirtBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> CLAY_BERRY_BUSH = NO_ITEM_BLOCK.register("clay_berry_bush",() -> new ClayBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> WOODEN_BERRY_BUSH = NO_ITEM_BLOCK.register("wooden_berry_bush",() -> new WoodenBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    //Ore Berries Block
    public static final RegistryObject<Block> XP_BERRY_BUSH = NO_ITEM_BLOCK.register("xp_berry_bush",() -> new ExperienceBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> IRON_BERRY_BUSH = NO_ITEM_BLOCK.register("iron_berry_bush",() -> new IronBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> COPPER_BERRY_BUSH = NO_ITEM_BLOCK.register("copper_berry_bush",() -> new CopperBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> GOLD_BERRY_BUSH = NO_ITEM_BLOCK.register("gold_berry_bush",() -> new GoldBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> COAL_BERRY_BUSH = NO_ITEM_BLOCK.register("coal_berry_bush",() -> new CoalBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> REDSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("redstone_berry_bush",() -> new RedstoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> GLOWSTONE_BERRY_BUSH = NO_ITEM_BLOCK.register("glowstone_berry_bush",() -> new GlowstoneBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> QUARTZ_BERRY_BUSH = NO_ITEM_BLOCK.register("quartz_berry_bush",() -> new QuartzBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> DIAMOND_BERRY_BUSH = NO_ITEM_BLOCK.register("diamond_berry_bush",() -> new DiamondBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> EMERALD_BERRY_BUSH = NO_ITEM_BLOCK.register("emerald_berry_bush",() -> new EmeraldBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> LAPIS_BERRY_BUSH = NO_ITEM_BLOCK.register("lapis_berry_bush",() -> new LapisBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> NETHERITE_BERRY_BUSH = NO_ITEM_BLOCK.register("netherite_berry_bush",() -> new NetheriteBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    //Elements Berries Block
    public static final RegistryObject<Block> ICE_BERRY_BUSH = NO_ITEM_BLOCK.register("ice_berry_bush",() -> new IceBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> FIRE_BERRY_BUSH = NO_ITEM_BLOCK.register("fire_berry_bush",() -> new FireBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    //Metal Berries Block
    public static final RegistryObject<Block> NICKEL_BERRY_BUSH = NO_ITEM_BLOCK.register("nickel_berry_bush",() -> new NickelBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> SILVER_BERRY_BUSH = NO_ITEM_BLOCK.register("silver_berry_bush",() -> new SilverBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> URANIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("uranium_berry_bush",() -> new UraniumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> LEAD_BERRY_BUSH = NO_ITEM_BLOCK.register("lead_berry_bush",() -> new LeadBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> ALUMINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("aluminum_berry_bush",() -> new AluminumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> TIN_BERRY_BUSH = NO_ITEM_BLOCK.register("tin_berry_bush",() -> new TinBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> OSMIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("osmium_berry_bush",() -> new OsmiumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> BISMUTH_BERRY_BUSH = NO_ITEM_BLOCK.register("bismuth_berry_bush",() -> new BismuthBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> ZINC_BERRY_BUSH = NO_ITEM_BLOCK.register("zinc_berry_bush",() -> new ZincBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> PLATINUM_BERRY_BUSH = NO_ITEM_BLOCK.register("platinum_berry_bush",() -> new PlatinumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));
    public static final RegistryObject<Block> IRIDIUM_BERRY_BUSH = NO_ITEM_BLOCK.register("iridium_berry_bush",() -> new IridiumBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).randomTicks()));

    //Tags
    //Dusts
    public static final Tags.IOptionalNamedTag<Item> TAGS_STONE_DUST= ItemTags.createOptional(new ResourceLocation("forge", "dusts/stone"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_SAND_DUST= ItemTags.createOptional(new ResourceLocation("forge", "dusts/sand"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_DIRT_DUST= ItemTags.createOptional(new ResourceLocation("forge", "dusts/dirt"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_GRAVEL_DUST= ItemTags.createOptional(new ResourceLocation("forge", "dusts/gravel"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_CLAY_DUST= ItemTags.createOptional(new ResourceLocation("forge", "dusts/clay"));
    //Nuggets
    public static final Tags.IOptionalNamedTag<Item> TAGS_ALUMINUM_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/aluminum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_BISMUTH_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/bismuth"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_COAL_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/coal"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_COPPER_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/copper"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_DIAMOND_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/diamond"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_EMERALD_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/emerald"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_FIRE_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/fire"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_GLOWSTONE_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/glowstone"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_ICE_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/ice"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_IRIDIUM_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/iridium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_LAPIS_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/lapis"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_LEAD_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/lead"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_NETHERITE_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/netherite"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_NICKEL_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/nickel"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_OSMIUM_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/osmium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_PLATINUM_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/platinum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_QUARTZ_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/quartz"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_REDSTONE_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/redstone"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_SILVER_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/silver"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_TIN_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/tin"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_URANIUM_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/uranium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_WOODEN_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/wooden"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_ZINC_NUGGET = ItemTags.createOptional(new ResourceLocation("forge", "nuggets/zinc"));
    //Ingots
    public static final Tags.IOptionalNamedTag<Item> TAGS_ALUMINUM_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/aluminum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_BISMUTH_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/bismuth"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_IRIDIUM_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/iridium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_LEAD_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/lead"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_NICKEL_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/nickel"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_OSMIUM_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/osmium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_PLATINUM_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/platinum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_SILVER_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/silver"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_TIN_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/tin"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_URANIUM_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/uranium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_ZINC_INGOT = ItemTags.createOptional(new ResourceLocation("forge", "ingots/zinc"));
    //Storage_Blocks (Item Tags)
    public static final Tags.IOptionalNamedTag<Item> TAGS_ALUMINUM_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/aluminum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_BISMUTH_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/bismuth"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_IRIDIUM_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/iridium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_LEAD_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/lead"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_NICKEL_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/nickel"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_OSMIUM_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/osmium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_PLATINUM_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/platinum"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_SILVER_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/silver"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_TIN_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/tin"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_URANIUM_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/uranium"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_ZINC_BLOCK_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "storage_blocks/zinc"));
    //Storage_Blocks (Block Tags)
    public static final Tags.IOptionalNamedTag<Block> TAGS_ALUMINUM_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/aluminum"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_BISMUTH_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/bismuth"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_IRIDIUM_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/iridium"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_LEAD_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/lead"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_NICKEL_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/nickel"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_OSMIUM_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/osmium"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_PLATINUM_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/platinum"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_SILVER_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/silver"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_TIN_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/tin"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_URANIUM_BLOCK= BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/uranium"));
    public static final Tags.IOptionalNamedTag<Block> TAGS_ZINC_BLOCK = BlockTags.createOptional(new ResourceLocation("forge", "storage_blocks/zinc"));
    //Pickaxes Tags
    public static final Tags.IOptionalNamedTag<Item> TAG_WOODEN_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/wooden_pickaxe"));
    public static final Tags.IOptionalNamedTag<Item> TAG_STONE_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/stone_pickaxe"));
    public static final Tags.IOptionalNamedTag<Item> TAG_IRON_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/iron_pickaxe"));
    public static final Tags.IOptionalNamedTag<Item> TAG_GOLDEN_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/golden_pickaxe"));
    public static final Tags.IOptionalNamedTag<Item> TAG_DIAMOND_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/diamond_pickaxe"));
    public static final Tags.IOptionalNamedTag<Item> TAG_NETHERITE_PICKAXE = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "pickaxe/netherite_pickaxe"));
    //Hammers Tags
    public static final Tags.IOptionalNamedTag<Item> TAG_STONE_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/stone_hammer"));
    public static final Tags.IOptionalNamedTag<Item> TAG_IRON_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/iron_hammer"));
    public static final Tags.IOptionalNamedTag<Item> TAG_GOLDEN_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/golden_hammer"));
    public static final Tags.IOptionalNamedTag<Item> TAG_DIAMOND_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/diamond_hammer"));
    public static final Tags.IOptionalNamedTag<Item> TAG_EMERALD_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/emerald_hammer"));
    public static final Tags.IOptionalNamedTag<Item> TAG_NETHERITE_HAMMER = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "hammer/netherite_hammer"));
    //Other Tags
    public static final Tags.IOptionalNamedTag<Item> TAG_POKING_STICK = ItemTags.createOptional(new ResourceLocation(NNOW.MODID, "poking_stick"));
    public static final Tags.IOptionalNamedTag<Item> WITHER_IMMUNE_ITEM = ItemTags.createOptional(new ResourceLocation("minecraft", "items/wither_immune"));
    public static final Tags.IOptionalNamedTag<Block> WITHER_IMMUNE_BLOCK = BlockTags.createOptional(new ResourceLocation("minecraft", "blocks/wither_immune"));
    public static final Tags.IOptionalNamedTag<Item> TAGS_SUPER_OBSIDIAN_ITEM = ItemTags.createOptional(new ResourceLocation("forge", "nnow/super_obsidian"));

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}