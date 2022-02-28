package com.GoldenEclipse.gemed;


import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("gemed")
public class GEMedieval
{
    public static final String MOD_ID = "gemed";

    public static final CreativeModeTab GEMED_TAB = new CreativeModeTab(MOD_ID)
    {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemInit.STEEL_INGOT.get());
        }
    };

    public GEMedieval()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
//
//        ItemInit.ITEMS.register(bus);
//        BlockInit.BLOCKS.register(bus);
        Registration.init(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
