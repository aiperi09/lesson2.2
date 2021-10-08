package com.company;

public class Romashka extends Plant implements Printable{
    private String species;

    @Override
    public void print() {
        System.out.println("Species " + species);

    }

    public Romashka(String species) {
        this.species = species;
    }
}
