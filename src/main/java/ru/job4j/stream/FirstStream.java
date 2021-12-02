package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstStream {
    public static List<Integer> positiveArray(List<Integer> array) {
        return array.stream().filter(
                el -> el > 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(-5);
        arList.add(7);
        arList.add(-4);
        arList.add(3);
        arList.add(-8);
        arList.add(42);
        List<Integer> filtredArList = FirstStream.positiveArray(arList);
    }
}
