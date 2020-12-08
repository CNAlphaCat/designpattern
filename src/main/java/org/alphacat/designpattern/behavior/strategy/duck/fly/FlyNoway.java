package org.alphacat.designpattern.behavior.strategy.duck.fly;

public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
