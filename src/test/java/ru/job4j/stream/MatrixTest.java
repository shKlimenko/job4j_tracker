package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void convertMatrixToList() {
        Integer[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix mtx = new Matrix();
        List<Integer> output = mtx.matrixToList(input);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(output, is(expected));
    }
}