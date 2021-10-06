package ru.job4j.tracker.encapsulation;

public class Library {
    public static void swapBooks(Book[] books, int start, int finish) {
        Book temp;
        temp = books[start];
        books[start] = books[finish];
        books[finish] = temp;
    }

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 777);
        Book aSoundOfThunder = new Book("A Sound of Thunder", 180);
        Book startingFromScratch = new Book("Starting from Scratch", 42);
        Book iAmLegend = new Book("I Am Legend", 712);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = aSoundOfThunder;
        books[2] = startingFromScratch;
        books[3] = iAmLegend;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages.");
        }
        swapBooks(books, 0, 3);
        System.out.println(System.lineSeparator() + "After swap books:"
                + System.lineSeparator());
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages.");
        }
        System.out.println(System.lineSeparator() + "Shown only \"Clean code\":"
                + System.lineSeparator());
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages() + " pages.");
            }
        }
    }
}
