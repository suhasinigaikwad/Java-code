package com.code.collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap {

	// Main method
	public static void main(String[] args) {

		// Creating an empty TreeMap
		// SortedMap<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new TreeMap<>();

		// Inserting custom elements in the Map
		// using put() method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("Vaibhav", 20);
		map.put("ajay", 25);
		// map.put("vicky", null);
		map.put("vaibhav", 60);
		map.put("rohit", 50);
		//not contains null key & values
		System.out.println(map);//maintains ascending order.

		// remove key
		map.remove("sachin");
		System.out.println("after remove key " + map);

		// remove key and value
		map.remove("Vaibhav", 20);
		System.out.println("after remove key and value " + map);

		map.compute("vishal", (key, value) -> value - 20);
		System.out.println(map);

		// if key not available gives null pointer exception
	//map.compute("tanvi", (key, value) -> value + 20);

		// compute key and value not available in map
		// if key is not available in map it will be create and gives mention value
		// and if key is available it will do second operation
		map.compute("rohit", (key, value) -> (value == null) ? 100 : value + 200);
		System.out.println(map);//

		// if key not available output is show element as it is
		map.computeIfPresent("aniket", (key, value) -> value + 10);
		System.out.println(map);

		// if key is not available then it will be create and add key keys lenght
		map.computeIfAbsent("saurabh", key -> key.length());
		System.out.println("key length is" + map);

		// replace value
		// replace and replace all method will work on values only
		map.replace("ajay", 5);
		System.out.println(map);

		map.replace("ajay", 5, 50);
		System.out.println(map);

		map.replaceAll((key, value) -> value + 10);
		System.out.println("Updated treemap: " + map);

		// calculate map size
		System.out.println("The size of the map is" + " " + map.size());

		// clear map
		map.clear();
		System.out.println("After clear" + " " + map);

		// Getting true false the map is empty
		System.out.println(map.isEmpty());

	}
}