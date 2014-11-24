package hw13;

// Exam 1 Question 2

/********************** Part (a) **********************/

// TODO:
// Write a public class BagelsOrder that implements the OrderItem interface

public class BagelsOrder implements OrderItem {
    
    private double bagelPrice;
    private int orderQuantity;

    public BagelsOrder (double price, int quantity) {
        bagelPrice = price;
        orderQuantity = quantity;
    }

    public double getPrice() {
        return bagelPrice;
    }

    public int getQuantity() {
        return orderQuantity;
    }

    public double getCost() {
        return (bagelPrice * orderQuantity);
    }

}
