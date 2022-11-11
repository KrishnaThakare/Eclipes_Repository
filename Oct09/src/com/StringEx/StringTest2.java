package com.StringEx;

import java.util.regex.Pattern;

public class StringTest2 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("...s...", "Krishna")); 
		System.out.println(Pattern.matches("....t", "Rohit"));
		System.out.println(Pattern.matches("S.....", "Sharad"));  
		System.out.println(Pattern.matches("...s", "amms")); 
		System.out.println(Pattern.matches("..s", "mas")); 

	}

}
