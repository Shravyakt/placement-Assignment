/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;
public class StringComparisonDemo {
    public static void main(String[] args) {

        // 1️⃣ String (Immutable)
        String str = "Hello";
        str.concat(" World");  // This will NOT change original string
        System.out.println("String after concat (without reassignment): " + str);

        str = str.concat(" World");  // Reassignment required
        System.out.println("String after concat (with reassignment): " + str);


        // 2️⃣ StringBuilder (Mutable, Not Thread-Safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // Directly modifies object
        System.out.println("StringBuilder after append: " + sb);


        // 3️⃣ StringBuffer (Mutable, Thread-Safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");  // Directly modifies object
        System.out.println("StringBuffer after append: " + sbf);


        // Performance comparison (Simple Loop Example)
        long startTime, endTime;

        // String Performance
        startTime = System.currentTimeMillis();
        String test = "";
        for (int i = 0; i < 10000; i++) {
            test += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");


        // StringBuilder Performance
        startTime = System.currentTimeMillis();
        StringBuilder testBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            testBuilder.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");


        // StringBuffer Performance
        startTime = System.currentTimeMillis();
        StringBuffer testBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            testBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");
    }
}
