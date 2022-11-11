package com.StringEx;

import java.util.regex.Pattern;

public class ErrorPropogation {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		System.out.println("In m1");
		m2();
	}

	private static void m2() {
		System.out.println("In m2");
		m3();
	}

	private static void m3() {
		try {
			int x = 5/0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
