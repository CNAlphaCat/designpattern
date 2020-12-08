package org.alphacat.designpattern.behavior.iterator;

public interface Iterator{
    boolean hasNext();  //返回一个布尔值，判断是否还有更多的元素
    Object next();   //返回下一个元素
}

