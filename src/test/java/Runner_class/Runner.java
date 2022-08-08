package Runner_class;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

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
import Com.helper.Page_object_manager;
import Com.maven_conspect.Base_class;
import Com.pom.Frame;
import Com.pom.Home_page;
import Com.pom.Login;
import Com.pom.Order;
import Com.pom.Page;
import Com.pom.dress;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Runner extends Base_Concept {
	
	
	
	 
	Page_object_manager pom = new Page_object_manager(driver);
	
	public static Logger log = Logger.getLogger(Logger_Basic.class);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	  PropertyConfigurable.configer("log4j.properties");
	  String url = Automation_file_Reader.get
		
		
		
		
		
		browser("Chrome");

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		sleep(3000);
		

		click(hp.getSigin());

		
		input(cl.getDriver());
		
		input(cl.getClick());
		click(cl.getSubmit());

		act(move.getMove());
		sleep(3000);
		click(move.getNon());

		click(move.getSum());

		sleep(3000);
		mobile(setup.getMethod());
		click(setup.getElement());


		options(sall.getCall());

		click(pink.getColur());


		click(second.getMit());

		driver.switchTo().defaultContent();

		sleep(3000);


		click(yagi.getContain());

		click(nan.getRoll());

		click(abc.getSon());
		Thread.sleep(2000);
		click(all.getPoint());
		Thread.sleep(5000);

		click(date.getDate());
		click(roll.getRoll());
		click(order.getName());

		annual(confirm, "window.scrollBy(0,300);");
		sleep(3000);

		camera("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\screenshot\\automation.png");

	}

}
