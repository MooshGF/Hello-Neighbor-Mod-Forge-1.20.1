package com.hellodecorate.registry;

import com.hellodecorate.HelloDecorate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HelloDecorate.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN = TABS.register("main",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hellodecorate"))
                    .icon(() -> new ItemStack(ModItems.WARDROBE.get()))
                    .displayItems((params, out) -> {
                        out.accept(ModItems.WARDROBE.get());
                        out.accept(ModItems.WHNDEMO.get());
                        out.accept(ModItems.NEIGHBOR_SPAWN_EGG.get());
                    })
                    .build());
}
