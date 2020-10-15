package com.company;


public class Main {

    public static void main(String[] args) {
        Bell kolokol = new Bell();

        System.out.println(kolokol.getName());
        System.out.println(kolokol.getLength());
        System.out.println(kolokol.getWidth());
        System.out.println(kolokol.getHeight());
        System.out.println();

        kolokol.setName("КOLOKOL");
        kolokol.setLength(15);
        kolokol.setWidth(10);
        kolokol.setHeight(20);

        System.out.println(kolokol.getName());
        System.out.println(kolokol.getLength());
        System.out.println(kolokol.getWidth());
        System.out.println(kolokol.getHeight());
        System.out.println();



        LittleBell kolokolchik = new LittleBell();

        kolokolchik.setName("КOLOKOLCHIK");
        kolokolchik.setLength(3);
        kolokolchik.setWidth(2);
        kolokolchik.setHeight(4);

        System.out.println(kolokolchik.getName());
        System.out.println(kolokolchik.getLength());
        System.out.println(kolokolchik.getWidth());
        System.out.println(kolokolchik.getHeight());
        System.out.println(kolokolchik.makeSound());
        System.out.println();



        BigBell big_kolokol = new BigBell();

        big_kolokol.setName("Царь-колокол");
        big_kolokol.setLength(30);
        big_kolokol.setWidth(20);
        big_kolokol.setHeight(40);

        System.out.println(big_kolokol.getName());
        System.out.println(big_kolokol.getLength());
        System.out.println(big_kolokol.getWidth());
        System.out.println(big_kolokol.getHeight());
        System.out.println(big_kolokol.makeSound());
    }
}
