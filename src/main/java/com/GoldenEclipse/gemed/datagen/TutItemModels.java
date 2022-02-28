package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import com.GoldenEclipse.init.ToolInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider
{

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GEMedieval.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        withExistingParent(BlockInit.STEEL_BLOCK.get().getRegistryName().getPath(), modLoc("block/steel_block"));
//        withExistingParent(Registration.SMITHING_ANVIL.get().getRegistryName().getPath(), modLoc("block/smithing_anvil"));

        singleTexture(ItemInit.STEEL_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/steel_ingot"));
        singleTexture(ItemInit.STEEL_NUGGET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/steel_nugget"));
        singleTexture(ToolInit.STEEL_PICKAXE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/steel_pickaxe"));

        withExistingParent(Registration.SMITHING_ANVIL_ITEM.get().getRegistryName().getPath(), modLoc("block/smithing_anvil"));
        withExistingParent(BlockInit.STEEL_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/steel_block"));


//        withExistingParent(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_nether"));
//        withExistingParent(Registration.MYSTERIOUS_ORE_END_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_end"));
//        withExistingParent(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_deepslate"));
    }
}
