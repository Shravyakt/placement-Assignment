
package exceptionhandling;
public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            System.out.println("Thread is running...");

            try {
                Thread.sleep(1000);   // TIMED_WAITING state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread execution completed.");
        });

        // 1️⃣ NEW state
        System.out.println("State after thread creation: " + t1.getState());

        // 2️⃣ RUNNABLE state
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        // Small delay to ensure thread goes into sleep
        Thread.sleep(100);
        System.out.println("State during sleep(): " + t1.getState());

        // Wait for thread to finish
        t1.join();

        // 3️⃣ TERMINATED state
        System.out.println("State after completion: " + t1.getState());
    }
}
   