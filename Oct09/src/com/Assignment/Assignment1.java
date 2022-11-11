package com.Assignment;

public class Assignment1 {

	public static void main(String[] args) {

		String a = "aaccccddaaafffff";

		a.repeat(1);
		int counta = 0, countd = 0, countc = 0, countf = 0;
		
		char[] ch = a.toCharArray();
		for (char s : ch) {
			if (s == 'a') {
				counta++;
			}
			if (s == 'd') {
				countd++;
			}
			if (s == 'c') {
				countc++;
			}
			if (s == 'f') {
				countf++;
			}
		}

		System.out
				.println("Count a: " + counta + " Count c: " + countc + " Count d: " + countd + " Count f: " + countf);
	}

}
