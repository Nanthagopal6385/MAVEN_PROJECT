package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check {
	public WebDriver driver5;
	@FindBy(xpath="//span[text()='Proceed to checkout")
	private WebElement roll;

	public Check(WebDriver driver) {
		this.driver5=(driver);
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getRoll() {
		return roll;
	}
	

}
