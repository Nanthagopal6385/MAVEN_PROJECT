package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frame {
	public WebDriver driver1;
	@FindBy(xpath="//iframe")
	private WebElement method;
	

	public Frame(WebDriver driver) {
		this.driver1 = (driver);
		
		
	}


	public WebElement getMethod() {
		return method;
	}
	
	@FindBy(xpath="//i[@class='icon-plus")
	private WebElement element;


	public WebElement getElement() {
		return element;
	}
	
	
	

}
