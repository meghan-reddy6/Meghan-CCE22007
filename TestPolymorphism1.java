// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child classes
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class TestPolymorphism1 {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Rectangle(); 
        myShape.draw();           

        myShape = new Circle(); 
        myShape.draw();         
    }
}