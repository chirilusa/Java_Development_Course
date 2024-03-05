package LiskovSubstitution;
class BadBooking {
    protected double price;

    public BadBooking(double price) {
        this.price = price;
    }

    // The base class defines a method to calculate the total price.
    public double calculateTotal() {
        return price;
    }
}

class BadDiscountedBooking extends BadBooking {
    private double discount;

    public BadDiscountedBooking(double price, double discount) {
        super(price);
        this.discount = discount;
    }

    // Violation of Liskov Substitution Principle
    @Override
    public double calculateTotal() {
        double discountedPrice = price - discount;

        // Problem: The derived class introduces unexpected behavior by allowing a negative discounted price.
        // This violates the Liskov Substitution Principle as it breaks the expectation set by the base class.
        if (discountedPrice < 0) {
            System.out.println("Error: Discounted price is negative.");
            return price;  // Returning the original price to avoid negative total.
        } else {
            return discountedPrice;
        }
    }
}

class BadMain {
    public static void main(String[] args) {
        // Creating a regular booking
        BadBooking regularBooking = new BadBooking(100);
        double regularTotal = regularBooking.calculateTotal();
        System.out.println("Regular Booking Total: " + regularTotal);

        // Creating a discounted booking
        BadBooking discountedBooking = new BadDiscountedBooking(100, 30);
        double discountedTotal = discountedBooking.calculateTotal();
        System.out.println("Discounted Booking Total: " + discountedTotal);

        // Check if base class can be replaced with derived class
        // This check is to illustrate the violation of Liskov Substitution Principle
        BadBooking baseClassReplacement = discountedBooking;
        double replacementTotal = baseClassReplacement.calculateTotal();
        System.out.println("Replacement Total using Derived Class: " + replacementTotal);
    }
}