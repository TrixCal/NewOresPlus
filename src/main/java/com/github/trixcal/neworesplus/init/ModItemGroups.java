package com.github.trixcal.neworesplus.init;

import com.github.trixcal.neworesplus.NewOresPlus;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import java.util.function.Supplier;

public class ModItemGroups {
    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(NewOresPlus.MODID, () -> new ItemStack(ModItems.ALUMINUM_INGOT));
}
