package com.patterns2.state;

/**
 * Created by Саша on 25.05.2015.
 */
class CarMoving extends CarState {
    public void openWindow() {
        System.out.println("The window is being opened ...");
    }
    public void openDoor() {
        System.out.println("Can't open the door while moving!");
    }
}

