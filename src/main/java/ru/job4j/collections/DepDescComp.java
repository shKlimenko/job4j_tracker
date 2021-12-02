package ru.job4j.collections;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Mass = o1.split("/");
        String[] o2Mass = o2.split("/");
        int rsl = o2Mass[0].compareTo(o1Mass[0]);
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}