package com.code.practice_code;

import java.util.Scanner;

public class PgmToCheckPalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");  // 121
		int num = sc.nextInt();
		
		int orgNum = num ; 
		int revNum = 0 ;
		
		while(num > 0) // using while loop to reverse number 
		{
			int digit = num % 10 ;
			revNum = revNum * 10 + digit; 
			num /= 10; 
			
			
		}
		if ( orgNum == revNum)
		{
			System.out.println("Number is palindrim ");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
		sc.close();
	}
	

}
/* A palindrome is something that reads the same forward and backward.

Examples:
Numbers: 121, 1331, 4554
Words: "madam", "racecar", "level"

For numbers, a palindrome number remains the same when its digits are reversed.

*/