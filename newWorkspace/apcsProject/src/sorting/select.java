public class select {
    
    public static void main (String[] args) {
        
        int[] sortArray = {3,6,7,9,1,2,4,5};
        int maxIndex = -1;
        int temp = -1;
        int unsortedLen = sortArray.length - 1;
        
        /*Sort array using select sorting*/
        for (int i = sortArray.length - 1; i > 1; i--) {
            maxIndex = 0;
            System.out.println("Outer for loop itteration: " + i);
            for (int j = 1; j < unsortedLen; j++) {
                System.out.println("Inner For loop itteration: " + j);
                System.out.println("Number being compared: " + sortArray[maxIndex]);
                System.out.println("Element at index j: " + sortArray[j]);
                if (sortArray[maxIndex] < sortArray[j]) {
                    System.out.print(sortArray[maxIndex] + " is less than " + sortArray[j]);
                    maxIndex = j;
                    System.out.println(" so new max number is " + sortArray[maxIndex]);
                } else {
                    System.out.println(sortArray[maxIndex] + " is greater than " + sortArray[j] + ". Do nothing");
                }
                System.out.println("//////////////");
                
            }
            
            temp = sortArray[i];
            sortArray[i] = sortArray[maxIndex];
            sortArray[maxIndex] = temp;
            System.out.println(sortArray[i] + " was swapped with " + sortArray[maxIndex]);
            System.out.println();
            unsortedLen--;
        }
        
        /*Print sorted array*/
        for (int i = 0; i < sortArray.length; i++) {
            System.out.println(sortArray[i]);
        }
        
    }
    
    public void swap (int a, int b, int[] array) {
        int temp = -1;
        temp = array[a];
        array[a] = b;
        array[b] = temp;
    }
    
}