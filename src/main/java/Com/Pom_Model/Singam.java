package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singam {
	public static WebDriver driver13;
	
	@FindBy(name = "bankwire")
	
	private WebElement muttai;

	public Singam(WebDriver driver) {
		this.driver13=driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getMuttai() {
		return muttai;
	}
		
	}


