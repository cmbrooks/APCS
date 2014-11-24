package bagelOrder;

// Exam 1 Question 2

/********************** Part (b) **********************/

// TODO:
// Write a BakersDozen class that extends BagelsOrderItem

public class BakersDozen extends BagelsOrderItem {

    public BakersDozen (double price) {
        super(price, 13);
    }

    public double getCost() {
        return (super.getCost() - super.getPrice());
    }
    
}
