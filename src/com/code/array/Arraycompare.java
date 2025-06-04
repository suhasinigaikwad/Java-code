package com.code.array;

import java.util.Arrays;
public class Arraycompare {

	



	  /*  public static void main(String[] args)
	    {
	    	//if 1st array is greater than second then o/p = 1
	    	//if 1st array is smaller than second then o/p = -1
	    	//if 1st array is equal to second array then o/p = 0

	        // Get the Array
	        int intArr[] = { 10, 20, 15, 22 };

	        // Get the second Array
	        int intArr1[] = { 10, 20, 15, 22, 35 };

	        // To compare both arrays
	        System.out.println("Integer Arrays on comparison: "
	                           + Arrays.compare(intArr, intArr1));
	    
	} */
	
	
	    public static void main(String[] args)
	    {

	        // Get the Array
	        int intArr[] = { 10, 20, 15, 22, 35 };

	        // To print the elements in one line
	        System.out.println("Integer Array: "
	                           + Arrays.toString(intArr));

	        System.out.println("\nNew Arrays by copyOf:\n");

	        System.out.println("Integer Array: "
	                           + Arrays.toString(
	                                 Arrays.copyOf(intArr, 11)));
	    }
	}


