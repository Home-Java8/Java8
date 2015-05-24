package com.patterns2.visitor;

/**
 * Created by Саша on 24.05.2015.
 */
interface Visitor {
    public void visit ( Point2d p );
    public void visit ( Point3d p );
}

