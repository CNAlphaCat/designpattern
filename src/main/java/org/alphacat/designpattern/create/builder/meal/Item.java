package org.alphacat.designpattern.create.builder.meal;

import org.alphacat.designpattern.create.builder.meal.packing.Packing;

public interface Item {
    String name();

    Packing packing();

    float price();
}
