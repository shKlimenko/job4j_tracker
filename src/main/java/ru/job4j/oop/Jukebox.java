package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String nextLine = System.lineSeparator();
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже" + nextLine
                    + "Пешеходы по лужам," + nextLine
                    + "А вода по асфальту рекой." + nextLine
                    + "И не ясно прохожим" + nextLine
                    + "В этот день непогожий" + nextLine
                    + "Почему я весёлый такой " + nextLine);
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят," + nextLine
                    + "Одеяла и подушки ждут ребят." + nextLine
                    + "Даже сказка спать ложится," + nextLine
                    + "Чтобы ночью нам присниться." + nextLine
                    + "Ты ей пожелай: \"Баю-бай!\"" + nextLine);
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(2);
        box.music(1);
        box.music(5);
    }
}
