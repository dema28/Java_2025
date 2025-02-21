package Novicov.Lessons08;

public class Main {
    public static void main(String[] args) {

        Book onegin = new Book();
        onegin.isbn = "978-0-345-33968-1";
        onegin.title = "Onegin";
        onegin.authors = new String[] {"Fyodor Dostoevsky"};
        onegin.noOfPages = 1800;


        Book harryPotter = new Book();
        harryPotter.isbn = "978-0-7432-7071-2";
        harryPotter.title = "Harry Potter and the Philosopher's Stone";
        harryPotter.authors = new String[] {"J.K. Rowling"};
        harryPotter.noOfPages = 300;

        System.out.println(onegin.makeCatalogCard());
        System.out.println(harryPotter.makeCatalogCard());

        Book.border = "++++++++++++++++";

        System.out.println(onegin.makeCatalogCard());
        System.out.println(harryPotter.makeCatalogCard());

        System.out.println(Book.validate("1234"));
        System.out.println(Book.validate("978-0-345-33968-1"));
        System.out.println(Book.validate("9780743270712"));
        System.out.println(onegin.isValid());
    }

}
