package com.code.array;

import java.util.Scanner;

public class ArrayAddtionUsingScanner {


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns for the array
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        // Declare the 2D array to store elements
        int[][] result = new int[rows][col];

        // Input the elements for the 2D array
        System.out.println("Enter elements for the 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {  // Fix: use 'j' to iterate over columns
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                result[i][j] = sc.nextInt();        
            }
        }

        // Display the 2D array in a matrix form
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");  // Print elements on the same line
            }
            System.out.println();  // Move to the next line after each row
        }

        sc.close();  // Always close the scanner after use to avoid resource leaks
    }
}