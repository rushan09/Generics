package com.rush.Array;

public class Arrays {

	public static void main( String[] args)
	{

		Person person1 = new Person("Rushan",15);
		Person person2 = new Person("Arunod",44);

		Person[] people = { person1,person2};
		
		printArray(people);
		Person person3 = new Person("Herath",88);


	}
	
	private static void printArray(Person[] people) {

		for(int i=0; i<people.length; i++){
			System.out.println(people[i]);
		}

	}
}
