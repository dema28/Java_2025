package Novicov.Lessons08;

import java.util.Arrays;

public class Book {
    String isbn;
    String title;
    String[] authors;
    int noOfPages;

    static String border = "\n--------------------------------";

    public String makeCatalogCard() {
        return "ISBN: " + isbn + "\n" +
                "Title: " + title + "\n" +
                "Author: " + Arrays.toString(authors) + "\n" +
                "Number of Pages: " + noOfPages + "\n" + border;
    }

    public boolean isValid() {
        return validate(isbn);
    }

    static boolean validate(String isbn) {
        return isbn.length() == 9 || isbn.length() == 13;
    }

}
