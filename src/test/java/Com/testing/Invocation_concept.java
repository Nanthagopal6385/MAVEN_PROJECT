package Com.testing;

import org.testng.annotations.Test;

public class Invocation_concept {
	
	
	@Test(priority = -1)
	private void browser_launch() {
		System.out.println("Browser launch");

	}
	
	
	private void launch_url() {
		System.out.println("Launch url");

	}
	
	@Test(priority = 0,invocationCount = 3)
	private void refresh() {
		System.out.println("refresh");
		
	}
	
	@Test(priority = 2)
	private void credentials() {
		System.out.println("credentials");

	}

}
