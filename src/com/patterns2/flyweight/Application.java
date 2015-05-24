package com.patterns2.flyweight;

/**
 ** {@link https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%B8%D1%81%D0%BF%D0%BE%D1%81%D0%BE%D0%B1%D0%BB%D0%B5%D0%BD%D0%B5%D1%86_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)}
 * {@link http://habrahabr.ru/post/88393/}
 * {@link http://codelab.ru/pattern/flyweight/}
 * **************************************
 * Приспособленец (шаблон проектирования)
 */

/* Класс, показывающий работу шаблона проектирования "Приспособленец".
 * Файл Application.java
 *
 * */

public class Application {

    public static void main (String [] args){
        FlyweightFactory factory = new FlyweightFactory();

        int [] characterCodes = {1,2,3};
        for (int nextCode : characterCodes){
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }

}

