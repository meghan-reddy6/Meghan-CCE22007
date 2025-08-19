// Parent or Superclass
class Vehicle {
    void run() {
        System.out.println("Vehicle is moving.");
    }
}

// Child or Subclass that overrides the run() method
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running on the road.");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run(); // Calls the overridden method in the Car class
    }
}