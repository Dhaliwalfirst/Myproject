package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class Homepage extends Testbase{
	
	
	@FindBy(xpath="//span[normalize-space()='Account & Lists']//span[@class='nav-icon nav-arrow']")
	WebElement dropdownicon;
	
	@FindBy(xpath="//span[normalize-space()='Your Account']")
	WebElement accountlink;
	
	@FindBy(xpath="//span[normalize-space()='Your Orders']")
	WebElement orderlink;
	
	@FindBy(xpath="//span[normalize-space()='Your Recommendations']")
	WebElement recommendations;
	
	@FindBy(xpath="//span[normalize-space()='Memberships & Subscriptions']")
	WebElement memberships;
	
	@FindBy(xpath="//span[normalize-space()='Find a Gift']")
	WebElement findgift;
	
	@FindBy(xpath="//span[normalize-space()='Baby Registry']")
	WebElement Babyregistry;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void move () {
	Actions action	= new Actions (driver);
	action.moveToElement(dropdownicon).build().perform();
	}
	
	public Accountpage yourAccount() {
	accountlink.click();
	return new Accountpage();
	}
	
	public Orderpage yourOrder() {
	orderlink.click();
	return new Orderpage();
	}
	
	public void yourRecommendation() {
		recommendations.click();
	}
	
	public void yourMembership() {
		memberships.click();
	}
	
	public void yourGift() {
		findgift.click();
	}
	public void yourBabyreg() {
		Babyregistry.click();
	}
    }
	
	
	
	
	
	

