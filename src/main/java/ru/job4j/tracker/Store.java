package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.List;

public interface Store {

    Item add(Item item) throws SQLException;

    boolean replace(int id, Item item);

    boolean delete(int id);

    List<Item> findAll();

    List<Item> findByName(String key);

    Item findById(int id);
}