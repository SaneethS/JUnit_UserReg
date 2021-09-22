package com.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.userregistration.UserRegistration;
import com.userregistration.UserRegistrationException;

/**
 * @author saneeths
 *Test cases are created for all the fields
 */
@RunWith(Parameterized.class)
public class UserRegisterationTest {
	
	UserRegistration user;
	String email;
	
	@Before
	public void init() {
		user = new UserRegistration();
	}
	
	public UserRegisterationTest(String email) {
		this.email = email;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(
				new Object[][] {
					{"abc@yahoo.com"},
					{"abc-100@yahoo.com"},{"abc.100@yahoo.com"},{"abc111@abc.com"},
					{"abc@1.com"},{"abc@gmail.com.com"},
					{"abc+100@gmail.com"}
					});
	}
	
	@Test
	public void nameIsInCorrectFormat() {
		try {
			boolean resFName = user.firstName("Max");
			boolean resLName = user.lastName("Payne");
			Assert.assertTrue(resFName);
			Assert.assertTrue(resLName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void nameIsInSmallerSize() {
		
		try {
			boolean resFName = user.firstName("M");
			boolean resLName = user.lastName("P");
			Assert.assertFalse(resFName);
			Assert.assertFalse(resLName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	

	@Test
	public void nameContainsNoCapsAtStart() {
		
		try {
			boolean resFName = user.firstName("max");
			boolean resLName = user.lastName("payne");
			Assert.assertFalse(resFName);
			Assert.assertFalse(resLName);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailIsInCorrectFormat() {
		boolean resEmail;
		try {
			resEmail = user.email("abc.max@gmail.co.in");
			Assert.assertTrue(resEmail);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailIsInCorrectFormatWithComAtEnd() {
		boolean resEmail;
		try {
			resEmail = user.email("abc.max@gmail.com");
			Assert.assertTrue(resEmail);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailIsInCorrectFormatWithoutOptionalField() {
		boolean resEmail;
		try {
			resEmail = user.email("abc@gmail.com");
			Assert.assertTrue(resEmail);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailIsInWrongFormat() {
		boolean resEmail;
		try {
			resEmail = user.email("abc.max@gmail");
			Assert.assertFalse(resEmail);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailIsInWrongFormatWithoutProperNotation() {
		boolean resEmail;
		try {
			resEmail = user.email("abc.maxgmailcom");
			Assert.assertFalse(resEmail);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void mobileNoIsInCorrectFormat() {
		boolean resMobile;
		try {
			resMobile = user.mobileNo("91 9876451234");
			Assert.assertTrue(resMobile);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void mobileNoWithoutCountryCode() {
		boolean resMobile;
		try {
			resMobile = user.mobileNo("9876451234");
			Assert.assertFalse(resMobile);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void mobileNoWithLessThanTenDigits() {
		boolean resMobile;
		try {
			resMobile = user.mobileNo("91 9876451");
			Assert.assertFalse(resMobile);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void passwordIsInCorrectFormat() {
		boolean resPassword;
		try {
			resPassword = user.password("qwErty@qwer12");
			Assert.assertTrue(resPassword);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void passwordHasLessThan8Characters() {
		boolean resPassword;
		try {
			resPassword = user.password("qwert");
			Assert.assertFalse(resPassword);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void passwordHasLessNoCapitalLetter() {
		boolean resPassword;
		try {
			resPassword = user.password("qwertadafaf");
			Assert.assertFalse(resPassword);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void passwordHasLessNoDigit() {
		boolean resPassword;
		try {
			resPassword = user.password("qweRtadafaf");
			Assert.assertFalse(resPassword);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void passwordHasLessNoSpecialCharacter() {
		boolean resPassword;
		try {
			resPassword = user.password("qweRtadafaf12");
			Assert.assertFalse(resPassword);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void emailInParameterizedFormVerified() {
		try {
			Assert.assertTrue(user.email(email));
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
	
}
