
package Com.Base_class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Concept {
	
	public static WebDriver driver;
	
	  public static  void click(WebElement element) {
		  
		  element.click();
	}
		public static void input(WebElement element,String data) {
			
			element.sendKeys(data);
			}
		public static void sleep(int mill) throws InterruptedException {
			Thread.sleep(mill);
			}
		public static void browser(String nandha) {
	     if (nandha.equalsIgnoreCase("chrome")) {
		
	        System.setProperty("webdriver.chrome.driver"
			 ,"C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\driver\\chromedriver.exe");
			 driver =new ChromeDriver();
	}
	}
		public static void act(WebElement element,String type) {
	      if(type.equalsIgnoreCase("move")) {	
		    Actions ac=new Actions(driver);
	        ac.moveToElement(element).build().perform();
	}
	     else if(type.equalsIgnoreCase("con")) {
		  Actions ac=new Actions(driver);
		  ac.contextClick(element);
		
	} 
	}
	     public static void options(WebElement element, String value,String type) {
		  Select s = new Select(element);
		 if(type.equalsIgnoreCase("value")) {
		  s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("index")) {
			int index =Integer.parseInt(value);
		s.selectByIndex(index);
		}
	}

	     public static void annual(WebElement element,String type) {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(type);
			}
	      public static void mobile(WebElement element) {
		   driver.switchTo().frame(element);
	}
	   
	      public static void camera(String path) throws IOException {
		   TakesScreenshot ts= (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path);
			FileUtils.copyFile(source, des);

	}

}
