package Com.testing;

import org.testng.annotations.Test;

public class Dependencytest {
	
	@Test
	private void mobile() {
		System.out.println("mobile");
	}
	
	@Test(dependsOnGroups = "watch")
	private void offer() {
		System.out.println("offer");
		
	}
	
	private void watch() {
		System.out.println("watch");
	}

}
