package com.GoldenEclipse.init;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.gemed.blocks.SmithingAnvilBE;
import com.GoldenEclipse.gemed.blocks.SmithingAnvilBlock;
import com.GoldenEclipse.gemed.blocks.SmithingAnvilContainer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration
{
    public static final Tags.IOptionalNamedTag<Block> STEEL_BLOCK = BlockTags.createOptional(new ResourceLocation(GEMedieval.MOD_ID, "steel_block"));
    public static final Tags.IOptionalNamedTag<Item> STEEL_INGOT = ItemTags.createOptional(new ResourceLocation(GEMedieval.MOD_ID, "steel_ingot"));

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, GEMedieval.MOD_ID);
    private static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, GEMedieval.MOD_ID);



    public static void init(IEventBus bus) {
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        ToolInit.TOOLS.register(bus);
        BLOCK_ENTITIES.register(bus);
        CONTAINERS.register(bus);
    }


    //may not register due to being called in other class
    //after new::, list of all blocks supporting BE type
    public static final RegistryObject<SmithingAnvilBlock> SMITHING_ANVIL = BlockInit.BLOCKS.register("smithing_anvil", SmithingAnvilBlock::new);
    public static final RegistryObject<Item> SMITHING_ANVIL_ITEM = BlockInit.fromBlock(SMITHING_ANVIL);
    public static final RegistryObject<BlockEntityType<SmithingAnvilBE>> SMITHING_ANVILBE = BLOCK_ENTITIES.register("smithing_anvil", () -> BlockEntityType.Builder.of(SmithingAnvilBE::new, SMITHING_ANVIL.get()).build(null));
    public static final RegistryObject<MenuType<SmithingAnvilContainer>> SMITHING_ANVIL_CONTAINER = CONTAINERS.register("smithing_anvil",
            () -> IForgeMenuType.create((windowId, inv, data) -> new SmithingAnvilContainer(windowId, data.readBlockPos(), inv, inv.player)));

}
