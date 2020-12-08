package org.alphacat.designpattern.structure.decorator.beverage;

public class DecoratorTest {

    public static void main(String[] args) throws Exception {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + "\t" + darkRoast.cost());
        System.out.println("---------------------");

        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription() + "\t" + espresso.cost());
    }
}
