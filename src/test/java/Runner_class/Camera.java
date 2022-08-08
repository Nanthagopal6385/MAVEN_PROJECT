package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Camera {
	public WebDriver driver3;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement date;

	public Camera(WebDriver driver) {
		this.driver3 = (driver);
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getDate() {
		return date;
	}
	

}
