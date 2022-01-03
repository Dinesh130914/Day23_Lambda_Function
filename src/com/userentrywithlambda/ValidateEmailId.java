package com.userentrywithlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmailId {
	public static void main(String[] args) {
		Ivalidate isvalidemail = (pattern, email) -> Pattern
				.compile(pattern)
				.matcher(email)
				.matches();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Email Id");
		String email = scanner.next();
		String pattern = "^abc(.+)[A-Za-z0-9]+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
		scanner.close();
		
		if(isvalidemail.validate(pattern, email)) 
		{
			System.out.println("valid email id");
		}
		else 
		{
			System.out.println("Invalid email id");
		}
	}
}
