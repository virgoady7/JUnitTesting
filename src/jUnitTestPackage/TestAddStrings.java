package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddStrings {

	@Test
	void test() {
		jUnitFunction junit=new jUnitFunction();
		String result=junit.addStrings("Aditya", "Bhardwaj");
		assertEquals("AdityaBhardwaj",result);
	}

}
