package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class Accountpage extends Testbase {
	
	@FindBy(xpath="//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")
	WebElement yourOrder;
	
	@FindBy(css="body > div:nth-child(1) > div:nth-child(27) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
	WebElement loginSecurity;
	
	@FindBy(xpath="//a[@href='https://www.amazon.ca/a/addresses?ref_=ya_d_c_addr']//div[@class='a-box ya-card--rich']")
	WebElement yourAddress;
	
	@FindBy(xpath="//div[@data-card-identifier='PaymentOptions']//div[@class='a-box-inner']")
	WebElement yourPayments;
	
	public Accountpage() {
		PageFactory.initElements(driver, this);
	}
	
	public Orderpage Ordericon() {
		yourOrder.click();
		return new Orderpage();
		}
	public LoginandsecurityPage loginandsecurit() {
		loginSecurity.click();
		return new LoginandsecurityPage();
		}
	public Addresspage yourAddressicon() {
		yourAddress.click();
		return new Addresspage();
	}
	public  PaymentPage yourPaymentsicon() {
		yourPayments.click();
		return new PaymentPage();
	
	}
	

	
	

}
