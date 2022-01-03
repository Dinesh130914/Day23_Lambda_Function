package com.userentrywithlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateLastName {
	public static void main(String[] args) {
		Ivalidate isvalidlname = (pattern, value) -> Pattern
				.compile(pattern)
				.matcher(value)
				.matches();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Last name");
		String value = scanner.next();
		String pattern = "^[A-Z]{1}[a-zA-Z]{3,}$";

		scanner.close();

		if (isvalidlname.validate(pattern, value)) {
			System.out.println("Valid Last Name");
		} else {
			System.out.println("Invalid Last Name");
		}

	}
}
