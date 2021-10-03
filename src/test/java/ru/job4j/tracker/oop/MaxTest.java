package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1and2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7and4and6() {
        int left = 7;
        int middle = 4;
        int right = 6;
        int result = Max.max(left,middle,  right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1and2and99and42() {
        int first = 1;
        int second = 2;
        int third = 99;
        int fourth = 42;
        int result = Max.max(first, second, third, fourth);
        int expected = 99;
        Assert.assertEquals(result, expected);
    }
}