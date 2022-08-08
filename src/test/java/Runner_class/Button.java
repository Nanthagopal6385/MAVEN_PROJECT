package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button {
	public WebDriver driver4;
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement contain;

	public Button(WebDriver driver) {
		this.driver4 = (driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getContain() {
		return contain;
	}
	

}
