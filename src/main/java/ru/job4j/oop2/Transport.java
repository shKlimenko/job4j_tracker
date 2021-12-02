package ru.job4j.oop2;

public class Transport {

    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle aircraft = new Aircraft();

        Vehicle[] vehicles = {train, bus, aircraft};
        for (Vehicle v:vehicles) {
            v.move();
            v.wheels();
        }
    }
}
