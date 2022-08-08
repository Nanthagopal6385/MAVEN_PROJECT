package Com.Pom_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Icecream {
	public static WebDriver driver7;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement list;

	public Icecream(WebDriver driver) {
		this.driver7 = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getList() {
		return list;
	}
		

	}


