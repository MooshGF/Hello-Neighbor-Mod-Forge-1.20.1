package com.hellodecorate;

import com.hellodecorate.client.NeighborRenderer;
import com.hellodecorate.entity.NeighborEntity;
import com.hellodecorate.registry.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = HelloDecorate.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Common {
        @SubscribeEvent
        public static void attributes(EntityAttributeCreationEvent e) {
            e.put(ModEntities.NEIGHBOR.get(), NeighborEntity.createAttributes().build());
        }
    }

    @Mod.EventBusSubscriber(modid = HelloDecorate.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class Client {
        @SubscribeEvent
        public static void renderers(EntityRenderersEvent.RegisterRenderers e) {
            e.registerEntityRenderer(ModEntities.NEIGHBOR.get(), NeighborRenderer::new);
        }
    }
}
