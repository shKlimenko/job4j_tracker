package ru.job4j.tracker.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterTThenFinish() {
        Fact.calc(-4);
    }
}