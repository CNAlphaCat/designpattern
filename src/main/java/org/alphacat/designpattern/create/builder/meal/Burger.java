package org.alphacat.designpattern.create.builder.meal;

import org.alphacat.designpattern.create.builder.meal.packing.Packing;
import org.alphacat.designpattern.create.builder.meal.packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
