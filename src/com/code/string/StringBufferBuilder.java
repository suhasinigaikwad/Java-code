package com.code.string;

public class StringBufferBuilder {


	    public static void main(String[] args) {
	        int n = 10000; // Number of iterations

	        // StringBuffer
	        long start = System.currentTimeMillis();
	        StringBuffer sbf = new StringBuffer();
	        for (int i = 0; i < n; i++) {
	            sbf.append(" World");
	          
	        }
	        long end = System.currentTimeMillis();
	        System.out.println("StringBuffer time: " + (end - start) + " ms");

	        // StringBuilder
	        start = System.currentTimeMillis();
	        StringBuilder sbl = new StringBuilder("Hello");
	        for (int i = 0; i < n; i++) {
	            sbl.append(" World");
	        }
	        end = System.currentTimeMillis();
	        System.out.println("StringBuilder time: " + (end - start) + " ms");
	    }
	}