package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	public WebDriver driver3;
	@FindBy(name=("Submit"))
	private WebElement mit;

	public Page(WebDriver driver) {
		this.driver3=(driver);
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getMit() {
		return mit;
	}
	

}
