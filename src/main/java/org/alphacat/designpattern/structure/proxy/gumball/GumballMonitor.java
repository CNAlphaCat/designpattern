package org.alphacat.designpattern.structure.proxy.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {
            System.out.println("糖果机位置: " + gumballMachine.getLocation());
            System.out.println("目前库存 : " + gumballMachine.getCount());
            System.out.println("当前状态 : " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
