package com.hellodecorate.registry;

import com.hellodecorate.HelloDecorate;
import com.hellodecorate.entity.NeighborEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HelloDecorate.MODID);

    public static final RegistryObject<EntityType<NeighborEntity>> NEIGHBOR = ENTITIES.register("neighbor",
            () -> EntityType.Builder.of(NeighborEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f)
                    .build("neighbor"));
}
