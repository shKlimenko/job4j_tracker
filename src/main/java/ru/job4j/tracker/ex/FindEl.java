package ru.job4j.tracker.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element Not Found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"test", "not a test", "Hello"};
        try {
            FindEl.indexOf(str, "bu");
        } catch (ElementNotFoundException no) {
            no.printStackTrace();
        }
    }
}
