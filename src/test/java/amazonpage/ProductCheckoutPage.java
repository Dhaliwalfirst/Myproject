package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class ProductCheckoutPage extends Testbase {
	
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement productcheckout;
	
	@FindBy(xpath="//a[@data-csa-c-content-id= 'sw-gtc_CONTENT']")
	WebElement gotocart;
	
	public ProductCheckoutPage() {
		PageFactory.initElements(driver, this);

	}
	public void productchk() {
		productcheckout.click();
	}
	
	public void Gotocart() {
		gotocart.click();
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	


