package calculator;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	public Calculator calculator;

	@Before
	public void setUp() {
		// Arrange
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		double firstnum = Operations.firstnum;
		double secondnum = Operations.secondnum;
		String operation = Operations.operations;
	    if (firstnum == 0  && operation == "*" ) {
	    	assertEquals(0, Operations.getBtnEquals(), "Multiple with zero should be zero");
	    } else if (secondnum == 0  && operation == "*" ) {
	    	assertEquals(0, Operations.getBtnEquals(), "Multiple with zero should be zero");
	    }else if (secondnum > 0 && firstnum > 0 && operation == "*" ) {
	    	assertEquals( 1, Operations.getBtnEquals(), "Regular multiplication should work");
	    }else if (secondnum < 0 && firstnum < 0 && operation == "*" ) {
	    	assertEquals( 1, Operations.getBtnEquals(), "Regular multiplication should work");
	    }else if (secondnum < 0 && firstnum > 0 && operation == "*" ) {
	    	assertEquals( 1, Operations.getBtnEquals(), "Regular multiplication should work");
	    }else if (secondnum > 0 && firstnum < 0 && operation == "*" ) {
	    	assertEquals( 1, Operations.getBtnEquals(), "Regular multiplication should work");
	    }
	}
}
