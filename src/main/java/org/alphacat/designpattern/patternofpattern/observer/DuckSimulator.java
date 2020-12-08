package org.alphacat.designpattern.patternofpattern.observer;


public class DuckSimulator {

    public static void main() {

    }

    void simulate() {

        Quackable mallardDuck = new MallardDuck();

        Flock flock = new Flock();
        flock.add(mallardDuck);



        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);

    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
