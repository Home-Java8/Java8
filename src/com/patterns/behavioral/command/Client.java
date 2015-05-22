package com.patterns.behavioral.command;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 13/07/2014
 * {@link http://sh2533.blogspot.com/search/label/шаблоны%20проектирования}
 * {@link http://sh2533.blogspot.com/2012/03/command.html}
 ********************************************************************
 * Паттерн Комманда(Command).
 * ----------------------------
 * Output:
 * go
 * step to east
 * step to north
 * step to north
 * step to south
 * go back
 * step to south
 * step to north
 * step to north
 * step to east
 */
public class Client {
    public static void main(String[] args) {
        Navigator navigator =
                new Navigator().registerStep(new GoEastCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoNorthCommand())
                        .registerStep(new GoSouthCommand());
        System.out.println("go");
        navigator.go();
        System.out.println("go back");
        navigator.goBack();
    }
}