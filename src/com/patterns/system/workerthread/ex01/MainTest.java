package com.patterns.system.workerthread.ex01;

import org.junit.Test;

import static org.junit.Assert.*;

/**Выполняет тестирование разработанного класса CalcT
 * @author Александр
 */
public class MainTest {

    /**проверка основной функциональности класса*/
    @Test
    public void testCalcT(){
        CalcT calcT = new CalcT();

        calcT.init(1, 1);
        assertEquals(3.23606797749979, calcT.getResult().getP(), .1e-5);
        calcT.init(2, 2);
        assertEquals(6.47213595499958, calcT.getResult().getP(), .1e-5);
        calcT.init(3, 3);
        assertEquals(9.70820393249937, calcT.getResult().getP(), .1e-5);
        calcT.init(4, 4);
        assertEquals(12.94427190999916, calcT.getResult().getP(), .1e-5);
        calcT.init(5, 5);
        assertEquals(16.18033988749895, calcT.getResult().getP(), .1e-5);
    }

}
