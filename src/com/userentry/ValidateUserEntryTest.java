package com.userentry;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class ValidateUserEntryTest {

	@Test
	void test() {
		ValidateUserEntry n = new ValidateUserEntry();
		
		assertTrue(n.firstname("Dinesh"));
		assertTrue(n.lastname("Raina"));
		assertTrue(n.contactno("918608894623"));
		//assertTrue(n.emailid("dhjlaf@kjdf.com"));
		assertEquals(false,n.emailid("din@hsk.bl.com.in"));
	}

}
