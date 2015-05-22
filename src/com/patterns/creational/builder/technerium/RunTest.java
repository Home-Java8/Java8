package com.patterns.creational.builder.technerium;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 14/07/2014
 * {@link http://www.technerium.ru/izuchenie-java-na-praktike/stroitel-pattern-razrabotki}
 ********************************************************************
 * Строитель - Паттерн разработки
 * Отделяет конструирование сложного объекта от его представления, так что в результате одного и того же процесса конструирования могут получаться разные представления.
 * + + + + + + + + + + + + + + +
 * Использование паттерна Builder в случае, когда мы сталкиваемся с конструктором с многими параметрами
 * -----------------------------
 * Output:
 * building ranch house--->
 * Build base
 * Build floor
 * Build walls with window: Simple window
 * Build roof
 * setting stores to: 1
 * building multistorey house--->
 * Build base
 * Build floor
 * Build walls with window: Complex window
 * Build floor
 * setting stores to: 1
 * Build walls with window: Complex window
 * Build roof
 * setting stores to: 2
 */
public class RunTest {
	public static void main(String[] args){
		log("building ranch house--->");
		Director director = new Director(1);
		House house = director.buildHouse();
		log("building multistorey house--->");
		director = new Director(2);
		house = director.buildHouse();
	}
	private static void log(String msg){
		System.out.println(msg);
	}
}
