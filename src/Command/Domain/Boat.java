package Command.Domain;

public class Boat implements Vehicle {
    public void start() { System.out.println("Boat starting engine"); }
    public void accelerate() { System.out.println("Boat increasing speed"); }
    public void brake() { System.out.println("Boat slowing down"); }
}