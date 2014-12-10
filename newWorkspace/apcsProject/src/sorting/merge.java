public class merge {
    
    public static void main (String[] args) {
        
        int[] array = generate(5);
        System.out.println("Original Array:");
        printArray(array);
        
        /*Start Merge Sort here*/
        int[] sortArray = msort(array, 0, array.length - 1);
        System.out.println("Final Array:");
        printArray(sortArray);
        
    }
    
    public static int[] msort (int[] array, int min, int max) {
        
        int mid = (max + min) / 2;
        msort(array, min, mid);
        msort(array, mid, max);
        merge(array, min, mid, max);
        
        return array;
        
    }
    
    public static void merge (int[] array, int min, int mid, int max) {
        
        int lMin = min;
        int lMax = mid;
        int rMin = mid;
        int rMax = max;
        int[] B = new int[max - min];
        int k = 0;
        
        while (lMin < lMax && rMin < rMax) {
            
            if (array[lMin] < array[rMin]) {
                B[k] = array[lMin];
                lMin++;
                k++;
            } else {
                B[k] = rMin;
                rMin++;
                k++;
            }
            
        }
        
    }

    public static int[] generate (int size) {
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            randArray[i] = (int)(Math.random() * 100.00);
        }
        return randArray;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}