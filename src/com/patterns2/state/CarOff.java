package com.patterns2.state;

/**
 * Created by Саша on 25.05.2015.
 */
class CarOff extends CarState {
    public void openWindow() {
        System.out.println("Can't open the window! Switch the car on!");
    }
    public void openDoor() {
        System.out.println("The door is being opened ...");
    }
}

