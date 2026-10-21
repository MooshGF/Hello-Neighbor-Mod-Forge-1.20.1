package com.hellodecorate.registry;

import com.hellodecorate.HelloDecorate;
import com.hellodecorate.block.DecoBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HelloDecorate.MODID);

    private static BlockBehaviour.Properties wood() {
        return BlockBehaviour.Properties.of().strength(2.0f).sound(SoundType.WOOD).noOcclusion();
    }

    public static final RegistryObject<Block> WARDROBE = BLOCKS.register("wardrobe", () -> new DecoBlock(wood()));
    public static final RegistryObject<Block> WHNDEMO = BLOCKS.register("whndemo", () -> new DecoBlock(wood()));
}
