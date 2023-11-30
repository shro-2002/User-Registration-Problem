package com.bridgelabs.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

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

}
