import java.lang.Math;
import java.util.ArrayList;

public class passwordGenerator {
    public static void main (String[] args) {
        ArrayList<String> passList = new ArrayList<String>();
        int numOfPass = 100;
        int passLen = 6;
        int passRejectCount = 0;
        for (int i = 0; i < numOfPass; i++) {
            String pass = "";
            for (int j = 0; j < passLen; j++) {
                pass = pass + getRandASCII();
            }
            if (passExists(pass, passList) == false) {
                passList.add(pass);
            } else {
                passRejectCount++;
                i--;
            }
            System.out.println("Password added: " + pass);
        }
        System.out.println("Number of passwords generated: " + passList.size());
        System.out.println("Number of passwords rejected: " + passRejectCount);
    }

    public static char getRandASCII () {
        /*
        Minimum readable ASCII code: DEC 32
        Maximum readable ASCII code: DEC 126
        */
        int min = 32;
        int max = 126;
        int charCode = (int)(Math.floor(Math.random() * (max - min))) + min;
        return (char)charCode;
    }

    public static boolean passExists (String pass, ArrayList<String> passList) {
        /*Makes sure studentList is sorted in ascending order*/
        java.util.Collections.sort(passList);

        int left = 0;
        int right = passList.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (pass.compareTo(passList.get(middle)) < 0) {
                /*Limits the search to the left half of the ArrayList*/
                right = middle - 1;
            } else if (pass.compareTo(passList.get(middle)) > 0) {
                /*Limits the search to the right half of the ArrayList*/
                left = middle + 1;
            } else {
                /*Target Student is found between the left and right bound*/
                return true;
            }
        }

        return false;
    }

}
