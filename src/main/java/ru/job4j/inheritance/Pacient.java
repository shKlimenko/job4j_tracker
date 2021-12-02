package ru.job4j.inheritance;

public class Pacient {
    private String pacientCart;

    public Diagnosis getMedicalCart() {
        Diagnosis medicalCart = new Diagnosis();
        return medicalCart;
    }

    public String getPacientCart() {
        return pacientCart;
    }
}
