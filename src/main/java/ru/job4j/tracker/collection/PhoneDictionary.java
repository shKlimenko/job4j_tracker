package ru.job4j.tracker.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().equals(key)
                    || person.getSurname().equals(key)
                    || person.getPhone().equals(key)
                    || person.getAddress().equals(key)) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> findWhithPredicate(String key) {
        Predicate<Person> predName = p -> p.getName().equals(key);
        Predicate<Person> predSurname = p -> p.getSurname().equals(key);
        Predicate<Person> predPhone = p -> p.getPhone().equals(key);
        Predicate<Person> predAddress = p -> p.getAddress().equals(key);

        Predicate<Person> combine = predName.or(predSurname).or(predPhone).or(predAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}