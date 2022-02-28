package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import com.GoldenEclipse.init.ToolInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class TutLanguageProvider extends LanguageProvider
{

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, GEMedieval.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + GEMedieval.MOD_ID, "GE Medieval Items");
        add(BlockInit.STEEL_BLOCK.get(), "Block of Steel");
        add(Registration.SMITHING_ANVIL.get(), "Smithing Anvil");

        add(ItemInit.STEEL_NUGGET.get(), "Steel Nugget");
        add(ToolInit.STEEL_PICKAXE.get(), "Steel Pickaxe");
        add(ItemInit.STEEL_INGOT.get(), "Steel Ingot");
//        add(Registration.MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
//        add(Registration.MYSTERIOUS_ORE_END.get(), "Mysterious ore");
//        add(Registration.MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");
    }
}
