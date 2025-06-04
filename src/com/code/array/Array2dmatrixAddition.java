package com.code.array;

public class Array2dmatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][] = {{1,2}, {3,4}};
		
		int b [][] = {{5,6},{7,8}};
		
		int c[][] = new int[2][2];
		
		System.out.println("additin of two matrix is: ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}

}
