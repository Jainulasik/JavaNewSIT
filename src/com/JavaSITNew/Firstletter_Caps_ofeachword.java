package com.JavaSITNew;

public class Firstletter_Caps_ofeachword {

	
	public static void main (String [] args ) {
		
		String s = "ashfiya zarin afrin rehana jainul asik ", capitalize = "";
		
		String[] firstletter = s.split("\\s");
		
		for (String words : firstletter) {
			String upppercase = words.substring(0, 1);
			String remainingletter = words.substring(1);
			capitalize = capitalize+upppercase.toUpperCase()+remainingletter+" ";
			
		}
		System.out.println(capitalize);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
