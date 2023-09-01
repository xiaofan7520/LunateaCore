
package net.klonoa9x6.lunatea.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class DiscNoteBlockBattleItem extends RecordItem {
	public DiscNoteBlockBattleItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lunatea:disc.note_block_battle")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2620);
	}
}
