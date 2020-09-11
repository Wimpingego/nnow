package com.github.wimpingego.nnow.init;

import com.github.wimpingego.nnow.NNOW;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,NNOW.MOD_ID);

	//Doom
	public static final RegistryObject<SoundEvent> DOOM_SOUND = SOUNDS.register("item.doom_sound",
			() -> new SoundEvent(new ResourceLocation(NNOW.MOD_ID, "item.doom_sound")));

	public static final Lazy<SoundEvent> DOOM_DISC_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(NNOW.MOD_ID, "item.doom_disc")));
	
	public static final RegistryObject<SoundEvent> DOOM_DISC = SOUNDS.register("item.doom_disc.disc", DOOM_DISC_LAZY);
	
	//Mizzy
	public static final RegistryObject<SoundEvent> MIZZY_SOUND = SOUNDS.register("item.mizzy_sound",
			() -> new SoundEvent(new ResourceLocation(NNOW.MOD_ID, "item.mizzy_sound")));

	public static final Lazy<SoundEvent> MIZZY_DISC_LAZY = Lazy
			.of(() -> new SoundEvent(new ResourceLocation(NNOW.MOD_ID, "item.mizzy_disc")));
	
	public static final RegistryObject<SoundEvent> MIZZY_DISC = SOUNDS.register("item.mizzy_disc.disc", MIZZY_DISC_LAZY);

}