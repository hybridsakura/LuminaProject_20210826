package com.hybridsakura.lumina;

import com.hybridsakura.lumina.builder.LuminaBridgeBuilder;
import com.hybridsakura.lumina.entity.FlexibleParams;
import com.hybridsakura.lumina.entity.MinecraftCoordinate;
import com.hybridsakura.lumina.entity.MinecraftCoordinatePair;
import com.hybridsakura.lumina.function.LuminaEngine;

public class LuminaLauncher {

    public static void main(String[] args) {
        System.out.println("程序开始");
        LuminaEngine luminaEngine = new LuminaEngine();

        //  1
//        MinecraftCoordinate coordinateUnit1 = new MinecraftCoordinate(2600 ,69 ,686);
//        MinecraftCoordinate coordinateUnit2 = new MinecraftCoordinate(2216, 69 ,695);
//        MinecraftCoordinatePair coordinatePair = new MinecraftCoordinatePair(coordinateUnit1, coordinateUnit2);
//
//        LuminaBridgeBuilder luminaBridgeBuilder = new LuminaBridgeBuilder();
//        FlexibleParams flexibleParams_1 = new FlexibleParams();
//        flexibleParams_1.setSequenceName("[lumina-bridge]");
//        flexibleParams_1.setWidth(3);
//
//        luminaEngine.LuminaMasterSequence(coordinatePair, null, flexibleParams_1);


        //  2
//        MinecraftCoordinate coordinate1 = new MinecraftCoordinate(1718, 63, 8);
//
//        FlexibleParams flexibleParams_2 = new FlexibleParams();
//        flexibleParams_2.setSequenceName("[lumina-beacon]");
//        flexibleParams_2.setDirectionCode("AXIS-HOLD-Y");
//
//        luminaEngine.LuminaMasterSequence(null, coordinate1, flexibleParams_2);

        //  3
//        MinecraftCoordinate coordinate2 = new MinecraftCoordinate(-416, 80, -246);
//        MinecraftCoordinate coordinate3 = new MinecraftCoordinate(-489, 50, -234);

//        MinecraftCoordinate coordinate3 = new MinecraftCoordinate(-489, 50, -234);
//        MinecraftCoordinate coordinate2 = new MinecraftCoordinate(1209, 56, 4);
//        MinecraftCoordinate coordinate3 = new MinecraftCoordinate(1309, 56, -2);
//        MinecraftCoordinatePair coordinatePair2 = new MinecraftCoordinatePair(coordinate2, coordinate3);
//        FlexibleParams flexibleParams_3 = new FlexibleParams();
//        flexibleParams_3.setSequenceName("[lumina-tunnel]");
//        luminaEngine.LuminaMasterSequence(coordinatePair2, null, flexibleParams_3);

        //  4
        MinecraftCoordinate coordinate5 = new MinecraftCoordinate(-150, 76, -433);
        FlexibleParams flexibleParams_4 = new FlexibleParams();
        flexibleParams_4.setSequenceName("[lumina-basics]");
        luminaEngine.LuminaMasterSequence(null, coordinate5, flexibleParams_4);

        System.out.println("程序结束");
    }

}
