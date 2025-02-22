package Lessons08My;

public class Book {
    String isbn;
    String title;
    String author;
    int noOfPages;

    public String CatalogCard() {
        return "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Number of pages: " + noOfPages;

    }





}
