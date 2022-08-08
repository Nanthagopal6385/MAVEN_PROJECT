package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Watching {
	public static WebDriver driver12;
	
	@FindBy(xpath = "//span[text()='I confirm my order']")
     
	private WebElement timing;

	public Watching(WebDriver driver) {
		this.driver12=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTiming() {
		return timing;
	}
		

	}

