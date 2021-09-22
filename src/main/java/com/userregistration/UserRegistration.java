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
	
	static String patternFirstName = "^[A-Z]{1}[a-zA-Z]{2,}";
	static String patternLastName = "^[A-Z]{1}[a-zA-Z]{2,}";
	static String patternEmail = "^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)";
	static String patternMobileNo = "^[0-9]{2}[\\s][0-9]{10}";
	static String patternPassword = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}";
	
	static Validator validateFirstName = (firstName)->Pattern.matches(patternFirstName, firstName);
	static Validator validateLastName = (lastName)->Pattern.matches(patternLastName, lastName);
	static Validator validateEmail = (email)->Pattern.matches(patternEmail, email);
	static Validator validateMobileNo = (mobileNo)->Pattern.matches(patternMobileNo, mobileNo);
	static Validator validatePassword = (password)->Pattern.matches(patternPassword, password);
	/**
	 * first name pattern is created using lambda expression
	 * @param firstName
	 * @return
	 */
	public static boolean firstName(String firstName) throws UserRegistrationException {
		boolean resultFirstName =  validateFirstName.validator(firstName);
		if(resultFirstName) {
			return true;
		}else
			throw new UserRegistrationException("Enter correct First Name");
	}
	
	/**
	 * last name pattern is created using lambda expression
	 * @param lastName
	 * @return
	 */
	public static boolean lastName(String lastName) throws UserRegistrationException {
		boolean resultLastName =  validateLastName.validator(lastName);
		if(resultLastName) {
			return true;
		}else
			throw new UserRegistrationException("Enter correct Last Name");
	}
	
	/**
	 * email pattern is created
	 * @param email
	 * @return
	 */
	public static boolean email(String email) throws UserRegistrationException {
		boolean resultEmail =  validateEmail.validator(email);
		if(true) {
			return Pattern.matches(patternEmail, email);
		}else
			throw new UserRegistrationException("Enter correct Email");
	}
	
	/**
	 * mobile number pattern is created using lambda expression
	 * @param mobileNo
	 * @return
	 */
	public static boolean mobileNo(String mobileNo) throws UserRegistrationException {
		boolean resultMobileNo =  validateMobileNo.validator(mobileNo);
		if(true) {
			return Pattern.matches(patternMobileNo, mobileNo);
		}else
			throw new UserRegistrationException("Enter correct Mobile number");
	}
	
	/**
	 * password pattern is created using lambda expression
	 * @param password
	 * @return
	 */
	public static boolean password(String password) throws UserRegistrationException {
		boolean resultPassword =  validatePassword.validator(password);
		if(true) {
			return Pattern.matches(patternPassword, password);
		}else
			throw new UserRegistrationException("Enter correct Password");
		
	}
}
