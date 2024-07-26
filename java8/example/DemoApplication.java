package com.java8.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	//1.Lambda expression
		//anonymous block--> have parameters, body and return type.
		//not tied with classes.
		//can be assigned to a variable.
		//() ------> input argument(no argument, one or more)
		// -> --------> token
		// ()  ---->body.

		int a =5;
		int total =0;
		for(int i=0;i<=a;i++){
        total=total+i;
		}
		System.out.println("using normal java: "+total);
		//using lambda
int total1 = IntStream.rangeClosed(0,5).sum();
		System.out.println("using java8: "+total1);



		//java

		List<String> names = Arrays.asList("Orange","mango","Apple","Papaya","Banana","mango");
		List<String> uniqueList =new ArrayList<>();
		for (String name:names
			 ) {
			if(!uniqueList.contains(name))
			uniqueList.add(name);
		}
		System.out.println("before java8: "+uniqueList);
//in java8
		List<String> uniqueList1 =
		names.stream().distinct().collect(Collectors.toList());
		System.out.println("using java8: "+uniqueList1);









	}

}
