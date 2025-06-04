package Command.Controller;

import Command.Command.Command;

public class Controller {
    public void executeCommand(Command command) {
        command.execute();
    }
}

