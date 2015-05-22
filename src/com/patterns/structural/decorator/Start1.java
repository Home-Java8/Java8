package com.patterns.structural.decorator;

import com.patterns.structural.decorator.decorators.BorderDecorator;
import com.patterns.structural.decorator.decorators.ColorDecorator;
import com.patterns.structural.decorator.objects.Component;
import com.patterns.structural.decorator.objects.TextView;
import com.patterns.structural.decorator.objects.Window;

/**
 * Created by Саша on 09.07.2014.
 */
public class Start1 {

    public static void main(String[] args){
//        Component windowWithBorder = new BorderDecorator(new Window());
        Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorder.draw();

        Component textView = new BorderDecorator(new TextView());
        textView.draw();
    }
}
