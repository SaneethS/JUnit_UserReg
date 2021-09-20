package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		firstName("Zero");
	}
	
	public static boolean firstName(String firstName) {
		String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
		return Pattern.matches(patternFirstName, firstName);
	}

}
