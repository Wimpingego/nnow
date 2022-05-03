package com.github.wimpingego.nnow;

import com.github.wimpingego.nnow.setup.ClientSetup;
import com.github.wimpingego.nnow.setup.ModSetup;
import com.github.wimpingego.nnow.setup.Registration;
import com.github.wimpingego.nnow.setup.Configs;
import com.github.wimpingego.nnow.util.WitherEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(NNOW.MODID)
public class NNOW {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "nnow";

    public NNOW() {

        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register 'ModSetup::init' to be called at mod setup time (server and client)
        modbus.addListener(ModSetup::init);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configs.ALL);
        Configs.load(Configs.ALL, FMLPaths.CONFIGDIR.get().resolve("nnow-common.toml"));

        MinecraftForge.EVENT_BUS.register(this);
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        forgeEventBus.addListener(WitherEvents::onWitherExplosion);
        forgeEventBus.addListener(WitherEvents::onExplosion);

        // Register 'ClientSetup::init' to be called at mod setup time (client only)
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}

