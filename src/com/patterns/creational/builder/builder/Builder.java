package com.patterns.creational.builder.builder;

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
 * ----------------------------
 *   Интерфейс, описывающий части, из которых может состоять здание.
 * Методы специально не сделаны абстрактными, что бы иметь возможность не строить ненужные части здания.
 */
public abstract class Builder {
    public void buildFundament() {

    }

    public void buildFloor() {

    }

    public void buildRoof() {

    }

    public void buildBasement() {

    }

    abstract Object getBuilding();
}
