// Creating a Java program with three threads

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 is running...");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running...");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3 is running...");
    }
}

public class Exam9 {
    public static void main(String[] args) {
        // Create instances of the threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        
        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}