package net.euruseve.fordarling.block;

import net.euruseve.fordarling.ForDarlingMod;
import net.euruseve.fordarling.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ForDarlingMod.MOD_ID);


    public static final RegistryObject<Block> DARLING_BLOCK = registerBlock("darling_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> RAW_DARLING_BLOCK = registerBlock("raw_darling_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);


    public static final RegistryObject<Block> DARLING_ORE = registerBlock("darling_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> DEEPSLATE_DARLING_ORE = registerBlock("deepslate_darling_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);





    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
