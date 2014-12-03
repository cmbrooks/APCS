public class select {
    
    public static void main (String[] args) {
        
        int[] sortArray = generate(4);
        int minIndex = -1;
        int temp = -1;
        
        /*Print unsorted array*/
        System.out.println("Unsorted array");
        printArray(sortArray);
        
        /*Sort array using select sorting*/
        for (int firstPlace = 0; firstPlace < sortArray.length - 1; firstPlace++) {
            minIndex = sortArray.length - 1;
            System.out.println("Sort line: " + firstPlace);
            for (int j = sortArray.length - 1; j >= firstPlace; j--) {
                System.out.println("Inner For loop itteration: " + j);
                System.out.println("Number being compared: " + sortArray[minIndex]);
                System.out.println("Element at index j (" + j + "): " + sortArray[j]);
                if (sortArray[j] < sortArray[minIndex]) {
                    System.out.print(sortArray[j] + " is less than " + sortArray[minIndex]);
                    minIndex = j;
                    System.out.println(" so new min number is " + sortArray[minIndex]);
                } else {
                    System.out.println(sortArray[minIndex] + " is less than " + sortArray[j] + ". Do nothing");
                }
                System.out.println("//////////////");
                
            }
            
            temp = sortArray[minIndex];
            sortArray[minIndex] = sortArray[firstPlace];
            sortArray[firstPlace] = temp;
            System.out.println(sortArray[firstPlace] + " was swapped with " + sortArray[minIndex]);
            System.out.println();
        }
        
        /*Print sorted array*/
        System.out.println("Sorted array");
        printArray(sortArray);
        
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