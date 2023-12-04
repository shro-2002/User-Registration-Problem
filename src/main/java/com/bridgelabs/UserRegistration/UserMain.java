package com.bridgelabs.UserRegistration;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		UserRegistration user = new UserRegistration();
		// UC-1
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first name: ");
			String fName = sc.nextLine();
			user.validateFirstName(fName);

			// UC-2
			System.out.print("Enter the Last name: ");
			String LName = sc.nextLine();
			user.validateLastName(LName);

			// UC-3
			System.out.print("Enter the Email of User: ");
			String Email = sc.nextLine();
			user.validateEmail(Email);

			// UC-4
			System.out.print("Enter the Phone Number of User: ");
			String Phone = sc.nextLine();

			user.validatePhoneNumber(Phone);

			// UC-7
			System.out.print("Enter the Password: ");
			String Pass = sc.nextLine();

			user.validatePassword(Pass);
		}

		catch (InvalidUserDetailsException e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}
}
