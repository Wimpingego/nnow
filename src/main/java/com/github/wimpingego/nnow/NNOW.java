package com.github.wimpingego.nnow;

import java.util.List;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.wimpingego.nnow.container.ModContainerTypes;
import com.github.wimpingego.nnow.entities.ModTileEntityTypes;
import com.github.wimpingego.nnow.init.BlockList;
import com.github.wimpingego.nnow.init.ItemList;
import com.github.wimpingego.nnow.util.ClientRenderer;
import com.github.wimpingego.nnow.util.ModConfigs;
import com.github.wimpingego.nnow.villagers.GunCusPointOfInterestTypes;
import com.github.wimpingego.nnow.villagers.GunCusUtility;
import com.github.wimpingego.nnow.villagers.GunCusVillagerProfessions;
import com.github.wimpingego.nnow.villagers.RandomTradeBuilder;

import net.minecraft.entity.merchant.villager.VillagerTrades.ITrade;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.fml.config.ModConfig;

@Mod("nnow")
@Mod.EventBusSubscriber(modid = NNOW.MOD_ID, bus = Bus.MOD)
public class NNOW {
	
	public static NNOW instance;
	public static final String MOD_ID = "nnow";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	public NNOW()
	{
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientSetup);
		modEventBus.addListener(this::villagerTrades);
		modEventBus.addListener(this::wandererTrades);
		
		ItemList.ITEMS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.NO_ITEM_BLOCK.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
		ModContainerTypes.CONTAINER_TYPES.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
		
        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ModConfigs.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModConfigs.COMMON_CONFIG);
        
        //ModConfigs.load(ModConfigs.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("nnow-client.toml"));
        ModConfigs.load(ModConfigs.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("nnow-common.toml"));
	}
	    
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(NNOWItemGroup.instance);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});

		LOGGER.debug("Registered BlockItems!");
	}


	private void setup(final FMLCommonSetupEvent event)
	{
		
		GunCusUtility.fixPOITypeBlockStates(GunCusPointOfInterestTypes.ARMS_DEALER);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		ClientRenderer.registerBlocks();
	}	
	
	@SubscribeEvent
	public static void onServerStarting(FMLServerStartingEvent event) {}
	
	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {}
	
    public void villagerTrades(VillagerTradesEvent event)
    {
        if (event.getType() == GunCusVillagerProfessions.ARMS_DEALER)
        {
            event.getTrades().get(1).add((entity, random) -> new MerchantOffer(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.REDSTONE), 8, 10, 0F));
            RandomTradeBuilder.forEachLevel((level, tradeBuild) -> event.getTrades().get(level.intValue()).add(tradeBuild.build()));
        
        }
    }

    public void wandererTrades(WandererTradesEvent event)
    {
        List<ITrade> genericList = event.getGenericTrades();
        RandomTradeBuilder.forEachWanderer((tradeBuild) -> genericList.add(tradeBuild.build()));

        List<ITrade> rareList = event.getGenericTrades();
        RandomTradeBuilder.forEachWandererRare((tradeBuild) -> rareList.add(tradeBuild.build()));
    }
	

	public static class NNOWItemGroup extends ItemGroup {
		public static final ItemGroup instance = new NNOWItemGroup(ItemGroup.GROUPS.length, "nnowtab");

		private NNOWItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemList.MAGNET.get());
		}
	}
}
