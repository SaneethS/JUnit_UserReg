package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.UserRegistration;

public class UserRegisterationTest {
	
	@Test
	public void nameIsInCorrectFormat() {
		UserRegistration user = new UserRegistration();
		boolean res = user.firstName("Max");
		Assert.assertTrue(res);
	}
	
	@Test
	public void nameIsInSmallerSize() {
		UserRegistration user = new UserRegistration();
		boolean res = user.firstName("M");
		Assert.assertFalse(res);
	}
	
	@Test
	public void nameContainsNoCapsAtStart() {
		UserRegistration user = new UserRegistration();
		boolean res = user.firstName("max");
		Assert.assertFalse(res);
	}
	
	
}
