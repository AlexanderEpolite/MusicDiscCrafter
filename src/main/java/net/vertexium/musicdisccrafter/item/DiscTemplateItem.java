
package net.vertexium.musicdisccrafter.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiscTemplateItem extends Item {
	public DiscTemplateItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
