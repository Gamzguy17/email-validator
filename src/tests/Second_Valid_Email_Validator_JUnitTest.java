package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class Second_Valid_Email_Validator_JUnitTest {

	@Test
	public void test() {
		//Test inputs for 3-2
		int spacesAndFirstNumber1 = validEmail.validate("1 something");
		int spacesAndFirstNumber2 = validEmail.validate("2 something");
		int spacesAndFirstNumber3 = validEmail.validate("3 something");
		int spacesAndFirstNumber4 = validEmail.validate("4 something");
		int spacesAndFirstNumber5 = validEmail.validate("5 something");
		int spacesAndFirstNumber6 = validEmail.validate("6 something");
		int spacesAndFirstNumber7 = validEmail.validate("7 something");
		int spacesAndFirstNumber8 = validEmail.validate("8 something");
		int spacesAndFirstNumber9 = validEmail.validate("9 something");
		int spaces = validEmail.validate("this email is not valid");
		int mostValid = validEmail.validate("this.isclose89@tobeinganemail.com");
		
		//Test expectations for 3-2
		assertEquals(0, spacesAndFirstNumber1);
		assertEquals(0, spacesAndFirstNumber2);
		assertEquals(0, spacesAndFirstNumber3);
		assertEquals(0, spacesAndFirstNumber4);
		assertEquals(0, spacesAndFirstNumber5);
		assertEquals(0, spacesAndFirstNumber6);
		assertEquals(0, spacesAndFirstNumber7);
		assertEquals(0, spacesAndFirstNumber8);
		assertEquals(0, spacesAndFirstNumber9);
		assertEquals(1, spaces);
		assertEquals(4, mostValid);
	}

}
