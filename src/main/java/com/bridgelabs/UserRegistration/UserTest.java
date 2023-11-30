package com.bridgelabs.UserRegistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void Happytest() {

		assertTrue(UserRegistration.validateFirstName("Shroddha"));
		assertTrue(UserRegistration.validateLastName("Ghosh"));
		assertTrue(UserRegistration.validateEmail("abc100@yahoo.com"));
		assertTrue(UserRegistration.validatePhoneNumber("91 7893426292"));
		assertTrue(UserRegistration.validatePassword("Tokyo@123"));

	}

	@Test
	void Sadtest() {

		assertFalse(UserRegistration.validateFirstName("miya"));
		assertFalse(UserRegistration.validateLastName("riya"));
		assertFalse(UserRegistration.validateEmail("abc.100@yahoo.com"));
		assertFalse(UserRegistration.validatePhoneNumber("917893426292"));
		assertFalse(UserRegistration.validatePassword("Tokyo@@123"));

	}

}
