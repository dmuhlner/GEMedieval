package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import net.minecraft.data.DataGenerator;

public class TutLootTables extends BaseLootTableProvider
{
    public TutLootTables(DataGenerator dataGeneratorIn) {super(dataGeneratorIn);}

    @Override
    protected void addTables()
    {
        lootTables.put(BlockInit.STEEL_BLOCK.get(), createSimpleTable("steel_block", BlockInit.STEEL_BLOCK.get()));
        lootTables.put(Registration.SMITHING_ANVIL.get(), createSimpleTable("smithing_anvil", Registration.SMITHING_ANVIL.get()));

    }
}
