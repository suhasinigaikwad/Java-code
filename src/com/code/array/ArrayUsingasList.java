package com.code.array;

import java.util.Arrays;

public class ArrayUsingasList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] i= {"A,B,C"};
		
		//asList() - used to convert an array into a fixed-size list
		//This method acts as a bridge between array-based and collection-based APIs, in combination with Collection.
		System.out.println(Arrays.asList(i));
	}

}
