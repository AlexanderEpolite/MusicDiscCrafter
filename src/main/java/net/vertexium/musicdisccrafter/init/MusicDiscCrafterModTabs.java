
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.vertexium.musicdisccrafter.init;

import net.vertexium.musicdisccrafter.MusicDiscCrafterMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class MusicDiscCrafterModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MusicDiscCrafterMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = REGISTRY.register("creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.music_disc_crafter.creative_tab")).icon(() -> new ItemStack(MusicDiscCrafterModItems.DISC_TEMPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MusicDiscCrafterModItems.DISC_TEMPLATE.get());
			}).build());
}
