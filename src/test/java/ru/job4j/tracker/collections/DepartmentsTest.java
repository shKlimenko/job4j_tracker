package ru.job4j.tracker.collections;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMissedThreeDeps() {
        List<String> input = Arrays.asList("k1/sk1/ssk1/sssk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1", "k1/sk1/ssk1/sssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAscDepartments() {
        List<String> input = Arrays.asList("k2/sk1", "k1");
        Departments.sortAsc(input);
        assertThat(input, is(Arrays.asList("k1", "k2/sk1")));
    }
}