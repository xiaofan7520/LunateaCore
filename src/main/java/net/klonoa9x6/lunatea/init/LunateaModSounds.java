
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
	public static final RegistryObject<SoundEvent> DISC_NOTE_BLOCK_BATTLE = REGISTRY.register("disc.note_block_battle", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lunatea", "disc.note_block_battle")));
	public static final RegistryObject<SoundEvent> DISC_WIND_GARDEN_GALAXY = REGISTRY.register("disc.wind_garden_galaxy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lunatea", "disc.wind_garden_galaxy")));
	public static final RegistryObject<SoundEvent> DISC_MAGIC_SPEAR_I = REGISTRY.register("disc.magic_spear_i", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lunatea", "disc.magic_spear_i")));
}
