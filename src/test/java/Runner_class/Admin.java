package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	public WebDriver driver2;
	@FindBy(id="cgv")
	private WebElement point;
	public Admin(WebDriver driver) {
		this.driver2=(driver);
		PageFactory.initElements(driver, this);
	}
	public WebElement getPoint() {
		return point;
	}
	

}
