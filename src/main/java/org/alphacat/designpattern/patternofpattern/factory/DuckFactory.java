package org.alphacat.designpattern.patternofpattern.factory;

import org.alphacat.designpattern.patternofpattern.decorator.QuackCount;
import org.alphacat.designpattern.patternofpattern.duck.*;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCount(new RedHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
