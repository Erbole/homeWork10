package com.company;

public class Xiaomi extends SmartPhone{

    private int series;

    public Xiaomi(String name, int series) {
        super(name);
        this.series = series;
    }

    @Override
    public void print() {
        System.out.println("Mi " + series);//мощно
    }
}
