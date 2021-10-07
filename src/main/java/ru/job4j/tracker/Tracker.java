package ru.job4j.tracker;

import ru.job4j.tracker.encapsulation.Product;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[size];
        for (int index = 0; index < size; index++) {
            itemsWithoutNull[index] = items[index];
        }
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsWithNamesLikeKey = new Item[size];
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                itemsWithNamesLikeKey[index] = items[index];
            }
        }
        return itemsWithNamesLikeKey;
    }

    public static Item[] delete(Item[] items, int index) {
        for (int i = index; i < items.length - 1; i++) {
            items[i] = items[i + 1];
        }
        items[items.length - 1] = null;
        return items;
    }
}