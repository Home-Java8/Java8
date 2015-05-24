package com.patterns2.state;

/**
 * Created by Саша on 25.05.2015.
 */
class Car {
    private CarState carState;

    public Car() {
        off();
    }
    public void on() {
        carState = new CarOn();
        System.out.println("The car is on!");
    }
    public void off() {
        carState = new CarOff();
        System.out.println("The car is off!");
    }
    public void start() {
        carState = new CarMoving();
        System.out.println("The car is moving!");
    }

    public void openWindow() {
        carState.openWindow();
    }
    public void openDoor() {
        carState.openDoor();
    }
}

