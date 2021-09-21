package com.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.userregistration.UserRegistration;

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
		boolean resFName = user.firstName("Max");
		boolean resLName = user.lastName("Payne");
		Assert.assertTrue(resFName);
		Assert.assertTrue(resLName);
	}
	
	@Test
	public void nameIsInSmallerSize() {
		boolean resFName = user.firstName("M");
		boolean resLName = user.lastName("P");
		Assert.assertFalse(resFName);
		Assert.assertFalse(resLName);
	}
	

	@Test
	public void nameContainsNoCapsAtStart() {
		boolean resFName = user.firstName("max");
		boolean resLName = user.lastName("payne");
		Assert.assertFalse(resFName);
		Assert.assertFalse(resLName);
	}
	
	@Test
	public void emailIsInCorrectFormat() {
		boolean resEmail = user.email("abc.max@gmail.co.in");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInCorrectFormatWithComAtEnd() {
		boolean resEmail = user.email("abc.max@gmail.com");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInCorrectFormatWithoutOptionalField() {
		boolean resEmail = user.email("abc@gmail.com");
		Assert.assertTrue(resEmail);
	}
	
	@Test
	public void emailIsInWrongFormat() {
		boolean resEmail = user.email("abc.max@gmail");
		Assert.assertFalse(resEmail);
	}
	
	@Test
	public void emailIsInWrongFormatWithoutProperNotation() {
		boolean resEmail = user.email("abc.maxgmailcom");
		Assert.assertFalse(resEmail);
	}

	@Test
	public void mobileNoIsInCorrectFormat() {
		boolean resMobile = user.mobileNo("91 9876451234");
		Assert.assertTrue(resMobile);
	}
	
	@Test
	public void mobileNoWithoutCountryCode() {
		boolean resMobile = user.mobileNo("9876451234");
		Assert.assertFalse(resMobile);
	}
	
	@Test
	public void mobileNoWithLessThanTenDigits() {
		boolean resMobile = user.mobileNo("91 9876451");
		Assert.assertFalse(resMobile);
	}
	
	@Test
	public void passwordIsInCorrectFormat() {
		boolean resPassword = user.password("qwErty@qwer12");
		Assert.assertTrue(resPassword);
	}
	
	@Test
	public void passwordHasLessThan8Characters() {
		boolean resPassword = user.password("qwert");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void passwordHasLessNoCapitalLetter() {
		boolean resPassword = user.password("qwertadafaf");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void passwordHasLessNoDigit() {
		boolean resPassword = user.password("qweRtadafaf");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void passwordHasLessNoSpecialCharacter() {
		boolean resPassword = user.password("qweRtadafaf12");
		Assert.assertFalse(resPassword);
	}
	
	@Test
	public void emailInParameterizedFormVerified() {
		Assert.assertTrue(user.email(email));
	}
	
}
