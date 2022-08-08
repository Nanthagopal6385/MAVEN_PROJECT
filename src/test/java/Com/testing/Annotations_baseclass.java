package Com.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_baseclass {
	@Test
	private void Protect() {
System.out.println("protect the value");
	}
	@BeforeClass
	private void input() {
		System.out.println("input");
		}
	@BeforeMethod
	private void output() {
		System.out.println("output");
	}
	
	@BeforeSuite
	
	private void womens() {
		System.out.println("womens");
	}
	@AfterMethod
	
	private void logout() {
		System.out.println("logout");
	}
	@AfterSuite
	
	private void sigin() {
		System.out.println("signin");

	}
}
	
	
	
	
	
	
	
	
	
