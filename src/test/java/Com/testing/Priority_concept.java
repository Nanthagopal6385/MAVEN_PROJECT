package Com.testing;

import org.testng.annotations.Test;

public class Priority_concept {
	
	
	@Test(priority = -1)
	private void username() {
		System.out.println("username");
		
	}
	
	@Test(priority = 0)
	private void password() {
		System.out.println("password");
		
	}
	
	@Test(priority = 1)
	
	private void login() {
		System.out.println("login");
	}

}
