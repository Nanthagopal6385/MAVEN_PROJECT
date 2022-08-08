package automation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button {
	
	public static WebDriver driver10;
	
	@FindBy (xpath = "//button[@type='submit'])[2]")
	
	private WebElement model;

	public Button(WebDriver driver) {
		this.driver10=driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getModel() {
		return model;
	}
	
	

	}
		

	


