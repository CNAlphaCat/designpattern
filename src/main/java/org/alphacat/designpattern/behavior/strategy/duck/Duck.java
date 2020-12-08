package org.alphacat.designpattern.behavior.strategy.duck;

import org.alphacat.designpattern.behavior.strategy.duck.fly.FlyBehavior;
import org.alphacat.designpattern.behavior.strategy.duck.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim");
    }

    void setFlyBehavior(FlyBehavior _flyBehavior) {
        flyBehavior = _flyBehavior;
    }

    void setQuackBehavior(QuackBehavior _quackBehavior) {
        quackBehavior = _quackBehavior;
    }
}
