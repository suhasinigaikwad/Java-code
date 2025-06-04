package com.code.practice_code;

import java.util.Scanner;

public class PrimeSeries {
		
	    

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; // 0 and 1 are not prime
	        }
	        for (int i = 2; i <=number/2; i++) {
	            if (number % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Enter the range up to which prime numbers are to be printed: ");
	        int range = scanner.nextInt();

	        System.out.println("Prime numbers up to " + range + ":");

	        
	        for (int i = 2; i <= range; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
	    }
	}
