package Runner_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Colour {
	public WebDriver driver1;
	@FindBy(id="color_24")
	private WebElement colur;

	public Colour(WebDriver driver) {
		this.driver1 =(driver);
		PageFactory.initElements(driver,this);
	}

	public WebElement getColur() {
		return colur;
	}
	

}
