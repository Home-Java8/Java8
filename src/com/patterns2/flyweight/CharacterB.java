package com.patterns2.flyweight;

/* Файл CharacterB.java
 *
 * */

public class CharacterB extends EnglishCharacter {

    public CharacterB(){
        symbol = 'B';
        width = 20;
        height = 30;
    }

    @Override
    public void printCharacter() {
        System.out.println("Simbol = " + symbol + " Width = " + width + " Height = " + height);
    }

}
