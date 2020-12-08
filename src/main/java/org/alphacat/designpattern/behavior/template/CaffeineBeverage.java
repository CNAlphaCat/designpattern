package org.alphacat.designpattern.behavior.template;

/**
 * 咖啡因饮料
 */
public abstract class CaffeineBeverage {
    /**
     * 模板方法，准备饮料
     */
    public final void prepareRecipe(){
        boilWater();
        brew();
        //用于模板方法的算法中可选部分的控制
        if(customerWantsCondiment()){
            addCondiment();
        }
        pourInCup();
    }

    /**
     *  煮沸水
     */
    public void boilWater() {
        System.out.println("煮沸水");
    }

    /**
     *  冲泡
     */
    public abstract void brew();

    /**
     *  增加调味剂
     */
    public abstract void addCondiment();

    /**
     * 将饮料倒入杯子
     */
    public void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    /**
     * “钩子”方法。顾客决定是否加调料
     */
    public Boolean customerWantsCondiment(){
        return true;
    }
}
