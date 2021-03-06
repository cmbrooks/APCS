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

        if (min < max) {
            int mid = ((max + min) / 2);
            msort(array, min, mid);
            msort(array, mid+1, max);
            merge(array, min, mid, max);
        }

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
            System.out.print("Left Min: " + lMin + "\t");
            System.out.println("Right Min: " + rMin);
            System.out.print("Left Max: " + lMax + "\t");
            System.out.println("Right Max: " + rMax);

            if (array[lMin] < array[rMin]) {
                B[k] = array[lMin];
                System.out.println("Added to B[]: " + array[lMin]);
                lMin++;
                k++;
            } else {
                B[k] = rMin;
                System.out.println("Added to B[]: " + array[rMin]);
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
