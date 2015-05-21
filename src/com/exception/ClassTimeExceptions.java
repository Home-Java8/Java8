package com.exception;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: sasha
 * Date: 18.11.11
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 * @author Alexandr kmets
 * @version 2.1
 * @since 1.0
 */
public class ClassTimeExceptions {

    private int RANGE_EXCEPTION    = 1;
    private int LIMIT_SIZE         = 0;
    private Random random          = new Random();
    /**
     * Number of repeated cycles of stimulation
     */
    public int COUNT_EXCEPTION     = random.nextInt(RANGE_EXCEPTION);
    /**
     * Get number code error
     */
    public int CStyleMessage       = 0;
    /**
     * Get Message Type Exception
     */
    public String JavaStyleMessage = null;
    private List cStyle            = null;
    private List javaStyle         = null;

    /**
     * C-Style get Code Error
     * @param o
     * @return
     */
    private int cStyle(Object o){
        if(LIMIT_SIZE > cStyle.size()){
            cStyle.add(o);
        } else {
            return -1;
        }
        return 0;
    }

    /**
     * Cicle Exception for C-Style
     */
    private void countCStyle(){
        cStyle           = new ArrayList();
        CStyleMessage    = 0;
        boolean IsCStyle = true;

        while (IsCStyle){
            if( cStyle("str CStyle") == -1 ) {
                IsCStyle      = false;
                CStyleMessage = -1;
            }
        }
    }

    /**
     * Java-Style get Message Error
     * @param o
     * @throws com.exception.JavaException
     */
    private void javaStyle(Object o) throws JavaException {
        if(LIMIT_SIZE > javaStyle.size()){
            javaStyle.add(o);
        } else {
            throw new JavaException();
        }
    }

    /**
     * Cicle Exception for Java-Style
     * @throws com.exception.JavaException
     */
    private void countJavaStyle() throws JavaException {
        javaStyle = new ArrayList();

        while (true){
            javaStyle("str JavaStyle");
        }
    }

    /**
     * Get Summary Time for C-Style Exception
     * @param range_exception
     * @param limit_size
     * @return
     */
    public double cStyleException(int range_exception, int limit_size){
        COUNT_EXCEPTION = random.nextInt(range_exception);
        LIMIT_SIZE      = limit_size;

        double TimeFirst = System.currentTimeMillis(); {
        for(int i = 0; i < COUNT_EXCEPTION; i++)
            countCStyle();
        }
        double TimeLast = System.currentTimeMillis();
        double SummaryTimeCStyle = TimeLast - TimeFirst;

        return SummaryTimeCStyle;
    }

    /**
     * Get Summary Time for Java-Style Exception
     * @param range_exception
     * @param limit_size
     * @return
     */
    public double javaStyleException(int range_exception, int limit_size){
        COUNT_EXCEPTION = random.nextInt(range_exception);
        LIMIT_SIZE      = limit_size;

        double TimeFirst = System.currentTimeMillis();
        double TimeLast  = 0;
        for (int i = 0; i < COUNT_EXCEPTION; i++) {
            try {
                countJavaStyle();
            } catch(JavaException e) {
                //e.printStackTrace(System.err);
                TimeLast       = System.currentTimeMillis();
                JavaStyleMessage = "Exception: " + e.getException();
            } finally {
                JavaStyleMessage = "Not catch exception?";
            }
        }
        double SummaryTimeJavaStyle = TimeLast - TimeFirst;

        return SummaryTimeJavaStyle;
    }

    /**
     * Get Different Summary Time for C-Java-Style Exceptions
     * @param range_exception
     * @param limit_size
     * @return
     */
    public double differentStyleException(int range_exception, int limit_size){
        COUNT_EXCEPTION = random.nextInt(range_exception);
        LIMIT_SIZE      = limit_size;

        double TimeFirst = System.currentTimeMillis(); {
        for(int i = 0; i < COUNT_EXCEPTION; i++)
            countCStyle();
        }
        double TimeLast = System.currentTimeMillis();
        double SummaryTimeCStyle = TimeLast - TimeFirst;

        TimeFirst = System.currentTimeMillis();
        TimeLast  = 0;
        for (int i = 0; i < COUNT_EXCEPTION; i++) {
            try {
                countJavaStyle();
            } catch(JavaException e) {
                //e.printStackTrace(System.err);
                TimeLast       = System.currentTimeMillis();
                JavaStyleMessage = "Exception: " + e.getException();
            } finally {
                JavaStyleMessage = "Not catch exception?";
            }
        }
        double SummaryTimeJavaStyle = TimeLast - TimeFirst;

        BigDecimal DecimalDifferentTime;
        double ToDecimalDifferentTime;
        if(SummaryTimeCStyle < SummaryTimeJavaStyle) {
            double DifferentTime = SummaryTimeJavaStyle / SummaryTimeCStyle;
            DecimalDifferentTime = new BigDecimal(DifferentTime);
            DecimalDifferentTime = DecimalDifferentTime.setScale(3, BigDecimal.ROUND_HALF_UP);
            ToDecimalDifferentTime = DecimalDifferentTime.doubleValue();
        } else {
            double DifferentTime = SummaryTimeCStyle / SummaryTimeJavaStyle;
            DecimalDifferentTime = new BigDecimal(DifferentTime);
            DecimalDifferentTime = DecimalDifferentTime.setScale(3, BigDecimal.ROUND_HALF_UP);
            ToDecimalDifferentTime = DecimalDifferentTime.doubleValue();
            ToDecimalDifferentTime = ToDecimalDifferentTime * -1;
        }

        return ToDecimalDifferentTime;
    }
}

/**
 * My Class for processing Java-Style Exception
 */
class JavaException extends Exception {
    public JavaException() {}

    /**
     * Get Message for Type Exception
     * @return
     */
    public String getException(){
        return "Is Limit Size";
    }
}