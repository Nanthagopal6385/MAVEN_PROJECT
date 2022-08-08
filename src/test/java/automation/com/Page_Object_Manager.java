package automation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Com.Pom_Model.Addcard;
import Com.Pom_Model.Create_Account;
import Com.Pom_Model.Dresses;
import Com.Pom_Model.Frame1;
import Com.Pom_Model.Icecream;
import Com.Pom_Model.Login_Page;
import Com.Pom_Model.Opening;
import Com.Pom_Model.Printed;
import Com.Pom_Model.Proceed;
import Com.Pom_Model.Radio;
import Com.Pom_Model.Reading;
import Com.Pom_Model.Singam;
import Com.Pom_Model.Watching;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	  public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public Login_Page getLp() {
		if (lp==null) {
			lp=new Login_Page(driver);
			
		}
		
		return lp;
	}
	public Create_Account Page_Object_Manager() {
		if (ca==null) {
			ca=new Create_Account(driver);
			
		}
		return ca;
	}
	public Dresses getD() {
		if (d==null) {
			d=new Dresses(driver);
		}
		return d;
	}
	public Printed getP() {
		if (p==null) {
			p=new Printed(driver);
			
		}
		return p;
	}
	public Proceed getA() {
		if (a==null) {
			a=new Proceed(driver);
			
		}
		return a;
	}
	public Frame1 getF() {
		if (f==null) {
			f=new Frame1(driver);
			
		}
		return f;
	}
	public Icecream getI() {
		if (i==null) {
			i=new Icecream(driver);
			
		}
		return i;
	}
	public Addcard getC() {
		if (c==null) {
			c=new Addcard(driver);
			
		}
		
		return c;
	}
	public Opening getO() {
		if (o==null) {
			o=new Opening(driver);
			
		}
		return o;
	}
	public Radio getR() {
		if (r==null) {
			r=new Radio(driver);
			
		}
		return r;
	}
	public Button getB() {
		if (b==null) {
			b=new Button(driver);
			
		}
		return b;
	}
	public Singam getS() {
		if (s==null) {
			s=new Singam(driver);
			
		}
		return s;
	}
	public Watching getW() {
		if (w==null) {
			w=new Watching(driver);
			
		}
		return w;
	}
	public Reading getE() {
		if (e==null) {
			e=new Reading(driver);
			
		}
		return e;
	}
	private Login_Page lp;
	  private Create_Account ca;
	  private Dresses d;
	  private Printed p;
	  private Proceed a;
	  private Frame1 f;
	  private Icecream i;
	  private Addcard c ;
	  private Opening o;
	  private Radio r;
	  private Button b;
	  private Singam s;
	  private Watching w;
	  private Reading e;
	  
	  
	
}
