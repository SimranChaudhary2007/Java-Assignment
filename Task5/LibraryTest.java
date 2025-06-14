/* You are building a library management system. Design an interface named "LibraryItem" with the following methods:
String getTitle() to retrieve the title of the library item
String getAuthor() to retrieve the author of the library item
int getYear() to retrieve the publication year of the library item
boolean isAvailable() to check if the library item is currently available for borrowing. */

package Task5;

interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;

    Book(String t, String a, int y, boolean av) {
        this.title = t;
        this.author = a;
        this.year = y;
        this.available = av;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem book = new Book("The Alchemist", "Paulo Coelho", 1988, true);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());
    }
}
