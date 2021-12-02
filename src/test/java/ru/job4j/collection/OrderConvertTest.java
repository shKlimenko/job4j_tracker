package ru.job4j.collection;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenMultipleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("a4y7", "T-Shirt"));
        orders.add(new Order("mf1w", "Hat"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("a4y7"), is(new Order("a4y7", "T-Shirt")));
    }

    @Test
    public void whenAddThatAlreadyExist() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("a4y7", "T-Shirt"));
        orders.add(new Order("a4y7", "Hat"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("a4y7"), is(new Order("a4y7", "Hat")));
    }

    @Test
    public void whenMapIsLessThanList() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("a4y7", "Hat"));
        orders.add(new Order("a4y7", "Hat"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.size(), Matchers.lessThan(orders.size()));
    }
}