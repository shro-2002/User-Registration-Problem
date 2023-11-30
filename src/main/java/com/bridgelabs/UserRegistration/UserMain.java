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

	}
}
