package com.company;

public class Gvozdika extends Plant implements Printable{
    private String smell;

    @Override
    public void print() {
        System.out.println("Smell " + smell);
    }

    public Gvozdika(String smell) {
        this.smell = smell;
    }
}
