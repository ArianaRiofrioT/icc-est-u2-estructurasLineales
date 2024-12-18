package Controller;

import materia.models.Contact;
import java.util.Scanner;

public class MenuController {
    private ContactManager contactManager;
    private Scanner scanner;

    public MenuController() {
        contactManager = new ContactManager();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\n--- Contact Manager Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Print Contacts");
            System.out.println("3. Find Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    contactManager.printList();
                    break;
                case 3:
                    findContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option - Try again.");
            }
        } while (option != 5);
    }

    private void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone: ");
        String phone = scanner.nextLine();
        contactManager.addContact(new Contact<>(name, phone));
        System.out.println("Contact added successfully!");
    }

    private void findContact() {
        System.out.print("Enter the name to search: ");
        String name = scanner.nextLine();
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private void deleteContact() {
        System.out.print("Enter the name to delete: ");
        String name = scanner.nextLine();
        contactManager.deleteContactByName(name);
        System.out.println("Contact deleted.");
    }
}
