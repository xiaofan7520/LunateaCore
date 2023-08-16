
package net.klonoa9x6.lunatea.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscUndertaleItem extends RecordItem {
	public DiscUndertaleItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lunatea:disc.undertale")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 7620);
	}
}
