package ru.job4j.tracker.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Иванов ТОР Одинович");
        student1.setGroup("Теория управления мультивселенной");
        student1.setEnrollment(new Date(467140820202L));

        System.out.println("Студент " + student1.getFullName()
                + " поступил на факультет: " + student1.getGroup()
                + " ровно в " + student1.getEnrollment());
    }
}
