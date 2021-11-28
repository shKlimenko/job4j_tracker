package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiaposonUsage {
    public static List<Double> diaposon(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(func.apply(i));
        }
        return rsl;
    }
}
