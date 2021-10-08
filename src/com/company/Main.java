package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Romashka").print();
        createObject("Gvozdika").print();
        createObject("Kaktus").print();
       }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Romashka":
                printable = new Romashka("Ромашка");
                break;
            case "Gvozdika":
                printable = new Gvozdika("Гвоздика");
                break;
            case "Kaktus":
                printable = new Kaktus("Кактус");
                break;
            default:
                return printable;
        }
        return printable;
    }
}
