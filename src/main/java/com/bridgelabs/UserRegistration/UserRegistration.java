package com.bridgelabs.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean validateFirstName(String data) {
		// Regex Expression for name
		final String regex = "^[A-Z][a-z]{2,}$";

		// compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Match the pattern
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();
		return result;
	}

}
