package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcard {
	
	public static WebDriver driver8;
	
	@FindBy(name = "group_1")
	private WebElement value;

	public Addcard(WebDriver driver) {
		this.driver8=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getValue() {
		return value;
	}
	@FindBy(id = "color_24")
	private WebElement pink;

	public WebElement getPink() {
		return pink;
	}
	
	 @FindBy(name = "Submit")
	 private WebElement girls;

	public WebElement getGirls() {
		return girls;
	}
		
}
  
   


