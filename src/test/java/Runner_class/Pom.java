package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public WebDriver driver1;
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement son;

	public Pom(WebDriver driver) {
	this.driver1=(driver);
	PageFactory.initElements(driver, this);
	
		}

	public WebElement getSon() {
		return son;
	}
	

}
