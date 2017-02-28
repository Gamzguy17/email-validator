package tests;


import static org.junit.Assert.*;

import org.junit.Test;

public class Valid_Email_JUnitTest {

	@Test
	public void test() {
		//Test inputs for 3-1
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
		
		//Test expectations for 3-1
		/*Changes from 3-1 branch:
		 * All have no spaces present, so one more additional count is expected
		 * All don't start with a number, so one more additional count is expected
		 */
		assertEquals(2, noDotsOrAts);
		assertEquals(2, twoAts);
		assertEquals(2, allAts);
		assertEquals(3, oneDot);
		assertEquals(3, twoDots);
		assertEquals(3, leftAt);
		assertEquals(3, rightAt);
		assertEquals(3, atsAndDots);
		assertEquals(4, emailAddress);
		assertEquals(4, atAndDots);
	}

}
