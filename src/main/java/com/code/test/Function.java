package com.code.test;

@FunctionalInterface
public interface Function {
    public void Hello ();    // single abstract method

    default void  Say (){    // multiple support default method
    }
    default void Ok (){
    }
    public static void Name (){  // multiple support static method
    }
    public static void My (){

    }
}
