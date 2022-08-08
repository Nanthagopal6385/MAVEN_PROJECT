package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver1;
	@FindBy(id="email")
	
	private WebElement driver;


	public WebElement getDriver() {
		return driver;
		
		
		}
	
	@FindBy(id="passwd")
	
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	
	
	


	public WebElement getSubmit() {
		return submit;
	}




	public Login(WebDriver driver2) {
		
		this.driver1 = driver2;
		
		PageFactory.initElements(driver2, this);
		
	}

}
