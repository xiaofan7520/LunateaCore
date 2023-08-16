
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.klonoa9x6.lunatea.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.klonoa9x6.lunatea.LunateaMod;

public class LunateaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LunateaMod.MODID);
	public static final RegistryObject<SoundEvent> DISC_MOONSONG = REGISTRY.register("disc.moonsong", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lunatea", "disc.moonsong")));
	public static final RegistryObject<SoundEvent> DISC_UNDERTALE = REGISTRY.register("disc.undertale", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lunatea", "disc.undertale")));
}
