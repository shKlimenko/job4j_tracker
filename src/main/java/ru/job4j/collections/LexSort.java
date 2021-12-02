package ru.job4j.collections;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftMass = left.split("\\.");
        String[] rightMass = right.split("\\.");
        return Integer.compare(Integer.parseInt(leftMass[0]), Integer.parseInt(rightMass[0]));
    }
}