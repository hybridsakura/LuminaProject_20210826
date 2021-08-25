package com.hybridsakura.lumina.builder;

import com.hybridsakura.lumina.entity.FlexibleParams;
import com.hybridsakura.lumina.entity.MinecraftCoordinate;
import com.hybridsakura.lumina.entity.MinecraftCoordinatePair;
import com.hybridsakura.lumina.helper.LuminaHelper;
import com.hybridsakura.lumina.helper.LuminaUtil;

public class LuminaBeaconBuilder {

    //  Lumina 信标建造者

    LuminaHelper luminaHelper = new LuminaHelper();
    LuminaUtil luminaUtil = new LuminaUtil();

    //  输入一个坐标，按照坐标展开。展开数为
    public void lumina_InitBeaconBuild(MinecraftCoordinatePair coordinatePair, MinecraftCoordinate coordinate, FlexibleParams... params) {

        LuminaBeaconBuilder luminaBeaconBuilder = new LuminaBeaconBuilder();
        luminaBeaconBuilder.beaconDeploy(coordinate);

    }

    private void beaconDeploy(MinecraftCoordinate coordinate) {

        String blockQualifyName = "diamond_block";
        MinecraftCoordinatePair tempCoordinatePair;
        MinecraftCoordinatePair tempPair = new MinecraftCoordinatePair();
        coordinate.setY(coordinate.getY() - 1);
        tempPair.setMinecraftCoordinate2(coordinate);
        luminaUtil.buildOrderGenerator(tempPair, blockQualifyName);
        int stageLevel = 2;
//        MinecraftCoordinate coordinate1;
//        MinecraftCoordinate coordinate2;

        for(int radius = 1; radius < 6; radius ++) {
            tempCoordinatePair = luminaHelper.generatePanelByRadiusAndDirection(coordinate, radius, "AXIS-HOLD-Y");
            tempCoordinatePair.getMinecraftCoordinate1().setY(tempCoordinatePair.getMinecraftCoordinate1().getY() - radius);
            tempCoordinatePair.getMinecraftCoordinate2().setY(tempCoordinatePair.getMinecraftCoordinate2().getY() - radius);
            luminaUtil.buildOrderGenerator(tempCoordinatePair, blockQualifyName);
            stageLevel += 1;
        }
    }


}
