package org.alphacat.designpattern.patternofpattern.observer;


public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
