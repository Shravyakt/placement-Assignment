/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;
public class StringReverseDemo {
    

    public static void main(String[] args) {

        String original = "Hello World";

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder(original);

        // Reverse the string
        sb.reverse();

        // Print result
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + sb);
    }
}
