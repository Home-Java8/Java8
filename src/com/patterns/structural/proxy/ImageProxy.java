package com.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Саша on 13.07.2014.
 */
public class ImageProxy implements Image {

    private Image realImage = new LargeImage();
    private Map loadedImages = new HashMap();

    @Override
    public String get(String imgName) {
        if (loadedImages.get(imgName) != null) {
            return (String)loadedImages.get(imgName);
        } else {
            String image = realImage.get(imgName);
            loadedImages.put(imgName, image);
            return image;
        }
    }
}