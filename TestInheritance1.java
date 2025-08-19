// Parent or Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child or Subclass that inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


public class TestInheritance1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method inherited from Animal class
        myDog.bark(); // Method from Dog class
    }
}