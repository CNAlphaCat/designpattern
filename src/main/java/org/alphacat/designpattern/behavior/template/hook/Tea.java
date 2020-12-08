package org.alphacat.designpattern.behavior.template.hook;

import org.alphacat.designpattern.behavior.template.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("浸泡茶叶");
    }

    @Override
    public void addCondiment() {
        System.out.println("添加蜂蜜");
    }

    //覆盖父类的“钩子”方法，更改算法中的可选部分
    @Override
    public Boolean customerWantsCondiment(){
        //询问顾客是否需要调料
        String answer = askCustomerNeedCondiment();
        if("y".equals(answer))
            return true;
        else
            return false;
    }

    private String askCustomerNeedCondiment() {
        String answer = null;

        System.out.println("请问您要不要加蜂蜜？请回答y或n");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }
}
