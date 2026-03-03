/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling;
    // Thread using Thread class
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread created using Thread class.");
    }
}

// Thread using Runnable interface
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }
}


public class ThreadDemo {
    public static void main(String[] args) {

        // Using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Using Runnable interface
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();
    }
}
    
