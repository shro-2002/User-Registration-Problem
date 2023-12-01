package com.bridgelabs.UserRegistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	UserRegistration user;

	@BeforeEach
	void initialise() {
		user = new UserRegistration();
	}

	@Test
	void Happytest() {

		assertTrue(user.validateFirstName("Shroddha"));
		assertTrue(user.validateLastName("Ghosh"));
		assertTrue(user.validateEmail("abc100@yahoo.com"));
		assertTrue(user.validatePhoneNumber("91 7893426292"));
		assertTrue(user.validatePassword("Tokyo@123"));

	}

	@Test
	void Sadtest() {

		assertFalse(user.validateFirstName("miya"));
		assertFalse(user.validateLastName("riya"));
		assertFalse(user.validateEmail("abc.100@yahoo.com"));
		assertFalse(user.validatePhoneNumber("917893426292"));
		assertFalse(user.validatePassword("Tokyo@@123"));

	}

}
