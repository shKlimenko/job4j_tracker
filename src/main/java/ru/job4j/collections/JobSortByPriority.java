package ru.job4j.collections;

import java.util.Comparator;

public class JobSortByPriority implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(first.getPriority(), second.getPriority());
    }
}