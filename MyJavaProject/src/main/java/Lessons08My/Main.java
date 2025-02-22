package Lessons08My;

public class Main {
    public static void main(String[] args) {

        Book borodino = new Book();
        borodino.isbn = "978-0-547-88693-7";
        borodino.title = "Borodino";
        borodino.author = "Лермонтов";
        borodino.noOfPages = 183;


        Book onegin = new Book();
        onegin.isbn = "978-0-670-03190-5";
        onegin.title = "Подростки";
        onegin.author = "Лев Толстой";
        onegin.noOfPages = 864;

        System.out.println(onegin.CatalogCard());
        System.out.println("--------------------------------");
        System.out.println(borodino.CatalogCard());
    }



}
