package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FirstStreamTest {
    @Test
    public void whenThreeOfSixIsPositive() {
        List<Integer> arList = List.of(-5, 7, -4, 3, -8, 42);
        List<Integer> arPositive = FirstStream.positiveArray(arList);
        List<Integer> arPositiveExpected = List.of(7, 3, 42);
        assertThat(arPositive, is(arPositiveExpected));
    }

    @Test
    public void whenTwoOfSixIsPositive() {
        List<Integer> arList = List.of(1, -77, -23, 3, -8, -102);
        List<Integer> arPositive = FirstStream.positiveArray(arList);
        List<Integer> arPositiveExpected = List.of(1, 3);
        assertThat(arPositive, is(arPositiveExpected));
    }
}