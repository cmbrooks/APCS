public class bubble {
    
    public static void main (String[] args) {
        
        int[] array = generate(5);
        int temp = -1;
        
        for (int i = array.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        
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