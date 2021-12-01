package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStram {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(5);
        arList.add(7);
        arList.add(4);
        arList.add(3);
        arList.add(8);
        arList.add(42);
        List<Integer> filtredArList = arList.stream().filter(
                el -> el % 2 == 0).collect(Collectors.toList()
        );
    }
}
