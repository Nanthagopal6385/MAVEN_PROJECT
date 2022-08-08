package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oppo {
	public WebDriver driver8;
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement name;

	public Oppo(WebDriver driver) {
		this.driver8=(driver);
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getName() {
		return name;
	}
	

}
