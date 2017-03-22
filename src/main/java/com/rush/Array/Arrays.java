package com.rush.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays {
	
	
	static Person person1;
	static Person person2;

	public static void main(String[] args) {

		person1 = new Person("Rushan", 15);
		person2 = new Person("Arunod", 44);
		normalArray();
		System.out.println();
		arrayList();

	}

	private static void normalArray() {


		Person[] people = { person1, person2 };

		Person person3 = new Person("Herath", 88);

		// people[2] = person3; //java.lang.ArrayIndexOutOfBoundsException

		people = add(people, person3);

		printArray(people);

	}
	
	private static void arrayList() {

		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);

		Person person3 = new Person("Herath",99);
		
		people.add(person3);
		printArrayList(people);
	}

	private static Person[] add(Person[] people, Person person) {

		int length = people.length;
		people = java.util.Arrays.copyOf(people, length + 1);
		people[length] = person;
		return people;
	}

	private static void printArray(Person[] people) {

		// for(int i=0; i<people.length; i++){
		// System.out.println(people[i]);
		// }

		for (Person person : people) {
			System.out.println(person);
		}
	}
	
	private static void printArrayList(List<Person> people) {
		Iterator<Person> iterator = people.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}
