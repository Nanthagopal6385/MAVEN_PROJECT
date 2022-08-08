package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reading {
	public static WebDriver driver14;
	
	@FindBy(xpath = "window.scrollBy(0,300);")
	
	private WebElement data;

	public Reading(WebDriver driver) {
		this.driver14= driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getData() {
		return data;
	}
		
	}


