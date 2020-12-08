package org.alphacat.designpattern.patternofpattern.adapter;

import org.alphacat.designpattern.patternofpattern.duck.*;
import org.alphacat.designpattern.patternofpattern.factory.AbstractDuckFactory;

public class DuckSimulator {

    public static void main() {
        DuckSimulator simulator = new DuckSimulator();
    }

    void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable read = abstractDuckFactory.createRedHeadDuck();
        Quackable rubber = abstractDuckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();

        simulate(read);
        simulate(rubber);
        simulate(goose);
        simulate(mallardDuck);
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
