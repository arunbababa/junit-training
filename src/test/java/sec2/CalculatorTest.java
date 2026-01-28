package sec2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	@DisplayName("arunbababa")
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}


}