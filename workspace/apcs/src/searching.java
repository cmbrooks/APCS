import java.util.ArrayList;

public class searching {
	
    public static void main(String[] args) {

        /*Creates stats for the target student*/
        Student targetStudent = new Student("John", "Doe", 3.97);
        /*Initializes student roster*/
        ArrayList<Student> classRoster = generateRoster();
        System.out.println("Class roster:");
        System.out.println(classRoster);

        System.out.println(Student.getName(targetStudent) + " was found at index " + MyDemoSearch.sequentialStudentSearch(classRoster, targetStudent)
                            + " using sequential searching");
        System.out.println(Student.getName(targetStudent) + " was found at index " + MyDemoSearch.binaryStudentSearch(classRoster, targetStudent)
                            + " using binary searching");
    }

    private static ArrayList<Student> generateRoster () {
        ArrayList<Student> roster = new ArrayList<Student>();
        Student student1 = new Student("Jane", "Doe", 3.50);
        roster.add(student1);
        Student student2 = new Student("Cookie", "Doe", 2.80);
        roster.add(student2);
        Student student3 = new Student("John", "Doe", 3.97);
        roster.add(student3);
        Student student4 = new Student("Do-si", "Doe", 3.50);
        roster.add(student4);
        Student student5 = new Student("Play", "Doe", 4.13);
        roster.add(student5);
        Student student6 = new Student("Tae Kwon", "Doe", 3.75);
        roster.add(student6);
        return roster;
    }

}

class MyDemoSearch extends DemoSearch{

    public static int sequentialStudentSearch (ArrayList<Student> studentList, Student target) {
        for (int i = 0; i < studentList.size(); i++) {
            if (target.compareTo(studentList.get(i)) == 0) {
                return i;
            }
        }
        /*If the target is not found*/
        return -1;
    }

    public static int binaryStudentSearch (ArrayList<Student> studentList, Student target) {
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

    public int sequentialTSearch (ArrayList<T> tList, Student target) {
        for (int i = 0; i < tList.size(); i++) {
            if (tList.get(i) == target) {
                return i;
            }
        }
        /*If the target is not found*/
        return -1;
    }

    public int binaryTSearch (ArrayList<T> tList, Student target) {
        /*Makes sure studentList is sorted in ascending order*/
        java.util.Collections.sort(tList);

        int left = 0;
        int right = tList.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target.compareTo(tList.get(middle)) < 0) {
                /*Limits the search to the left half of the ArrayList*/
                right = middle - 1;
            } else if (target.compareTo(tList.get(middle)) > 0) {
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
	
	static String firstName;
	static String lastName;
	static double gpa;
	
	public Student (String newFirstName, String newLastName, double newGPA) {
		firstName = newFirstName;
	    lastName = newLastName;
	    gpa = newGPA;
	}

    /*Need to test this comparable method*/
    public int compareTo (Student otherStudent) {
        if (gpa > this.getGPA(otherStudent)) {
            return 1;
        } else if (gpa < this.getGPA(otherStudent)) {
            return -1;
        } else {
            return 0;
        }
    }

    public void setFirstName (String newName) {
        lastName = newName;
    }

    public void setLastName (String newName) {
        lastName = newName;
    }

    public static String getName (Student student) {
        String fullName = firstName + ", " + lastName;
        return fullName;
    }

    public void setGPA (double newGPA) {
        gpa = newGPA;
    }

    public double getGPA (Student student) {
        return gpa;
    }
}
