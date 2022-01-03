package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validatelastname {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the lastname");
		String lname = scanner.next();
		
		String result = "^[A-Z][A-Za-z]{3,25}";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(lname);
		
		if(inputMatcher.matches()) 
		{
			System.out.println(lname+" "+"is valid");
		}else 
		{
			System.out.println("Invalid Name.should start with Caps");
		}
	}
}
