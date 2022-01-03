package com.userentrywithlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateFirstname {

	public static void main(String[] args) {
		Ivalidate isvalidfname = (pattern, value) -> Pattern
				.compile(pattern)
				.matcher(value)
				.matches();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String value = scanner.next();
		String pattern = "^[A-Z]{1}[a-zA-Z]{3,}$";
		
		scanner.close();
		
		if(isvalidfname.validate(pattern, value)) 
		{
			System.out.println("Valid First Name");
		}else 
		{
			System.out.println("Invalid First Name");
		}
		
	}
}
