
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.klonoa9x6.lunatea.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.klonoa9x6.lunatea.LunateaMod;

public class LunateaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LunateaMod.MODID);
	public static final RegistryObject<CreativeModeTab> LUNATEA_GROUP = REGISTRY.register("lunatea_group",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lunatea.lunatea_group")).icon(() -> new ItemStack(LunateaModItems.WIND_RING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LunateaModItems.WIND_RING.get());
				tabData.accept(LunateaModItems.DISC_UNDERTALE.get());
				tabData.accept(LunateaModItems.DISC_MOONSONG.get());
				tabData.accept(LunateaModItems.DISC_NOTE_BLOCK_BATTLE.get());
				tabData.accept(LunateaModItems.DISC_WIND_GARDEN_GALAXY.get());
				tabData.accept(LunateaModItems.DISC_MAGIC_SPEAR_I.get());
				tabData.accept(LunateaModItems.DISC_PRIAMILL_KLONOA_G_1.get());
				tabData.accept(LunateaModItems.RING.get());
			})

					.build());
}
