package net.euruseve.fordarling.item;

import net.euruseve.fordarling.ForDarlingMod;
import net.euruseve.fordarling.item.custom.DrowsingRodItem;
import net.euruseve.fordarling.item.custom.PaxelItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> DARLING_TURNIP = ITEMS.register("darling_turnip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB).food(ModFoods.TURNIP)));

    public static final RegistryObject<Item> DARLING_SWORD = ITEMS.register("darling_sword",
            () -> new SwordItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));
    public static final RegistryObject<Item> DARLING_PICKAXE = ITEMS.register("darling_pickaxe",
            () -> new PickaxeItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));
    public static final RegistryObject<Item> DARLING_SHOVEL = ITEMS.register("darling_shovel",
            () -> new ShovelItem(ModTiers.COBALT, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));
    public static final RegistryObject<Item> DARLING_AXE = ITEMS.register("darling_axe",
            () -> new AxeItem(ModTiers.COBALT, 4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));
    public static final RegistryObject<Item> DARLING_HOE = ITEMS.register("darling_hoe",
            () -> new HoeItem(ModTiers.COBALT, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_PAXEL = ITEMS.register("darling_paxel",
            () -> new PaxelItem(ModTiers.COBALT, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_HELMET = ITEMS.register("darling_helmet",
            () -> new ArmorItem(ModArmorMaterials.DARLING, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_CHESTPLATE = ITEMS.register("darling_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DARLING, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_LEGGINGS = ITEMS.register("darling_leggings",
            () -> new ArmorItem(ModArmorMaterials.DARLING, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static final RegistryObject<Item> DARLING_BOOTS = ITEMS.register("darling_boots",
            () -> new ArmorItem(ModArmorMaterials.DARLING, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.DARLING_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
