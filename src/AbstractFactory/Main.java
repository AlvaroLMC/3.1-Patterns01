package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose country (spain/us): ");
        String country = scanner.nextLine().trim().toLowerCase();

        ContactFactory factory = switch (country) {
            case "spain" -> new SpainContactFactory();
            case "us" -> new USContactFactory();
            default -> throw new IllegalArgumentException("Unsupported country");
        };

        ContactManager manager = new ContactManager(factory);

        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        manager.addContact(street, city, phone);
    }
}
