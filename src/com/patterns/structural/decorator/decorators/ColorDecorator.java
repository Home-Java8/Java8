package com.patterns.structural.decorator.decorators;

import com.patterns.structural.decorator.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }

}
