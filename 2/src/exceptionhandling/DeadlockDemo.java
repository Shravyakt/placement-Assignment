/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
 class Resource {

    String name;

    Resource(String name) {
        this.name = name;
    }
}


public class DeadlockDemo {
   public static void main(String[] args) {

        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked " + r1.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1 waiting for " + r2.name);
                synchronized (r2) {
                    System.out.println("Thread 1 locked " + r2.name);
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2 locked " + r2.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2 waiting for " + r1.name);
                synchronized (r1) {
                    System.out.println("Thread 2 locked " + r1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

