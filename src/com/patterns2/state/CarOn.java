package com.patterns2.state;

/**
 * Created by Саша on 25.05.2015.
 */
class CarOn extends CarState {
    public void openWindow() {
        System.out.println("The window is being opened ...");
    }
    public void openDoor() {
        System.out.println("The door is being opened ...");
    }
}

