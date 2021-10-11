package ru.job4j.tracker.oop2;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по шоссе.");
    }

    @Override
    public void wheels() {
        System.out.println("У " + getClass().getSimpleName() + " 4 пары колёс.");
    }
}
