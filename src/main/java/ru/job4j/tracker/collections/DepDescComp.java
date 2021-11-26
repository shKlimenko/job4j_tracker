package ru.job4j.tracker.collections;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] o1Mass = o1.split("/");
        String[] o2Mass = o2.split("/");
        if (o2Mass[0].compareTo(o1Mass[0]) == 0) {
            for (int i = 0; i < Math.min(o1Mass.length, o2Mass.length); i++) {
                rsl = o1Mass[i].compareTo(o2Mass[i]);
                if (rsl != 0) {
                    return rsl;
                }
            }
        }
        return Integer.compare(o1Mass.length, o2Mass.length);
    }
}