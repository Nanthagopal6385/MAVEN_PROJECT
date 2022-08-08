package automation.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Com.Base_class.Base_Concept;
import Com.Pom_Model.Addcard;
import Com.Pom_Model.Create_Account;
import Com.Pom_Model.Dresses;
import Com.Pom_Model.Frame1;
import Com.Pom_Model.Icecream;
import Com.Pom_Model.Login_Page;
import Com.Pom_Model.Opening;
import Com.Pom_Model.Printed;
import Com.Pom_Model.Proceed;
import Com.Pom_Model.Radio;
import Com.Pom_Model.Reading;
import Com.Pom_Model.Singam;
import Com.Pom_Model.Watching;
import Com.pom.Frame;

public class Runner_Copy extends Base_Concept {
	public static WebDriver driver;
	
	 public static Page_Object_Manager pp1 = new Page_Object_Manager(driver);
	  
	  
	  
	  
	  
	  public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver"
				 ,"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium practice\\driver\\chromedriver.exe");
				
				WebDriver driver =new ChromeDriver();
				Thread.sleep(3000);
				driver.get("http://automationpractice.com/index.php");				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				
				click(pp1.getLp().getSigin());
			    
			//	input(pp1.getCa().getOpen(),"Nandhagopal23@gmail.com");
				
		//		input(pp1.getCa().getPassword(), "Nandha@123");
		//		click(pp1.getCa().getClick());
			
				click(pp1.getD().getTitle());
			    act(pp1.getD().getTitle(), "move");
				Thread.sleep(2000);
				click(pp1.getD().getNext());
				
				click(pp1.getA().getCheck());
				
				Thread.sleep(2000);
			
				click(pp1.getF().getKing());
				
				click(pp1.getI().getList());
				
				options(pp1.getC().getValue(), "index","2");
				
				click(pp1.getC().getPink());
				
				click(pp1.getC().getGirls());
				
				
				Thread.sleep(2000);
				
				click(pp1.getP().getImage());
				
				click(pp1.getP().getCard());
				
				
				click(pp1.getO().getReach());
				Thread.sleep(2000);
			    click(pp1.getR().getSound());
				Thread.sleep(5000);
				
				click(pp1.getB().getModel());
				click(pp1.getS().getMuttai());
				click(pp1.getW().getTiming());
				
				annual(pp1.getE().getData(),"3000");
				
				Thread.sleep(2000);
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Jaja\\Screenshot\\Mini_Projectimage.png");
			FileUtils.copyFile(source, des);
				
			
				
				
				
				
				
				
				
				
				
			   
			   
			    
			    
				
	}

}
