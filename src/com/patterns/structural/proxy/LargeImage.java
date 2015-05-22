package com.patterns.structural.proxy;

/**
 * Created by Саша on 13.07.2014.
 */
public class LargeImage implements Image {
    @Override
    public String get(String imgName) {
        System.out.println("some expensive operation for loading image");
        return String.format("image with name \"%s\"", imgName);
    }
}