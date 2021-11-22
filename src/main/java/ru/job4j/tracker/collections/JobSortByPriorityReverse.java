package ru.job4j.tracker.collections;

import java.util.Comparator;

public class JobSortByPriorityReverse implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getPriority(), first.getPriority());
    }
}