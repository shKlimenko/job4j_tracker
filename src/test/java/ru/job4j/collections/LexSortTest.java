package ru.job4j.collections;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.Arrays;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum11and20and17() {
        String[] input = {
                "11. Task.",
                "20. Task.",
                "17. Task."
        };
        String[] out = {
                "11. Task.",
                "17. Task.",
                "20. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}