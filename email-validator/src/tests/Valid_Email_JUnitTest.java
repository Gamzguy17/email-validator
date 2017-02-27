package tests;


import static org.junit.Assert.*;

import org.junit.Test;

public class Valid_Email_JUnitTest {

	@Test
	public void test() {
		//Test inputs
		int noDotsOrAts = validEmail.validate("hello");
		int twoAts = validEmail.validate("@@");
		int allAts = validEmail.validate("@@@@@@@");
		int oneDot = validEmail.validate("www.hello");
		int twoDots = validEmail.validate("www.hello.com");
		int leftAt = validEmail.validate("@hello");
		int rightAt = validEmail.validate("hello@");
		int atsAndDots = validEmail.validate("..@@..");
		int emailAddress = validEmail.validate("fake@fake.ca");
		int atAndDots = validEmail.validate("..@..");
		//Test expectations
		assertEquals(0, noDotsOrAts);
		assertEquals(0, twoAts);
		assertEquals(0, allAts);
		assertEquals(1, oneDot);
		assertEquals(1, twoDots);
		assertEquals(1, leftAt);
		assertEquals(1, rightAt);
		assertEquals(1, atsAndDots);
		assertEquals(2, emailAddress);
		assertEquals(2, atAndDots);
	}

}
