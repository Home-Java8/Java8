package com.patterns.structural.decorator.decorators;

import com.patterns.structural.decorator.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(" ... add border");
    }

   
}
