package net.euruseve.fordarling.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DARLING_TAB = new CreativeModeTab("darlingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARLING_INGOT.get());
        }
    };
}
