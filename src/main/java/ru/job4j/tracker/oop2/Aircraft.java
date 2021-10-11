package ru.job4j.tracker.oop2;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по небу.");
    }

    @Override
    public void wheels() {
        System.out.println("У " + getClass().getSimpleName() + " 3 пары колёс.");
    }
}
