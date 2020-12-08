package org.alphacat.designpattern.patternofpattern.iterator;

import org.alphacat.designpattern.patternofpattern.adapter.GooseAdapter;
import org.alphacat.designpattern.patternofpattern.duck.*;

public class DuckSimulator {

    public static void main() {

    }

    void simulate() {
        Quackable read = new RedHeadDuck();
        Quackable rubber = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable mallardDuck = new MallardDuck();

        Flock flock = new Flock();
        flock.add(read);
        flock.add(rubber);
        flock.add(goose);
        flock.add(mallardDuck);

        simulate(flock);
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}

