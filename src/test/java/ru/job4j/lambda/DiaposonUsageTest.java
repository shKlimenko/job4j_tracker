package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DiaposonUsageTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiaposonUsage.diaposon(2, 5, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(5D, 7D, 9D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = DiaposonUsage.diaposon(4, 10, x -> x * x);
        List<Double> expected = Arrays.asList(16D, 25D, 36D, 49D, 64D, 81D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = DiaposonUsage.diaposon(3, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(8D, 16D, 32D);
        assertThat(result, is(expected));
    }
}