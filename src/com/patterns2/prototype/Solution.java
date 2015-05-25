package com.patterns2.prototype;

/**
 ** {@link http://cybern.ru/java-pattern-prototype.html}
 ** {@link https://www.youtube.com/watch?v=8ryPDBRH0aE}
 * {@link https://ru.wikipedia.org/wiki/Прототип_(шаблон_проектирования)}
 * {@link http://www.javenue.info/post/70}
 * {@link http://cpp-reference.ru/patterns/creational-patterns/prototype/}
 * *****************************************************
 * Прототип (шаблон проектирования)
 */

public class Solution {
    public static void main(String[] args) {
        Request request = new Request("lordrp", 20, "coder");
        while (true)//имитирую онлайн запросы
        {
            try {
                Request userRequest = request.clone();
                //изменение параметров
                userRequest.setAge(30);
                //тут мог бы осуществляться какой - нить поиск
                //search(userRequest)
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();//объект не поддерживает клонирование
            }
        }
    }
}
