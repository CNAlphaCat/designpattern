package org.alphacat.designpattern.behavior.template;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("浸泡茶叶");
    }

    @Override
    public void addCondiment() {
        System.out.println("添加蜂蜜");
    }
}
