abstract class Vehicle {
    abstract void start(); // abstract method (no implementation)
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class AbstractionExample1 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        
        v1.start();
        v2.start();
    }
}
