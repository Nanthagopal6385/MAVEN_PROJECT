package Com.testing;

import org.testng.annotations.Test;

public class Expected_exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator() {
		
		int a = 10;
		
		System.out.println(a / 0);
		
		System.out.println("Display the output");

	}

}
