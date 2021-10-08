package com.company;

public class Kaktus extends Plant implements Printable{
    private String age;

    @Override
    public void print() {
        System.out.println("Age " + age);
    }

    public Kaktus(String age) {
        this.age = age;
    }
}
