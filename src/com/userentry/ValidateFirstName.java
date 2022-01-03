package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFirstName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the firstname");
		String fname = scanner.next();
		
		String result = "^[A-Z][A-Za-z]{3,25}";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(fname);
		scanner.close();
		
		if(inputMatcher.matches()) 
		{
			System.out.println(fname +" "+ "is valid name");
		}else 
		{
			System.out.println("Invalid name.Name should start with Caps");
		}
	}
}
