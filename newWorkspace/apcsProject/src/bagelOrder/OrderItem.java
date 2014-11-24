package bagelOrder;

// Exam 1 Question 2

public interface OrderItem
{
  /** Returns the price of this item */
  double getPrice();

  /** Returns the number of units ordered */
  int getQuantity();

  /** Returns the total cost for this order item */
  double getCost();
}
