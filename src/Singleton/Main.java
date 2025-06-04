package Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singleton.Undo undoManager = Singleton.Undo.getInstance();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Undo Command System ===");
        while (true) {
            System.out.print("Enter a command (add [cmd], undo, history, exit): ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.startsWith("add ")) {
                String command = input.substring(4);
                undoManager.addCommand(command);
            } else if (input.equalsIgnoreCase("undo")) {
                undoManager.removeLastCommand();
            } else if (input.equalsIgnoreCase("history")) {
                undoManager.showHistory();
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}