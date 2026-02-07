package com.code.test;
public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code, if needed
    }
    // Public static method to get the instance of the Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            // Lazy initialization
            instance = new Singleton();
        }
        return instance;
    }
    // Other methods and variables can be added as needed
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
    public static void main(String[] args) {
        // Get the instance of the Singleton class
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        // Both instances should be the same
        System.out.println(singletonInstance1 == singletonInstance2); // Output: true

        // Perform some action using the Singleton instance
        singletonInstance1.doSomething(); // Output: Singleton instance is doing something.
    } }

