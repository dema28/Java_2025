package Novicov.Lessons10;

public class TextScanner {

    public String scanBook(Book book) {
        String text ="";
        for(Page p : book.pages) {
            text += p.text;
        }
        return text;
    }

    public String scan(Page page) {
        return page.text;
    }

    public String scan(String text) {
        return text;
    }

    public static void main(String[] args) {
        Page p1 = new Page("1");
        Page p2 = new Page("2");
        Page p3 = new Page("3");

        Book b = new Book(new Page[] {p1, p3});

        TextScanner scanner = new TextScanner();

        System.out.println(scaner.scan(book));
        System.out.println(scanner.scan(p2));
        scanner.scan("");
        scanner.scan(p1);


    }
}

class Page {
    final String text;

    Page(String text) {
        this.text = text;
    }
}

class Book {
    final Page[] pages;

    Book(Page[] pages) {
        this.pages = pages;
    }

}
