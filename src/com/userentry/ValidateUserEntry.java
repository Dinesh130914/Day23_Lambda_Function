package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserEntry {

	Scanner scanner = new Scanner(System.in);

	public boolean firstname(String fname) {

		String result = "^[A-Z][A-Za-z]{3,25}";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(fname);
		scanner.close();

		if (inputMatcher.matches()) {
			System.out.println( " valid First name");
		} else {
			System.out.println("Invalid name.Name should start with Caps");
		}
		return inputMatcher.matches();
	}

	public boolean lastname(String lname) {

		String result = "^[A-Z][A-Za-z]{3,25}";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(lname);

		if (inputMatcher.matches()) {
			System.out.println(" valid Last name");
		} else {
			System.out.println("Invalid Name.should start with Caps");
		}
		return inputMatcher.matches();
	}

	public boolean contactno(String mobileno) {

		String pattern = "^[0-9]{2}[\s]?[0-9]{10}$";
		Pattern regex = Pattern.compile(pattern);
		Matcher inputmMatcher = regex.matcher(mobileno);

		if (inputmMatcher.matches()) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid number");
		}
		return inputmMatcher.matches();
	}

	public boolean emailid(String email) {

		String pattern = "^[abc]+.+[a-z]+@[bl]+.+[co]+.+[a-z]{2,5}$";
		Pattern regex = Pattern.compile(pattern);
		Matcher inputMatcher = regex.matcher(email);

		if (inputMatcher.matches()) {
			System.out.println("Valid email id");
		} else {
			System.out.println("Invalid email id");
		}
		return inputMatcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		ValidateUserEntry validateUserEntry = new ValidateUserEntry();

		System.out.println("Enter the firstname");
		String firstname = scanner1.next();

		System.out.println("Enter the Lastname");
		String lastname = scanner1.next();

		System.out.println("Enter the contactno");
		String contactno = scanner1.next();

		System.out.println("Enter the emailid");
		String email = scanner1.next();
		scanner1.close();

		validateUserEntry.firstname(firstname);
		validateUserEntry.lastname(lastname);
		validateUserEntry.contactno(contactno);
		validateUserEntry.emailid(email);
	}

}
