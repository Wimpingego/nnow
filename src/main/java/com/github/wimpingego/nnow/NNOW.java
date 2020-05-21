package com.github.wimpingego.nnow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.wimpingego.nnow.container.ModContainerTypes;
import com.github.wimpingego.nnow.entities.ModTileEntityTypes;
import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ClientRenderer;
import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.villagers.PointOfInterestTypes;
import com.github.wimpingego.nnow.villagers.VillagerUtil;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.config.ModConfig;

@Mod("nnow")
@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
public class NNOW
{	
	public static NNOW instance;
	public static final String MOD_ID = "nnow";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final ItemGroup NNOW_TAB = new ItemGroup("NNOWTab") {
		public ItemStack createIcon() {
			return new ItemStack(ItemList.MAGNET.get());
		}
	};

	public NNOW()
	{
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientSetup);
		
		ItemList.ITEMS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.NO_ITEM_BLOCK.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
		ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
        
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.COMMON_CONFIG);
        ModConfigs.load(ModConfigs.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("nnow-common.toml"));
	}
	
	@SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(NNOW_TAB);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});		
	}

	private void setup(final FMLCommonSetupEvent event)
	{	
		VillagerUtil.fixPOITypeBlockStates(PointOfInterestTypes.OLD_DERPY);
		VillagerUtil.fixPOITypeBlockStates(PointOfInterestTypes.BANKER);
		VillagerUtil.fixPOITypeBlockStates(PointOfInterestTypes.BEEKEEPER);
		VillagerUtil.fixPOITypeBlockStates(PointOfInterestTypes.MONSTER_TRAPPER);
		VillagerUtil.fixPOITypeBlockStates(PointOfInterestTypes.END_TRADER);
	}
		
	private void clientSetup(final FMLClientSetupEvent event)
	{
		ClientRenderer.registerBlocks();
	}	
	
}
