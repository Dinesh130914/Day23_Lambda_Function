package com.userexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameException extends Exception {
	public LastNameException(String msg) {
		super(msg);
	}

	public static void validatelastname(String lname) {
		try {
			String result = "^[A-Z][A-Za-z]{3,25}";
			Pattern regex = Pattern.compile(result);
			Matcher inputMatcher = regex.matcher(lname);

			if (!inputMatcher.matches()) {
				throw new LastNameException("Invalid Last Name");
			} else {
				System.out.println("Valid Last Name");
			}

		} catch (LastNameException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the lastname");
		String lname = scanner.next();
		scanner.close();
		
		validatelastname(lname);
	}
}
