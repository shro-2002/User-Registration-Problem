package com.bridgelabs.UserRegistration;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first name: ");
		String fName = sc.nextLine();

		if (UserRegistration.validateFirstName(fName))

			System.out.println("Valid first name!");

		else

			System.out.println("Invalid first name. Please enter the first letter capital!!");

	}
}
