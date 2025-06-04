package Command.Domain;

public class Bike implements Vehicle {
    public void start() { System.out.println("Bike ready to pedal"); }
    public void accelerate() { System.out.println("Bike accelerating"); }
    public void brake() { System.out.println("Bike braking"); }
}
