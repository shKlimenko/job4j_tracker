package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item frmStart = new Item();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = frmStart.getCreated().format(formatter);
        System.out.println(currentDateTimeFormat);
        System.out.println(frmStart);
    }
}
