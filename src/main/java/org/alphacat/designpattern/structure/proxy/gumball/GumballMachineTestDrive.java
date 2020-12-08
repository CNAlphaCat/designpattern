package org.alphacat.designpattern.structure.proxy.gumball;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {


    public static void main(String[] args) throws AlreadyBoundException, MalformedURLException, NotBoundException {
        //创建一个机器的数组,条件有限,就写一个吧,假装他是多个,,,
        String[] location = {"rmi://192.168.31.149/gumballMachine"};
        //创建多个监视器
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            for (int j = 0; j < monitor.length; j++) {
                monitor[j].report();
            }
        }
    }


}
