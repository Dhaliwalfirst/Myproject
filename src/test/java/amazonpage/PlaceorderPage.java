package amazonpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbase.Testbase;

public class PlaceorderPage extends Testbase{
	
	@FindBy(className="a-button-input")
	WebElement placeYourOrder;
	
	
	public PlaceorderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPlaceOrder() {
		placeYourOrder.click();
	}
    }
	
	
	
	
	
	
	
	


