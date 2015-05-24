package com.patterns2.visitor;

/**
 * Created by Саша on 24.05.2015.
 */
abstract class Point {
    public abstract void accept ( Visitor v );
    private double metric = -1;
    public double getMetric () {
        return metric;
    }
    public void setMetric ( double metric ) {
        this.metric = metric;
    }
}

