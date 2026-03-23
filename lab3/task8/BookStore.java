import java.util.ArrayList;

class Author {
    String name;
    Author(String name) {
        this.name = name;
    }
}

class Book {
    String id, title, genre;
    double price;
    int pages;
    Author author;

    Book(String id, String title, double price, int pages, String genre, Author author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    void display() {
        System.out.printf("| %-5s | %-20s | %-7.2f | %-5d | %-12s | %-14s |%n", id, title, price, pages, genre, author.name);
        System.out.println("=".repeat(80));
    }
}

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Author robert = new Author("Robert Martin");

        books.add(new Book("001", "Clean Code",         35.99, 431, "Programming", robert));
        books.add(new Book("002", "Clean Architecture", 39.99, 369, "Programming", robert));
        books.add(new Book("003", "The Clean Coder",    29.99, 256, "Programming", robert));

        System.out.printf("| %-5s | %-20s | %-7s | %-5s | %-12s | %-14s |%n", "ID", "Title", "Price", "Pages", "Genre", "Author");
        System.out.println("=".repeat(80));
        for (Book b : books) {
            b.display();
        }
    }
}