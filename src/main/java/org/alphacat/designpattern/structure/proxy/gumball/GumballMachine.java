package org.alphacat.designpattern.structure.proxy.gumball;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    //位置
    private String location;

    //库存
    private Integer count;

    //状态
    private State state;

    public GumballMachine(String location,Integer count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public GumballMachine setLocation(String location) {
        this.location = location;
        return this;
    }

    public Integer getInventory() {
        return count;
    }

    public GumballMachine setInventory(Integer inventory) {
        this.count = inventory;
        return this;
    }

    @Override
    public State getState() {
        return state;
    }

    public GumballMachine setState(State state) {
        this.state = state;
        return this;
    }

}
