package com.rush.Set;

import java.util.HashSet;
import java.util.Set;

import com.rush.Array.Person;

public class Sets {
	
	static Person person1;
	static Person person2;

	public static void main(String[] args) {

		person1 = new Person("Rushan", 15);
		person2 = new Person("Arunod", 44);
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(person1);
		set.add(person2);
		set.add(person1);
		set.add(person1);
		
		for(Person person : set){
			System.out.println(person);
		}
	}

}
