/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
public class AgeValidationDemo {

    // Method to check age
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change value to test
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
    
