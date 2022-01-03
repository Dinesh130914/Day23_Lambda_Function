package com.userentry;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ValidateUserEntryParameterizedTest {

	private String firstName;
	private String lastName;
	private String contactNumber;
	private String emailID;

	private boolean expectedResultForFName;
	private boolean expectedResultForLName;
	private boolean expectedResultForNumber;
	private boolean expectedResultForEmail;

	private ValidateUserEntry userEntry;

	public ValidateUserEntryParameterizedTest(String firstName, String lastName, String contactNumber, String emailID,
			boolean expectedResultForFName, boolean expectedResultForLName, boolean expectedResultForNumber,
			boolean expectedResultForEmail) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailID = emailID;
		this.expectedResultForFName = expectedResultForFName;
		this.expectedResultForLName = expectedResultForLName;
		this.expectedResultForNumber = expectedResultForNumber;
		this.expectedResultForEmail = expectedResultForEmail;
	}

	@Before
	public void initialize() {
		userEntry = new ValidateUserEntry();
	}

	@Parameterized.Parameters
	public static Collection parameters() {
		return Arrays.asList(new Object[][] { { "", "", "", "", false, false, false, false },
				{ "dinesh", "raina", "95 894", "d@@gmail.com", false, false, false, false } });
	}

	@Test
	public void validateFirstName() {
		assertEquals(expectedResultForFName, userEntry.firstname(firstName));
	}

	@Test
	public void validateLastName() {
		assertEquals(expectedResultForLName, userEntry.lastname(lastName));
	}

	@Test
	public void validateContactNumber() {
		assertEquals(expectedResultForNumber, userEntry.contactno(contactNumber));
	}

	@Test
	public void validateEmailId() {
		assertEquals(expectedResultForEmail, userEntry.emailid(emailID));
	}

}
