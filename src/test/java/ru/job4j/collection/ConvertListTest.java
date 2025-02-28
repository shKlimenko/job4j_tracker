package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void whenThreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1, 7, 8, 3});
        in.add(new int[] {2, 3});
        in.add(new int[] {5, 3, 4});
        List<Integer> expect = List.of(1, 7, 8, 3, 2, 3, 5, 3, 4);
        assertThat(ConvertList.convert(in), is(expect));
    }
}