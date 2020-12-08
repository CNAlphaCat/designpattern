package org.alphacat.designpattern.create.factory;

public class ProductA implements Product {
    @Override
    public void show() {
        System.out.println("生产出了产品A");
    }
}
