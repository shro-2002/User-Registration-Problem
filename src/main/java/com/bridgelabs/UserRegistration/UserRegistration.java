package com.bridgelabs.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @description: User Registration System needs to ensure all valid entries
 */
public class UserRegistration {

	/*
	 * @description: Validate first name: first name starts with Cap and has minimum
	 * 3 characters
	 * 
	 * @param: String name
	 * 
	 * @return: boolean
	 */
	public static boolean validateFirstName(String name) {
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
		return result;
	}

	/*
	 * @description: Validate last name: last name starts with Cap and has minimum 3
	 * characters
	 * 
	 * @param: String name
	 * 
	 * @return: boolean
	 */
	public static boolean validateLastName(String name) {
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
		return result;
	}

	/*
	 * @description: Validate email: E.g. abc.xyz@bl.co.in - Email has 3 mandatory
	 * parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * 
	 * @param: String email
	 * 
	 * @return: boolean
	 */
	public static boolean validateEmail(String email) {
		// Regex Expression for email
		final String emailRegex = "^[a-zA-Z0-9_%+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z]{2,})+$";

		// compile the regex
		Pattern pattern = Pattern.compile(emailRegex);

		// Match the pattern
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();

		if (result)
			System.out.println("Valid Email!");
		else
			System.out.println("Invalid Email!");

		return result;
	}

	/*
	 * @description: Validate phone number: E.g. 91 9919819801 - Country code follow
	 * by space and 10 digit number
	 * 
	 * @param: String phoneNumber
	 * 
	 * @return: boolean
	 */

	public static boolean validatePhoneNumber(String phoneNumber) {
		// Regex Expression for phoneNumber
		String regex = "^\\d{2} \\d{10}$";

		// compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Match the pattern
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean result = matcher.matches();

		if (result)
			System.out.println("Valid Phone Number!");
		else
			System.out.println("Invalid Phone Number!");

		return result;
	}

	/*
	 * @description: Validate password: Rule4 – Has exactly 1 Special Character
	 * 
	 * @param: String password
	 * 
	 * @return: void
	 */
	public static boolean validatePassword(String Password) {
		// Regex Expression for phoneNumber having 8 characters
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?!.*[@#$%^&-+=()]{2,}).{8,}$";

		// compile the regex
		Pattern pattern = Pattern.compile(regex);

		// Match the pattern
		Matcher matcher = pattern.matcher(Password);
		boolean result = matcher.matches();

		if (result)
			System.out.println(
					"Password has 8 characters , An Uppercase, a Numeric Character an Exactly one Special Character !");
		else
			System.out.println("Invalid Password!");

		return result;
	}

}
