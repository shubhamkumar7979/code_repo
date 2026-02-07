package com.code.test;


import java.util.Optional;

public class Option {
    public static void main(String[] args) {

        Optional<String> name = getName(2);  // Get Name
        String nameTobeUse =  name.orElse("NA");  // Not present print NA
        System.out.println(nameTobeUse);
    }

    private static Optional<String> getName(int id){  // get Id
        return Optional.of("shyam");  // print
    }
}
