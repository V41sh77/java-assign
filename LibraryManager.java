import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {

        // Scanner 
        Scanner scanner = new Scanner(System.in);

        // ArrayList to store books
        ArrayList<Book> bookList = new ArrayList<>();

        // Menu loop
        while (true) {
            System.out.println("\n----- Library Menu -----");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
             if (choice == 1) {

    System.out.print("Enter book title: ");
    String title = scanner.nextLine();

    System.out.print("Enter book author: ");
    String author = scanner.nextLine();

    System.out.print("Enter ISBN: ");
    String isbn = scanner.nextLine();

    // Create Book object and add to list
    Book newBook = new Book(title, author, isbn);
    bookList.add(newBook);

    System.out.println("Book added successfully!");
}
else if (choice == 2) {

                System.out.println("Total books right now: " + bookList.size()); 

                if (bookList.isEmpty()) {
                    System.out.println("No books available.");
                } else {
                    System.out.println("\n--- All Books ---");
                    for (Book book : bookList) {
                        book.displayBookInfo();
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting program");
                break;
            }
            else{
                 System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
