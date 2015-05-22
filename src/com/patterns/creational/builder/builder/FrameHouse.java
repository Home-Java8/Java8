package com.patterns.creational.builder.builder;

/**
 * Created by Саша on 13.07.2014.
 */
public class FrameHouse {

    private StringBuilder parts = new StringBuilder();

    public void setPart(String part) {
        parts.append(part);
    }

    public String getParts() {
        return parts.toString();
    }
}
