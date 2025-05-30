
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.vertexium.musicdisccrafter.init;

import net.vertexium.musicdisccrafter.item.DiscTemplateItem;
import net.vertexium.musicdisccrafter.MusicDiscCrafterMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class MusicDiscCrafterModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MusicDiscCrafterMod.MODID);
	public static final DeferredItem<Item> DISC_TEMPLATE = REGISTRY.register("disc_template", DiscTemplateItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
