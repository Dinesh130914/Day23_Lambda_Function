package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the emailid");
		String email = scanner.next();

		String pattern = "^[abc]+.+[a-z]+@[bl]+.+[co]+.+[a-z]{2,5}$";
		Pattern regex = Pattern.compile(pattern);
		Matcher inputMatcher = regex.matcher(email);

		if (inputMatcher.matches()) {
			System.out.println("Valid email id");
		} else {
			System.out.println("Invalid email id");
		}
	}
}
