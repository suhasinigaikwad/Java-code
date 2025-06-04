package com.code.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
	//	int a=10;
		
		
		ArrayList<String> namelist = new ArrayList<String>();

		namelist.add("tulip");
		//namelist.add(10);
		namelist.add("sunflower");
		namelist.add("Rose");
		namelist.add("Aster");
		namelist.add("Tulip");
		namelist.add(null);
		namelist.add("Daisy");
		namelist.add(1, "Lily");
		namelist.add("Jasmine");

		System.out.println("Flowers List :" + namelist);

		namelist.remove(5);
		namelist.add(null);
		// namelist.addAll(namelist);
		// System.out.println("Flowers List :" +namelist);
		namelist.set(0, "Orchid"); // replace name
		System.out.println("Size Of Flower List :" + namelist.size());
		System.out.println("Is ArrayList Empty: " + namelist.isEmpty());// boolean value return

		List<String> no = new ArrayList<String>();

		// List<Integer> al1=new ArrayList<String>();

		no.add("BlueBell");
		no.add("Hibiscus");
		no.add("Lavender");
		// no.add("Jasmine");
		boolean remEle = no.removeIf(str -> str.contains("Hibiscus"));// remove
//		System.out.println("iterating the elements after retaining the elements of no");
//		namelist.retainAll(no);  

		namelist.addAll(1,no);

		System.out.println("**Iterating list by using Iterator**");
		Iterator<String> i = namelist.iterator();

		while (i.hasNext()) // check boolean value
		{
			System.out.println(i.next());
		}

//		System.out.println("**Iterating list by using For-each loop**");
//		for(String str:namelist)
//		{
//			System.out.println(str);
//		}
	}
}