package com.patterns.creational.builder.technerium;

public class Director {
	private Builder builder;
	public Director(int level){
		if(level > 1)
			builder = new MultiStoreyBuilderImpl();
		else
			builder = new RanchBuilderImpl();
	}
	
	public House buildHouse(){
		return builder.buildHouse();
	}
}
