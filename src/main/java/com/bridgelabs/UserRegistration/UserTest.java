package com.bridgelabs.UserRegistration;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserTest {

	UserRegistration user;

	/*
	 * @Description: Object is created before each test case
	 * 
	 * @Param: None
	 * 
	 * @Return: None
	 */
	@BeforeEach
	void initialise() {
		user = new UserRegistration();
	}

	/*
	 * @Description: Happy test case for validating first name, last name, email,
	 * phone, password
	 * 
	 * @Param: None
	 * 
	 * @Return: None
	 */
	@Test
	void Happytest() throws InvalidUserDetailsException {

		assertTrue(user.validateFirstName("Shroddha"));
		assertTrue(user.validateLastName("Ghosh"));
		assertTrue(user.validateEmail("abc100@yahoo.com"));
		assertTrue(user.validatePhoneNumber("91 7893426292"));
		assertTrue(user.validatePassword("Tokyo@123"));

	}

	/*
	 * @Description: Sad Test case for validating first name, last name, email,
	 * phone, password
	 * 
	 * @Param: None
	 * 
	 * @Return: None
	 */
	@Test
	void Sadtest() throws InvalidUserDetailsException {

		assertThrows(InvalidUserDetailsException.class, () -> user.validateFirstName("shroddha"));
		assertThrows(InvalidUserDetailsException.class, () -> user.validateLastName("ghosh"));
		assertThrows(InvalidUserDetailsException.class, () -> user.validateEmail("abc100@.com"));
		assertThrows(InvalidUserDetailsException.class, () -> user.validatePhoneNumber("7893426292"));
		assertThrows(InvalidUserDetailsException.class, () -> user.validatePassword("tokyo@123"));

	}

	/*
	 * @Description: Parameterized test case for validating email
	 * 
	 * @Param: Sample valid emails
	 * 
	 * @Return: None
	 */

	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com", "abc.100@abc.net", "abc111@abc.com", "abc@1.com", "abc@gmail.com.com",
			"abc+100@gmail.com" })

	void ValidEmails(String email) throws InvalidUserDetailsException {
		assertTrue(user.validateEmail(email));
	}

	/*
	 * @Description: Parameterized test case for invalidating email
	 * 
	 * @Param: Sample invalid emails
	 * 
	 * @Return: None
	 */
	@ParameterizedTest
	@ValueSource(strings = { "abc", "abc123@gmail.a", "abc123@.com", "abc..2002@gmail.com", "abc@abc@gmail.com",
			"12. abc@gmail.com.1a" })
	void InvalidEmails(String email) throws InvalidUserDetailsException {
		assertThrows(InvalidUserDetailsException.class, () -> user.validateEmail(email));
	}

}
