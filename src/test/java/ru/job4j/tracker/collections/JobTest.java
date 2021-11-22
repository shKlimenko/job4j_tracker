package ru.job4j.tracker.collections;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndProrityReverse() {
        Comparator<Job> cmpNamePriority = new JobSortByNameReverse().thenComparing(
                new JobSortByPriorityReverse()
        );
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpNamePriority = new JobSortByName();
        int rsl = cmpNamePriority.compare(
                new Job("Reboot server", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByPriority() {
        Comparator<Job> cmpNamePriority = new JobSortByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Reboot server", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPriorityEquals() {
        Comparator<Job> cmpNamePriority = new JobSortByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Reboot server", 0),
                new Job("Reboot server", 0)
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenCompatorByNameReverse() {
        Comparator<Job> cmpNamePriority = new JobSortByNameReverse();
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Call senior Java Developer", 999)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByPriorityReverse() {
        Comparator<Job> cmpNamePriority = new JobSortByPriorityReverse();
        int rsl = cmpNamePriority.compare(
                new Job("Go home and sleep", 77),
                new Job("Name variables", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobSortByPriority().thenComparing(
                new JobSortByNameReverse()
        );
        int rsl = cmpNamePriority.compare(
                new Job("Hack pentagon", 9),
                new Job("Call TechSupport", 9)
        );
        assertThat(rsl, lessThan(0));
    }
}