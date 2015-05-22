//package com.patternsdemo.composite;
//
///**
// * @author Aleksandr Konstantinovitch
// * @version 1.0
// * @date 13/07/2014
// * {@link http://sh2533.blogspot.com/search/label/шаблоны%20проектирования}
// * {@link http://sh2533.blogspot.com/2012/03/command.html}
// ********************************************************************
// * Паттерн Комманда(Command).
// * ----------------------------
// * Output:
// * Hello
// * Hello world!
// *     Hello world! Hello world!
// */
//public class Client {
//    public static void main(String[] args) {
//        Sentence sentence1  = new Sentence(
//                new Symbol('H'),
//                new Symbol('e'),
//                new Symbol('l'),
//                new Symbol('l'),
//                new Symbol('o')
//        );
//        System.out.println(sentence1.getValue());
//
//        Sentence sentence2  = new Sentence(
//                new Symbol('w'),
//                new Symbol('o'),
//                new Symbol('r'),
//                new Symbol('l'),
//                new Symbol('d'),
//                new Symbol('!')
//        );
//
//        Sentence sentence3 = new Sentence(sentence1, new Symbol(' '), sentence2);
//        System.out.println(sentence3.getValue());
//
//        Paragraph paragraph = new Paragraph(sentence3, new Symbol(' '), sentence3);
//        System.out.println(paragraph.getValue());
//    }
//}