package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) throws UserRegistrationException {
		System.out.println(firstName("Max"));
		System.out.println(lastName("Payne"));
		System.out.println(email("abc.max@gmail.com"));
		System.out.println(mobileNo("91 9865453223"));
		System.out.println(password("qwqErty@1"));
	}
	
	/**
	 * first name pattern is created
	 * @param firstName
	 * @return
	 */
	public static boolean firstName(String firstName) throws UserRegistrationException {
		String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
		if(true) {
			return Pattern.matches(patternFirstName, firstName);
		}else
			throw new UserRegistrationException("Enter correct First Name");
	}
	
	/**
	 * last name pattern is created
	 * @param lastName
	 * @return
	 */
	public static boolean lastName(String lastName) throws UserRegistrationException {
		String patternLastName = "^[A-Z]{1}[a-zA-Z]{2,}";
		if(true) {
			return Pattern.matches(patternLastName, lastName);
		}else
			throw new UserRegistrationException("Enter correct Last Name");
	}
	
	/**
	 * email pattern is created
	 * @param email
	 * @return
	 */
	public static boolean email(String email) throws UserRegistrationException {
		String patternEmail = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
		if(true) {
			return Pattern.matches(patternEmail, email);
		}else
			throw new UserRegistrationException("Enter correct Email");
	}
	
	/**
	 * mobile number pattern is created
	 * @param mobileNo
	 * @return
	 */
	public static boolean mobileNo(String mobileNo) throws UserRegistrationException {
		String patternMobileNo = "^[0-9]{2}[\\s][0-9]{10}";
		if(true) {
			return Pattern.matches(patternMobileNo, mobileNo);
		}else
			throw new UserRegistrationException("Enter correct Mobile number");
	}
	
	/**
	 * password pattern is created
	 * @param password
	 * @return
	 */
	public static boolean password(String password) throws UserRegistrationException {
		String patternPassword = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";
		if(true) {
			return Pattern.matches(patternPassword, password);
		}else
			throw new UserRegistrationException("Enter correct Password");
		
	}
}
