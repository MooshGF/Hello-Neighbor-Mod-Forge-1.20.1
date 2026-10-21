package com.hellodecorate.client;

import com.hellodecorate.HelloDecorate;
import com.hellodecorate.entity.NeighborEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NeighborRenderer extends MobRenderer<NeighborEntity, HumanoidModel<NeighborEntity>> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(HelloDecorate.MODID, "textures/entity/neighbor.png");

    public NeighborRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new HumanoidModel<>(ctx.bakeLayer(ModelLayers.PLAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(NeighborEntity entity) {
        return TEXTURE;
    }
}
