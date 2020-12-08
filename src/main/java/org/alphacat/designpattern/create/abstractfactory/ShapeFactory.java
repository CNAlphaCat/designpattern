package org.alphacat.designpattern.create.abstractfactory;

import org.alphacat.designpattern.create.abstractfactory.color.Color;
import org.alphacat.designpattern.create.abstractfactory.shape.Circle;
import org.alphacat.designpattern.create.abstractfactory.shape.Rectangle;
import org.alphacat.designpattern.create.abstractfactory.shape.Shape;
import org.alphacat.designpattern.create.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}