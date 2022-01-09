package com.company;

public class Iphone extends SmartPhone{

    private String model;

    public Iphone(String name, String model) {
        super(name);
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Iphone " + model);
    }
}
