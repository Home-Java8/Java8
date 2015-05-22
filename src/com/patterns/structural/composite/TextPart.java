//package com.patternsdemo.composite;
//
//import java.util.ArrayList;
//import java.util.List;
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
// * Component
// */
//public abstract class TextPart {
//
//    protected List value = new ArrayList();
//
//    public String getValue() {
//        StringBuilder sb = new StringBuilder();
//        for (TextPart textPart : value) {
//            sb.append(textPart.getValue());
//        }
//        return sb.toString();
//    }
//
//    public void append(TextPart... textPart) {
//        for (TextPart part : textPart) {
//            value.add(part);
//        }
//    }
//}
