package com.JavaSITNew;

import java.util.Scanner;

public class ReverseInt_using_Scanner {
	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur num");
			long num = sc.nextLong(),rev,a=0,b=0;
			
			rev=num;
			
			while (rev > 0) {
				a=rev%10;
				b=(b*10)+a;
				rev=rev/10;
			}

			System.out.println("Rev is "+b);

	}


}
