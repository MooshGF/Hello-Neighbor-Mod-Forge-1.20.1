package com.hellodecorate.registry;

import com.hellodecorate.HelloDecorate;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HelloDecorate.MODID);

    public static final RegistryObject<Item> WARDROBE =
            ITEMS.register("wardrobe", () -> new BlockItem(ModBlocks.WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHNDEMO =
            ITEMS.register("whndemo", () -> new BlockItem(ModBlocks.WHNDEMO.get(), new Item.Properties()));
    public static final RegistryObject<Item> NEIGHBOR_SPAWN_EGG =
            ITEMS.register("neighbor_spawn_egg",
                    () -> new ForgeSpawnEggItem(ModEntities.NEIGHBOR, 0xD9822B, 0x2B4C9B, new Item.Properties()));
}
