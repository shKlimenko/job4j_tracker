package ru.job4j.tracker.collections;

import java.util.Comparator;

public class JobSortByName implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}