package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    /* реализовать singleton */

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    /* Остальные методы из класса Tracker. */
}
