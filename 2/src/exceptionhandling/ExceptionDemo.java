/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
  
    public static void main(String[] args) {

        // 🔹 Unchecked Exception Example
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }

        // 🔹 Checked Exception Example
        try {
            FileReader file = new FileReader("test.txt");  // May cause FileNotFoundException
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
    
