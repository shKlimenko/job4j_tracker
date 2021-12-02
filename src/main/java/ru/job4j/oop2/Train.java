package ru.job4j.oop2;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам.");
    }

    @Override
    public void wheels() {
        System.out.println("У " + getClass().getSimpleName() + " очень много пар колёс.");
    }
}