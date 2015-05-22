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
// * Leaf
// */
//public class Symbol extends TextPart {
//    private char value;
//
//    public Symbol(char value) {
//        this.value = value;
//    }
//
//    @Override
//    public String getValue() {
//        return String.valueOf(value);
//    }
//
//    @Override
//    public void append(TextPart... textPart) {
//        throw new UnsupportedOperationException();
//    }
//}
