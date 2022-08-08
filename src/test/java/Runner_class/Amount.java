package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amount {
	public WebDriver driver7;
	@FindBy(name="bankwire")
	private WebElement roll;

	public Amount(WebDriver driver) {
		this.driver7 =(driver);
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getRoll() {
		return roll;
	}
	

}
