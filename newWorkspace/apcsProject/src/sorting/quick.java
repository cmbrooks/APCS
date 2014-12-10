public class quick {
    
    public static void main (String[] args) {
        
        int[] array = generate(5);
        System.out.println("Original Array:");
        printArray(array);
        
        /*Start Quick sort here*/
        
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