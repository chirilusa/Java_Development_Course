package OpenClosePrinciple;

// A better approach: Create an abstraction (interface or abstract class) for shapes.
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class MainGood {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        // You can now add new shapes without modifying existing code.
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);
    }
}