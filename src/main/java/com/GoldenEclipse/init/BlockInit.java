package com.GoldenEclipse.init;

import com.GoldenEclipse.gemed.GEMedieval;
import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GEMedieval.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    //blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_GRAY).strength(4.0f).sound(SoundType.ANVIL)
            .requiresCorrectToolForDrops()));


    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = fromBlock(STEEL_BLOCK);


    private static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(GEMedieval.GEMED_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> item)
    {
        return BLOCKS.register(name, item);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item)
    {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
