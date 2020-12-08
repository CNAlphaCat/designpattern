package org.alphacat.designpattern.patternofpattern.duck;

public class MallardDuck  implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}