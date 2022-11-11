package com.StringEx;

import java.util.regex.Pattern;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hi");
		System.out.println(sb.hashCode());
		sb =sb.append(" Krishna");
		System.out.println(sb.hashCode());
	}

}
