package Command.Domain;

public class Plane implements Vehicle {
    public void start() { System.out.println("Plane powering engines"); }
    public void accelerate() { System.out.println("Plane accelerating on runway"); }
    public void brake() { System.out.println("Plane braking on runway"); }
}
