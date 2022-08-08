package Com.testing;

import org.testng.annotations.Test;

public class Groups_concept {
	@Test(groups =" english")
	private void english() {
		System.out.println("english");
		
	}
	
	@Test(groups = "socical media")
	private void instagram() {
		System.out.println("instagram");
		
	}
	
	@Test(groups = "socical media")
	private void whatsapp() {
		System.out.println("whatsapp");
		
	}
	
	@Test(priority = -1 , groups = "watching")
	private void move() {
     
		System.out.println("move");
	}

}

	