package org.alphacat.designpattern.create.factory.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();

    public void Prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossingdough...");
        System.out.println("Addingsauce..");
        System.out.println("Addingtoppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    public void Bake() {
        System.out.println("Bakefor 25 minutes at 350");
    }

    public void Cut() {
        System.out.println("Cuttingthe pizza into diagonal slices");
    }

    public void Box() {
        System.out.println("Placepizza in official PizzaStore box");
    }

    public String GetName() {
        return name;
    }

}
