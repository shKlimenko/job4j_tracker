package ru.job4j.tracker.polymorphism;

public class Bus implements Transport {
    private int passengers;
    private int price;

    @Override
    public void drive() {
    }

    @Override
    public void passengers(int pass) {
        this.passengers = pass;
    }

    @Override
    public int refuel(int liters) {
        return liters * price;
    }
}
