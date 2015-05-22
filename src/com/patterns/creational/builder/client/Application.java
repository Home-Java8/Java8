package com.patterns.creational.builder.client;

import com.patterns.creational.builder.builder.FrameHouse;
import com.patterns.creational.builder.builder.OfficeBuilding;
import com.patterns.creational.builder.director.Director;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 13/07/2014
 * {@link http://sh2533.blogspot.com/2011/08/builder.html}
 * {@link http://jdevnotes.blogspot.com/2010/10/builder.html}
 *
 * {@link http://www.youtube.com/playlist?list=PL67C644F846BB4DED}
 * {@link http://www.youtube.com/watch?v=TXoc2M8jUJo&list=PL67C644F846BB4DED&index=8}
 ********************************************************************
 * Паттерн Builder (Строитель).
 * Отделяет конструирование сложного объекта от его представления, так что в результате одного и того же процесса конструирования могут получаться разные представления.
 * + + + + + + + + + + + + + + +
 * можно считать этот паттерн-'Builder' законченой идеей для реализации другого паттерна-'Decorator'...
 * к примеру представим себе какую-нибудь игровую модель: автомобиль, бронетранспортер, винтовой самалет, вертолет, ...
 * все эти игровые модели являются частью каких-нибудь общих строительных элементов, которые могут подвергатся разного рода физическим разрушениям.
 * В этом случае с помощью паттерна-'Decorator' можно сконструировать любой сложности модель.
 * Но уже с помощью паттерна-'Builder' ("Director") можно строить много разных сложных моделей.
 *   Вторым ключевы элементом в этой структуре есть "Client" - он ничего незнает о том как нужно строить модели, он ("Client") умеет испоьзовать эти модели и получать
 * результаты в своих задачах.
 * Примером такой клиентской задачи может служить игровой сценарий в котором задействованы эти модели
 * -----------------------------
 * Output:
 * Фундамент. 1 этаж. Двускатная крыша.
 * Подвал. Фундамент. 1 этаж. 2 этаж. 3 этаж. 4 этаж. 5 этаж. Плоская крыша.
 */
public class Application {
    public static void main(String[] args) {

        FrameHouse fh = Director.getFrameHouse();
        System.out.println(fh.getParts());

        OfficeBuilding ob = Director.getOfficeBuilding();
        System.out.println(ob.getParts());
    }
}
