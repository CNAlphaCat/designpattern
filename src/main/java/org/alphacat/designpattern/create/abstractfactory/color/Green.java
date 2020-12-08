package org.alphacat.designpattern.create.abstractfactory.color;

import org.alphacat.designpattern.create.abstractfactory.color.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
