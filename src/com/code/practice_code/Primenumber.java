package com.code.practice_code;

import java.util.Scanner;
public class Primenumber {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input a number from the user
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        boolean isPrime = true;

	        // Prime number check (excluding 0 and 1)
	        if (num < 2) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i < num/2;i++) { // Loop from 2 to num/2
	                if (num % i == 0) {
	                    isPrime = false;
	                    break; // Exit the loop early if a factor is found
	                }
	            }
	        }

	        // Output the result
	        if (isPrime)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");

	        scanner.close();
	    }
	}

