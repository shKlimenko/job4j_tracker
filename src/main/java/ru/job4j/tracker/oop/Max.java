package ru.job4j.tracker.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }
}

