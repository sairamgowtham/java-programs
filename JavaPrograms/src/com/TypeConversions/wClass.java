package com.TypeConversions;

public class wClass {
	
	public static void square(Integer a) {
	    //unboxing happens automatically
		int square = a*a;
		System.out.println("Square of a is" + square);
		
	}
	public static void main(String[] args) {
		
		int a = 5;
        // Autoboxing: primitive int → Integer
		Integer b =a;
		square(b);
		
		int c = 10;
		Integer obj = Integer.valueOf(c);
		
				
		
		
		
		
	}
	

}
