package com.patterns.creational.singleton;

/**
 * Created by Саша on 08.07.2014.
 */
public class Start3 {

    public static void main(String[] args) {
        TestSingleton3.getInstance().print();
        TestSingleton3.getInstance().print();
        TestSingleton3.getInstance().print();

        TestSingleton3.getInstance().stop();
    }
}