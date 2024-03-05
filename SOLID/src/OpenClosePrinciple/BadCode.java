package OpenClosePrinciple;
class BadRectangle {
    public double width;
    public double height;

    public BadRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

class BadCircle {
    public double radius;

    public BadCircle(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {
    // Not a good approach: The class should be closed for modification, but it's modified to add support for rectangles.
    public double calculateRectangleArea(BadRectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    // Not a good approach: The class should be closed for modification, but it's modified to add support for circles.
    public double calculateCircleArea(BadCircle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
}

class Main {
    public static void main(String[] args) {
        BadRectangle rectangle = new BadRectangle(5, 10);
        BadCircle circle = new BadCircle(7);

        AreaCalculator areaCalculator = new AreaCalculator();

        double rectangleArea = areaCalculator.calculateRectangleArea(rectangle);
        System.out.println("Rectangle Area: " + rectangleArea);

        double circleArea = areaCalculator.calculateCircleArea(circle);
        System.out.println("Circle Area: " + circleArea);
    }
}