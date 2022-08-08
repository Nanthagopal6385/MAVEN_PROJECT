package Com.testing;

import org.testng.annotations.Test;

public class Timeout_concept {
	
	@Test(timeOut = 8000)
	private void browser_execution() throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("browser launch");
		
		Thread.sleep(1000);
		
		System.out.println("url launch");
		
		Thread.sleep(2000);
		System.out.println("credential entered");
		
		Thread.sleep(1000);
		
		System.out.println("next page");
		
	}

}
