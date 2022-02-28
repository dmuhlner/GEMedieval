package com.GoldenEclipse.gemed.datagen;

import com.GoldenEclipse.gemed.GEMedieval;
import com.GoldenEclipse.init.BlockInit;
import com.GoldenEclipse.init.Registration;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider
{

    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, GEMedieval.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
          simpleBlock(BlockInit.STEEL_BLOCK.get());


//        simpleBlock(Registration.MYSTERIOUS_ORE_OVERWORLD.get());
//        simpleBlock(Registration.MYSTERIOUS_ORE_NETHER.get());
//        simpleBlock(Registration.MYSTERIOUS_ORE_END.get());
//        simpleBlock(Registration.MYSTERIOUS_ORE_DEEPSLATE.get());
    }

//    private void registerSmithingAnvil() {
//        BlockModelBuilder frame = models().getBuilder("minecraft:block/anvil/main");
//        frame.parent(models().getExistingFile(mcLoc("anvil")));
////
////        floatingCube(frame, 0f, 0f, 0f, 1f, 16f, 1f);
////        floatingCube(frame, 15f, 0f, 0f, 16f, 16f, 1f);
////        floatingCube(frame, 0f, 0f, 15f, 1f, 16f, 16f);
////        floatingCube(frame, 15f, 0f, 15f, 16f, 16f, 16f);
////
////        floatingCube(frame, 1f, 0f, 0f, 15f, 1f, 1f);
////        floatingCube(frame, 1f, 15f, 0f, 15f, 16f, 1f);
////        floatingCube(frame, 1f, 0f, 15f, 15f, 1f, 16f);
////        floatingCube(frame, 1f, 15f, 15f, 15f, 16f, 16f);
////
////        floatingCube(frame, 0f, 0f, 1f, 1f, 1f, 15f);
////        floatingCube(frame, 15f, 0f, 1f, 16f, 1f, 15f);
////        floatingCube(frame, 0f, 15f, 1f, 1f, 16f, 15f);
////        floatingCube(frame, 15f, 15f, 1f, 16f, 16f, 15f);
////
////        floatingCube(frame, 1f, 1f, 1f, 15f, 15f, 15f);
//
//        frame.texture("window", modLoc("block/smithing_anvil_top"));
//        frame.texture("particle", modLoc("block/smithing_anvil_top"));
//
//        createSmithingAnvilModel(Registration.SMITHING_ANVIL.get(), frame);
//    }
//
//    private void floatingCube(BlockModelBuilder builder, float fx, float fy, float fz, float tx, float ty, float tz) {
//        builder.element()
//                .from(fx, fy, fz)
//                .to(tx, ty, tz)
//                .allFaces((direction, faceBuilder) -> faceBuilder.texture("#window"))
//                .end();
//    }
//
//    private void createSmithingAnvilModel(Block block, BlockModelBuilder frame) {
//        BlockModelBuilder singleOff = models().getBuilder("block/smithing_anvil/singleoff")
//                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
//                .texture("single", modLoc("block/smithing_anvil_top"));
//        BlockModelBuilder singleOn = models().getBuilder("block/smithing_anvil/singleon")
//                .element().from(3, 3, 3).to(13, 13, 13).face(Direction.DOWN).texture("#single").end().end()
//                .texture("single", modLoc("block/smithing_anvil_top"));
//
//        MultiPartBlockStateBuilder bld = getMultipartBuilder(block);
//
//        bld.part().modelFile(frame).addModel();
//
//        BlockModelBuilder[] models = new BlockModelBuilder[] { singleOff, singleOn };
//        for (int i = 0 ; i < 2 ; i++) {
//            boolean lit = i == 1;
//            bld.part().modelFile(models[i]).addModel().condition(BlockStateProperties.LIT, lit);
//            bld.part().modelFile(models[i]).rotationX(180).addModel().condition(BlockStateProperties.LIT, lit);
//            bld.part().modelFile(models[i]).rotationX(90).addModel().condition(BlockStateProperties.LIT, lit);
//            bld.part().modelFile(models[i]).rotationX(270).addModel().condition(BlockStateProperties.LIT, lit);
//            bld.part().modelFile(models[i]).rotationY(90).rotationX(90).addModel().condition(BlockStateProperties.LIT, lit);
//            bld.part().modelFile(models[i]).rotationY(270).rotationX(90).addModel().condition(BlockStateProperties.LIT, lit);
//        }
//    }
}

