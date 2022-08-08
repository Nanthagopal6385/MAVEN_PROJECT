package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver2;
	@FindBy(className="login")
	private WebElement sigin;

	public Home_page(WebDriver driver) {
		this .driver2=(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getSigin() {
		return sigin;
	}
	
	
	

}
