package com.bridgelabs.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @description: User Registration System needs to ensure all valid entries
 */
public class UserRegistration {

	private boolean RegexMatching(String regex, String data) {

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();

		return result;
	}

	/*
	 * @description: Validate first name: first name starts with Cap and has minimum
	 * 3 characters
	 * 
	 * @param: String name
	 * 
	 * @return: boolean
	 */
	public boolean validateFirstName(String name) throws InvalidUserDetailsException {
		// Regex Expression for name
		final String regex = "^[A-Z][a-z]{2,}$";

		if (!RegexMatching(regex, name)) {
			throw new InvalidUserDetailsException("Invalid first name!");
		}
		System.out.println("Valid first name!");
		return true;
	}

	/*
	 * @description: Validate last name: last name starts with Cap and has minimum 3
	 * characters
	 * 
	 * @param: String name
	 * 
	 * @return: boolean
	 */
	public boolean validateLastName(String name) throws InvalidUserDetailsException {
		// Regex Expression for name
		final String regex = "^[A-Z][a-z]{2,}$";

		if (!RegexMatching(regex, name)) {
			throw new InvalidUserDetailsException("Invalid last name!");
		}
		System.out.println("Valid last name!");
		return true;
	}

	/*
	 * @description: Validate email: E.g. abc.xyz@bl.co.in - Email has 3 mandatory
	 * parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
	 * 
	 * @param: String email
	 * 
	 * @return: boolean
	 */
	public boolean validateEmail(String email) throws InvalidUserDetailsException {
		// Regex Expression for email
		final String regex = "^(?!.*\\.{2})[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(?<!\\.\\w)$";

		if (!RegexMatching(regex, email)) {
			throw new InvalidUserDetailsException("Invalid Email!");
		}
		System.out.println("Valid Email!");
		return true;
	}

	/*
	 * @description: Validate phone number: E.g. 91 9919819801 - Country code follow
	 * by space and 10 digit number
	 * 
	 * @param: String phoneNumber
	 * 
	 * @return: boolean
	 */

	public boolean validatePhoneNumber(String phoneNumber) throws InvalidUserDetailsException {
		// Regex Expression for phoneNumber
		String regex = "^\\d{2} \\d{10}$";

		if (!RegexMatching(regex, phoneNumber)) {
			throw new InvalidUserDetailsException("Invalid Phone Number!");
		}
		System.out.println("Valid Phone Number!");
		return true;
	}

	/*
	 * @description: Validate password: Rule4 – Has exactly 1 Special Character
	 * 
	 * @param: String password
	 * 
	 * @return: void
	 */
	public boolean validatePassword(String Password) throws InvalidUserDetailsException {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?!.*[@#$%^&-+=()]{2,}).{8,}$";

		if (!RegexMatching(regex, Password)) {
			throw new InvalidUserDetailsException("Invalid Password!");
		}
		System.out.println("Valid Password!");
		return true;
	}

}
