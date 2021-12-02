package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int experience;

    public Builder(String name, String surname,
                   String education, String birthday,
                   int age, int experience) {
        super(name, surname, education, birthday, age);
        this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    public void make(Tower tower) {
        System.out.println("Вы создалю башню на " + tower.getFloor()
                + " этажей. Из " + tower.getMaterial()
                + ". Наличие лифта: " + tower.getElevator());
    }
}
