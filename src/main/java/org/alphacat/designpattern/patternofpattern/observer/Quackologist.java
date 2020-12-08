package org.alphacat.designpattern.patternofpattern.observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println(duck + "is quack");
    }
}
