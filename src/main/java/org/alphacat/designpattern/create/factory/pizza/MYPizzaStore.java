package org.alphacat.designpattern.create.factory.pizza;

public class MYPizzaStore extends PizzaStore {

    @Override
    public Pizza CreatePizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            default:
                break;
        }
        return pizza;
    }

}
