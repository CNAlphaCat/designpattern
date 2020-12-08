package org.alphacat.designpattern.patternofpattern.duck;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
