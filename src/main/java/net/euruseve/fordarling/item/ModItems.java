package net.euruseve.fordarling.item;

import net.euruseve.fordarling.ForDarlingMod;
import net.euruseve.fordarling.item.custom.DrowsingRodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForDarlingMod.MOD_ID);


    public static final RegistryObject<Item> DARLING_INGOT = ITEMS.register("darling_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_NUGGET = ITEMS.register("darling_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> RAW_DARLING = ITEMS.register("raw_darling",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

        public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DrowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
