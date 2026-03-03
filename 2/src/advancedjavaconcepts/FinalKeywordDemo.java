/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;
    // Final class (cannot be inherited)
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// Base class
class Parent {

    // Final variable (constant)
    final int number = 100;

    // Final method (cannot be overridden)
    final void show() {
        System.out.println("This is a final method.");
    }
}

// Child class
class Child extends Parent {

    // Uncommenting below method will cause ERROR
    /*
    void show() {
        System.out.println("Trying to override final method");
    }
    */

    void displayNumber() {
        // number = 200;  ❌ Cannot change final variable
        System.out.println("Final variable value: " + number);
    }
}


public class FinalKeywordDemo {


    public static void main(String[] args) {

        // Using final class
        FinalClass obj1 = new FinalClass();
        obj1.display();

        // Using final variable and method
        Child obj2 = new Child();
        obj2.show();
        obj2.displayNumber();
    }
}
   