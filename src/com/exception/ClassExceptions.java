package com.exception;

import javax.xml.soap.Node;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: sasha
 * Date: 19.11.11
 * Time: 1:02
 * To change this template use File | Settings | File Templates.
 * @author Alexandr kmets
 * @version 2.1
 * @since 1.0
 */
public class ClassExceptions {

    /**
     * Is NumberFormatException
     */
    public void myNumberFormatException() {
        String s = "FOOBAR";
        int i   = Integer.parseInt(s);
        System.out.println("int value = " + i);
    }

    /**
     * Is ClassNotFoundException
     * @throws ClassNotFoundException
     */
    public void myClassNotFoundException() throws ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }

    /**
     * Is RuntimeException
     * @param n
     */
    public void myRuntimeException(Node n) {
        Node ifPart = (Node) n.getFirstChild();
        ifPart.getValue();
    }

    /**
     * Is OutOfMemoryError
     */
	public void myOutOfMemoryError() {
        ArrayList al = new ArrayList();
        while (true){
            al.add("abc");
        }
	}

    /**
     * Is IOException
     * @param fname
     * @throws java.io.IOException
     */
    public void myIOException(String fname) throws IOException {
        if (fname == null || fname.length() == 0) {
            throw new BadArgumentException();
        }
        FileInputStream fis = new FileInputStream(fname);
        // ... обработать файл ...
        fis.close();
    }

    /**
     * Is ClassCastException
     */
	public void myClassCastException() {
        Object ch = new Character('*');
        System.out.println((Byte) ch);
	}

    /**
     * Is IllegalArgumen
     */
	public void myIllegalArgumen() {
        Integer a = 100;
        Integer b = Integer.valueOf("abc");
        int c = a + b;
	}

    /**
     * Is IndexOutOfBounds
     */
	public void myIndexOutOfBounds() {
        int[] a = {1, 2, 3, 4, 5};
        int b = a[10] + 10;
	}

    /**
     * Is NullPointerException
     */
	public void myNullPointer() {
        ArrayList al = null;
        al.add(100);
	}

    /**
     * Is StackOverflowError
     */
	public void myStackOverflow() {
        Operations operations = new Operations();
	}
}

/**
 * Test Class for demo RuntimeException
 */
class BadArgumentException extends RuntimeException {
  public BadArgumentException() {
    super();
  }

  public BadArgumentException(String s) {
    super(s);
  }
}

/**
 * Test Class for demo StackOverflowError
 */
class Operations {
    public Operations(){
        new Operations();
    }

    public int getFieldA(){
        return FieldA;
    }
    public int getFieldB(){
        return FieldB;
    }
    public int getFieldC(){
        return FieldC;
    }

    public void setFieldA(int args){
        FieldA = args;
    }
    public void setFieldB(int args){
        FieldB = args;
    }
    public void setFieldC(int args){
        FieldC = args;
    }

    private int FieldA = 0;
    private int FieldB = 0;
    private int FieldC = 0;
}