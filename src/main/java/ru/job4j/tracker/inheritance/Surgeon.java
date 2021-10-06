package ru.job4j.tracker.inheritance;

public class Surgeon extends Doctor {
    private char gender;

    public Surgeon(String name, String surname,
                   String education, String birthday,
                   String academicDegree, String university, char gender) {
        super(name, surname, education, birthday, academicDegree, university);
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    public void callSurgeon(Surgeon surgeon) {
        System.out.println("Срочно позовите " + surgeon.getSurname());
    }
}
