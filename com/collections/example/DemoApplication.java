package com.collections.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//1.Arraylist
		// Arraylist is implemented using Arrays

		System.out.println("****************ARRAY LIST********************");

		ArrayList<Integer> alist= new ArrayList<>();
		alist.add(7);
		alist.add(9);
		alist.add(25);
		alist.add(18);
		alist.add(32);
		alist.add(36);
		alist.add(45);
		alist.add(27);
		alist.add(27);

		System.out.println("gives all the values in the list: "+alist);
		System.out.println("gives the value of that particular index{5}: " + alist.get(5));
		alist.remove(5);
		System.out.println("list after removing the 5th index value: "+alist);
		alist.set(1,63);
		System.out.println("list after updating the 1st index value: "+alist);

		//iterating using for each
		for(int i:alist)
			System.out.println("print all elements in the list: "+i);

		//creating object for iterator and retrieving all the objects

		Iterator i=alist.iterator();

		System.out.println(i.next()); //print the first value of the list

		//iterating the entire loop.
		while (i.hasNext()){ //checks until next the value is present
			System.out.println(i.next());
		}

		//*********************************************************************************

		//2.LinkedList
        //linked list is implemented based on linkedlist datastructure
		//the elements are stored in unassigned manner
		//to point out the next element there will be pointers internally which navigates the path to next element
		//the storage area is called node
		//each node will have the separate space for storing elements and pointers
		//this is used to store a new element and remove the old element
		//while we do this in array list all the elements should be moved so it will take time.
		//but in linkedlist, the pointers alone can be changed.

		System.out.println("************************LINKED LIST***************************");

		LinkedList<Integer> blist = new LinkedList<>();
		blist.add(25);
		blist.add(36);
		blist.add(54);
		blist.add(45);
		blist.add(72);
		blist.add(27);

		System.out.println("retrieve all elements: "+blist);

		System.out.println("retrieving the 2nd index alone: "+blist.get(2));
		blist.remove(2);
		System.out.println("after removing 2nd index value: "+blist);
		for(int j:blist)
			System.out.println("iterating using loop: " + j);

		//printing the first element
		System.out.println("printing the first element: "+blist.getFirst());
		System.out.println("printing the last element: "+blist.getLast());
		Iterator k = blist.iterator();

		System.out.println("print the first value: "+k.next());//print the first value
		while (k.hasNext()) {//checks the next value is present
			System.out.println(k.next());//
		}


			//**********************************************************************
			System.out.println("*********************QUEUE**********************");

		System.out.println("---------(FIFO)---------");

			Queue<Integer> q = new LinkedList();//queue is an interface
			//we can't create object for an interface and so we use Linkedlist


			q.add(3);
			q.add(5);
			q.add(36);
			q.add(45);
			q.add(63);
			System.out.println("head is: "+q.peek());//peek method will just show the first value but doesn't remove

		System.out.println("removed: "+q.remove());//removes the first element


		//************************SET***************************
		System.out.println("*********************SET**********************");

		//stores only the unique elements
		//duplicates are not allowed
		//Hashset--> working on hashing
		// key%n--> n is the total length of an array. key is the value which need to store
		// ex: store 7 in an array which has length 5. 7%5=2.
		//the element 7 will be stored in the 2nd index of the array.

		System.out.println("*********************HASHSET**********************");
		HashSet<Integer> h =new HashSet<>();
		h.add(21);
		h.add(9);
		h.add(73);
		h.add(25);
		h.add(45);
		h.add(45);

		HashSet<String> s =new HashSet<>();
		s.add("praveeen");
		s.add("Arun");
		s.add("Ajith");
		s.add("Ram");

		System.out.println("string value of hashset will give the unique value in unordered manner: "+ s);

		System.out.println("will give the unique value in unordered manner: "+ h);


		System.out.println("*********************LINKEDHASHSET**********************");
		// linkedHashSet -- will maintain order but doesn't allow duplicate values:
		//because linkedHasSet will implements the linkedlist. so there will be pointers so it will
		//automatically save the current element and navigates to the next value.

		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("rahul");
		ls.add("muthu");
		ls.add("ravi");
		ls.add("mohan");
		ls.add("sam");
		ls.add("ravi");

		System.out.println("linked Hashset maintain the order of insertion but doesn't allow duplicates: "+ls);




		//tree set
		//tree set stores the element in sorting order.
		//it will sort the element before it saves, so while getting the values it will be retrieved
		// in sorted manner.
		System.out.println("*********************TREESET**********************");

		TreeSet<String> ts = new TreeSet<>();
		ts.add("Orange");
		ts.add("Avacado");
		ts.add("Orange");
		ts.add("SitaFriut");
		ts.add("Banana");
		ts.add("Jackfruit");
		ts.add("Apple");

		System.out.println("treeset gives the unique values in sorted order: "+ ts);


		//*******************************************MAP************************************

		System.out.println("********************MAP**********************");

		//map === [key, value] pair.
		//key will always be unique.
		//HashMap
		//LinkedHashMap
		//TreeMap


		System.out.println("-----------------------------HASHMAP-------------------------------");
		//1.HashMap
		//no order will be maintained

		Map<String,Integer> hm = new HashMap<>();
		//put method is used to add  & update the data
		hm.put("Orange",20);
		hm.put("Papaya",30);
		hm.put("Apple",30);
		hm.put("Banana",10);
		hm.put("mango",50);
		hm.put("Ilanthai",45);

		//all map values should be retrieved based on loop only.
		// I need to print the keys
		// we declared the datatype of key as String, retrieve the data based on key set.

		for(String key: hm.keySet()){
			System.out.println("HashMap gives the key in unordered manner: "+key);
			System.out.println("HashMap gives key and their values and order is not maintained : "+ key+" ----> "+hm.get(key));
		}
		//removing
		hm.remove("Ilanthai");
		for(String key:hm.keySet()){
			System.out.println("data after removal: "+key+" ---> "+hm.get(key));
		}

		//update the banana value
		hm.put("Banana",hm.get("Banana")+15);

		for(String key: hm.keySet()){
			System.out.println("after updating the banana value: "+key+" ===> "+hm.get(key));
		}

		System.out.println("returns boolean value for key 'mango': "+hm.containsKey("mango"));
		System.out.println("returns boolean value for key 'plum': "+hm.containsKey("plum"));
		System.out.println("returns boolean value--> check the data with caseSensitive 'Mango': "+hm.containsKey("Mango"));

		System.out.println("-----------------------------LinkedHashMap-------------------------------");
		//2.LinkedHashMap:
		// maintains the key insertion order.

		Map<String,Integer> lhm = new LinkedHashMap<>();
		//put method is used to add  & update the data
		lhm.put("Orange",20);
		lhm.put("Papaya",30);
		lhm.put("Apple",30);
		lhm.put("Banana",10);
		lhm.put("mango",50);
		lhm.put("Ilanthai",45);

		//all map values should be retrieved based on loop only.
		// I need to print the keys
		// we declared the datatype of key as String, retrieve the data based on key set.

		for(String key: lhm.keySet()){
			System.out.println("LinkedHashMap gives only the key in insertion order: "+key);
			System.out.println("LinkedHashMap gives key and their values by insertion order: "+ key+" ----> "+lhm.get(key));
		}

		System.out.println("-----------------------------TREE-MAP-------------------------------");
		//3.TreeMap.
		//maintains the key sorted order:

		Map<String,Integer> khm = new TreeMap<>();
		//put method is used to add  & update the data
		khm.put("Orange",20);
		khm.put("Papaya",30);
		khm.put("Apple",30);
		khm.put("Banana",10);
		khm.put("mango",50);
		khm.put("Ilanthai",45);

		//all map values should be retrieved based on loop only.
		// I need to print the keys
		// we declared the datatype of key as String, retrieve the data based on key set.

		for(String key: khm.keySet()){
			System.out.println("Treemap gives only the key in sorted order: "+key);
			System.out.println("Treemap gives key and their values by sorted order: "+ key+" ----> "+khm.get(key));
		}









	}

}
