package com.patterns.structural.decorator.decorators;

import com.patterns.structural.decorator.objects.Button;
import com.patterns.structural.decorator.objects.Component;
import com.patterns.structural.decorator.objects.TextView;
import com.patterns.structural.decorator.objects.Window;

public class Start {
    
    private static Component window;
    private static Component textView;
    private static Component button;
    
    public static void main(String[] args) {
        
        
        boolean showBorder = true;
        
        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }
        
        
        window.draw();
        textView.draw();
        button.draw();
        
        
    }

}
