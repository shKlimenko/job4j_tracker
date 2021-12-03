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
}
