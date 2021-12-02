package ru.job4j.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Impl task", 1),
                new Job("Fix bugs", 2),
                new Job("Fix bugs", 1),
                new Job("Fix bugs", 3)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new JobSortByName());
        System.out.println(jobs);

        Collections.sort(jobs, new JobSortByNameReverse().thenComparing(
                new JobSortByPriorityReverse())
        );
        System.out.println(jobs);
    }
}