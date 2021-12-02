package ru.job4j.collections;

import java.util.Comparator;

public class JobSortByNameReverse implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return second.getName().compareTo(first.getName());
    }
}