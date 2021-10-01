package ru.job4j.tracker.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже \n"
                    + "Пешеходы по лужам, \n"
                    + "А вода по асфальту рекой. \n"
                    + "И не ясно прохожим \n"
                    + "В этот день непогожий \n"
                    + "Почему я весёлый такой \n");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят,\n"
                    + "Одеяла и подушки ждут ребят.\n"
                    + "Даже сказка спать ложится,\n"
                    + "Чтобы ночью нам присниться.\n"
                    + "Ты ей пожелай: \"Баю-бай!\" \n");
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
