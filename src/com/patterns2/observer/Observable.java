package com.patterns2.observer;

interface Observable
{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
