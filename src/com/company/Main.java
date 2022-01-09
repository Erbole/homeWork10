package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // э я правльно делаю?
        Printable[] printables = {createObject("0"),createObject("1"), createObject("2"),
        createObject("3")}; //высе? //ахахаха

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
//        for (Printable printable:printables) {
//            printable.print();
//
//        }

    }

    public static Printable createObject(String className) {

        switch (className) {
            case "0":
                Iphone iphone = new Iphone("Iphone", ":13:");
                return iphone;   //не ругайся
            case "1":
                Xiaomi xiaomi = new Xiaomi("Xiaomi", 12);
                return xiaomi;
            case "2":
                OnePlus onePlus = new OnePlus("OnePlus", ":oxygenOs:");
                return onePlus;
            case "3":
                RealMe realMe = new RealMe("RealMe", 14);
                return realMe;

        }
        return null;

    }

}
