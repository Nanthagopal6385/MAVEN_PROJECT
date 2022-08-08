package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
	public static WebDriver driver5;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement check;

	public Proceed(WebDriver driver) {
		
		this.driver5 = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCheck() {
		return check;
		
		
		
	}
	
	

}

