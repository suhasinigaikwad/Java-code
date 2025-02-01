package com.code.practice_code;

import java.util.*;
public class AddusingScanner {

	int num1;
	int num2;
	int sum;
	int sub;
	int mul;
	int div;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter first no: ");
		int num1 = scanner.nextInt();
	
		System.out.println("enter second no: ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		int sub = num2 - num1;
		int mul = num1 * num2;
		int div = num2 / num1;
		
		System.out.println("The sum is : "+sum);

		System.out.println("The sub is : "+sub);
		
		System.out.println("Multiplication is : "+mul);
		
		System.out.println("Division is "+div);
		
		scanner.close();
	}

}
