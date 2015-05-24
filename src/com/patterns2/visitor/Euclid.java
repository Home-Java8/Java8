package com.patterns2.visitor;

/**
 * Created by Саша on 24.05.2015.
 */
class Euclid implements Visitor {
    public void visit ( Point2d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() ) );
    }
    public void visit ( Point3d p ) {
        p.setMetric( Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY() + p.getZ()*p.getZ() ) );
    }
}

