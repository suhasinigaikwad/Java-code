package com.code.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String>hm = new HashMap<>();
		
		hm.put(101, "Tanwi");
		hm.put(102, "Saurabh");
		hm.put(104, "Priyanka");
		hm.put(103, "Parmeshwar");
		hm.put(null, "snehal");		
		hm.put(null, null);
		//hm.put(103, null);
		//hm.put(null, "abc"); //allows multiple null values and one null key
		
		System.out.println("Originl data"+hm); //doesn't maintain order
		System.out.println("------------");
		
		//key is unique and value changed
		hm.put(104, "Sneha");
		System.out.println("updating value "+hm);
		System.out.println("------------");
		
		//get value 
		System.out.println("get value of key: "+hm.get(101));
		System.out.println("------------");
		
		//remove element
		hm.remove(104);
		System.out.println("after removing element :"+hm); 
		System.out.println("------------");
		
		//checking elements exist or not
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("Tanwi"));
		System.out.println("------------");
		
		hm.replace(103, "Dipika");
		System.out.println(hm);
		System.out.println("------------");
		
		System.out.println(hm.keySet());  
		System.out.println(hm.values()); 
		System.out.println(hm.entrySet());
		System.out.println("------------");
			
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println("------------");
		
		//using for each loop
	      
		 for (Integer k : hm.keySet()) {
	            System.out.println(k + " " + hm.get(k));
	        }
	        
		 	System.out.println("------------");
	        //Using Iterator
		 	//iterator is an object that allows you to traverse through a collection 
	        Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
	        while(it.hasNext())
	        {
	        	Entry<Integer,String>entry=it.next();
	        	 System.out.println(entry.getKey() + " " + entry.getValue());
	        	
	        }
	        System.out.println("------------");
	        //hashcode - It returns the memory reference of the object in integer form.
	        //The value received from the method is used as the bucket number. 
	        //The bucket number is the address of the element inside the map. Hash code of null Key is 0.
	        int val = hm.hashCode();
	        System.out.println("hashcode is: "+val);
	        
	        
	        int capacity = 16;
	        int index = (capacity-1)& val;
	      //(16-1)&1369734243
	      //1369734243 in binary (last 4 bits): xxxx xxxx xxxx 0011         
	      // 15 in binary:                                0000 1111
	      //  ---------------------------------------------------------
	      //  Result:                                     0000 0011 = 3
	        System.out.println("bucket number: "+index);
		}
		
	}
	


