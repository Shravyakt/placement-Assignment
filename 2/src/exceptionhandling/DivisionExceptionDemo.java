/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
public class DivisionExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } 
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

