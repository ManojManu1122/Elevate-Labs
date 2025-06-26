
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Sample Data
        library.addBook(new Book(1, "The Alchemist"));
        library.addBook(new Book(2, "Java Programming"));
        library.addUser(new User(101, "Manoj"));

        while (true) {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    library.viewBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
