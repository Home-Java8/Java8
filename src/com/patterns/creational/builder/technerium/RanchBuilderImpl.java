package com.patterns.creational.builder.technerium;

public class RanchBuilderImpl extends Builder{
	public RanchBuilderImpl(){
		house = new House();
	}
	
	@Override
	public House buildHouse() {
		house.buildBase();
		house.buildFloor();
		Window simpleWindow = new SimpleWindow();
		house.buildWalls(simpleWindow);
		house.buildRoof();
		house.setStores(1);
		return house;
	}

}
