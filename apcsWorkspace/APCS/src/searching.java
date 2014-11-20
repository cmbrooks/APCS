public class searching{

    public static void main(String[] args) {

        /*Creates stats for the target student*/
        Student targetStudent = new Student("John", "Doe", 3.97);
        /*Initializes student roster*/
        classRoster = generateRoster();
        System.out.println("Class roster:");
        System.out.println(classRoster);

        System.out.println(targetStudent.getName() + " was found at index " + MyDemoSearch.sequentialStudentSearch(classRoster, targetStudent)
                            + " using sequential searching");
        System.out.println(targetStudent.getName() + " was found at index " + MyDemoSearch.binaryStudentSearch(classRoster, targetStudent)
                            + " using binary searching");
        }

    private ArrayList<Student> generateRoster () {
        ArrayList<Student> roster = new ArrayList<Student>();
        roster.add(Student student1 = new Student("Jane", "Doe", 3.50));
        roster.add(Student student2 = new Student("Cookie", "Doe", 2.80));
        Roster.add(Student targetStudent = new Student("John", "Doe", 3.97));
        roster.add(Student student3 = new Student("Do-si", "Doe", 3.50));
        roster.add(Student student4 = new Student("Play", "Doe", 4.13));
        roster.add(Student student5 = new Student("Tae Kwon", "Doe", 3.75));
        return roster;
    }

}

public class MyDemoSearch extends DemoSearch{

    public int sequentialStudentSearch (ArrayList<Student> studentList, Student target) {
        for (int i = 0; i < studentList.size(); i++) {
            if (target.compareTo(studentList.get(i)) == 0) {
                return i;
            }
        }
        /*If the target is not found*/
        return -1;
    }

    public int binaryStudentSearch (ArrayList<Student> studentList, Student target) {
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
        java.util.Collections.sort(studentList);

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

public class Student (String newFirstName, String newLastName, double newGPA) implements Comparable<Student> {
    private String firstName = newFirstName;
    private String lastName = newLastName;
    private double gpa = newGPA;

    /*Need to test this comparable method*/
    public int compareTo (Student otherStudent) {
        if (this.gpa > otherStudent.getGPA) {
            return 1;
        } else if (this.gpa < otherStudent.getGPA) {
            return -1;
        } else if (this.gpa == otherStudent.getGPA) {
            return 0;
        }
    }

    public void setFirstName (Student newName) {
        this.lastName = newName;
    }

    public void setLastName (Student newName) {
        this.lastName = newName;
    }

    public String getName (Student student) {
        fullName = this.firstName + ", " + this.lastName
        return fullName;
    }

    public void setGPA (double newGPA) {
        this.gpa = newGPA;
    }

    public double getGPA (Student student) {
        return this.gpa;
    }
}
