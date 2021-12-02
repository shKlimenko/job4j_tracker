package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("Priority 5", 5));
        queue.put(new Task("High Priority", 9));
        queue.put(new Task("Priority 4", 4));
        queue.put(new Task("Low Priority", 2));
        queue.put(new Task("Priority 3", 3));
        queue.put(new Task("Priority 7", 7));
        queue.put(new Task("Priority 6", 6));
        Task result = queue.take();
        assertThat(result.getDesc(), is("Low Priority"));
    }
}