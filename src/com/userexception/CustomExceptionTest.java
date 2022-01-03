package com.userexception;

import java.util.Scanner;

import org.junit.Test;

public class CustomExceptionTest extends Exception {

	EmailException emailException = new EmailException(getMessage());
	FirstnameException firstnameException = new FirstnameException(getMessage());
	LastNameException lastNameException = new LastNameException(getMessage());
	MobileNumberException mobileNumberException = new MobileNumberException(getMessage());
	Scanner sc = new Scanner(System.in);
	@Test
	public void fnamtest() throws FirstnameException {
		
		System.out.println("Enter the First Name");
		String fname = sc.next();
		FirstnameException.validatefirstname(fname);
	}

	@Test
	public void lnametest() throws LastNameException {
		System.out.println("Enter the Last Name");
		String lname = sc.next();
		LastNameException.validatelastname(lname);
	}

	@Test
	public void emailtest() throws EmailException {
		System.out.println("Enter the Email Id");
		String email = sc.next();
		EmailException.validatemail(email);
	}

	@Test
	public void contacttest() throws MobileNumberException {
		System.out.println("Enter the Mobile Number");
		String contactnum = sc.next();
		MobileNumberException.validatecontact(contactnum);
	}

}
