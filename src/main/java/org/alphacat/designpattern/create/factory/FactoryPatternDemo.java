package org.alphacat.designpattern.create.factory;

public class FactoryPatternDemo {

    public void demo() {
        //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        Product a = mFactoryA.manufacture();
        a.show();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        Product b = mFactoryB.manufacture();
        b.show();
    }

}
