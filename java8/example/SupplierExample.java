package com.java8.example;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        //Supplier will return only the output
        Supplier<Double> random = ()->Math.random();
        System.out.println(random.get());
    }
}
