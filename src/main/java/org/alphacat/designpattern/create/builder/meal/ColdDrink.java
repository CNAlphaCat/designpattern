package org.alphacat.designpattern.create.builder.meal;

import org.alphacat.designpattern.create.builder.meal.packing.Bottle;
import org.alphacat.designpattern.create.builder.meal.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
