package Com.testing;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_concept {
	
	@Test
	private void username() {
    
		String exp_username = "starc";
		
		String actual_username = "starc123";
		
	//	Assert.assertEquals(actual_username, exp_username);
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual_username,exp_username);
		
		System.out.println("Assertvalidation");

	}

}
