package com.programs;

import java.util.Scanner;

public class reverseUsingBuilder {
	
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuilder sb = new StringBuilder(input);
		System.out.println("The reverse word is"+);
        String reverse = sb.reverse().toString();
		if(input.equals(reverse)) {
			System.out.println("The word is palindrome");
		} else {
			System.out.println("The word is not palindrome");
		}

		
	}

}
