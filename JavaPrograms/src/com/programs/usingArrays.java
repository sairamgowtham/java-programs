package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class usingArrays {
	public static String stringreverse(String input) {
		String rev= "";

		for(int i =0;i<input.length();i++) {
			rev=input.charAt(i)+rev;
			
		}

		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		String[] input = {"hello","yes"};
		
		for(int i =0;i<input.length;i++) {
			input[i] = stringreverse(input[i]);
			
		}
		
		System.out.println(Arrays.toString(input));
		

	}

}
