package com.JavaSITNew;

import java.util.Scanner;

public class Reverse_String {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		
		String reverse = sc.nextLine();
		String rev ="";
		
		int length = reverse.length();
		for (int i=reverse.length()-1 ; i>=0; i--) {
			rev=rev+reverse.charAt(i);
		}
		System.out.println("Reverse is "+rev);
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

