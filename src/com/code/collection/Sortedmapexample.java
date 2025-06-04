package com.code.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmapexample {

	public static void main(String[] args) {

		        // Creating a TreeMap which implements SortedMap
		        SortedMap< Integer,String> sortedMap = new TreeMap<>();

		        // Adding entries to the map
		        sortedMap.put(2,"Apple");
		        sortedMap.put(1,"Banana");
		        sortedMap.put(3,"Cherry");

		        // Displaying the sorted map
		        System.out.println("SortedMap: " + sortedMap);

		        // Accessing the first and last keys
		        System.out.println("First Key: " + sortedMap.firstKey());
		        System.out.println("Last Key: " + sortedMap.lastKey());
		        
		        System.out.println("headmap is: "+sortedMap.headMap(2));
		        System.out.println("tailmap: "+sortedMap.tailMap(2));

		        //Getting a submap
		       SortedMap< Integer,String> subMap = sortedMap.subMap(1,3);
		       System.out.println("SubMap: " + subMap);

	}

	}
