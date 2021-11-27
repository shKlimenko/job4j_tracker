package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (i, s) -> map.put(i, s);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (bpi, bps) -> bpi % 2 == 0
                || map.get(Integer.parseInt(bps)).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, i.toString())) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();

        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = (str) -> str.toUpperCase();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}