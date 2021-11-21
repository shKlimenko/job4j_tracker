package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void whenIncrease() {
        List<Item> items = Arrays.asList(new Item("eat"), new Item("sleep"),
                new Item("code"), new Item("repeat"));
        Collections.sort(items,  new ItemAscByName());
        List<Item> expected = Arrays.asList(new Item("code"), new Item("eat"),
                new Item("repeat"), new Item("sleep"));
        assertThat(items, is(expected));
    }

    @Test
    public void whenDecrease() {
        List<Item> items = Arrays.asList(new Item("minute"), new Item("hour"),
                new Item("day"), new Item("year"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(new Item("year"), new Item("minute"),
                new Item("hour"), new Item("day"));
        assertThat(items, is(expected));
    }
}