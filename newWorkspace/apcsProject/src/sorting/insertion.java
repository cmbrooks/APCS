public class insertion {
    
    public static void main (String[] args) {
        
        int[] array = generate(4);
        System.out.println("Unsorted array");
        printArray(array);
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
        System.out.println("Sorted Array");
        printArray(array);
        
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