package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class Orderpage extends Testbase{
	
	@FindBy(xpath="//a[@class='a-link-normal'][normalize-space()='Buy Again']")
	WebElement buyagainlink;
	
	@FindBy(css="section[class='your-orders-content-container aok-relative js-yo-container'] li:nth-child(3) a:nth-child(1)")
	WebElement notyetshippedlink;
	
	@FindBy(xpath="//a[normalize-space()='Cancelled Orders']")
	WebElement cancelledorder;
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement Orderplaced;
	
	public Orderpage() {
		PageFactory.initElements(driver, this);
	}

	
	public void BuyAgainProduct() {
		buyagainlink.click();
	}
	
	public void NotYetShipped() {
		notyetshippedlink.click();
	}
	
	public void CancelledOrder() {
		cancelledorder.click();
	}
    }
	
	
	
	
	


