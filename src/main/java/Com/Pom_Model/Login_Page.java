package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver1;
	
	@FindBy(id="login")
	private WebElement sigin ;

	public Login_Page(WebDriver driver) {
		this.driver1=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSigin() {
		return sigin;
	}
	
	
	

	
	
	
			

}
