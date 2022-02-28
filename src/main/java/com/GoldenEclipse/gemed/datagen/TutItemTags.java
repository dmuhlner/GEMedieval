package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeItemTagsProvider;

public class TutItemTags extends ItemTagsProvider
{

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper)
    {
        super(generator, blockTags, GEMedieval.MOD_ID, helper);
    }

    @Override
    protected void addTags()
    {
//        tag(Tags.Items.ORES)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_END_ITEM.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(ItemInit.STEEL_INGOT.get());



        tag(Tags.Items.NUGGETS)
                .add(ItemInit.STEEL_NUGGET.get());

        tag(Registration.STEEL_INGOT).add(ItemInit.STEEL_INGOT.get());

    }

    @Override
    public String getName()
    {
        return "GE Medieval Tags";
    }
}
