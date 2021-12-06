package ru.job4j.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
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
        Predicate<Person> predName = p -> p.getName().contains(key);
        Predicate<Person> predSurname = p -> p.getSurname().contains(key);
        Predicate<Person> predPhone = p -> p.getPhone().contains(key);
        Predicate<Person> predAddress = p -> p.getAddress().contains(key);

        Predicate<Person> combine = predName.or(predSurname).or(predPhone).or(predAddress);
        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}