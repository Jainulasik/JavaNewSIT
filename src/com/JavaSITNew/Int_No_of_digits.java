package com.JavaSITNew;

import java.util.Scanner;

public class Int_No_of_digits {


	public static void main (String [] args) {
		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yur num");
		long long1 = sc.nextLong(),b=0;
		
		while (long1 >0) {
			long1=long1/10;
			b++;
		}
		System.out.println("no of didgits is "+b);
	}
}


