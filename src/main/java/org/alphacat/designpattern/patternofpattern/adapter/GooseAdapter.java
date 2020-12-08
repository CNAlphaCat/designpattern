package org.alphacat.designpattern.patternofpattern.adapter;

import org.alphacat.designpattern.patternofpattern.duck.Goose;
import org.alphacat.designpattern.patternofpattern.duck.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
