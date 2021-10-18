package ru.job4j.tracker.ex;

public class Fact {
    public static void main(String[] args) {
        new Fact().calc(-2);
    }

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The argument must be greater than or equal to 0");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}