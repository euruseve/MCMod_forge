package net.euruseve.fordarling.util;

import net.euruseve.fordarling.ForDarlingMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> DOWSING_ROD_VALUABLES =
                tag("dowsing_rod_valuables");
        public static final Tags.IOptionalNamedTag<Block> PAXEL_MINEABLE =
                tag("mineable/paxel");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(ForDarlingMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }


    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> DARLING_INGOTS = forgeTag("ingots/darling");
        public static final Tags.IOptionalNamedTag<Item> DARLING_NUGGETS = forgeTag("nuggets/darling");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(ForDarlingMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
