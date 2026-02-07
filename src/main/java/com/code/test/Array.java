package com.code.test;


import java.util.*;

public class Array {
    public static void main(String[] args) {
        HashSet a1 = new HashSet();

        a1.add(10);
        a1.add( 20);
        a1.add( 60);
        a1.add( 50);
        a1.add( 30);
        a1.add( 100);
        a1.add( 90);

      //  a1.add( 10);
        a1.add( null);

     //   a1.add();
        a1.remove(2);
        System.out.println(a1);

    }
}
