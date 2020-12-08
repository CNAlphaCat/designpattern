package org.alphacat.designpattern.patternofpattern.factory;

import org.alphacat.designpattern.patternofpattern.duck.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createRubberDuck();
}
