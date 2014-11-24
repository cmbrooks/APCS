package hw13;

// Exam 1 Question 2

import java.util.List;
import java.util.ArrayList;

/********************** Extra **********************/

public class ShoppingCart extends ArrayList<OrderItem> {
    private double total;
    public double totaldue(){
        for (int i = 0; i < this.size(); i++) {
          total += this.get(i);
        }
        return total;
    }

    /********************** Test **********************/=
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // TODO:
        // Enable the following tests when the bagels oder classes are ready

        cart.add(new BagelsOrderItem(0.25, 3));
        cart.add(new BakersDozen(0.35));
        System.out.printf("Total due: $%.02f", cart.totalDue());
    }

}
