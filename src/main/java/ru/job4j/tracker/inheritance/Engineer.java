package ru.job4j.tracker.inheritance;

public class Engineer extends Profession {
    private int age;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, int age) {
        super(name, surname, education, birthday);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
