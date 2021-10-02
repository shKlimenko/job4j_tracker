package ru.job4j.tracker.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Статус ошибки: " + active);
        System.out.println("Номер ошибки: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error fatalError = new Error(true, 999, "Привет от SKYNET");
        Error criticalError = new Error(true, 17, "Сервер упал, поднимите обратно на стол");
        Error anotherError = new Error(false, 2, "Ну, ничего страшного. Тяу тяу тяу тяу. (Простите, не удержался:)");
        err1.printInfo();
        fatalError.printInfo();
        criticalError.printInfo();
        anotherError.printInfo();
    }
}