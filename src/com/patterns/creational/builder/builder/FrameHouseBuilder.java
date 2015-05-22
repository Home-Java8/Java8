package com.patterns.creational.builder.builder;

/**
 * Created by Саша on 13.07.2014.
 */
public class FrameHouseBuilder extends Builder {
    private FrameHouse fh = new FrameHouse();

    public void buildFundament() {
        fh.setPart("Фундамент. ");
    }

    public void buildFloor() {
        fh.setPart("1 этаж. ");
    }

    public void buildRoof() {
        fh.setPart("Двускатная крыша. ");
    }

    @Override
    public FrameHouse getBuilding() {
        return fh;
    }
}
