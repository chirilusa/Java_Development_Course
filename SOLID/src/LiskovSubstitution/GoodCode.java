package LiskovSubstitution;

class GoodBooking {
    protected double price;

    public GoodBooking(double price) {
        this.price = price;
    }

    public double calculateTotal() {
        return price;
    }
}

class GoodDiscountedBooking extends GoodBooking {
    private double discount;

    public GoodDiscountedBooking(double price, double discount) {
        super(price);
        this.discount = discount;
    }

    @Override
    public double calculateTotal() {
        // The overridden method calculates the discounted total without allowing negative values.
        double discountedPrice = Math.max(price - discount, 0);
        return discountedPrice;
    }
}

class GoodMain {
    public static void main(String[] args) {
        // Creating a regular booking
        GoodBooking regularBooking = new GoodBooking(100);
        double regularTotal = regularBooking.calculateTotal();
        System.out.println("Regular Booking Total: " + regularTotal);

        // Creating a discounted booking
        GoodBooking discountedBooking = new GoodDiscountedBooking(100, 30);
        double discountedTotal = discountedBooking.calculateTotal();
        System.out.println("Discounted Booking Total: " + discountedTotal);

        // Check if base class can be replaced with derived class
        // This check is to demonstrate that Liskov Substitution is maintained in the good code
        GoodBooking baseClassReplacement = discountedBooking;
        double replacementTotal = baseClassReplacement.calculateTotal();
        System.out.println("Replacement Total using Derived Class: " + replacementTotal);
    }
}
