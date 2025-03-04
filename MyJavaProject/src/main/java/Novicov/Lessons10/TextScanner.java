package Novicov.Lessons10;

public class TextScanner {
    public String scan(Book book) {
        String text ="";
        for(Page p : book.pages) {
            text += p.text;
        }
        return text;
    }
    public String scan(Page page) {
        return page.text;
    }

    public int scan(String text) {
        return 0;
    }


    public static void main(String[] args) {
        Page p1 = new Page("This\nis\npage 1");
        Page p2 = new Page("This\nis\npage 2");
        Page p3 = new Page("This\nis\npage 3");

        TextScanner scanner = new TextScanner();

        Book book = new Book(new Page[]{p1, p3});

        System.out.println(scanner.scan(book));
        System.out.println(scanner.scan(p2));


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





