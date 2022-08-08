package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opening {
	public static WebDriver driver9;
	
	@FindBy(xpath ="//span[text()='Proceed to checkout']")
	private WebElement reach;

	public Opening(WebDriver driver) {
		
		this.driver9= driver;
		PageFactory.initElements(driver, this);
		
		
		
		
	}

	public WebElement getReach() {
		return reach;
	}
		

	}


