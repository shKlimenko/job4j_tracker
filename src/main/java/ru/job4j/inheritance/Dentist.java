package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String name, String surname,
                   String education, String birthday,
                   String academicDegree, String university, String specialization) {
        super(name, surname, education, birthday, academicDegree, university);
        this.specialization = specialization;
    }

    public DentalImpression make() {
        return new DentalImpression();
    }
}
