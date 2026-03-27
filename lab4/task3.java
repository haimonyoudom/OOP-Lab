import java.util.Scanner;

class Book
{
    static Scanner sc = new Scanner(System.in);
    int isbn;
    float price;
    String title;
    int getIsbn()
    {
        return isbn;
    }
    Book()
    {

    }
    Book(int isbn,String title,float price)
    {
        this.isbn=isbn;
        this.title=title;
        this.price=price;
    }
    static void listBook(Book books[])
    {
        System.out.println("=".repeat(56));
        System.out.printf("| %-6s | %-6s | %-25s | %-6s |%n", "No", "ISBN", "Title", "Price");
        System.out.println("=".repeat(56));
        int displayCount = 0;
        for(int i = 0 ; i < books.length;i++)
        {
            Book b = books[i];
            if(b != null) {
                System.out.printf("| %-6d | %-6d | %-25s | %-6.2f$|%n", (i+1), b.isbn, b.title, b.price);
                displayCount++;
            }
        }
        if(displayCount == 0) {
            System.out.println("No Book to display.");
        }
        System.out.println("=".repeat(56));
    }
     static boolean updateBookById(Book books[], int id) {
       
    for (int i = 0; i < books.length; i++) {

        
    if (books[i] != null && books[i].getIsbn() == id) {
        System.out.println("=== Update a Book ===");
        System.out.println("Please update the following:");
        System.out.print("ISBN: ");
        int isbn = sc.nextInt();
        sc.nextLine();
        System.out.print("Title : ");
        String title = sc.nextLine();
        System.out.print("Price : ");
        float price = sc.nextFloat();
        sc.nextLine();
        Book temp = new Book(isbn, title, price);
        books[i]=temp;
        return true;
    }
    }
    return false;
    }
}
public class task3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];
        int count = 0;

        while(true)
        {
        System.out.println("=== Menu===");
        System.out.printf("%-25s >%n","1. View all books");
        System.out.printf("%-25s >%n","2. Add a new book");
        System.out.printf("%-25s >%n","3. Update a book");
        System.out.printf("%-25s >%n","4. Quit");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                Book.listBook(books);
                break;
            case 2:
                if(count < 100) {
                    System.out.print("ISBN: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Price: ");
                    float price = sc.nextFloat();
                    sc.nextLine();
                    books[count] = new Book(isbn, title, price);
                    count++;
                    System.out.println("Book added successfully!");
                } else {
                    System.out.println("Array is full!");
                }
                break;
            case 3:
                System.out.print("Enter ID to delete: ");
                int delId = sc.nextInt();
                sc.nextLine();
                if(Book.updateBookById(books, delId)) {
                    System.out.println("Book updated successfully!");
                } else {
                    System.out.println("Book not found!");
                }
                break;
            case 4:
                System.out.println("Exit Program...");
                break;
                
            default:
                System.out.println("Invalid choice!");
                break;
        }
        if(choice == 4){break;}
        }
        sc.close();
    }
}
