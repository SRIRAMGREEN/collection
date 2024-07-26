package com.java8.example;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //predicate will return boolean value
        Predicate<String> checkLength = str->str.length()>5;
        System.out.println(checkLength.test("Welcome"));
    }
}
