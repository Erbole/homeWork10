package com.company;

public abstract class SmartPhone implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SmartPhone(String name) {
        this.name = name;
    }
}
