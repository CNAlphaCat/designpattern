package org.alphacat.designpattern.create.abstractfactory.shape;

import org.alphacat.designpattern.create.abstractfactory.shape.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
