package com.GoldenEclipse.init;

import com.GoldenEclipse.gemed.GEMedieval;
import com.google.common.base.Supplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GEMedieval.MOD_ID);


    //items
    public static final RegistryObject<Item> STEEL_INGOT = register("steel_ingot", () -> new Item(new Item.Properties().tab(GEMedieval.GEMED_TAB)));
    public static final RegistryObject<Item> STEEL_NUGGET = register("steel_nugget", () -> new Item(new Item.Properties().tab(GEMedieval.GEMED_TAB)));




    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
    {
        return ITEMS.register(name, item);
    }
}
