package com.bridgelabs.UserRegistration;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// UC-1
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first name: ");
		String fName = sc.nextLine();

		UserRegistration.validateFirstName(fName);

		// UC-2
		System.out.print("Enter the Last name: ");
		String LName = sc.nextLine();

		UserRegistration.validateLastName(LName);

		// UC-3
		System.out.print("Enter the Email of User: ");
		String Email = sc.nextLine();

		UserRegistration.validateEmail(Email);

		// UC-4
		System.out.print("Enter the Phone Number of User: ");
		String Phone = sc.nextLine();

		UserRegistration.validatePhoneNumber(Phone);

		// UC-7
		System.out.print("Enter the Password: ");
		String Pass = sc.nextLine();

		UserRegistration.validatePassword(Pass);

	}
}
