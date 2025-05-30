
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.vertexium.musicdisccrafter.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class MusicDiscCrafterModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(Items.EMERALD, 8), new ItemStack(MusicDiscCrafterModItems.DISC_TEMPLATE.get()), 10, 5, 0.05f));
		}
	}
}
