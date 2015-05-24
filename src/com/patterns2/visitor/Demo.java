package com.patterns2.visitor;

/**
 * Created by Саша on 24.05.2015.
 *
 ** {@link https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D1%81%D0%B5%D1%82%D0%B8%D1%82%D0%B5%D0%BB%D1%8C_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)}
 * **********************************************
 * Посетитель (шаблон проектирования):
 * 1.Добавьте метод accept(Visitor) в иерархию «элемент».
 * 2.Создайте базовый класс Visitor и определите методы visit() для каждого типа элемента.
 * 3.Создайте производные классы Visitor для каждой операции, исполняемой над элементами.
 * 4.Клиент создаёт объект Visitor и передаёт его в вызываемый метод accept().
 *
 * {@link http://habrahabr.ru/post/133183/}
 * {@link http://cpp-reference.ru/patterns/behavioral-patterns/visitor/}
 *
 * {@link http://habrahabr.ru/post/136766/}
 * {@link http://www.itdumka.com.ua/index.php?cmd=shownode&node=11}
 */
public class Demo {
    public static void main ( String [] args ) {
        Point p = new Point2d( 1, 2 );
        Visitor v = new Euclid();
//        Visitor v = new Chebyshev();
        p.accept( v );
        System.out.println( p.getMetric() );
    }
}

