package org.alphacat.designpattern.create.factory.pizza;

public abstract class PizzaStore
{
    public Pizza OrderPizza(String type)
    {
        Pizza pizza = CreatePizza(type);
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();

        return pizza;
    }

    //抽象出创建Pizza的工厂方法，由子类实现该方法并创建具体的Pizza
    public abstract Pizza CreatePizza(String type);

}
