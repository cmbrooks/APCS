public class select {
    
    public static void main (String[] args) {
        
        int[] sortArray = {3,2,4,1};
        int maxNumber = sortArray[0];
        int maxIndex = -1;
        int temp = -1;
        
        /*Sort array using select sorting*/
        for (int i = 0; i < sortArray.length; i++) {
            
            //compNumber = sortArray[i];
            System.out.println("Outer for loop itteration: " + i);
            for (int j = 1; j < sortArray.length; j++) {
                System.out.println("Inner For loop itteration: " + j);
                System.out.println("Number being compared: " + maxNumber);
                System.out.println("Element at index j: " + sortArray[j]);
                /**HERE IS THE PROBLEM!!!**/
                if (maxNumber < sortArray[j]) {
                    System.out.println(maxNumber + " is less than " + sortArray[i] + " so new max number is " + sortArray[i]);
                    maxNumber = sortArray[j];
                    maxIndex = j;
                } else {
                    System.out.println("Max is still max. Do nothing");
                }
                System.out.println("//////////////");
                
            }
            
            temp = sortArray[i];
            sortArray[i] = sortArray[maxIndex];
            sortArray[maxIndex] = temp;
            //System.out.println(sortArray[i] + " was swapped with " + sortArray[maxIndex]);
            System.out.println();
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