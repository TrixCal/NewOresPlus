package com.github.trixcal.neworesplus;

import com.github.trixcal.neworesplus.init.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = NewOresPlus.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent()
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "aluminum_ingot")
        );
    }


    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(NewOresPlus.MODID, name));
    }
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
