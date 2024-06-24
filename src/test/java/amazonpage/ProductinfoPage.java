package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class ProductinfoPage extends Testbase {
	
	
	
	@FindBy(xpath="//span[@id='a-autoid-0-announce']")
	WebElement quantityselect;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addcart;
	
	@FindBy(css="input[aria-labelledby='attachSiNoCoverage-announce']")
	WebElement nothanks;

	
	public ProductinfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addtoCartBtn() {
		addcart.click();
	}
	
	public void notanksbtn() {
		nothanks.click();
	}
	
	
	
	

}
