package com.code.practice_code;

import java.util.Scanner;



public class Palindrome {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");  // 121
		int num = sc.nextInt();
		
		int orgNum = num ; 
		int revNum = 0 ;
		
		/*while(num > 0) // using while loop to reverse number 
		{
			int digit = num % 10 ;
			revNum = revNum * 10 + digit; 
			num /= 10; 
			
			
		}*/
		
		
		for(;num!=0;num/=10 ) { //121 !=0 // 121/10=12
			int digit = num % 10 ;//121%10 = 1
			revNum = revNum * 10 + digit;  //0*10 +1-->1
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


*/