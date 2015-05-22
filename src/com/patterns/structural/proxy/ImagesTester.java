package com.patterns.structural.proxy;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 13/07/2014
 * {@link http://sh2533.blogspot.com/search/label/шаблоны%20проектирования}
 * {@link http://sh2533.blogspot.com/2012/02/proxy.html}
 ********************************************************************
 * Паттерн Прокси(Proxy).
 * ----------------------------
 * Output:
 * some expensive operation for loading image
 * image with name "Flowers.jpg"
 * image with name "Flowers.jpg"
 * image with name "Flowers.jpg"
 * some expensive operation for loading image
 * image with name "Sky.jpg"
 * some expensive operation for loading image
 * image with name "Sky.jpg"
 */
public class ImagesTester {
    public static void main(String[] args) {
        Image image1 = new ImageProxy();
        Image image2 = new LargeImage();
        System.out.println(image1.get("Flowers.jpg"));
        System.out.println(image1.get("Flowers.jpg"));
        System.out.println(image1.get("Flowers.jpg"));

        System.out.println(image2.get("Sky.jpg"));
        System.out.println(image2.get("Sky.jpg"));
    }
}