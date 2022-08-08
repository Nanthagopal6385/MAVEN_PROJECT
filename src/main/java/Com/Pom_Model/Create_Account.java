package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account {
	public static WebDriver driver2;
	
	@FindBy(id = "email")
	
	private WebElement open;

	public Create_Account(WebDriver driver) {
		this.driver2 = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOpen() {
		return open;
	}
	

	
	@FindBy(id = "passwd")
	
	private WebElement password;

	public WebElement getPassword() {
		return password;
		
	}
	
	@FindBy(id = "SubmitLogin")
	
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	
	
}
		
	



