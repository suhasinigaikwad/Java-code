package com.code.loops;

import java.util.Scanner;

public class WhileusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		
		int i=1;
		while(i<num)
		{
			System.out.println(i);
			i++;
		}
	}

}
