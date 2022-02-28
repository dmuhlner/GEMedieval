package com.GoldenEclipse.gemed.client;

import com.GoldenEclipse.init.Registration;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //register container client ide and couple to specific screen
            MenuScreens.register(Registration.SMITHING_ANVIL_CONTAINER.get(), SmithingAnvilScreen::new);           // Attach our container to the screen
            ItemBlockRenderTypes.setRenderLayer(Registration.SMITHING_ANVIL.get(), RenderType.translucent()); // Set the render type for our power generator to translucent
        });
    }
}