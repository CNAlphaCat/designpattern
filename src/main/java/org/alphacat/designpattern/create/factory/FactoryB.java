package org.alphacat.designpattern.create.factory;

public class FactoryB implements Factory {
    @Override
    public Product manufacture() {
        return new ProductB();
    }
}
