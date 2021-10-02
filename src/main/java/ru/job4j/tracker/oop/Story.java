package ru.job4j.tracker.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        OldWolf wolf = new OldWolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
