package net.spacegateir.dyeableliquids.util.render_handler;

import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;

public class ModFluidRenderHandler {

    public static SimpleFluidRenderHandler coloredLava(int tint, Identifier stillTexture, Identifier flowTexture) {
        // overlay is null here, but you can add your own overlay texture if you want
        return new SimpleFluidRenderHandler(stillTexture, flowTexture, null, tint);
    }
}
