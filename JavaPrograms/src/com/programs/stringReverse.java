package com.programs;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if(input.isEmpty()||input==null) {
			System.out.println("Data is empty");
		}
		String rev= "";
		for(int i =0;i<input.length();i++) {
			rev=input.charAt(i)+rev;
			
		}
		System.out.println("reversed string is:"+rev);
		

	}

}
