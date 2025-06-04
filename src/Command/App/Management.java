package Command.App;

import Command.Command.AccelerateCommand;
import Command.Command.BrakeCommand;
import Command.Command.StartCommand;
import Command.Controller.Controller;
import Command.Domain.*;

public class Management {
    private final Controller controller = new Controller();

    private void performVehicleActions(String name, Vehicle vehicle) {
        System.out.println("== " + name + " Actions ==");
        controller.executeCommand(new StartCommand(vehicle));
        controller.executeCommand(new AccelerateCommand(vehicle));
        controller.executeCommand(new BrakeCommand(vehicle));
        System.out.println();
    }

    public void run() {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle plane = new Plane();
        Vehicle boat = new Boat();

        performVehicleActions("Car", car);
        performVehicleActions("Bike", bike);
        performVehicleActions("Plane", plane);
        performVehicleActions("Boat", boat);
    }
}
