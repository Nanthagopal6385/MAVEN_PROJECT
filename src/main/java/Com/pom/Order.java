package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	public WebDriver driver2;
	@FindBy(name="group_1")
	private WebElement call;

	public Order(WebDriver driver) {
	this.driver2 = (driver);
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getCall() {
		return call;
	}
	
	

}
		