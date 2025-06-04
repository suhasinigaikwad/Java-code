package com.code.ifelse;


import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for their age
        System.out.println("Enter your no:");
        int n = scanner.nextInt();


        if(n<4) {
        	System.out.println("no is less than 4");
        
        }
        else if (n>=5 && n<8)
        {
        		System.out.println("no is grater than 5");

        }
        	else {
        		System.out.println("no is not in range");
        	}
       
        
        scanner.close();
        } 
        // Close the scanner object
       
    }

