package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book java = new Book("Java", 200);
        Book ml = new Book("M.L", 300);
        Book algorithms = new Book("Algorithms", 400);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = java;
        books[2] = ml;
        books[3] = algorithms;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        System.out.println();
        System.out.println("Replace index[0] to index[3]");
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book br = books[i];
            System.out.println(br.getName() + " - " + br.getCount());
        }
        System.out.println();
        System.out.println("Show only book which name 'Clean code'");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book bl = books[i];
            if ("Clean code".equals(bl.getName())) {
                System.out.println(bl.getName());
            }
        }
    }
}
