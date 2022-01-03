package com.userentrywithlambda;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePassword {
	public static void main(String[] args) {
		Ivalidate isvalidconatct = (pattern, pwd) -> Pattern
				.compile(pattern)
				.matcher(pwd)
				.matches();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Password");
		String password = scanner.next();
		String pattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
		scanner.close();
		
		if(isvalidconatct.validate(pattern, password)) 
		{
			System.out.println("valid password ");
		}
		else 
		{
			System.out.println("Invalid password");
		}
	}
}
