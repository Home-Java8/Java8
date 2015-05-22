package com.patterns.creational.builder.director;

import com.patterns.creational.builder.builder.FrameHouse;
import com.patterns.creational.builder.builder.FrameHouseBuilder;
import com.patterns.creational.builder.builder.OfficeBuilding;
import com.patterns.creational.builder.builder.OfficeBuildingBuilder;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 13/07/2014
 * {@link http://sh2533.blogspot.com/2011/08/builder.html}
 * {@link http://jdevnotes.blogspot.com/2010/10/builder.html}
 *
 * {@link http://www.youtube.com/playlist?list=PL67C644F846BB4DED}
 * {@link http://www.youtube.com/watch?v=TXoc2M8jUJo&list=PL67C644F846BB4DED&index=8}
 ********************************************************************
 * Паттерн Builder (Строитель).
 * ----------------------------
 * Распорядитель. Собирает различные виды зданий
 */
public class Director {
    public static FrameHouse getFrameHouse() {
        FrameHouseBuilder fhb = new FrameHouseBuilder();
        fhb.buildFundament();
        fhb.buildFloor();
        fhb.buildRoof();
        return fhb.getBuilding();
    }

    public static OfficeBuilding getOfficeBuilding() {
        OfficeBuildingBuilder fhb = new OfficeBuildingBuilder();
        fhb.buildBasement();
        fhb.buildFundament();
        for (int i=0; i < 5; i++) {
            fhb.buildFloor();
        }
        fhb.buildRoof();
        return fhb.getBuilding();
    }
}
