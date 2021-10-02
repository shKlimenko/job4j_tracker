package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public void exchage(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
