/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;


public class GarbageCollectionDemo {

    // Override finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected object.");
    }

    public static void main(String[] args) {

        // Creating objects
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Requesting JVM for Garbage Collection
        System.gc();

        System.out.println("End of main method.");
    }
}
