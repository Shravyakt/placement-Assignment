/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;
   class Student {

    int rollNo;          // Instance variable
    String name;         // Instance variable
    static String college = "ABC College";  // Static variable (shared)

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;   // Can access only static variables
    }

    // Display method
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(1, "Shravya");
        Student s2 = new Student(2, "Rahul");

        // Display before change
        System.out.println("Before changing college:");
        s1.display();
        s2.display();

        // Change static variable using static method
        Student.changeCollege("XYZ College");

        // Display after change
        System.out.println("\nAfter changing college:");
        s1.display();
        s2.display();
    }
}
    
