package com.company;

public class OnePlus extends SmartPhone{

    private String os;

    public OnePlus(String name, String os) {
        super(name);
        this.os = os;
    }

    @Override
    public void print() {
        System.out.println("Operation system " + os);//хахах
    }
}
