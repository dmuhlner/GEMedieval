package com.GoldenEclipse.util;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

public class Lib
{

    public static final Tier STEEL = new Tier()
    {

        @Override
        public int getUses()
        {
            return 700;
        }

        @Override
        public float getSpeed()
        {
            return 7f;
        }

        @Override
        public float getAttackDamageBonus()
        {
            return 3f;
        }

        @Override
        public int getLevel()
        {
            return 3;
        }

        @Override
        public int getEnchantmentValue()
        {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(Tags.Items.INGOTS_IRON);//Ingredient.of(items.steel_ingot);
        }
    };

}
