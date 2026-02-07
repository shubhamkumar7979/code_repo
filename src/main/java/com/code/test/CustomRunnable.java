package com.code.test;

// CustomRunnable.java
class CustomRunnable implements Runnable {
    private int threadNumber;

    public CustomRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
    }

        public static void main(String[] args) {
            // Create runnable instances
            CustomRunnable runnable1 = new CustomRunnable(1);
            CustomRunnable runnable2 = new CustomRunnable(2);
            CustomRunnable runnable3 = new CustomRunnable(3);

            // Create thread instances and associate with runnables
            Thread thread1 = new Thread(runnable1);
            Thread thread2 = new Thread(runnable2);
            Thread thread3 = new Thread(runnable3);

            // Start the threads
            thread1.start();
            thread2.start();
            thread3.start();

        } }
