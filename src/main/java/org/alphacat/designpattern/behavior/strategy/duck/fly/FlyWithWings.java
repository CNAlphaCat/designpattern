package org.alphacat.designpattern.behavior.strategy.duck.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
