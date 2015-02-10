import java.util.Random;

public class takeSeat {
    
    public static void main (String[] args) {
    
        int correctSeats = 0;
        Boolean[] seats = new Boolean[10];
        for (int i = 0; i < seats.length; i++) {
            seats[i] = false;
        }
        
        takeRandSeat(seats);
        
        for (int j = 0; j < seats.length; j++) {
            if (seats[j] == false) {
                seats[j] = true;
                correctSeats++;
            } else {
                takeRandSeat(seats);
            }
        }
        
        for (int k = 0; k < seats.length; k++) {
            System.out.println(seats[k]);
        }
        
        System.out.println("Number of correct seats taken: " + correctSeats);
        
    }
    
    public static void takeRandSeat (Boolean[] seats) {
        int randomSeat = new Random().nextInt(seats.length);
        if (seats[randomSeat] == false) {
            seats[randomSeat] = true;
        }
        /*Error in this recursion*/
        // else {
        //     takeRandSeat(seats);
        // }
        
    }
    
}