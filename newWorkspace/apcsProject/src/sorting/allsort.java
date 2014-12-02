import java.lang.Math;

public class allsort {
    
    public static void main (String[] args) {
        
        System.out.println("Program started");
        int[] array1 = generate(10);
        int[] array2 = duplicate(array);
        
    }
    
    
    
    public static int[] generate (int size) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            randArray[i] = (int)(Math.random() * 100.00);
        }
        return randArray;
    }
    
    public static boolean sorted (int[] array) {
        boolean status = false;
        for(int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        return status;
    }
    
    /*This still needs some work*/
    public static int[] duplicate (int[] a) {
        int[] b = new int[a.length];
        b = a;
        return b;
    }
    
}