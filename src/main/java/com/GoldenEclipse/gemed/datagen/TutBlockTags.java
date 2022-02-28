package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider
{

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GEMedieval.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.STEEL_BLOCK.get())
                .add(Registration.SMITHING_ANVIL.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get())
            ;
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.STEEL_BLOCK.get())
                .add(Registration.SMITHING_ANVIL.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get())
            ;
        tag(Tags.Blocks.ORES)
//                .add(Registration.MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(Registration.MYSTERIOUS_ORE_NETHER.get())
//                .add(Registration.MYSTERIOUS_ORE_END.get())
//                .add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get())
            ;

        tag(Registration.STEEL_BLOCK)
                .add(BlockInit.STEEL_BLOCK.get())

            ;

        tag(BlockTags.ANVIL).add(Registration.SMITHING_ANVIL.get());



//        tag(Registration.STEEL_INGOT)
//                .add(ItemInit.STEEL_INGOT.get())
//            ;
    }

    @Override
    public String getName() {
        return "GE Medieval Tags";
    }
}
