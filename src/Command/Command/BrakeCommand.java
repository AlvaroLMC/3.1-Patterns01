package Command.Command;

import Command.Domain.Vehicle;

public class BrakeCommand implements Command {
    private final Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.brake();
    }
}