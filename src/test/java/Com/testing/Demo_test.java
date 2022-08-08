package Com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_test {
	
	@Test(retryAnalyzer = Retry_class.class)
	
	private void username() {
		 String expected_username = "starc";
		 
		 String actual_username = "starc123";
		 
		 Assert.assertEquals(actual_username, expected_username);
		 
	}
	
	private void password() {
		
		 String expected_password = "starc";
		 
		 String actual_password = "starc123";
		 
		 Assert.assertEquals(actual_password, expected_password);
		 
		
	}
	
	
	

}
