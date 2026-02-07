package com.code.test;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalValue = Optional.of("Hello, Java 8!");

        // Getting the value if it's present
        if (optionalValue.isPresent()) {
            String value = optionalValue.get();
            System.out.println("Value is present: " + value);
        } else {
            System.out.println("Value is not present");
        }

        // Creating an Optional with a null value
        Optional<String> optionalNull = Optional.ofNullable(null);

        // Using orElse to provide a default value if the Optional is empty
        String result = optionalNull.orElse("Default Value");
        System.out.println("Result: " + result);

        // Using ifPresent to perform an action if the value is present
        optionalValue.ifPresent(val -> {
            System.out.println("Value is present: " + val);
        });
    }
}
