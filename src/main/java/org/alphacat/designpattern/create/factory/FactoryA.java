package org.alphacat.designpattern.create.factory;

public class FactoryA implements Factory {
    @Override
    public Product manufacture() {
        return new ProductA();
    }
}
