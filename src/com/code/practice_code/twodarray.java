package com.code.practice_code;

public class twodarray {

	public static void main(String[] args) {
	  int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
           			//00 01 02   10 11 12   20 21 22
	  
      for (int i = 0; i < 3; i++) {  
          for (int j = 0; j < 3; j++) {  
              System.out.print(arr[i][j] + " ");  
          }  						
          System.out.println();  
      }  

}
}
