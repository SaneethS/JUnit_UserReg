package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.UserRegistration;

public class UserRegisterationTest {
	
	@Test
	public void nameIsInCorrectFormat() {
		UserRegistration user = new UserRegistration();
		boolean resFName = user.firstName("Max");
		boolean resLName = user.lastName("Payne");
		Assert.assertTrue(resFName);
		Assert.assertTrue(resLName);
	}
	
	@Test
	public void nameIsInSmallerSize() {
		UserRegistration user = new UserRegistration();
		boolean resFName = user.firstName("M");
		boolean resLName = user.lastName("P");
		Assert.assertFalse(resFName);
		Assert.assertFalse(resLName);
	}
	
	@Test
	public void nameContainsNoCapsAtStart() {
		UserRegistration user = new UserRegistration();
		boolean resFName = user.firstName("max");
		boolean resLName = user.lastName("payne");
		Assert.assertFalse(resFName);
		Assert.assertFalse(resLName);
	}
	
	@Test
	public void emailIsInCorrectFormat() {
		UserRegistration user = new UserRegistration();
		boolean resEmail = user.email("abc.max@gmail.co.in");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInCorrectFormatWithComAtEnd() {
		UserRegistration user = new UserRegistration();
		boolean resEmail = user.email("abc.max@gmail.com");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInCorrectFormatWithoutOptionalField() {
		UserRegistration user = new UserRegistration();
		boolean resEmail = user.email("abc@gmail.com");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInWrongFormat() {
		UserRegistration user = new UserRegistration();
		boolean resEmail = user.email("abc.max@gmail");
		Assert.assertFalse(resEmail);
	}
	
	@Test
	public void emailIsInWrongFormatWithoutProperNotation() {
		UserRegistration user = new UserRegistration();
		boolean resEmail = user.email("abc.maxgmailcom");
		Assert.assertFalse(resEmail);
	}

	@Test
	public void mobileNoIsInCorrectFormat() {
		UserRegistration user = new UserRegistration();
		boolean resMobile = user.mobileNo("91 9876451234");
		Assert.assertTrue(resMobile);
	}
	
	@Test
	public void mobileNoWithoutCountryCode() {
		UserRegistration user = new UserRegistration();
		boolean resMobile = user.mobileNo("9876451234");
		Assert.assertFalse(resMobile);
	}
	
	@Test
	public void mobileNoWithLessThanTenDigits() {
		UserRegistration user = new UserRegistration();
		boolean resMobile = user.mobileNo("91 9876451");
		Assert.assertFalse(resMobile);
	}
	
	@Test
	public void passwordIsInCorrectFormat() {
		UserRegistration user = new UserRegistration();
		boolean resPassword = user.password("qwErtyqwer12");
		Assert.assertTrue(resPassword);
	}
	
	@Test
	public void passwordHasLessThan8Characters() {
		UserRegistration user = new UserRegistration();
		boolean resPassword = user.password("qwert");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void passwordHasLessNoCapitalLetter() {
		UserRegistration user = new UserRegistration();
		boolean resPassword = user.password("qwertadafaf");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void passwordHasLessNoDigit() {
		UserRegistration user = new UserRegistration();
		boolean resPassword = user.password("qweRtadafaf");
		Assert.assertFalse(resPassword);
	}
	
}
