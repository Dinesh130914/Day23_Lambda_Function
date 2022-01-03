package com.userentrywithlambda;

import java.util.Scanner;
import java.util.regex.Pattern;


public class ValidateContactNumber {
	public static void main(String[] args) {
		Ivalidate isvalidconatct = (pattern, contact) -> Pattern
				.compile(pattern)
				.matcher(contact)
				.matches();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Contact Number");
		String contact = scanner.next();
		String pattern = "^[0-9]{2}[\s]{1}[0-9]{10}$";
		scanner.close();
		
		if(isvalidconatct.validate(pattern, contact)) 
		{
			System.out.println("valid Contact Number");
		}
		else 
		{
			System.out.println("Invalid Contact Number");
		}
	}
}
