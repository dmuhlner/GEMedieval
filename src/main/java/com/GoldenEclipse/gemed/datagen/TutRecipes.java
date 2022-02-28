package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.ItemInit;
import com.GoldenEclipse.init.Registration;
import com.GoldenEclipse.init.ToolInit;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.event.ColorHandlerEvent;

import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider
{

    public TutRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.IRON_INGOT), ItemInit.STEEL_INGOT.get(), 1.0f, 100)
                .unlockedBy("has_ingot", has(Items.IRON_INGOT))
                .save(consumer, "steel_ingot_smelting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.IRON_NUGGET), ItemInit.STEEL_NUGGET.get(), 1.0f, 12)
                .unlockedBy("has_nugget", has(Items.IRON_NUGGET))
                .save(consumer, "steel_nugget_smelting");


        ShapedRecipeBuilder.shaped(Registration.SMITHING_ANVIL.get())
                .define('I', BlockInit.STEEL_BLOCK.get())
                .define('i', ItemInit.STEEL_INGOT.get())
                .pattern("III").pattern(" i ").pattern("iii")
                .unlockedBy("has_steel_block", has(BlockInit.STEEL_BLOCK.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(BlockInit.STEEL_BLOCK.get())
                .requires(ItemInit.STEEL_INGOT.get(), 9)
                .unlockedBy("has steel ingot", has(ItemInit.STEEL_INGOT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ItemInit.STEEL_INGOT.get())
                .requires(ItemInit.STEEL_NUGGET.get(), 9)
                .unlockedBy("has steel ingot", has(ItemInit.STEEL_INGOT.get()))
                .save(consumer, "steel_ingot_from_nuggets");

        ShapelessRecipeBuilder.shapeless(ItemInit.STEEL_INGOT.get(), 9)
                .requires(BlockInit.STEEL_BLOCK.get())
                .unlockedBy("has steel ingot", has(ItemInit.STEEL_INGOT.get()))
                .save(consumer, "steel_ingot_from_block");

        ShapelessRecipeBuilder.shapeless(ItemInit.STEEL_NUGGET.get(), 9)
                .requires(ItemInit.STEEL_INGOT.get())
                .unlockedBy("has steel ingot", has(ItemInit.STEEL_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ToolInit.STEEL_PICKAXE.get())
                .define('I', ItemInit.STEEL_INGOT.get())
                .define('i', Items.STICK)
                .pattern("III").pattern(" i ").pattern(" i ")
                .unlockedBy("has_steel_ingot", has(ItemInit.STEEL_INGOT.get()))
                .save(consumer);

    }
}
