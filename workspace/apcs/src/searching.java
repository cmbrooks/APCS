import java.util.ArrayList;
import java.util.Arrays;

public class searching {

    public static void main(String[] args) {

        /*Creates stats for the target student*/
        Student targetStudent = new Student("John", "Doe", 3.97);

        /*Initializes student roster*/
        ArrayList<Student> classRoster = generateRoster();

        /*Search list for target*/
        System.out.println("Starting sequential search");
        System.out.print("Target student " + targetStudent.getName() + " was found at index ");
        System.out.println(MyDemoSearch.sequentialListSearch(classRoster, targetStudent));
        System.out.println();

        System.out.println("Starting binary search");
        System.out.print("Target student " + targetStudent.getName() + " was found at index ");
        System.out.println(MyDemoSearch.binaryListSearch(classRoster, targetStudent));


    }

    private static ArrayList<Student> generateRoster () {
        ArrayList<Student> roster = new ArrayList<Student>();
        Student student1 = new Student("Jane", "Doe", 3.50);
        Student student2 = new Student("Cookie", "Doe", 2.80);
        Student student3 = new Student("John", "Doe", 3.97);
        Student student4 = new Student("Do-si", "Doe", 3.50);
        Student student5 = new Student("Play", "Doe", 4.13);
        Student student6 = new Student("Tae Kwon", "Doe", 3.75);
        roster.add(student1);
        roster.add(student2);
        roster.add(student3);
        roster.add(student4);
        roster.add(student5);
        roster.add(student6);
        return roster;
    }

}

class MyDemoSearch extends DemoSearch{

    public static int sequentialListSearch (ArrayList<Student> studentList, Student target) {
        for (int i = 0; i < studentList.size(); i++) {
            if (target.compareTo(studentList.get(i)) == 0) {
            	return i;
            }
        }
        /*If the target is not found*/
        return -1;
    }

    public static int binaryListSearch (ArrayList<Student> studentList, Student target) {
        /*Makes sure studentList is sorted in ascending order*/
        java.util.Collections.sort(studentList);

        int left = 0;
        int right = studentList.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target.compareTo(studentList.get(middle)) < 0) {
                /*Limits the search to the left half of the ArrayList*/
                right = middle - 1;
            } else if (target.compareTo(studentList.get(middle)) > 0) {
                /*Limits the search to the right half of the ArrayList*/
                left = middle + 1;
            } else {
                /*Target Student is found between the left and right bound*/
                return middle;
            }
        }

        /*Target was not found in the array*/
        return -1;
    }

    public int sequentialArraySearch (Student[] studentArray, Student target) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == target) {
                return i;
            }
        }
        /*If the target is not found*/
        return -1;
    }

    public int binaryArraySearch (Student[] studentArray, Student target) {
        /*Makes sure studentList is sorted in ascending order*/
        Arrays.sort(studentArray);

        int left = 0;
        int right = studentArray.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target.compareTo(studentArray[middle]) < 0) {
                /*Limits the search to the left half of the ArrayList*/
                right = middle - 1;
            } else if (target.compareTo(studentArray[middle]) > 0) {
                /*Limits the search to the right half of the ArrayList*/
                left = middle + 1;
            } else {
                /*Target T is found between the left and right bound*/
                return middle;
            }
        }

        /*Target was not found in the array*/
        return -1;
    }

}

class Student implements Comparable<Student> {

	String firstName;
	String lastName;
	double gpa;

	public Student (String newFirstName, String newLastName, double newGPA) {
		firstName = newFirstName;
	    lastName = newLastName;
	    gpa = newGPA;
	}

    /*Need to test this comparable method*/
    public int compareTo (Student otherStudent) {
        if (gpa > otherStudent.getGPA()) {
            return 1;
        } else if (gpa < otherStudent.getGPA()) {
            return -1;
        } else if (gpa == otherStudent.getGPA()){
            return 0;
        } else {
        	/*Error*/
        	return -2;
        }
    }

    public void setFirstName (String newName) {
        lastName = newName;
    }

    public void setLastName (String newName) {
        lastName = newName;
    }

    public String getName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public void setGPA (double newGPA) {
        gpa = newGPA;
    }

    public double getGPA() {
        return gpa;
    }
}
