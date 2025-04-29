package com.programs;

import java.util.Scanner;

public class reverseUsingBuilder {
	
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuilder sb = new StringBuilder(input);
		System.out.println("The reverse word is"+sb.reverse());


		
	}

}
