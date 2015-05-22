package com.patterns.creational.builder.technerium;

public class House {
	private int stores;
	public House(){
		stores = 0;
	}
	public void setStores(int newLevel){
		log("setting stores to: " + newLevel);
		stores = newLevel;
	}
	public int getStores(){
		return stores;
	}
	public void buildBase(){
		log("Build base");
	}
	public void buildFloor(){
		log("Build floor");
	}
	public void buildRoof(){
		log("Build roof");
	}
	public void buildWalls(Window window){
		log("Build walls with window: " + window.getWindowType());
	}
	private void log(String msg){
		System.out.println(msg);
	}
}
