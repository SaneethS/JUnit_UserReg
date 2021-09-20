package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println(firstName("Max"));
		System.out.println(lastName("Payne"));
	}
	
	public static boolean firstName(String firstName) {
		String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
		return Pattern.matches(patternFirstName, firstName);
	}
	
	public static boolean lastName(String lastName) {
		String patternLastName = "^[A-Z]{1}[a-zA-Z]{2,}";
		return Pattern.matches(patternLastName, lastName);
	}

}
