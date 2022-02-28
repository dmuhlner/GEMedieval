package com.GoldenEclipse.init;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.util.Lib;
import com.google.common.base.Supplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolInit
{
    //credit to blusunrize for assisting with this part of development
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, GEMedieval.MOD_ID);

//    //TIERS
//    public static final Tier STEEL = Lib.STEEL; //new ForgeTier(3, 1000, 3.0f, 3.0f, 15, )

    public static final RegistryObject<Item> STEEL_PICKAXE = register("steel_pickaxe", () -> createPickaxe(Lib.STEEL));

    public static PickaxeItem createPickaxe(Tier tier)
    {
        PickaxeItem ret = new PickaxeItem(tier, 1, -2.8f, toolProperties());
        return ret;
    }

    private static Item.Properties toolProperties()
    {
        return new Item.Properties().tab(GEMedieval.GEMED_TAB).stacksTo(1);
    }

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
    {
        return TOOLS.register(name, item);
    }
}
