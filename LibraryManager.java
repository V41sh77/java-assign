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

            if (choice == 3) {
                System.out.println("Exiting program");
                break;
            }
        }

        scanner.close();
    }
}
