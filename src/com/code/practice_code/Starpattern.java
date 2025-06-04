package com.code.practice_code;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" simple trangle");
	    int rows = 5; // Number of rows in the pattern
	   // outer for loop for rows
	        for(int i=1;i<=rows;i++) 
	        {
	    	// inner for loop for space
	        	for(int j=1;j<rows-i;j++) 
	        	{
	        		System.out.print(" ");
	        	} //print star
	        	for(int k=1;k<=2*i-1;k++) 
	        	{
	        		System.out.print("*");
	        	}
	        	System.out.println(); // Move to the next line
	        }
	        
	        
	        System.out.println("----------------------");
	        System.out.println("Right half pyramid pattern");
	        
	        for(int i=1;i<=5;i++)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }	
	        
	        System.out.println("------------------------------");
	        System.out.println("Left half pyramid pattern");
	        
	        for(int m=5;m>1;m--) {
	        	for(int n=0;n<m;n++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        System.out.println("-----------------------");
	        
	    }

}
