
package net.klonoa9x6.lunatea.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscMoonsongItem extends RecordItem {
	public DiscMoonsongItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lunatea:disc.moonsong")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
