package com.code.practice_code;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string for checking palindrome");
		String str = sc.nextLine();
		
		 String org = str;
		 String rev= "";
		 
		 char a[] = str.toCharArray();
		 int len =a.length;
		 

		 for(int i=len-1;i>=0;i--) {
			 rev = rev+a[i];

		 }
		if(org.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
		 	
	
		}
		
	}


