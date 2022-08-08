package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio {
	public static WebDriver driver9;
	
	@FindBy (id = "cgv")
	
	private WebElement sound;

	public Radio(WebDriver driver) {
		this.driver9=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSound() {
		return sound;
	}
		

	}


