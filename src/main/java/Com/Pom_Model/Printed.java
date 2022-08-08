package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed {
	public static WebDriver driver4;
	
	@FindBy(xpath ="//img[@title='Printed Dress']")
	
	private WebElement image;

	public Printed(WebDriver driver) {
	   this.driver4=driver;
	   PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return image;
	}
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	
	private WebElement card;

	public WebElement getCard() {
		return card;
	}
		
}


