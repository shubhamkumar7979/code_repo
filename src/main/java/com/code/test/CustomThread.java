package com.code.test;

// CustomThread.java
class CustomThread extends Thread {
    private int threadNumber;

    public CustomThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }
//}

// Main.java//public class Main {
    public static void main(String[] args) {
        // Create and start multiple threads
        CustomThread thread1 = new CustomThread(1);
        CustomThread thread2 = new CustomThread(2);
        CustomThread thread3 = new CustomThread(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
