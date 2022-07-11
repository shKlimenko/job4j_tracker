package ru.job4j.tracker;

import java.sql.SQLException;

public class CreateForGCAction implements UserAction {
    private final Output out;

    public CreateForGCAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add A LOT OF Items";
    }

    @Override
    public boolean execute(Input input, Store tracker) throws SQLException {
        out.println("=== Create a new Item ====");

        for (int i = 0; i < 500000; i++) {
            tracker.add(new Item("name" + i));
        }

        out.println("Добавленно заявок: 500000");
        return true;
    }
}
