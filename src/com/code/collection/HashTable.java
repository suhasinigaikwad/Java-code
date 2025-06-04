package com.code.collection;
import java.util.HashMap;
import java.util.Hashtable;   
import java.util.Map; 
public class HashTable {

	    public static void main(String[] args) {  
	        // Creating a Map  

	    	Hashtable<String, Integer> hashtable = new Hashtable<>();   
	    	hashtable.put("One", 1);  
	    	hashtable.put("Two", 2);  
	    	hashtable.put("Three", 3); 
	    	//hashtable.put(null, null);//it gives nullpointerexception
	    	//hashtable.put("abc", null);//does not allow null key or null value
	    	//hashtable.put(null,4);
	        
        
	        System.out.println("Hashtable: " + hashtable);  //does not maintains insertion order in java same as hashmap.
	    }  
	}  
