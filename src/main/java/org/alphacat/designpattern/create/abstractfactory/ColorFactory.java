package org.alphacat.designpattern.create.abstractfactory;

import org.alphacat.designpattern.create.abstractfactory.color.Blue;
import org.alphacat.designpattern.create.abstractfactory.color.Color;
import org.alphacat.designpattern.create.abstractfactory.color.Green;
import org.alphacat.designpattern.create.abstractfactory.color.Red;
import org.alphacat.designpattern.create.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
