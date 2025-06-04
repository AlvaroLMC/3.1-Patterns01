package Singleton;

import java.util.Stack;

public class Undo {
    private static Singleton.Undo instance;
    private final Stack<String> commandHistory; //Almacena LIFO

    private Undo() {
        commandHistory = new Stack<>();
    }

    public static Singleton.Undo getInstance() {
        if (instance == null) {
            instance = new Singleton.Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commandHistory.push(command);
        System.out.println("Command added: " + command);
    }

    public void removeLastCommand() {
        if (!commandHistory.isEmpty()) {
            System.out.println("Removed: " + commandHistory.pop());
        } else {
            System.out.println("No commands to remove.");
        }
    }

    public void showHistory() {
        if (commandHistory.isEmpty()) {
            System.out.println("No commands in history.");
        } else {
            System.out.println("Command history:");
            for (int i = commandHistory.size() - 1; i >= 0; i--) {
                System.out.println(commandHistory.get(i));
            }
        }
    }
}
