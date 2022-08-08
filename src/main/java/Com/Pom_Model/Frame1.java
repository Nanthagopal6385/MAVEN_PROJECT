package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame1 {
	public static WebDriver driver6;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	
	private WebElement king;

	public Frame1(WebDriver driver) {
		this.driver6 = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getKing() {
		return king;
	}



	
	
	
		

	}


