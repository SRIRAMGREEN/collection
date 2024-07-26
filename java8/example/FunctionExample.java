package com.java8.example;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Function --> accept input and return output
        Function<Integer,String> getInt = v->v*10+ " value multiplied by 10";
        System.out.println(getInt.apply(5));
    }
}
