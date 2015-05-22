package com.patterns.system.workerthread.ex03;

import junit.framework.TestCase;

/**Выполняет тестирование разработанного класса CalcT
 * @author Александр
 */
public class MainTest extends TestCase {

    /**проверка основной функциональности класса*/
    public void testCalcT(){
        ViewTable calcP = new ViewTable();

        calcP.init(1, 1);
        assertEquals(4, calcP.getp(), .1e-1);
        calcP.init(2, 2);
        assertEquals(8, calcP.getp(), .1e-1);
        calcP.init(3, 3);
        assertEquals(12, calcP.getp(), .1e-1);
        calcP.init(4, 4);
        assertEquals(16, calcP.getp(), .1e-1);
        calcP.init(5, 5);
        assertEquals(20, calcP.getp(), .1e-1);
    }
}
