package org.alphacat.designpattern.create.abstractfactory.color;

import org.alphacat.designpattern.create.abstractfactory.color.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
