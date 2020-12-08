package org.alphacat.designpattern.behavior.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "1111111111111", true, 2.99);
        addItem("Regular Pancake Breakfast", "222222222222", false, 2.99);
        addItem("Blueberry Pancakes", "2222222222222", true, 3.29);
        addItem("Waffles", "33333333333333", true, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    //其他方法
}

