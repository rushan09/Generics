package com.rush.collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.rush.collections.Array.Person;

public class Maps {
	
	static Person person1;
	static Person person2;

	public static void main(String[] args) {

		person1 = new Person("Rushan", 15);
		person2 = new Person("Arunod", 44);
		
		Map<String, Person> map = new HashMap<String, Person>();
		
		map.put(person1.getName(), person1);
		map.put(person2.getName(), person2);
		
		System.out.println(map.get("Rushan"));
		System.out.println(map.containsKey("Rushan"));
		System.out.println();
		
		loopThroughKey(map);
		System.out.println();
		
		loopThroughValue(map);
		System.out.println();
		
		loopThroughEntrySet(map);
		
	}

	private static void loopThroughEntrySet(Map<String, Person> map) {
		for(Entry<String, Person> entry: map.entrySet())
		{
			System.out.println(entry);
		}
		
	}

	private static void loopThroughValue(Map<String, Person> map) {
		for(Person person: map.values())
		{
			System.out.println(person);
		}
		
	}

	private static void loopThroughKey(Map<String, Person> map) {
		for(String name: map.keySet())
		{
			System.out.println(name);
		}
	}
}
