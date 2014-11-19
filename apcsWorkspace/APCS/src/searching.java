public class searching{
    public static void main(String[] args) {
        /*Implement binary sorting here*/
    }
}

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

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

    public void printName (Student student) {
        System.out.println(this.firstName + ", " = this.lastName);
    }

    public double getGPA (Student student) {
        return this.gpa;
    }
}
