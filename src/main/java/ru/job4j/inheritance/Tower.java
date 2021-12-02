package ru.job4j.inheritance;

public class Tower {
    private int floor;
    private String material;
    private boolean elevator;

    public Tower(int floor, String material, boolean elevator) {
        this.floor = floor;
        this.material = material;
        this.elevator = elevator;
    }

    public int getFloor() {
        return this.floor;
    }

    public String getMaterial() {
        return this.material;
    }

    public boolean getElevator() {
        return this.elevator;
    }
}
