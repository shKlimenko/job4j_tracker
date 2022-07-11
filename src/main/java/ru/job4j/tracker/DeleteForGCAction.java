package ru.job4j.tracker;

import java.util.List;

public class DeleteForGCAction implements UserAction {
    private final Output out;

    public DeleteForGCAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete all items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Delete all items ====");
        List<Item> items = tracker.findAll();

        for (Item item : items) {
            tracker.delete(item.getId());
        }
        out.println("=== All items has been deleted ===");
        return true;
    }
}
