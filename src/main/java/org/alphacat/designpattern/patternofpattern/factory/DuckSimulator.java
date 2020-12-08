package org.alphacat.designpattern.patternofpattern.factory;

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

        simulate(read);
        simulate(rubber);
        simulate(goose);
        simulate(mallardDuck);
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
