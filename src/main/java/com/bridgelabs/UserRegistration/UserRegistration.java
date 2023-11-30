package com.bridgelabs.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @description: User Registration System needs to ensure all validations entries
 */
public class UserRegistration {

	/*
	 * @description: Validate first name: first name starts with Cap and has minimum
	 * 3 characters
	 * 
	 * @param: String name
	 * 
	 * @return: void
	 */
	public static void validateFirstName(String name) {
		// Regex Expression for name
		final String regex = "^[A-Z][a-z]{2,}$";

		// compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Match the pattern
		Matcher matcher = pattern.matcher(name);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid first name!");
		else
			System.out.println("Invalid first name!");
	}

	/*
	 * @description: Validate last name: last name starts with Cap and has minimum 3
	 * characters
	 * 
	 * @param: String name
	 * 
	 * @return: void
	 */
	public static void validateLastName(String name) {
		// Regex Expression for name
		final String regex = "^[A-Z][a-z]{2,}$";

		// compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Match the pattern
		Matcher matcher = pattern.matcher(name);
		boolean result = matcher.matches();
		if (result)
			System.out.println("Valid Last name!");
		else
			System.out.println("Invalid last name!");
	}

	/*
	 * @description: Validate email: E.g. abc.xyz@bl.co.in - Email has 3 mandatory
	 * parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * 
	 * @param: String email
	 * 
	 * @return: void
	 */
	public static void validateEmail(String email) {
		// Regex Expression for email
		final String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";

		// compile the regex
		Pattern pattern = Pattern.compile(emailRegex);

		// Match the pattern
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();

		if (result)
			System.out.println("Valid Email!");
		else
			System.out.println("Invalid Email!");
	}

}
