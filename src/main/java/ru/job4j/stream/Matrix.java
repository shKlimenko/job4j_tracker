package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public List<Integer> matrixToList(Integer[][] intArray) {
        return Arrays.stream(intArray)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[][] massInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix mtx = new Matrix();
        System.out.println(mtx.matrixToList(massInt));
    }
}
