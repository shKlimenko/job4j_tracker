package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String academicDegree;
    private String university;

    public Doctor(String name, String surname,
                  String education, String birthday,
                  String academicDegree, String university) {
        super(name, surname, education, birthday);
        this.academicDegree = academicDegree;
        this.university = university;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public String getUniversity() {
        return university;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diag = pacient.getMedicalCart();
        return diag;
    }
}
