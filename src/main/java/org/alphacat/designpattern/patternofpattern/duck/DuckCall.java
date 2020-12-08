package org.alphacat.designpattern.patternofpattern.duck;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("kwak");
    }
}

