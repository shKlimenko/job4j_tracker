package ru.job4j.tracker.collections;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task l : list) {
            numbers.add(l.getNumber());
        }
        return numbers;
    }
}