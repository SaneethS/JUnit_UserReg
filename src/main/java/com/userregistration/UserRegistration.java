package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println(firstName("Max"));
		System.out.println(lastName("Payne"));
		System.out.println(email("abc.max@gmail.com"));
		System.out.println(mobileNo("91 9865453223"));
		System.out.println(password("qwqerty@1"));
	}
	
	public static boolean firstName(String firstName) {
		String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
		return Pattern.matches(patternFirstName, firstName);
	}
	
	public static boolean lastName(String lastName) {
		String patternLastName = "^[A-Z]{1}[a-zA-Z]{2,}";
		return Pattern.matches(patternLastName, lastName);
	}
	
	public static boolean email(String email) {
		String patternEmail = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
		return Pattern.matches(patternEmail, email);
	}
	
	public static boolean mobileNo(String mobileNo) {
		String patternMobileNo = "^[0-9]{2}[\\s][0-9]{10}";
		return Pattern.matches(patternMobileNo, mobileNo);
	}
	
	public static boolean password(String password) {
		String patternPassword = "(?=.*[a-z]).{8,}";
		return Pattern.matches(patternPassword, password);
		
	}
}
