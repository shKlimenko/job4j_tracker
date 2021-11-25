package ru.job4j.tracker.collections;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = value.split("/")[0];
            for (String el : value.split("/")) {
                if (start.equals(el)) {
                    tmp.add(start);
                    continue;
                }
                start += "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}