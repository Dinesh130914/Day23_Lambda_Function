package com.userexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstnameException extends Exception {
	public FirstnameException(String msg) {
		super(msg);
	}

	static Scanner sc = new Scanner(System.in);

	public static void validatefirstname(String inputStr) {
		try {
			String namePattern = "^[A-Z]{1}[a-z]{3,5}$";
			Pattern regex = Pattern.compile(namePattern);
			Matcher firstNameMatcher = regex.matcher(inputStr);
			if (!firstNameMatcher.matches()) {
				throw new FirstnameException("Invalid First Name");
			} else {
				System.out.println("Valid Name");
			}
		}

		catch (FirstnameException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the first name : ");
		
		String fname = sc.next();
		sc.close();
		
		validatefirstname(fname);

	}
}
