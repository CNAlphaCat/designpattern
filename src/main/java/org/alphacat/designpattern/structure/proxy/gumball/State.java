package org.alphacat.designpattern.structure.proxy.gumball;

import java.io.Serializable;

public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}