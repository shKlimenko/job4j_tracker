package ru.job4j.tracker.oop;

import org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenResult2dot0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2.0, 0.001));
    }

    @Test
    public void whenResult4dot0() {
        Point a = new Point(5, 4);
        Point b = new Point(9, 4);
        double dist = a.distance(b);
        assertThat(dist, closeTo(4.0, 0.001));
    }
}