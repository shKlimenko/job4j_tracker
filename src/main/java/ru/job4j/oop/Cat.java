package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Котика зовут " + this.name + ". Котик съел " + this.food + ".");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("котлету");
        gav.giveNick("ГАВ");
        gav.show();
        Cat black = new Cat();
        black.eat("рыбу");
        black.giveNick("ТЬМА");
        black.show();
    }
}
