package org.alphacat.designpattern.structure.facade.shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
