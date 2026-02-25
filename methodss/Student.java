package methodss;
public class Student {

    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student(101, "Shravya", 89.5);

        s1.display();
        s2.display();
    }
}
    

