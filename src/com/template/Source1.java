package com.template;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by alexandr on 19.05.15.
 * ***************************************************************************************************
 * http://developer.alexanderklimov.ru/android/java/generic.php
 * http://kharkovitcourses.blogspot.com/2012/08/module-java-io.html
 * http://www.k-press.ru/cs/2004/3/Generics/Generics.asp
 ** http://www.sprava.net/sites/default/files/9_Collections&Generics.pdf
 * (Generic-и и исключения) http://study.kvazar-micro.zp.ua/tutorials/Generics_in_Java_5/generics_in_java.html
 * http://www.kgeorgiy.info/courses/java-intro/slides/generics.xhtml#%2827%29
 ** http://habrahabr.ru/post/196806/
 ** (Шпаргалка по шаблонам проектирования) http://habrahabr.ru/post/210288/
 */
public class Source1 {

    public static void main(String[] args) {
        System.out.println(X.Y.Z); // life is pain ... потому-что статическая переменная-поле ИМЯ которого будет затирать название класса

        System.out.println(getData(125));
        System.out.println(getData("Sasha"));
        System.out.println(getData(125.333));

        printData(new Integer[]{1, 2, 3});
        printData(new String[]{"Sasha", "Masha", "Dasha"});


//        System.out.println( Source1.<String>foo() );
        System.out.println( Source1.<Integer>foo() );
    }

    // здесь я указываю какой тип я передаю "<T>" и где я буду его использовать.
    public static <T> T getData(T a) {
        return a;
    }

    public static <T> T[] getData(T[] a) { //public static <T> T[] getData(T... a) {
        return a;
    }
    public static <T, U> void printData(T[] as) {
        for(T a : as) System.out.print(a + " ");
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }



    // Вот еще один пример generic-метода, использующего групповые символы для сортировки списка по возрастанию. По существу, все элементы списка должны реализовать интерфейс Comparable.
    public static <T extends Comparable<? super T>> void sort(List<T> list)
    {
        Object a[] = list.toArray();
        Arrays.sort(a);
        ListIterator<T> i = list.listIterator();
        for(int j=0; j<a.length; j++)
        {
//            i.index();
            i.set((T)a[j]);
        }
    }

    class ReturnGenericType<T> {
        private Object obj;
        public ReturnGenericType(T x) { obj = x; }
        public T get() { return (T) obj; }
    }





    public static class X { // это объявление статического класса (который можно вызывать через точку)
        public static class Y { // это объявление внутреннего статического класса (который тоже можно вызывать через точку)
            public static String Z = "life is good"; // это объявление статической переенной-поле (которую можно вызывать через точку)
        }

        public static C Y; // по сути классы -это есть объекты-типоы данных, поэтому сначала объявляются классы. И потом мы обяъвляем статическую переменную-поле ИМЯ которого будет затирать название класса
    }

    public static class C { // это объявление статического класса (который можно вызывать через точку)
        public static String Z = "life is pain";
    }



    // При вызове этого метода мы ему передаем тип "String", но потом программы пытается привести типы "String" и "Integer" - вылетает ексепшен приведения типов
    public static <T> T foo() {
        try {
            return (T) new Integer(42);
//            return (T) new String("42");
        } catch (ClassCastException e) {
            return (T) "habr";
        }
    }

}
