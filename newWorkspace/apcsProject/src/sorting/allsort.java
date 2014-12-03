import java.lang.Math;

public class allsort {
    
    public static void main (String[] args) {
        
        System.out.println("Program started");
        int[] array1 = generate(10);
        
        if (checkSort(select(array1))) {
            System.out.println("Your program worked, Congratulations!");
        } else {
            System.out.println("You still need to work some kinks out...");
            System.out.println("**********");
            
            System.out.println("Unsorted array:");
            printArray(array1);
            System.out.println("Sorted array:");
            printArray(select(array1));
        }
        
    }
    
    
    
    public static int[] generate (int size) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            randArray[i] = (int)(Math.random() * 100.00);
        }
        return randArray;
    }
    
    public static boolean checkSort (int[] array) {
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
    
    public static int[] select (int[] unsortArray) {
        
        int[] sortArray = unsortArray;
        int maxIndex = -1;
        int temp = -1;
        int unsortedLen = sortArray.length - 1;
        
        /*Sort array using select sorting*/
        for (int i = sortArray.length - 1; i > 1; i--) {
            maxIndex = 0;
            for (int j = 1; j < unsortedLen; j++) {
                if (sortArray[maxIndex] < sortArray[j]) {
                    maxIndex = j;
                }
            }
            
            temp = sortArray[i];
            sortArray[i] = sortArray[maxIndex];
            sortArray[maxIndex] = temp;
            unsortedLen--;
        }
        
        return sortArray;
        
    }
    
    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}