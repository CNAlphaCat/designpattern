package org.alphacat.designpattern.create.abstractfactory.color;

import org.alphacat.designpattern.create.abstractfactory.color.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
