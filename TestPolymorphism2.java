class Display {
    // Method with one String parameter
    public void show(String name) {
        System.out.println("Displaying name: " + name);
    }

    // Overloaded method with one String and one int parameter
    public void show(String name, int age) {
        System.out.println("Displaying name: " + name + " and age: " + age);
    }
}

public class TestPolymorphism2 {
    public static void main(String[] args) {
        Display obj = new Display();
        
        // Calls the first show() method
        obj.show("Meghan");
        
        // Calls the second, overloaded show() method
        obj.show("Rohan", 16);
    }
}