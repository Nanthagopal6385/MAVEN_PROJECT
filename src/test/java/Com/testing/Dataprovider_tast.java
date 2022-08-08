package Com.testing;

import org.junit.experimental.theories.DataPoint;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_tast {
	
	@Test(dataProvider = "test_data")
	private void adactin_Runner1(String username, String password) {
		
		System.out.println("username :" +username);
		
		System.out.println("password:"+password);
		
		
	}
	
	@DataProvider
	private Object[][] test_Data() {
		
	   return new Object[][]  {
		   
		   {"starc",123},
		   {"smith",2343},
		   {"watson",345}
		   
	   };
	   
	}  
	@Test(dataProvider = "test_data")
	private void adactin_Runner(String username, String password) {
		
		System.out.println("username :" +username);
		
		System.out.println("password:"+password);
	}
	
}	
		
	
	

		   
		
	
		
