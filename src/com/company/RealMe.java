package com.company;

public class RealMe extends SmartPhone{

    private int ram;

    public RealMe(String name, int ram) {
        super(name);
        this.ram = ram;
    }// э шылдындабачы

    @Override
    public void print() {
        System.out.println("RAM " + ram);
    }
}
