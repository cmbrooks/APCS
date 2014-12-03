import java.util.Arrays;
import java.lang.Math;

public class allsort {
    
    public static void main (String[] args) {
        
        int[] array1 = generate(10);
        
        int[] array2 = array1.clone();
        
        if (array1 == array2) {
            System.out.println("Results are void, arrays 1 and 2 are the same");
        }
        
        if (checkSort(insertion(array1)) && checkSort(select(array2))) {
            System.out.println("Sorted correctly");
        } else {
            System.out.println("Not sorted correctly");
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
            if (array[i] >= array[i - 1]) {
                status = true;
            } else {
                status = false;
                break;
            }
        }
        return status;
    }
    
    public static int[] select (int[] array) {
        
        int minIndex = -1;
        int temp = -1;

        /*Sort array using select sorting*/
        for (int firstPlace = 0; firstPlace < array.length - 1; firstPlace++) {
            
            minIndex = array.length - 1;
            for (int j = array.length - 1; j >= firstPlace; j--) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            temp = array[minIndex];
            array[minIndex] = array[firstPlace];
            array[firstPlace] = temp;
            
        }
        
        return array;
        
    }
    
    public static int[] insertion (int[] array) {
        int temp = -1;
        
        for (int sortLine = 1; sortLine < array.length; sortLine++) {
            int sortIndex = sortLine; 
            while (sortIndex > 0 && array[sortIndex] < array[sortIndex - 1]) {
                /*Swap elements*/
                temp = array[sortIndex];
                array[sortIndex] = array[sortIndex - 1];
                array[sortIndex - 1] = temp;
                
                sortIndex--;
            }
        }
        return array;
    }
    
    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}