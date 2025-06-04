package com.code.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemoprogram {

	public static void main(String[] args) {
	
		//ArrayList<String> cars=new ArrayList<String>();
		
				ArrayList<Integer> rollno = new ArrayList<Integer>();
				rollno.add(10);
				rollno.add(20);
				rollno.add(50);
				rollno.add(40);
				
				System.out.println("Orginal numbers: " +rollno);
				
				///1 Insert an element at index 2
				
				rollno.add(50);
				System.out.println("Adding rollno:" +rollno);
				// 2 Remove an element
				rollno.remove(3);
				System.out.println("After Removing Element at Index 3:"+rollno);
				//3 get element by index
				System.out.println("Element at index 2 is " +rollno.get(2));
				//4 set(update element )
				rollno.set(0, 80);
				System.out.println("After updating index:" +rollno);
				//5 Remove index by index 
				
				Collections.sort(rollno);
				System.out.println("Sorted List: " + rollno);
				
				
				rollno.remove(3);
				System.out.println("After removing 3 index:" +rollno);
				//6 check element exits or not 
				rollno.contains(30);
				System.out.println("Contians '30':" +rollno.contains(30));
				System.out.println("Contians '30':" +rollno.contains(90));
				
			   // 7 Get the size of the ArrayList
				System.out.println("size of arraylist:" +rollno.size());
				//
			     rollno.clear();
				System.out.println("Aafter clearing :" +rollno);
			
				
				
				
				
				
				
				

	}

}
