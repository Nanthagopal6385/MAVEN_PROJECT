package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Dresses'])[2]")
	
	private WebElement move;

	public dress(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getMove() {
		return move;
	}
	
	@FindBy(xpath="//a[text()='Evening Dresses")
	private WebElement non;

	public WebElement getNon() {
		return non;
	}
	@FindBy(xpath="//img[@title='Printed Dress")
    private WebElement sum;

	public WebElement getSum() {
		return sum;
	}	
	
	

}
