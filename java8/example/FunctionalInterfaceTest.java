package com.java8.example;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

    }
}


//1.functional interface can have one abstract method, and multiple static and default mentods.
// functional interface can have one functionality to exhibit
//Runnable, Comparable,ActionListener are examples of FI.

// pillers:
//Consumer -  it only accept the input and doesnot return.
//Predicate - it accept the input and return the boolean value.
//Function - it accepts two inputs.

//            input1 - input datatype(String).
//            input2 - return datatype(Integer).
//  it wil accept and return the values based on the type of data.
//Supplier  -  it only return the data.

@FunctionalInterface
interface Interface1{
    void add();

    default void method1(){
        System.out.println("message from java8");
    }
    static void method2(){
        System.out.println("static method response");
    }
}
