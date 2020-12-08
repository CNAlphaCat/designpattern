package org.alphacat.designpattern.structure.decorator.beverage;


public abstract class Beverage {
    protected String description = "Unknow Beverage";

    //对饮料的描述
    public String getDescription() {
        return description;
    }

    //计算价格
    public abstract double cost();
}

