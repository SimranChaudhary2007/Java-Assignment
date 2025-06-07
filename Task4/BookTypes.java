class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class BookTypes {
    public static void main(String[] args) {
        FictionBook fb = new FictionBook("1984", "George Orwell");
        fb.displayDetails();

        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        nfb.displayDetails();

        TechnicalBook tb = new TechnicalBook("Effective Java", "Joshua Bloch");
        tb.displayDetails();
    }
}
