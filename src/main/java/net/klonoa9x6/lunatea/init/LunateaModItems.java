
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.klonoa9x6.lunatea.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.klonoa9x6.lunatea.item.DiscUndertaleItem;
import net.klonoa9x6.lunatea.item.DiscMoonsongItem;
import net.klonoa9x6.lunatea.LunateaMod;

public class LunateaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LunateaMod.MODID);
	public static final RegistryObject<Item> DISC_UNDERTALE = REGISTRY.register("disc_undertale", () -> new DiscUndertaleItem());
	public static final RegistryObject<Item> DISC_MOONSONG = REGISTRY.register("disc_moonsong", () -> new DiscMoonsongItem());
}
