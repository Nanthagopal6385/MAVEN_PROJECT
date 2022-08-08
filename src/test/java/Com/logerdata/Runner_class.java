package Com.logerdata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Base_class.Base_Concept;
import Com.pom.Frame;
import Com.pom.Home_page;
import Com.pom.Login;
import Com.pom.Order;
import Com.pom.Page;
import Com.pom.dress;
import Runner_class.Admin;
import Runner_class.Amount;
import Runner_class.Button;
import Runner_class.Camera;
import Runner_class.Check;
import Runner_class.Colour;
import Runner_class.Oppo;
import Runner_class.Pom;

public class Runner_class extends Base_Concept{
	
    public static WebDriver driver;	
	public static Home_page hp = new Home_page(driver);
	public static dress move = new dress(driver);
	public static Login cl = new Login(driver);
	public static Frame setup = new Frame(driver);
	public static Order sall = new Order(driver);
	public static Colour pink = new Colour(driver);
	public static Page second = new Page(driver);
	public static Button yagi = new Button(driver);
	public static Check nan = new Check(driver);
	public static Pom abc = new Pom(driver);
	public static Admin all = new Admin (driver);
	public static Camera date = new Camera(driver);
	public static Amount roll = new Amount(driver);
	public static Oppo order = new Oppo(driver);
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		
		
		
		
		
		browser("Chrome");

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		sleep(3000);
		

		click(hp.getSigin());

		
	//	input(cl.getDriver());
		
	//	input(cl.getClick());
		click(cl.getSubmit());

	//	act(move.getMove());
		sleep(3000);
		click(move.getNon());

		click(move.getSum());

		sleep(3000);
		mobile(setup.getMethod());
		click(setup.getElement());


	//	options(sall.getCall());

		click(pink.getColur());


		click(second.getMit());

		driver.switchTo().defaultContent();

		sleep(3000);


		click(yagi.getContain());

		click(nan.getRoll());

		click(abc.getSon());
		Thread.sleep(2000);
		click(all.getPoint());
		Thread.sleep(5000);

		click(date.getDate());
		click(roll.getRoll());
		click(order.getName());

	//	annual(confirm, "window.scrollBy(0,300);");
		sleep(3000);

		camera("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\screenshot\\automation.png");

	}


}
