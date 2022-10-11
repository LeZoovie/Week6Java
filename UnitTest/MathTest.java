package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//use Java Docs 5 
//Good practice is to run TDD - Test driven development: What this means is that the unit tests are first written before writing the code to show,
//what the code should do. Then write the code to pass the tests. Defines the logic and functionality that you want to exist to then write 
//the code to match it. Can sometimes be difficult to go about this way first, due to not knowing how to implement a certain code until,
//going into the program.
//Tip: some companies are willing to pay more for TDD, to make sure their code runs right. 
class MathTest {
	Math math = new Math();
	@Test 
	void testMultiplyReturnsCorrectValues() {
	
		int product = math.multiply(2,  5);
		assertEquals(10, product);

	}

//	@Test
//	void testDivideResturnsCorrectValues() {
//		double result = math.divide(5.0, 2.0);
//		assertEquals(2.5, result);
//	}

	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	void testDivideThrowsEcecptionWhenDividingBy0() {
		assertThrows(ArithmeticException.class,() -> math.divide(5, 0));
	}
	
}
