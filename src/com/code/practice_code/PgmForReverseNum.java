package com.code.practice_code;

import java.util.Scanner;

public class PgmForReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int reversed = 0;
		
		while (num != 0 )
		{
			int digit = num % 10;
			reversed = reversed * 10  + digit ;
			num /= 10 ;
			
		}
		
		System.out.println("Reverse Number is : " + reversed );
		
		sc.close();
		
	}

}



/* Input: 1234
Steps:

4 → reversed = 4
3 → reversed = 43
2 → reversed = 432
1 → reversed = 4321


Step-by-Step Execution:
-------------------------------------------------------------------------------------------------------
Iteration	num	digit   (num % 10)	reversed (reversed * 10 + digit)	num after division (num / 10)
--------------------------------------------------------------------------------------------------------
1st	            1234	     4	                0 * 10 + 4 = 4	                 123
2nd	            123	         3	                4 * 10 + 3 = 43	                 12
3rd	            12	         2	                43 * 10 + 2 = 432	             1
4th	            1	         1	                432 * 10 + 1 = 4321	             0 */
