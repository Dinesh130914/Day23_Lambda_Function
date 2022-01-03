package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordrule3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Password(should have atleast one numerical value)");
		String pwd = scanner.next();
		
		String result = "(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,15}$";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(pwd);
		
		if(inputMatcher.matches()) 
		{
			System.out.println("Valid password");
		}else 
		{
			System.out.println("Invalid.should have atleast one numerical value");
		}
	}
}	
