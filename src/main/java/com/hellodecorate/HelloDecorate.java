package com.hellodecorate;

import com.hellodecorate.registry.ModBlocks;
import com.hellodecorate.registry.ModEntities;
import com.hellodecorate.registry.ModItems;
import com.hellodecorate.registry.ModTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(HelloDecorate.MODID)
public class HelloDecorate {
    public static final String MODID = "hellodecorate";

    public HelloDecorate() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModEntities.ENTITIES.register(bus);
        ModItems.ITEMS.register(bus);
        ModTabs.TABS.register(bus);
    }
}
