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
	
	
}
