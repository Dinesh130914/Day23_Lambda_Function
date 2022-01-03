package com.userentry;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordrule1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		
		String result = "^[A-Za-z]{8,15}";
		Pattern regex = Pattern.compile(result);
		Matcher inputMatcher = regex.matcher(pwd);
		
		if(inputMatcher.matches()) 
		{
			System.out.println("Valid password");
		}else 
		{
			System.out.println("Invalid password.should have minimum 8 character");
		}
	}
}
