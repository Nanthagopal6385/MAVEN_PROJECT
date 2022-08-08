package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	public static WebDriver driver3;
	
	@FindBy(xpath = "//a[@title='Dresses'])[2]")
	
	private WebElement title;

	public Dresses(WebDriver driver) {
		this.driver3=driver;
		PageFactory.initElements(driver, this);
		
		}

	public WebElement getTitle() {
		return title;
		
	}
	
	@FindBy(xpath = "//a[text()='Evening Dresses'])[2]")
	
	private WebElement next;

	public WebElement getNext() {
		return next;
	}
	
	


	}
		

	


