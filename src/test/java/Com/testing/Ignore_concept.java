package Com.testing;

import org.testng.annotations.Test;

public class Ignore_concept {
	
	@Test(enabled = false)
	private void books() {
		System.out.println("books");

	}
	
	@Test(priority = 1)
	private void twitter() {
		System.out.println("twitter");
	}
	
	@Test(priority = 2)
	private void instagram() {
		System.out.println("instagram");
		
	}
	
	@Test(priority = -1)
	private void helicopter() {
		System.out.println("helicopter");
	}
	
}
