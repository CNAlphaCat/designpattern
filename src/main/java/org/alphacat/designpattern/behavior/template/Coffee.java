package org.alphacat.designpattern.behavior.template;

public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("冲泡咖啡粉");
    }

    @Override
    public void addCondiment() {
        System.out.println("添加糖和牛奶");
    }

}