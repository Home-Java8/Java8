package com.patterns.structural.decorator.objects;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("draw window");
    }

}
