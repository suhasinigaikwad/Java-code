package com.code.array;

import java.util.Arrays;

public class ArrayUsingDeeptoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//used to return a string representation of the “deep contents” of a specified array. 
		//It handles multidimensional arrays by including the contents of nested arrays.
		
		Object[] a = {1,2,3,4,5};
		
		System.out.println(Arrays.deepToString(a));
	}

}
