import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("(A)dd, (D)elete, (E)mail search, (P)rint List, (S)earch, (Q)uit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

            switch (Character.toUpperCase(choice)) {
                case 'A':
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactBook.addContact(name, phoneNumber, email);
                    break;
                case 'D':
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    contactBook.deleteContact(deleteName);
                    break;
                case 'E':
                    System.out.print("Enter email to search: ");
                    String searchEmail = scanner.nextLine();
                    contactBook.searchByEmail(searchEmail);
                    break;
                case 'P':
                    contactBook.printContactList();
                    break;
                case 'S':
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactBook.searchByName(searchName);
                    break;
                case 'Q':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (Character.toUpperCase(choice) != 'Q');
        
        scanner.close();
    }
}
