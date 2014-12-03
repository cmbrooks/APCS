import java.lang.Math;

public class allsort {
    
    public static void main (String[] args) {
        
        int[] array1 = generate(1000);
        
        if (checkSort(select(array1))) {
            System.out.println(true);
        } else {
            System.out.println(false);
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
    
    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}