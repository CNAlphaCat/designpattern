package org.alphacat.designpattern.patternofpattern.decorator;

import org.alphacat.designpattern.patternofpattern.duck.Quackable;

public class QuackCount implements Quackable {
    Quackable duck;
    static int count;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        ++count;
        duck.quack();
    }

    public int getCount() {
        return count;
    }
}
