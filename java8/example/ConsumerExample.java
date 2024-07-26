package com.java8.example;

import java.util.function.Consumer;
class Person{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        //1.consumer
        //will be used to update and will not return anything.
        Person person = new Person();
Consumer<Person> setName = t-> t.setName("Vanjinathan");
setName.accept(person);
        System.out.println(person.getName());




    }
}
