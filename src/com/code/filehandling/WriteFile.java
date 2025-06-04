package com.code.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
   public static void main(String[] args) {
		        try {
		            FileWriter myWriter = new FileWriter("C:\\Users\\admin\\Desktop\\filehandlingdemo.txt");
		            myWriter.write("Hello, this is a test.\n this 2nd line");
		            
		            myWriter.close();
		            System.out.println("Successfully wrote to the file.");
		        } catch (IOException e) {
		            System.out.println("An error occurred.");
		            e.printStackTrace();
		        }
		    }
	

	}
