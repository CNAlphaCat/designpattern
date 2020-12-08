package org.alphacat.designpattern.create.abstractfactory;

import org.alphacat.designpattern.create.abstractfactory.color.Color;
import org.alphacat.designpattern.create.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
